package xianchencaozuo.demo;
/*
 * �����ߺ������߰���
 * ����1�����ڶ��̵߳�ԭ���������ڼ�����Ϣ���ƣ���δ������Ϣ���ݣ����е����������̣߳������Ὣ��Ϣ���ƺ���һ����Ϣ������
 * ����һ��
 * Ϊ�˽��������⣬����ʹ��ͬ��
 * 
 */
//��Ϣ�࣬������Ϣ������Ϣ���ݣ������Ϣ������Ϣ����
class Info{
	private String infoname;
	private String infoconnet;
	public void setinfoname(String infoname){
		this.infoname = infoname;
	}
	public String getinfoname(){
		return infoname;
	}
	public void setinfoconnet(String infoconnet){
		this.infoconnet = infoconnet;
	}
	public String getinfoconnet(){
		return infoconnet;
	}
	
}
//��������ʵ��runnable
class product implements Runnable{
	//����һ����־λ
	private boolean flag = false;
	//product���췽��Ϊ���ำֵ
	private Info info = null;
	public product (Info info){
		this.info = info;
	}
	public void run(){
		for (int i = 0; i < 50; i++) {
			if (flag) {
				this.info.setinfoname("sophia ");
				//������ ������֮������ӳ�
				try{Thread.sleep(500);}
				 catch(Exception e){
					 System.out.println(e.getStackTrace());
					 }
				this.info.setinfoconnet("��ӭ��ʦ");
			      //�޸ı�־λ
				flag = false;
			}
			else {
				this.info.setinfoname("���Կ��� ");
				//������ ������֮������ӳ�
				try{Thread.sleep(500);}
				 catch(Exception e){
					 System.out.println(e.getStackTrace());
					 }
				this.info.setinfoconnet("��Ҫ���Կ���");
			      //�޸ı�־λ
				flag = true;
			}
		}
	}
}
//��������
class consumer implements Runnable{
	private Info info = null ;
	public consumer(Info info){
	this.info = info;
	}
	public void run(){
		for (int i = 0; i <50; i++) {
			//ȡ��Ϣ���� ����Ϣ���ݣ��������ӳ�
			System.out.println(this.info.getinfoname());
			try{Thread.sleep(500);}
			 catch(Exception e){
				 System.out.println(e.getStackTrace());
				 }
			System.out.println(this.info.getinfoconnet());
		}
	}
}
//������
public class ThreadCaseDemo {
public static void main(String[] args) {
	Info in = new Info();
	product pd = new product(in);
	consumer cs = new consumer(in);
	new Thread(pd).start();
	new Thread(cs).start();
}
}
