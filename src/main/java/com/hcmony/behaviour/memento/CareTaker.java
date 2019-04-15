package com.hcmony.behaviour.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 21:07
 */
public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();

	public void add(Memento state){
		mementoList.add(state);
	}

	public Memento get(int index){
		return mementoList.get(index);
	}
}
