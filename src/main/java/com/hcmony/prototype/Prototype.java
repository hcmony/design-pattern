package com.hcmony.prototype;

import java.io.*;

/**
 * <h3>原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 		这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。
 		例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。</h3>
 * <p>
 *   使用场景： 1、资源优化场景。
 *            2、类初始化需要消化非常多的资源，这个资源包括数据、硬件资源等。
 *   		  3、性能和安全要求的场景。
 *   		  4、通过 new 产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
 *   		  5、一个对象多个修改者的场景。
 *   		  6、一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式拷贝多个对象供调用者使用。
 *   		  7、在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过 clone 的方法创建一个对象，然后由工厂方法提供给调用者。
 *   		    原型模式已经与 Java 融为浑然一体，大家可以随手拿来使用。
     注意事项：与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。
 			 浅拷贝实现 Cloneable，重写，深拷贝是通过实现 Serializable 读取二进制流。
 *
 * </p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 20:23
 */
public class Prototype implements Cloneable,Serializable {

	private static final long serialVersionUID = -9204468401262904300L;

	private int base;
	private Integer obj;

	@Override //浅拷贝
	public Object clone() throws CloneNotSupportedException{
		Prototype proto = (Prototype) super.clone();
		return proto;
	}

	//深拷贝
	public Object deepClone() throws IOException, ClassNotFoundException {

		// 写入当前对象的二进制流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		// 读出二进制流产生的新对象
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public Integer getObj() {
		return obj;
	}

	public void setObj(Integer obj) {
		this.obj = obj;
	}

}
