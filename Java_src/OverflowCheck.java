package WhiteBoard;
//kopo_15
public class OverflowCheck {

	public static void main(String[] args) {
		int i = Integer.MAX_VALUE + 1;
		String value = Integer.toUnsignedString(i);
		System.out.println(value);
		
		i = Integer.MAX_VALUE + Integer.MAX_VALUE + 1;
		value = Integer.toUnsignedString(i);
		System.out.println(value);
		
		i = i + 1;
		value = Integer.toUnsignedString(i);
		System.out.println(value);
		
		long l = Long.MAX_VALUE + Long.MAX_VALUE + 1;
		value = Long.toUnsignedString(l);
		System.out.println(value);
		
		l = l + 1;
		value = Long.toUnsignedString(l);
		System.out.println(value);
	}

}

//Console
//2147483648
//4294967295
//0
//18446744073709551615
//0