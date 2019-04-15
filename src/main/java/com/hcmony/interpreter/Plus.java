package com.hcmony.interpreter;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 17:43
 */
public class Plus implements Expression {
	@Override
	public int interpret(Context context) {
		return context.getNum1()+context.getNum2();
	}
}
