package com.hcmony.decorator;

/**
 * <h3>
 *    装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。
 *    这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 * </h3>
 * <p>
 *     	优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
 		缺点：多层装饰比较复杂。
 		使用场景： 1、扩展一个类的功能。 2、动态增加功能，动态撤销。
 		注意事项：可代替继承。
  </p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/08 21:14
 */
public class DecoratorTest implements DecoratorInterface {
	private Decorator decorator;

	public DecoratorTest (Decorator decorator){
		super();
		this.decorator=decorator;
	}
	@Override
	public void add() {
		decorator.add();
		System.out.println("额外的新加方法");
	}

	public static void main(String[] args) {
		DecoratorTest test = new DecoratorTest(new Decorator());
		test.add();
	}
}
