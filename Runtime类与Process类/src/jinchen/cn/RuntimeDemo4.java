package jinchen.cn;

/*
 * Runtime����˹۲��ڴ�ʹ�����⣬����ֱ��ʹ��runtime �����б����Ŀ�ִ�г���
 *  Process	exec(String command) 
          �ڵ����Ľ�����ִ��ָ�����ַ������
          ���������ǣ�process�������
 */
public class RuntimeDemo4 {
public static void main(String[] args) {
	//ȡ��runtime��ʵ��������
	Runtime rt = Runtime.getRuntime();
	//�򿪼��±�
	try{rt.exec("notepad.exe");}
	 catch(Exception e){
		 System.out.println(e.getStackTrace());
	 }
	//ʵ��һ�����ܣ��򿪼��±�ͣ��5s���Զ��ر�
	//����һ��process �������ڽ��������Ľ���
	//Process p = null;
	
	try{Thread.sleep(5000);}
	 catch(Exception e){
		 System.out.println(e.getStackTrace());
	 }
      //p.destroy();
	try{rt.exec("notepad.exe").destroy();}
	catch(Exception e){
		System.out.println(e.getStackTrace());
	}
	
}
}
