//csv - use line.contains code

package CSVReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String path = "C:\\Users\\kopo15\\Desktop\\������ġ��\\before_covid_20180101_****.csv";
		String line = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));

			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				//break; - ù��°�� ǥ������. - ������ �� �� ����.
				String[] values = line.split(",");
				if (line.contains("***") && !line.contains("**")) { 
				System.out.println(values[0]+values[11]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
