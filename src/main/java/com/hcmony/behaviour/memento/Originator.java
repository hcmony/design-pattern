package com.hcmony.behaviour.memento;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 21:06
 */
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento saveStateToMemento(){
		return new Memento(state);
	}

	public void getStateFromMemento(Memento Memento){
		state = Memento.getState();
	}
}
