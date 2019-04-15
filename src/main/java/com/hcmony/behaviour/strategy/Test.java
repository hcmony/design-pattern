package com.hcmony.behaviour.strategy;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 21:30
 */
public class Test {
	public static void main(String[] args) {
		String exp = "3+3";
		IntefaceStrategy cal = new Plus();
		int result = cal.calculate(exp);
		System.out.println("3+3 = "+ result);
	}

}
