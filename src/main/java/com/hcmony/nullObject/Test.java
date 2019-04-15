package com.hcmony.nullObject;

/**
 * <h3>空对象模式</h3>
 * <p>
 *      在空对象模式（Null Object Pattern）中，一个空对象取代 NULL 对象实例的检查。
 *      Null 对象不是检查空值，而是反应一个不做任何动作的关系。这样的 Null 对象也可以在数据不可用的时候提供默认的行为。
 		在空对象模式中，我们创建一个指定各种要执行的操作的抽象类和扩展该类的实体类，
 		还创建一个未对该类做任何实现的空对象类，该空对象类将无缝地使用在需要检查空值的地方。
 * </p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 21:19
 */
public class Test {

	public static void main(String[] args) {

		AbstractCustomer customer1 = CustomerFactory.getCustomer("one");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("two");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("five");


		System.out.println("obj");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());

	}
}