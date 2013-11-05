package com.ait.com.restfull.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;

public class JSONPInterceptor extends AbstractPhaseInterceptor {
  
	public JSONPInterceptor(String phase) {
		super(phase);
	}

	@Override
	public void handleMessage(Message arg0) throws Fault {
		  System.out.println("*********In****Helloworld******");  
	}

}
