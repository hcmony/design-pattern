package com.hcmony.singleton;

/**
 * <h3>单例模式,这种有并发问题，还有很多没有写</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 20:13
 */
public class Singleton {
	private volatile static Singleton singleton = new Singleton();
	private Singleton (){}
	public static synchronized Singleton getInstance(){
		return singleton;
	}

}
