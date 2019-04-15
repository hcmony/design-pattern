package com.hcmony.behaviour.template;

/**
 * <h3>
 *     在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。
 *     它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。
 *     这种类型的设计模式属于行为型模式。
 * </h3>
 * <p>
 *    	优点： 1、封装不变部分，扩展可变部分。 2、提取公共代码，便于维护。 3、行为由父类控制，子类实现。
 		缺点：每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。
 		使用场景： 1、有多个子类共有的方法，且逻辑相同。 2、重要的、复杂的方法，可以考虑作为模板方法。
 		注意事项：为防止恶意操作，一般模板方法都加上 final 关键词。
 * </p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 21:26
 */
public class Test {
	public static void main(String[] args) {
		String exp = "2+3";
		AbstractTemplate cal = new Template();
		int result = cal.calculate(exp, "\\+");
		System.out.println(result);
	}
}

