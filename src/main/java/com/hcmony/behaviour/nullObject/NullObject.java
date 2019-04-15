package com.hcmony.behaviour.nullObject;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 20:29
 */
public class NullObject  extends AbstractCustomer {

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "NullObject";
	}
}
