import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineFileExam {

	public static void main(String[] args) {
		//�����а� ��������
		FileReader fr;
		try {
			fr = new FileReader("src/dataw.txt");
			//�����а� ��������
			BufferedReader br = new BufferedReader(fr);
			//��������
			String s;
			while((s = br.readLine()) != null) {
				//ȭ�鿡 �������
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}






