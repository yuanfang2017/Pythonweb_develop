package tongbujiejuewenti.cn;
/*
 * �����ߺ������߰���
 * ����1�����ڶ��̵߳�ԭ���������ڼ�����Ϣ���ƣ���δ������Ϣ���ݣ����е����������̣߳������Ὣ��Ϣ���ƺ���һ����Ϣ������
 * ����һ��
 * Ϊ�˽��������⣬����ʹ��ͬ��
 * 
 */
//��Ϣ�࣬������Ϣ������Ϣ���ݣ������Ϣ������Ϣ����
//���� ���ƣ��������� ͬ����ȡ�����ƣ�ȡ������ ͬ��
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
	public synchronized void setinfo(String infoname,String infoconnet){
		this.setinfoname(name);
		this.infoname = infoname;
		this.infoconnet = infoconnet;
	}
	public synchronized String getinfo(){
		System.out.println(this.get);
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
				this.info.setinfo("sophia", "��ʦ��ӭ��");
			      //�޸ı�־λ
				flag = false;
			}
			else {
				this.info.setinfo("���Կ���", "��Ҫ���Կ���");
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
			try{Thread.sleep(500);}
			 catch(Exception e){
				 System.out.println(e.getStackTrace());
				 }
			this.info.get();
		}
	}
}
//������
public class ThreadCaseDemo2 {
public static void main(String[] args) {
	Info in = new Info();
	product pd = new product(in);
	consumer cs = new consumer(in);
	new Thread(pd).start();
	new Thread(cs).start();
}
}