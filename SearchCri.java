package food;

public class SearchCri {

	int min;
	int max;

	public SearchCri(int low, int high) {
		this.min = low;
		this.max = high;

	}

	@Override
	public String toString() {
		return "SearchCri [min=" + min + ", max=" + max + "]";
	}

}
