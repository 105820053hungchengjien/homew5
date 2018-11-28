package hw5_2;

import hw5_2.s18.Car18;

public class s18 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = ("1號車");
		Car18 cars18 = new Car18(input);
		cars18.start();
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("正在進行main()的處理工作");
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
		
	}

	public static class Car18 extends Thread{

		



				private String name;
				
				public Car18(String nm) {
					name=nm;
				}
				
				
				public void run() {
					for (int i = 0; i < 5; i++) {
						System.out.println("正在進行"+name+"的處理工作");	
					}
				}
			
		}




}
