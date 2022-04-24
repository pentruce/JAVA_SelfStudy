package WhiteBoard;
//KOPO_15
//"+" 연산자 대신에 문자열 연결에 이용할 수 있는 클래스 : StringBuilder!!
public class StringBuilder {

	public static void main(String[] args) {
		String text1 = "KOPO";
		String text2 = "15";
		StringBuilder sb = new StringBuilder();
		sb.append(text1);
		sb.append(text2);
		
		String resultString = sb.toString();
		System.out.println(resultString);
		
	}

	private void append(String text) {
	}
}
