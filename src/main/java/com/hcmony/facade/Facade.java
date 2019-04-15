package com.hcmony.facade;

/**
 * <h3>
 *     外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。
 *     这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。
 		这种模式涉及到一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。
 * </h3>
 * <p>
 *     	优点： 1、减少系统相互依赖。 2、提高灵活性。 3、提高了安全性。
 		缺点：不符合开闭原则，如果要改东西很麻烦，继承重写都不合适。
 		使用场景： 1、为复杂的模块或子系统提供外界访问的模块。 2、子系统相对独立。 3、预防低水平人员带来的风险。
 		注意事项：在层次化结构中，可以使用外观模式定义系统中每一层的入口。
 * </p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 20:25
 */
public class Facade {
	private Animal animal;
	private Person person;

	public Facade(){
		this.animal = new Animal();
		this.person = new Person();
	}

	public void cry(){
		animal.cry();
	}
	public void say(){
		person.say();
	}

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.say();
		facade.cry();
	}
}
