package teacher.com.javacore.ExceptionHandling.Sample03_CheckedException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		File file = new File("F://files//Test.txt");

		try {
			FileReader fr = new FileReader(file);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Không tìm thấy file");
		}

	}

}
