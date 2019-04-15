package com.hcmony.createtype.prototype;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/08 17:33
 */
public class PrototypeTest {
	public static void main(String[] args) throws Exception{
		Prototype prototype = new Prototype();
		prototype.setBase(1);
		prototype.setObj(new Integer(2));
        //浅拷贝
		Prototype prototype1 = (Prototype) prototype.clone();
        //深拷贝
		Prototype prototype2 = (Prototype) prototype.deepClone();
		System.out.println(prototype1.getObj()==prototype1.getObj());
		System.out.println(prototype1.getObj()==prototype2.getObj());
	}
}
