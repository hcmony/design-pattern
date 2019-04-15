package com.hcmony.structural.bridge;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/08 20:02
 */
public abstract class BridgeAbstract {
	private Bridge bridge;

	public void say(){
		bridge.say();
	}

	public Bridge getBridge() {
		return bridge;
	}

	public void setBridge(Bridge bridge) {
		this.bridge = bridge;
	}
}
