package hw5_2;

import hw5_2.s19.Car19;

public class s19 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = ("1����");
		Car19 cars19 = new Car19(input);
		cars19.start();
		
			try {
				cars19.join();
			} catch (InterruptedException e) {
				System.out.println("���b�i��main()���B�z�u�@");
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
						System.out.println("���b�i��"+name+"���B�z�u�@");	
					}
				}
			
		}




}
