package oop2;

public class LottoBall {

	int num;
	boolean selected;

	public LottoBall(int num) {
		this.num = num;
		this.selected = false;
	}

	public boolean askSelected() {

		if (selected) {
			return true;
		}
		this.selected = true;
		return false;
	}

	@Override
	public String toString() {
		return " [num:" + num + ", s:" + (selected?"1":"0") + "]";
	}

	

}
