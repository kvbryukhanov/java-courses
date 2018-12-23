/**
	Класс для запуска калькулятора с параметрами
*/

public class ArgRunner {
	
	public static void main (String[] arg){
		System.out.println("Calculate");
		if (arg.length == 2) {
			int first = Integer.valueOf(arg[0]);
			int second = Integer.valueOf(arg[2]);
			Calculator calc = new Calculator();
			calc.add(first,second);
			System.out.println("Sum : " + calc.getResult());
		}else {
			System.out.println("Enter two parameters.");
		}
	}
}