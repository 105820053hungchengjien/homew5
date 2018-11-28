package hw5_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class s12 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入字串");
		try {
			FileWriter fw1 = new FileWriter("test.txt");
			PrintWriter pw =new PrintWriter(new BufferedWriter(fw1));
			
			pw.println("Hello!");
			pw.println("GoodBye");
			pw.close();
			
			System.out.println("資料已寫入檔案了");
		
		} catch (IOException e) {
			System.out.println("輸入輸出有誤");
			// TODO: handle exception
		}
	}

}

