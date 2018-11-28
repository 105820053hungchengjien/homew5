package hw5_2;

import hw5_2.s19.Car19;

public class s19 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = ("1號車");
		Car19 cars19 = new Car19(input);
		cars19.start();
		
			try {
				cars19.join();
			} catch (InterruptedException e) {
				System.out.println("正在進行main()的處理工作");
				// TODO: handle exception
			}
			
		
		
	}

	public static class Car19 extends Thread{

		



				private String name;
				
				public Car19(String nm) {
					name=nm;
				}
				
				
				public void run() {
					for (int i = 0; i < 5; i++) {
						System.out.println("正在進行"+name+"的處理工作");	
					}
				}
			
		}




}
