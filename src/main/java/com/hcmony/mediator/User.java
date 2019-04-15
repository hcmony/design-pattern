package com.hcmony.mediator;

/**
 * <h3>
 *     中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。
 *     这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。
 *     中介者模式属于行为型模式。
 * </h3>
 * <p>
 *     	优点： 1、降低了类的复杂度，将一对多转化成了一对一。 2、各个类之间的解耦。 3、符合迪米特原则。
 		缺点：中介者会庞大，变得复杂难以维护。
 		使用场景： 1、系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象。
 				2、想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。
 		注意事项：不应当在职责混乱的时候使用。
 * </p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 21:01
 */
public class User {
	private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void say(){
		Mediator.say(this.name);
	}

	public static void main(String[] args) {
		User user = new User();
		user.setName("中介者");
		user.say();
	}
}
