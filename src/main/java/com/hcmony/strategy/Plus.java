package com.hcmony.strategy;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 21:29
 */
public class Plus extends AbstractStrategy implements IntefaceStrategy{

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\+");
		return arrayInt[0] + arrayInt[1];
	}
}
