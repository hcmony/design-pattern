package com.hcmony.behaviour.iterator;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/04/09 17:50
 */
public class Repository implements Container {
	public String names[];

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	public Repository(String[] names) {
		this.names = names;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	private class NameIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			if(index < names.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return names[index++];
			}
			return null;
		}
	}

	public static void main(String[] args) {
		String[] names = {"a","b","c"};
		Repository repository = new Repository(names);

		for(Iterator iter = repository.getIterator(); iter.hasNext();){
			String name = (String)iter.next();
			System.out.println("Name : " + name);
		}
	}
}
