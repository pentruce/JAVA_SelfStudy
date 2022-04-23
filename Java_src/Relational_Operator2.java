package WhiteBoard;
//kopo_15
import java.io.Serializable;
import java.math.BigDecimal;
public class Relational_Operator2 {

	public static void main(String[] args) {
	
		//자료형 비교
		String value = "abcde";
		boolean result = value instanceof String;
		System.out.println("[1] \"abcde\" instanceof String => result = " + result);
		
		//상속한 클래스와 자료형 비교
		result = value instanceof Object;
		System.out.println("[2] \"abcde\" instanceof String => Object = " + result);
		
		//인터페이스와 자료형 비교
		result = value instanceof Serializable;
		System.out.println("[3] \"abcde\" instanceof Serializable => result = " + result);
		
		//일치하지 않는 자료형과 비교
		Object object = "abcde";
		result = object instanceof BigDecimal;
		System.out.println("[4] \"abcde\" instanceof BigDecimal => result = " + result);
	}
}

//Console
//[1] "abcde" instanceof String => result = true
//[2] "abcde" instanceof String => Object = true
//[3] "abcde" instanceof Serializable => result = true
//[4] "abcde" instanceof BigDecimal => result = false
