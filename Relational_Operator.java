package WhiteBoard;
//kopo_15
public class Relational_Operator {

	public static void main(String[] args) {
		//1-������ �����͸� �����ڷ� ���ϴ� ���
		boolean result = new Integer("1") == new Integer("1");
		System.out.println("new Integer(\"1\") == new Integer(\"1\") => result = " +result);
		
		//2-������ �����͸� equals method�� ���ϴ� ���
		result = new Integer("1").equals(new Integer("1"));
		System.out.println("new Integer(\"1\").equals(new Integer(\"1\")) => result = " + result);
		
		//3-������ �����͸� compareTo method�� ���ϴ� ���
		int resultValue = new Integer("1").compareTo(new Integer("1"));
		System.out.println("new Integer(\"1\").compareTo(new Integer(\"1\")) => resultValue = " + resultValue);
		
		resultValue = new Integer("1").compareTo(new Integer("2"));
		System.out.println("new Integer(\"1\").compareTo(new Integer(\"2\")) => resultValue = " + resultValue);
		
		resultValue = new Integer("2").compareTo(new Integer("1"));
		System.out.println("new Integer(\"2\").compareTo(new Integer(\"1\")) => resultValue = " + resultValue);
	}

}

////Console
//new Integer("1") == new Integer("1") => result = false
//new Integer("1").equals(new Integer("1")) => result = true
//new Integer("1").compareTo(new Integer("1")) => resultValue = 0
//new Integer("1").compareTo(new Integer("2")) => resultValue = -1
//new Integer("2").compareTo(new Integer("1")) => resultValue = 1
