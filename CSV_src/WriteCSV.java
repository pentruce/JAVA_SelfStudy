package CSV;
//KOPO_15

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WriteCSV {

	public static void main(String[] args) {
		//출력 스트림 오브젝트 생성
		BufferedWriter bufWriter = null;
		try {
			bufWriter = Files.newBufferedWriter(Paths.get("***.csv"), Charset.forName("UTF-8"));
			//CSV파일 읽기
			List<List<String>> allData = readCSV();
			for(List<String> newLine : allData) {
			
				//1행분의 데이터
				List<String> list = newLine;
				
				for (String data : list) {
					bufWriter.write(data);
					bufWriter.write(",");
				}
				
				//추가할 이름 데이터 추가
				bufWriter.write("이름");
				
				//개행 코드 추가
				bufWriter.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bufWriter != null) {
					bufWriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
