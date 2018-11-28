package hw5;

public class Car {

	




			protected int num;
			protected double  gas;
			
			
			
			public  Car() {
				num=0;	
				gas=0.0;
				System.out.println("生產了車子");
			}
			public Car(int n, double g) {
				num=n;	
				gas=g;
				System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
			}
			public void setCar (int n, double g) {
				num=n;	
				gas=g;
				System.out.println("將車號設為"+num+"汽油量設為"+gas);
			}
			
			public void show() {
				
				System.out.println("car1車號是"+this.num);
				System.out.println("car1汽油量是"+this.gas);
			}
		
	}



