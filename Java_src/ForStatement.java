package WhiteBoard;
//kopo_15

public class ForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for ��
		System.out.println("----- ī���͸� �̿��� ���� -----");
		String stringValue = "KOPO15";
		
		for (int i = 0; i < stringValue.length(); i++) {
			System.out.println("\t[1]" + stringValue.charAt(i));
		}
		
		System.out.println("\n\n----- �迭�� �̿��� ���� -----");
		char[] chars = stringValue.toCharArray();
		for (char charValue : chars) {
			System.out.println("\t[2]" + charValue);
		}
	
	}
}

////Console
//----- ī���͸� �̿��� ���� -----
//[1]K
//[1]O
//[1]P
//[1]O
//[1]1
//[1]5
//
//
//----- �迭�� �̿��� ���� -----
//[2]K
//[2]O
//[2]P
//[2]O
//[2]1
//[2]5
