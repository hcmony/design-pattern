package com.hcmony.factory.moreFactory;

import com.hcmony.factory.factory.MyClassOne;
import com.hcmony.factory.factory.MyClassTwo;
import com.hcmony.factory.factory.MyInterface;

/**
 * <h3>多个工厂方法模式，是对普通工厂方法模式的改进，多个工厂方法模式就是提供多个工厂方法，分别创建对象</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 21:21
 */
public class MyFactory {
	public MyInterface produceOne() {
		return new MyClassOne();
	}

	public MyInterface produceTwo() {
		return new MyClassTwo();
	}

	public static void main(String[] args) {
		MyFactory factory = new MyFactory();
		MyInterface my = factory.produceOne();
		my.print();
	}
}
