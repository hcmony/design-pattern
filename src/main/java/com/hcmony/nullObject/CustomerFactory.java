package com.hcmony.nullObject;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 21:19
 */
public class CustomerFactory {

	public static final String[] names = {"one", "two", "three"};

	public static AbstractCustomer getCustomer(String name){
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)){
				return new RealCustomer(name);
			}
		}
		return new NullObject();
	}
}
