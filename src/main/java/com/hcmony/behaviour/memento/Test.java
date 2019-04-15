package com.hcmony.behaviour.memento;

/**
 * <h3>
 *     备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。
 * </h3>
 * <p>
 *    	优点： 	1、给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。
 *    			2、实现了信息的封装，使得用户不需要关心状态的保存细节。
 		缺点：	消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
 		使用场景： 1、需要保存/恢复数据的相关状态场景。
 				 2、提供一个可回滚的操作。
 		注意事项： 1、为了符合迪米特原则，还要增加一个管理备忘录的类。
                 2、为了节约内存，可使用原型模式+备忘录模式。
 * </p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 21:07
 */
public class Test {
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		originator.setState("State -- 1");
		originator.setState("State  -- 2");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State  -- 3");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State  -- 4");

		System.out.println("Current State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State: " + originator.getState());
	}
}
