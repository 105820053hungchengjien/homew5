package hw5_2;

import hw5_2.s22.Company2;
import hw5_2.s22.Driver2;

public class s22 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company2 cmp = new Company2();
		Driver2 drv1 = new Driver2(cmp);
		drv1.start();
		Driver2 drv2 = new Driver2(cmp);
		drv2.start();
	}
	public static class Company2
	{
		private int sum = 0;
		public synchronized void add(int a) {
				int tmp = sum;
				System.out.println("�ثe���X�p�ƭȬO"+tmp+"��");
				System.out.println("�Ȩ�"+a+"���F�C");
				tmp = tmp + a;
				System.out.println("�X�p���B�O"+tmp+"��");
				sum = tmp;
		}
			
	}
	public static class Driver2 extends Thread{
		private Company2 comp;
		public Driver2(Company2 c) {
			comp = c; 
		}
		public void run() {
			for (int i = 0; i < 3; i++) {
				comp.add(50);
			}
		}
	}
}
