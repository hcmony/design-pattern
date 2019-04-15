package com.hcmony.state;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 21:12
 */
public class StartState implements State {


	@Override
	public void doAction(Context context) {
		System.out.println("StartState doAction");
		context.setState(this);
	}

}
