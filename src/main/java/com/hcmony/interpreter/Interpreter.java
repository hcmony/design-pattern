package com.hcmony.interpreter;

/**
 * <h3>
 *     解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。
 *     这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。
 * </h3>
 * <p>
 *     	优点： 1、可扩展性比较好，灵活。 2、增加了新的解释表达式的方式。 3、易于实现简单文法。
 		缺点： 1、可利用场景比较少。 2、对于复杂的文法比较难维护。 3、解释器模式会引起类膨胀。 4、解释器模式采用递归调用方法。
 		使用场景： 1、可以将一个需要解释执行的语言中的句子表示为一个抽象语法树。
 				2、一些重复出现的问题可以用一种简单的语言来进行表达。 3、一个简单语法需要解释的场景。
		 注意事项：可利用场景比较少，JAVA 中如果碰到可以用 expression4J 代替。
 * </p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 20:27
 */
public class Interpreter {
	public static void main(String[] args) {

		// 计算1+1-2的值
		int result = new Minus().interpret((new Context(new Plus()
				.interpret(new Context(1, 1)), 2)));
		System.out.println(result);
	}
}
