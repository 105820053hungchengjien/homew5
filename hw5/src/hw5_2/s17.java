package hw5_2;

import hw5_2.s17.Car17;

public class s17 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = ("1����");
		Car17 cars17 = new Car17(input);
		cars17.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("���b�i��main()���B�z�u�@");
		}
		
	}

	public static class Car17 extends Thread{

		



				private String name;
				
				public Car17(String nm) {
					name=nm;
				}
				
				
				public void run() {
					for (int i = 0; i < 5; i++) {
						try {
							sleep(1000);
							System.out.println("���b�i��"+name+"���B�z�u�@");	
						} catch (InterruptedException e) {
							// TODO: handle exception
						}
						
					}
				}
			
		}




}
