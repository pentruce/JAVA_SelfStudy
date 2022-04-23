//csv - use line.contains code

package CSVReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String path = "C:\\Users\\kopo15\\Desktop\\파일합치기\\before_covid_20180101_****.csv";
		String line = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));

			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				//break; - 첫번째줄 표시해줌. - 시작점 알 수 있음.
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
