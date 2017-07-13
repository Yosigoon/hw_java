package p1;

public class MovieTiket {

	public static void main(String[] args) {
		double tiket = 5.0;
		double customer = 200;
		double basicCost = 120.0;
		double perCost = 0.5;
		double result = 0;

		double plustCost, minusCost, total;

		for (;;) {
			plustCost = tiket * customer;
			minusCost = basicCost + (perCost * customer);
			total = plustCost - minusCost;
			tiket = tiket - 0.1;
			customer = customer + 15;
			if (tiket < 1.0) {

				
			}
			System.out.println("total>>" + total + "plustCost>>" + plustCost + "customer>>" + customer);
			break;
		}

	}
}
