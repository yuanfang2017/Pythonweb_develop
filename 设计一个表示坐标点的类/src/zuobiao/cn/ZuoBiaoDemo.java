package zuobiao.cn;
/*
 * дһ����ʾ�������
 * ���˼·�������������� �������꣬�����꣬���ڱ�ʾ�����������֣� int float string
 * Ҫ��һ������������������ͣ�ֻ��ʹ�� object����Ϊobject����Խ����κ����͵�����
 */
//������� �� point
class Point{
	private  Object x;
	private Object y;
	public void setx(Object x){
		this.x = x;
	}
	public void sety(Object y){
		this.y = y;
	}
	public Object getx(){
		return x;
	}
public Object gety(){
		return y;
	}
		
}
public class ZuoBiaoDemo {
	public static void main(String[] args) {
		//�������
		Point p = new Point();
		p.setx(20);
		p.sety(78);
		//������ݣ�������object ���͵ģ�����Ҫ �Զ�����
		int m = (Integer)p.getx();
		int n = (Integer)p.gety();
		//�������
		System.out.println("�������ǣ�"+m);
		System.out.println("�������ǣ�"+n);
	}

}
