public class Calculate {
	
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		float first = Float.valueOf(arg[0]);
		float second = Float.valueOf(arg[1]);
		float devided = first/second;
		System.out.println("Dev:  " + devided);
	}
	
}