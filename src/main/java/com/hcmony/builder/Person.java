package com.hcmony.builder;

/**
 * <h3>建造者模式</h3>
 * <p>建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。</p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 20:13
 */
public class Person {
	private String name;
	private int age;
	private String sex;

	public static class Build{
		private String name;
		private int age;
		private String sex;
		public Build setname(String name){
			this.name = name;
			return this;
		}
		public Build setage(int age){
			this.age = age;
			return this;
		}
		public Build setsex(String age){
			this.sex = sex;
			return this;
		}

		public  Person build(){
			return new Person(this);
		}
	}
	public Person (Build build){
		this.name=build.name;
		this.age=build.age;
		this.sex=build.sex;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}

	public static void main(String[] args) {
		Person person = new Build().setage(30).build();
		System.out.println(person.getAge());
	}
}

