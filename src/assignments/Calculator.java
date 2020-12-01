package assignments;

public class Calculator {
	int num1, num2;
	
	public Calculator(int i, int j) {
		num1 = i;
		num2 = j;
	}
	
	public int add() {
		return (num1+num2);
	}
	public int mult() {
		return num1*num2;
	}
	public int sub() {
		return num1-num2;
	}
	public int div() {
		return num1/num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator(9,3);
		System.out.println(calc.add());
		System.out.println(calc.sub());
		System.out.println(calc.mult());
		System.out.println(calc.div());
	}

}
