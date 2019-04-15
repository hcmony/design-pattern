package com.hcmony.structural.adapter;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/08 19:33
 */
public abstract  class  AdapterAbstract implements AdapterInterface {
	@Override
	public boolean add() {
		return false;
	}

	@Override
	public boolean update() {
		return false;
	}

	@Override
	public boolean delete() {
		return false;
	}

	@Override
	public boolean find() {
		return false;
	}
}
