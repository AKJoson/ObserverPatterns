package com.test.yp;

public class ListView implements InotifyDataChange{
	private BaseAdapter adapter;

	public void setAdapter(BaseAdapter adapter) {
		this.adapter = adapter;
		adapter.registerNotify(this);
	}

	@Override
	public void notifyDataChange() {
		// TODO Auto-generated method stub
		System.out.println("ListView开始从新getCount,getView,刷新界面");
		System.out.println(adapter.getSize());
	}
	

}
