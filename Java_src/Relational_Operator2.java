package WhiteBoard;
//kopo_15
import java.io.Serializable;
import java.math.BigDecimal;
public class Relational_Operator2 {

	public static void main(String[] args) {
	
		//�ڷ��� ��
		String value = "abcde";
		boolean result = value instanceof String;
		System.out.println("[1] \"abcde\" instanceof String => result = " + result);
		
		//����� Ŭ������ �ڷ��� ��
		result = value instanceof Object;
		System.out.println("[2] \"abcde\" instanceof String => Object = " + result);
		
		//�������̽��� �ڷ��� ��
		result = value instanceof Serializable;
		System.out.println("[3] \"abcde\" instanceof Serializable => result = " + result);
		
		//��ġ���� �ʴ� �ڷ����� ��
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
