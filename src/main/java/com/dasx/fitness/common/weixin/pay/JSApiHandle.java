package com.dasx.fitness.common.weixin.pay;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

import javax.xml.bind.JAXBException;

import com.dasx.fitness.common.weixin.Configure;
import com.dasx.fitness.common.weixin.pay.protocol.JSApiPayReqData;
import com.dasx.fitness.common.weixin.pay.protocol.JSApiResPayData;

public class JSApiHandle extends BaseHandle {

	public JSApiHandle() throws ClassNotFoundException, IllegalAccessException, InstantiationException{
		super(Configure.PAY_API);
	}
	
	/**
	 * 预下单
	 * @param scanPayReqData
	 * @return
	 * @throws UnrecoverableKeyException
	 * @throws KeyManagementException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyStoreException
	 * @throws IOException
	 * @throws JAXBException 
	 */
	public JSApiResPayData unifiedorder(JSApiPayReqData payReqData) throws UnrecoverableKeyException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, JAXBException{
		return  sendPost(payReqData,JSApiResPayData.class);
	}
	
	
}
