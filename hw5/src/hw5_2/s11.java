package hw5_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class s11 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�п�J�r��");
		try {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			String str1 = br1.readLine();
			System.out.println("�w��J�r��"+str1);
		
		} catch (IOException e) {
			System.out.println("��J��X���~");
			// TODO: handle exception
		}
	}

}
