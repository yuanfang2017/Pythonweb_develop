package tongbu.cn;
/*
 * ����߳�ͬʱ����ͬһ��Դ��������������ƱΪ������Ϊ�˽��������⣬��Ҫʹ��ͬ��
 * ��νͬ�������Ƕ��������ͬһʱ����� ֻ����һ���߳̽���
 * ͬ�������ĸ�ʽ
 * synchronized(ͬ������){
 * ��Ҫͬ���Ĵ���
 * }
 */
//һ����ʵ��runnable 
class TongBuDaiMa implements Runnable{
	private int tiket = 5;
	public void run(){
		for (int i = 0; i < 100; i++) {
			//�ж�Ʊ���Ƿ����0 ������0�Ļ�����Ʊ
			//ͬ�������
			synchronized (this) {
			
			if (tiket>0) {
				//�����߳�֮���ӳ�
				try{Thread.sleep(50);}
				catch(Exception e){}
				System.out.println("tiket = "+ tiket--);
			}
		}
	}
}
}
public class TongBu {
	public static void main(String[] args) {
		TongBuDaiMa tb = new TongBuDaiMa();
		Thread tbd1 = new Thread(tb);
		Thread tbd2 = new Thread(tb);
		Thread tbd3 = new Thread(tb);
		tbd1.start();
		tbd2.start();
		tbd3.start();
	}

}
