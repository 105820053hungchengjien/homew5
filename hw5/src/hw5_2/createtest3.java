package hw5_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class createtest3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�п�J�r��");
		try {
			FileWriter fw1 = new FileWriter("test.txt");
			PrintWriter pw =new PrintWriter(new BufferedWriter(fw1));
			
			pw.println("A long time age,");
			pw.println("There was a little girl.");
			pw.close();
			
			System.out.println("��Ƥw�g�J�ɮפF");
		
		} catch (IOException e) {
			System.out.println("��J��X���~");
			// TODO: handle exception
		}
	}

}