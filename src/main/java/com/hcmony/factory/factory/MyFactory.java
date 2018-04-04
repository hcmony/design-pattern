package com.hcmony.factory.factory;

/**
 * <h3>普通工厂模式就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 21:19
 */
public class MyFactory {
	public MyInterface produce(String type){
		if ("One".equals(type)) {
			return new MyClassOne();
		} else if ("Two".equals(type)) {
			return new MyClassTwo();
		} else {
			System.out.println("没有要找的类型");
			return null;
		}
	}

	public static void main(String[] args) {
		MyFactory factory = new MyFactory();
		MyInterface myi = factory.produce("Two");
		myi.print();
	}
}
