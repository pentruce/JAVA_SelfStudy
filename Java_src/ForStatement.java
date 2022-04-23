package WhiteBoard;
//kopo_15

public class ForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for 문
		System.out.println("----- 카운터를 이용한 예제 -----");
		String stringValue = "KOPO15";
		
		for (int i = 0; i < stringValue.length(); i++) {
			System.out.println("\t[1]" + stringValue.charAt(i));
		}
		
		System.out.println("\n\n----- 배열을 이용한 예제 -----");
		char[] chars = stringValue.toCharArray();
		for (char charValue : chars) {
			System.out.println("\t[2]" + charValue);
		}
	
	}
}

////Console
//----- 카운터를 이용한 예제 -----
//[1]K
//[1]O
//[1]P
//[1]O
//[1]1
//[1]5
//
//
//----- 배열을 이용한 예제 -----
//[2]K
//[2]O
//[2]P
//[2]O
//[2]1
//[2]5
