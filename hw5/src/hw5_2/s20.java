package hw5_2;

import hw5_2.s20.Car20;

public class s20 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = ("�@����");
		Car20 cars20 = new Car20(input);
		Thread th20 = new Thread(cars20);
		th20.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("���b�i��main()���B�z�u�@");
		}
		
	}

	public static class Car20 implements Runnable{

		



				private String name;
				
				public Car20(String nm) {
					name=nm;
				}
				
				
				public void run() {
					for (int i = 0; i < 5; i++) {
						System.out.println("���b�i��"+name+"���B�z�u�@");	
					}
				}
			
		}




}
