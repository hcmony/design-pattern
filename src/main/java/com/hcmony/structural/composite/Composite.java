package com.hcmony.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>
 *     	组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。
 * 		组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 		这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。
 * </h3>
 * <p>	优点： 1、高层模块调用简单。 2、节点自由增加。
 		缺点：在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
 		使用场景：部分、整体场景，如树形菜单，文件、文件夹的管理。
 		注意事项：定义时为具体类。
 </p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/03 20:24
 */
public class Composite {
	private String name;
	private int age;
	private List<Composite> list;
	public Composite(){}
	public Composite(String name,int age){
		this.age=age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Composite{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Composite> getList() {
		return list;
	}

	public void setList(List<Composite> list) {
		this.list = list;
	}

	public static void main(String[] args) {
		//小明有两个儿子
		Composite composite = new Composite("小明",80);
		Composite sonComposite1 = new Composite("儿子1",55);
		Composite sonComposite2 = new Composite("儿子2",50);
		List<Composite> son = new ArrayList<>();
		son.add(sonComposite1);
		son.add(sonComposite2);
		composite.setList(son);

		//大儿子生了两个儿子
		Composite grandsonComposite1 = new Composite("孙子1",25);
		Composite grandsonComposite2 = new Composite("孙子2",22);
		List<Composite> grandson = new ArrayList<>();
		grandson.add(grandsonComposite1);
		grandson.add(grandsonComposite2);
		sonComposite1.setList(grandson);

		//二儿子生了一个儿子
		Composite grandsonComposite3 = new Composite("孙子3",20);
		List<Composite> grandson2 = new ArrayList<>();
		grandson2.add(grandsonComposite3);
		sonComposite2.setList(grandson2);

		//循环出小明的后代
		for (Composite sons:composite.getList()){
			System.out.println(sons);
			for (Composite grandsons:sons.getList()){
				System.out.println(grandsons);
			}
		}
	}
}
