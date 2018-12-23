/**
	Класс реализует калькулятор
*/
public class Calculator {
	/**
		Результат вычисления
	*/
	private float result;
	
	/**
		Суммируем аргументы
		@param params Аргументы суммирования
	*/
	public void add(String operator, float ... params) {
		if (operator.equals("+")) {
			for (Float param : params) {
				this.result += param;
			}
		}else if (operator.equals("-")) {
			this.result = params[0] - params[1];
		}else if (operator.equals("*")) {
			this.result = params[0] * params[1];
		}else if (operator.equals("/")) {
			this.result = params[0] / params[1];
		}else if (operator.equals("^")) {
			this.result = (float)Math.pow(params[0], params[1]);
		}else{
			System.out.println("Operator must be +, -, /, *, ^ ");
		}
	}
	/**
		Получить результат
		@return результат вычисления.
	*/
	public float getResult() {
		return this.result;
	}
	/**
		Очистить результат вычисления
	*/
	public void cleanResult() {
		this.result = 0;
	}
}