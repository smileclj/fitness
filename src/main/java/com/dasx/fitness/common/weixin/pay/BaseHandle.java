package com.dasx.fitness.common.weixin.pay;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

import javax.xml.bind.JAXBException;

public class BaseHandle {
	  //API的地址
    private String apiURL;

    private HttpsRequest httpsRequest=HttpsRequest.getInstance();
    
    public BaseHandle(String api) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        apiURL = api;
    }

    protected <T>T sendPost(Object xmlObj,Class<T> clazz) throws UnrecoverableKeyException, IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, JAXBException {
        return httpsRequest.postXML(apiURL,xmlObj,clazz);
    }
}
