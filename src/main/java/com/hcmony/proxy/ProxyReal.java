package com.hcmony.proxy;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 09:43
 */
public class ProxyReal implements ProxyInteface {
	@Override
	public void add() {
		System.out.println("这是真实的类");
	}
}
