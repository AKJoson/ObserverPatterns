package com.test.yp;

public abstract class BaseAdapter implements InotifyDataChange {
	private InotifyDataChange nInotifyDataChange;
	@Override
	public void notifyDataChange() {
		// 告知ListView,数据已经改变，需要刷新
		nInotifyDataChange.notifyDataChange();
	}
	
	public void registerNotify(InotifyDataChange nInotifyDataChange) {
		this.nInotifyDataChange = nInotifyDataChange;
	}
	public abstract int getSize();

}
