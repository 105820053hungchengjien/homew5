package hw5_2;

public class s09 {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Car2 car1;
				car1 = new Car2();
				try {
					car1.setCar(1234,-10);
				} catch (Car2Exception e) {
					System.out.println("拋出"+e+"了");
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
					System.out.println("生產了車子");
				}
				public Car2(int n, double g) {
					num=n;	
					gas=g;
					System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
				}
				public void setCar (int n, double g)throws Car2Exception{
					if (g<0) {
						Car2Exception e = new Car2Exception();
						throw e;
					}else
					{
						num=n;	
						gas=g;
						System.out.println("將車號設為"+num+"汽油量設為"+gas);
					}	
					
				}
				
				public void show() {
					
					System.out.println("car1車號是"+this.num);
					System.out.println("car1汽油量是"+this.gas);
				}

	}



