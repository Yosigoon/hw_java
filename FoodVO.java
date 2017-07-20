package food;

public class FoodVO {
	
	String name;
    int price;

    public FoodVO(String name, int price) {

        this.name = name;

        this.price = price;

    }

    public boolean accept(SearchCri cri) {

        if (cri.min > this.price) {
            return false;
        }
        if (cri.max < this.price) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FoodVo [name=" + name + ", price=" + price + "]";
    }

}
