package com.hcmony.structural.decorator;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 20:25
 */
public class Decorator implements DecoratorInterface{
	@Override
	public void add() {
		System.out.println("这是Decorator的add 方法");
	}
}
