package hw5;

public class Car {

	




			protected int num;
			protected double  gas;
			
			
			
			public  Car() {
				num=0;	
				gas=0.0;
				System.out.println("�Ͳ��F���l");
			}
			public Car(int n, double g) {
				num=n;	
				gas=g;
				System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");
			}
			public void setCar (int n, double g) {
				num=n;	
				gas=g;
				System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas);
			}
			
			public void show() {
				
				System.out.println("car1�����O"+this.num);
				System.out.println("car1�T�o�q�O"+this.gas);
			}
		
	}



