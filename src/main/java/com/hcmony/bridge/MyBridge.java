package com.hcmony.bridge;

/**
 * <h3>桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。
 * 		这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
 * </h3>
 * <p>
 *     	优点： 1、抽象和实现的分离。 2、优秀的扩展能力。 3、实现细节对客户透明。
 		缺点：桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
 		使用场景： 1、如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，
 					通过桥接模式可以使它们在抽象层建立一个关联关系。
 				 2、对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。
 			     3、一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
 		注意事项：对于两个独立变化的维度，使用桥接模式再适合不过了。
 *
 * </p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/08 20:05
 */
public class MyBridge extends BridgeAbstract {
	@Override
	public void say() {
		super.say();
	}

	public static void main(String[] args) {
		BridgeAbstract myBridge = new MyBridge();
		myBridge.setBridge(new BridgeTwo());
		myBridge.say();
		myBridge.setBridge(new BridgeOne());
		myBridge.say();
	}
}
