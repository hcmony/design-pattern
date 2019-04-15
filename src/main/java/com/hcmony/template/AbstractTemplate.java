package com.hcmony.template;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 21:24
 */
public abstract class AbstractTemplate {

	/*主方法，实现对本类其它方法的调用*/
	public final int calculate(String exp,String opt){
		int array[] = split(exp,opt);
		return calculate(array[0],array[1]);
	}

	/*被子类重写的方法*/
	abstract public int calculate(int num1,int num2);

	public int[] split(String exp,String opt){
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}
