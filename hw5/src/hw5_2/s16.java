package hw5_2;



public class s16 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = ("1號車");
		Car16 cars1 = new Car16("input");
		cars1.start();
		String input2 = ("2號車");
		Car16 cars2 = new Car16("input2");
		cars2.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("正在進行main()的處理工作");
		}
		
	}

	public static class Car16 extends Thread{

		



				private String name;
				
				public Car16(String nm) {
					name=nm;
				}
				
				
				public void run() {
					for (int i = 0; i < 5; i++) {
						System.out.println("正在進行"+name+"的處理工作");	
					}
				}
			
		}




}
