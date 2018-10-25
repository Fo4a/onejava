public class Calculator{
	public static void main (String[] args){
		double numberOne = 3;
		double numberTwo = 100;
		int numberThree = (int)numberTwo;
		char sign = '+';
		if ('+' == sign){
			System.out.println(numberOne + numberTwo);
		}
		else if ('-' == sign){
			System.out.println(numberOne - numberTwo);
		}
		else if ('/' == sign){
			System.out.println(numberTwo / numberOne);
		}
        System.out.println((int)'a');
	}
}