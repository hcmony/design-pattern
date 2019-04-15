package com.hcmony.structural.flyweight;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 20:25
 */
public class Flyweight {
	private  String name;
	public Flyweight(String name){
		this.name=name;
	}

	@Override
	public String toString() {
		return "Flyweight{" +
				"name='" + name + '\'' +
				'}';
	}
}
