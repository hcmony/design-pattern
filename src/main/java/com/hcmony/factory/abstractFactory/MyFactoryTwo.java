package com.hcmony.factory.abstractFactory;

import com.hcmony.factory.factory.MyClassTwo;
import com.hcmony.factory.factory.MyInterface;

/**
 * <h3>工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则。

 为解决这个问题，我们来看看抽象工厂模式：创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。

 这样就符合闭包原则了。</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 21:27
 */
public class MyFactoryTwo implements Provider {
	@Override
	public MyInterface produce() {
		return new MyClassTwo();
	}

	public static void main(String[] args) {
		Provider provider = new MyFactoryOne();
		MyInterface my = provider.produce();
		my.print();
	}
}
