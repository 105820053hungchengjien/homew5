package hw5_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class s14 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length!=1) {
			System.out.println("請指定正確的檔案名稱");
			System.exit(1);
		}
		try {
			BufferedReader br3 = new BufferedReader(new FileReader(args[0]));
			
			String str;
			while ((str = br3.readLine()) != null) {
				System.out.println(str);
				
			}
			br3.close();
		} catch (IOException e) {
			System.out.println("輸入輸出有誤");
			// TODO: handle exception
		}

	}

}
