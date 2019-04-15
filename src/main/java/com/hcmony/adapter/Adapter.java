package com.hcmony.adapter;

/**
 * <h3>
 *     适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。
 *     这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
 * </h3>
 * <p>
     	优点： 	1、可以让任何两个没有关联的类一起运行。
 				2、提高了类的复用。 3、增加了类的透明度。 4、灵活性好。
 		缺点： 	1、过多地使用适配器，会让系统非常零乱，不易整体进行把握。
 					比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现，一个系统如果太多出现这种情况，
 					无异于一场灾难。因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。
 				2.由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类。
      	使用场景：有动机地修改一个正常运行的系统的接口，这时应该考虑使用适配器模式。
      	注意事项：适配器不是在详细设计时添加的，而是解决正在服役的项目的问题。
    </p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 20:23
 */
public class Adapter  extends AdapterAbstract{
	@Override
	public boolean add() {
		System.out.println("只实现一个add方法");
		return true;
	}

	public static void main(String[] args) {
		AdapterInterface adapterInterface = new Adapter();
		adapterInterface.add();
	}
}
