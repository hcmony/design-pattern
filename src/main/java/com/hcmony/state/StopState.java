package com.hcmony.state;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 21:13
 */
public class StopState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("StopState doAction");
		context.setState(this);
	}

}
