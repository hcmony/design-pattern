package com.hcmony.createtype.factory.staticFactory;

import com.hcmony.createtype.factory.factory.MyClassOne;
import com.hcmony.createtype.factory.factory.MyClassTwo;
import com.hcmony.createtype.factory.factory.MyInterface;

/**
 * <h3>静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 21:23
 */
public class MyFactory {
	public static MyInterface produceOne(){
		return  new MyClassOne();
	}
	public static MyInterface produceTwo(){
		return  new MyClassTwo();
	}

	public static void main(String[] args) {
		MyFactory.produceOne().print();
		MyFactory.produceTwo().print();
	}
}
