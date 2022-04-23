package WhiteBoard;
//kopo_15
public class Arithmetic_Operator {

	public static void main(String[] args) {
		
		//특수한 계산
		int result = 1;
		result += 2;
		System.out.println("result = 1 => result += 2 => result = " + result);
		
		//특수한 계산2
		System.out.println("result = 1 => ++result");
		result = 1;
		printValue(++result);
		System.out.printf("result = ", + result);
		
		//특수한 계산3
		System.out.println("result = 1 => result++");
		result = 1;
		printValue(result++);
		System.out.printf("result = " + result);
	
	}

	private static void printValue(int value) {
		System.out.println("Return: value = " + value);
	}
}

//Console Result
//result = 1 => result += 2 => result = 3
//result = 1 => ++result
//Return: value = 2
//result = result = 1 => result++
//Return: value = 1
//result = 2