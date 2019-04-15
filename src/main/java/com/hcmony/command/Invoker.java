package com.hcmony.command;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 17:20
 */
public class Invoker {
	private CommandInteface inteface;
	public Invoker(CommandInteface inteface){
		this.inteface=inteface;
	}
	public void action(){
		inteface.exe();
	}

	public static void main(String[] args) {
		Command command = new Command();
		CommandInteface inteface = new MyCommand(command);
		Invoker invoker = new Invoker(inteface);
		invoker.action();
	}
}
