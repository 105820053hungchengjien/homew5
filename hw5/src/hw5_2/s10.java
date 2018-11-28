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
					System.out.println("生產了車子");
				}
				public Car3(int n, double g) {
					num=n;	
					gas=g;
					System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
				}
				public void setCar (int n, double g)throws Car3Exception{
					if (g<0) {
						Car3Exception e = new Car3Exception();
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



