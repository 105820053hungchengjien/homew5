package hw5_2;

public class s10 {


			public static void main(String[] args) throws Car3Exception {
				// TODO Auto-generated method stub
				Car3 car2;
				car2 = new Car3();
				
				car2.setCar(1234,-10);
				
				
					// TODO: handle exception
				
				car2.show();
				
				
			}
}
class Car3Exception extends Exception{
			}
class Car3 {

				protected int num;
				protected double  gas;
				
				
				
				public Car3() {
					num=0;	
					gas=0.0;
					System.out.println("�Ͳ��F���l");
				}
				public Car3(int n, double g) {
					num=n;	
					gas=g;
					System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");
				}
				public void setCar (int n, double g)throws Car3Exception{
					if (g<0) {
						Car3Exception e = new Car3Exception();
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



