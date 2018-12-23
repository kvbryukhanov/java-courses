import java.util.Scanner;

/**
	Класс для запуска калькулятора, поддерживает ввод пользователя.
*/
public class InteractRunner {

	public static void main(String[] arg) {
		Scanner reader = new Scanner (System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			String cleaning = "yes";
			String first = "0";
			while(!exit.equals("yes")) {
				if (cleaning.equals("yes")) {
					System.out.println("Enter first arg : ");
					first = reader.next();
				}else {
					first = String.valueOf(calc.getResult());
					System.out.println("First arg is " + first);
				}
				System.out.println("Enter second arg : ");
				String second = reader.next();
				System.out.println("Enter operator : ");
				String operator = reader.next();
				calc.add(operator, Float.valueOf(first), Float.valueOf(second));
				System.out.println("Result : " + calc.getResult());
				System.out.println("Do you want clean the result? yes/no");
				cleaning = reader.next(); 
				if (cleaning.equals("yes")){
					calc.cleanResult();
				}
				System.out.println("Exit : yes/no ");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
	
}