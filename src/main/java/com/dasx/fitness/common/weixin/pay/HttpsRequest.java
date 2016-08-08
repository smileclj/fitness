package com.dasx.fitness.common.weixin.pay;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.net.ssl.SSLContext;
import javax.xml.bind.JAXBException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dasx.fitness.common.util.JaxbXmlUtil;
import com.dasx.fitness.common.weixin.Configure;

/**
 */
public class HttpsRequest {

	private static HttpsRequest instance = null;

	private static Logger log = 
			LoggerFactory.getLogger(HttpsRequest.class);

	// 表示请求器是否已经做了初始化工作
	private boolean hasInit = false;

	// 连接超时时间，默认10秒
	private int socketTimeout = 10000;

	// 传输超时时间，默认30秒
	private int connectTimeout = 30000;

	// 请求器的配置
	private RequestConfig requestConfig;

	// HTTP请求器
	private CloseableHttpClient httpClient;

	private HttpsRequest() {
			try {
				init();
			} catch (UnrecoverableKeyException e) {
				e.printStackTrace();
			} catch (KeyManagementException e) {
				e.printStackTrace();
			} catch (KeyStoreException e) {
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public static HttpsRequest getInstance() {
		if (instance == null) {
			synchronized (HttpsRequest.class) {
				if (instance == null) {
					return new HttpsRequest();
				}
			}
		}
		return instance;
	}

	private void init() throws IOException, KeyStoreException,
			UnrecoverableKeyException, NoSuchAlgorithmException,
			KeyManagementException {

		KeyStore keyStore = KeyStore.getInstance("PKCS12");
		FileInputStream instream = new FileInputStream(new File(
				Configure.getCertLocalPath()));// 加载本地的证书进行https加密传输
		try {
			keyStore.load(instream, Configure.getCertPassword().toCharArray());// 设置证书密码
		} catch (CertificateException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} finally {
			instream.close();
		}

		SSLContext sslcontext = SSLContexts
				.custom()
				.loadKeyMaterial(keyStore,
						Configure.getCertPassword().toCharArray()).build();
		// Allow TLSv1 protocol only
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
				sslcontext, new String[] { "TLSv1" }, null,
				SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);

		httpClient = HttpClients.custom().setSSLSocketFactory(sslsf).build();

		// 根据默认超时限制初始化requestConfig
		requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout)
				.setConnectTimeout(connectTimeout).build();

		hasInit = true;
	}

	/**
	 * 通过Https往API post xml数据
	 * @param <T>
	 * 
	 * @param url
	 *            API地址
	 * @param xmlObj
	 *            要提交的XML数据对象
	 * @return API回包的实际数据
	 * @throws IOException
	 * @throws KeyStoreException
	 * @throws UnrecoverableKeyException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyManagementException
	 * @throws JAXBException 
	 */

	@SuppressWarnings("unchecked")
	public <T> T postXML(String url,Object xmlObj, Class<T> clazz) throws IOException,
			KeyStoreException, UnrecoverableKeyException,
			NoSuchAlgorithmException, KeyManagementException, JAXBException {
		if (!hasInit) {
			init();
		}
		String result = null;
		HttpPost httpPost = new HttpPost(url);
		String postDataXML=JaxbXmlUtil.toXML(xmlObj);
		StringEntity postEntity = new StringEntity(postDataXML, "UTF-8");
		httpPost.addHeader("Content-Type", "text/xml");
		httpPost.setEntity(postEntity);
		httpPost.setConfig(requestConfig);
		try {
			HttpResponse response = httpClient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			result = EntityUtils.toString(entity, "UTF-8");
		} catch (ConnectionPoolTimeoutException e) {
			log.error("http get throw ConnectionPoolTimeoutException(wait time out)");

		} catch (ConnectTimeoutException e) {
			log.error("http get throw ConnectTimeoutException");

		} catch (SocketTimeoutException e) {
			log.error("http get throw SocketTimeoutException");

		} catch (Exception e) {
			log.error("http get throw Exception");

		} finally {
			httpPost.abort();
		}
		return (T) JaxbXmlUtil.readString( clazz,result);
	}

	/**
	 * 设置连接超时时间
	 * 
	 * @param socketTimeout
	 *            连接时长，默认10秒
	 */
	public void setSocketTimeout(int socketTimeout) {
		socketTimeout = socketTimeout;
		resetRequestConfig();
	}

	/**
	 * 设置传输超时时间
	 * 
	 * @param connectTimeout
	 *            传输时长，默认30秒
	 */
	public void setConnectTimeout(int connectTimeout) {
		connectTimeout = connectTimeout;
		resetRequestConfig();
	}

	private void resetRequestConfig() {
		requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout)
				.setConnectTimeout(connectTimeout).build();
	}

	/**
	 * 允许商户自己做更高级更复杂的请求器配置
	 * 
	 * @param requestConfig
	 *            设置HttpsRequest的请求器配置
	 */
	public void setRequestConfig(RequestConfig requestConfig) {
		requestConfig = requestConfig;
	}
}
