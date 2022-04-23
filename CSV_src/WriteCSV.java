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
		//��� ��Ʈ�� ������Ʈ ����
		BufferedWriter bufWriter = null;
		try {
			bufWriter = Files.newBufferedWriter(Paths.get("***.csv"), Charset.forName("UTF-8"));
			//CSV���� �б�
			List<List<String>> allData = readCSV();
			for(List<String> newLine : allData) {
			
				//1����� ������
				List<String> list = newLine;
				
				for (String data : list) {
					bufWriter.write(data);
					bufWriter.write(",");
				}
				
				//�߰��� �̸� ������ �߰�
				bufWriter.write("�̸�");
				
				//���� �ڵ� �߰�
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






















