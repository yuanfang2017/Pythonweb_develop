package system.cn;
/*
 * system��ķ��� ���Ǿ�̬����������ֱ��������ֱ�ӵ���
 * ���õķ�����
 * static long	currentTimeMillis() 
          �����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
static void	exit(int status) 
          ��ֹ��ǰ�������е� Java �������
static void	gc() 
          ����������������
 static Properties	getProperties() 
          ȷ����ǰ��ϵͳ���ԡ�
static String	getProperty(String key) 
          ��ȡָ����ָʾ��ϵͳ���ԡ�
static String	getProperty(String key, String def) 
          ��ȡ��ָ����������ϵͳ���ԡ�
 */
public class SystemDemo {
	public static void main(String[] args) {
		//���յ�ǰʱ��
		long starttime = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i <10000000; i++) {
			sum = sum+i;
		}
		//���ս���ʱ��
		long endtime = System.currentTimeMillis();
		//��ȡ�ܹ���ʱ
		long totaltime = endtime-starttime;
		System.out.println("�ܹ���ʱ��"+totaltime);
	}

}
