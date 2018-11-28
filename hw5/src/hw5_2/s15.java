package hw5_2;

public class s15 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = ("1號車");
		Car15 cars15 = new Car15(input);
		cars15.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("正在進行main()的處理工作");
		}
		
	}

	public static class Car15 extends Thread{

		



				private String name;
				
				public Car15(String nm) {
					name=nm;
				}
				
				
				public void run() {
					for (int i = 0; i < 5; i++) {
						System.out.println("正在進行"+name+"的處理工作");	
					}
				}
			
		}




}
