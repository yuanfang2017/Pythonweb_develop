package timetask.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * time�� ��һ���߳�ʵʩ����������ʵ����ĳһ��ʱ�����ĳһ��ʱ��κ���ĳһ������ִ��һ�λ��߶����ظ�ִ��
 * timetask �� timer�����ŵ�һ�λ����ظ�ִ�е�ĳһ������
 * ��������Ҫ���ʹ��
 * Timetask������һ�������࣬���Ҫʹ�ø��࣬��Ҫ�Լ�����һ�������̳д��࣬��ʵ�����еĳ��󷽷�
 * time ����Ҫ����
 *  void	cancel() 
          ��ֹ�˼�ʱ�����������е�ǰ�Ѱ��ŵ�����
 int	purge() 
          �Ӵ˼�ʱ��������������Ƴ�������ȡ��������
 void	schedule(TimerTask task, Date time) 
          ������ָ����ʱ��ִ��ָ��������
 void	schedule(TimerTask task, Date firstTime, long period) 
          ����ָ����������ָ����ʱ�俪ʼ�����ظ��Ĺ̶��ӳ�ִ�С�
 void	schedule(TimerTask task, long delay) 
          ������ָ���ӳٺ�ִ��ָ��������
 void	schedule(TimerTask task, long delay, long period) 
          ����ָ���������ָ�����ӳٺ�ʼ�����ظ��Ĺ̶��ӳ�ִ�С�
 void	scheduleAtFixedRate(TimerTask task, Date firstTime, long period) 
          ����ָ����������ָ����ʱ�俪ʼ�����ظ��Ĺ̶�����ִ�С�
 void	scheduleAtFixedRate(TimerTask task, long delay, long period) 
          ����ָ����������ָ�����ӳٺ�ʼ�����ظ��Ĺ̶�����ִ�С�  
  timetask
          public abstract class TimerTask
          ������
    boolean	cancel() 
          ȡ���˼�ʱ������
    abstract  void	run() 
          �˼�ʱ������Ҫִ�еĲ�����
    long	scheduledExecutionTime() 
          ���ش��������ʵ�� ִ�е��Ѱ��� ִ��ʱ��
     
 */
/*
 * ���󣺶�ʱ�Ĵ�ӡϵͳ�ĵ�ǰʱ��
 */
//����һ����̳�timetask
class MyTask extends TimerTask{
	//��дrun()����
	public void run(){
		//����һ��ʱ���ʽ���Ķ���
		SimpleDateFormat sd = new SimpleDateFormat("yyy-MM-dd HH:mm:ss:SSS");
		//��ӡϵͳʱ��
		System.out.println(sd.format(new Date()));
		
	}
}
public class TimeDemo {
	public static void main(String[] args) {
		//���� timer����
		Timer t = new Timer();
		//����timertask����
		MyTask mt = new MyTask();
		//��timer���������   void	schedule(TimerTask task, long delay, long period) 
        t.schedule(mt, 1000,2000);				
	}

}
