package tongbufangfa.cn;
/*
 * ͬ������ ���ͬ������
 * ͬ��������ʹ��synchronized �ؼ��ֽ�һ����������Ϊ ͬ������
 * ��ʽΪ��
 * synchronized ��������ֵ   �������� �������б�{
 * }
 */
//һ����ʵ��runnable 
class TongBu implements Runnable{
	private int tiket = 5;
	public void run(){
		for (int i = 0; i < 100; i++) {	
			//����ͬ������
			this.sale();
		}
	}
	        //ʹ��ͬ������
	      public synchronized void sale(){
				//�ж�Ʊ���Ƿ����0 ������0�Ļ�����Ʊ
				if (tiket>0) {
				//�����߳�֮���ӳ�
				try{Thread.sleep(50);}
				catch(Exception e){}
				System.out.println("tiket = "+ tiket--);
			}
		}	
}
public class TongBuFangFa {
	public static void main(String[] args) {
		TongBu tb = new TongBu();
		Thread tbd1 = new Thread(tb);
		Thread tbd2 = new Thread(tb);
		Thread tbd3 = new Thread(tb);
		tbd1.start();
		tbd2.start();
		tbd3.start();
	}
	

}
