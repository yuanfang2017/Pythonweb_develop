package xiancheng.sleep;
/*
 * �߳����� demo
 * static void	sleep(long millis)   ��ָ���ĺ��������õ�ǰ����ִ�е��߳����ߣ���ִͣ�У�
 *                                   �˲����ܵ�ϵͳ��ʱ���͵��ȳ��򾫶Ⱥ�׼ȷ�Ե�Ӱ��
 */
class XianChenSleep implements Runnable{
	//��д run()
	public void run(){
		try{
		  Thread.sleep(5000);
		}catch(Exception e){
			System.out.println(e);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
}
public class SleepDemo {
 public static void main(String[] args) {
	 XianChenSleep xc = new XianChenSleep();
	 new Thread(xc,"�߳�").start();
	    
	 
}
}
