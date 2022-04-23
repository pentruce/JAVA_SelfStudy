//csv - version2

package CSVReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.IntStream;

public class Main2 {

	public static void main(String[] args) {
		int sum = 0;
		int mean = 0;
		int max = 0;
		int min = 0;
		int check = 1;
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\\\kopo15\\\\��������_�α���Ȳ_�ñ���__20220317140112.csv"));
			String line;
			while ((line = br.readLine()) != null) {
				String[] array = line.split(",");
				if (array[0].contains("����Ư����") && !array[1].contains("�Ұ�")) {
					for (int i = 0; i< 3; i++) {
						array[i] = array[i].replaceAll("\"", ""); 
						System.out.println(array[i] + " ");
					}
					System.out.println();
					
					///find a "seoul", "area", "population"
					String num = array[2];
					sum = Integer.parseInt(num) + sum;
					if(check == 1) {
						min = Integer.parseInt(num);
				} else if (min >= Integer.parseInt(num)) {
					min = Integer.parseInt(num);
				}
				if (max <= Integer.parseInt(num)) {
					max = Integer.parseInt(num);
				}
				check++;
				}
			}
			mean = sum / check;
			System.out.println(sum);
			System.out.println(mean);
			System.out.println(max);
			System.out.println(min);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace(); // ����, ���, �ִ�, �ּ�
		}
	}
}
