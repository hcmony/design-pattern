package com.hcmony.factory.abstractFactory;

import com.hcmony.factory.factory.MyClassTwo;
import com.hcmony.factory.factory.MyInterface;

/**
 * <h3>
 *     	抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。
 *     	该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 		在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
 </h3>
 * <p>
 *		优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 		缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
 		使用场景： 1、QQ 换皮肤，一整套一起换。 2、生成不同操作系统的程序。
 		注意事项：产品族难扩展，产品等级易扩展。
 * </p>
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
