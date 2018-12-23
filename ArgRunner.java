/**
	Класс для запуска калькулятора с параметрами
*/

public class ArgRunner {
	
	/**
		@param первое число, второе число, операция
	*/
	
	public static void main (String[] arg){
		System.out.println("Calculate");
		if (arg.length == 3) {
			float first = Integer.valueOf(arg[1]);
			float second = Integer.valueOf(arg[2]);
			String operation = arg[0];
			Calculator calc = new Calculator();
			calc.add(operation,first,second);
			System.out.println("Sum : " + calc.getResult());
		}else {
			System.out.println("Enter two parameters.");
		}
	}
}