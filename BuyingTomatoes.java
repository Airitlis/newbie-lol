
public class BuyingTomatoes {

	/*
	 * $ java BuyingTomatoes
 Enter number of pounds: 5.0
 Enter cost per LB: 3.5
 RESULT: 17.5
	 */
	public static void main(String[] args) {
		System.out.print("Enter number of pounds: ");
		double lbs = IO.readDouble();
		System.out.print("Enter cost per lb: ");
		double cost = IO.readDouble();
		
		if (lbs <= 0 || cost <= 0) {
			System.out.println("lb and cost value needs to be positive");
		}
		else {
			double RESULT = lbs * cost;
			IO.outputDoubleAnswer(RESULT);

	}
	}
}



