package hw5_2;

public class s09 {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Car2 car1;
				car1 = new Car2();
				try {
					car1.setCar(1234,-10);
				} catch (Car2Exception e) {
					System.out.println("�ߥX"+e+"�F");
					// TODO: handle exception
				}
				car1.show();
				
				
			}
}
class Car2Exception extends Exception{
			}
class Car2 {

				protected int num;
				protected double  gas;
				
				
				
				public Car2() {
					num=0;	
					gas=0.0;
					System.out.println("�Ͳ��F���l");
				}
				public Car2(int n, double g) {
					num=n;	
					gas=g;
					System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");
				}
				public void setCar (int n, double g)throws Car2Exception{
					if (g<0) {
						Car2Exception e = new Car2Exception();
						throw e;
					}else
					{
						num=n;	
						gas=g;
						System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas);
					}	
					
				}
				
				public void show() {
					
					System.out.println("car1�����O"+this.num);
					System.out.println("car1�T�o�q�O"+this.gas);
				}

	}



