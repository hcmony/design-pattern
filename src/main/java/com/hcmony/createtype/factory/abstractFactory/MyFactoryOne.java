package com.hcmony.createtype.factory.abstractFactory;

import com.hcmony.createtype.factory.factory.MyClassOne;
import com.hcmony.createtype.factory.factory.MyInterface;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 21:27
 */
public class MyFactoryOne implements Provider {
	@Override
	public MyInterface produce() {
		return new MyClassOne();
	}
}
