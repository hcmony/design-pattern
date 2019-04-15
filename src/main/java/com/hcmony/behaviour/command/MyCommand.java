package com.hcmony.behaviour.command;

/**
 * <h3>命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。
 * 		请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 * </h3>
 * <p>	优点： 1、降低了系统耦合度。 2、新的命令可以很容易添加到系统中去。
 		缺点：使用命令模式可能会导致某些系统有过多的具体命令类。
 		使用场景：认为是命令的地方都可以使用命令模式，比如： 1、GUI 中每一个按钮都是一条命令。 2、模拟 CMD。
 		注意事项：系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作，也可以考虑使用命令模式，见命令模式的扩展。
 </p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 17:18
 */
public class MyCommand implements CommandInteface {
	private Command command;

	public MyCommand(Command command){
		this.command = command;
	}
	@Override
	public void exe() {
		command.action();
	}
}
