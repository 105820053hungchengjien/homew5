package hw5;

public class s07 {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				try {
					int[] test;
					test = new int[5];
					
					System.out.println("將值指定給test[10]");
					test[10]=80;
					System.out.println("將80指定給test[10]");
				} 
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("超出陣列的範圍了");
				}
				finally {
					System.out.println("最後一定會執行這個處理");
				}
				
				System.out.println("順利執行完畢");
			}

		

}