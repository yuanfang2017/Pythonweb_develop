package fanxing.cn;
/*
 * ʹ�÷������Ż� �������demo
 */
//����������
class Point <t> {
private t x;
private t y;
public void setx(t  x){
	this.x = x;
}
public t getx(){
	return x;
}
public void sety(t  y){
	this.y = y;
}
public t gety(){
	return y;
}
}
public class FanXingDemo {
	public static void main(String[] args) {
		//���Ͷ�����
		//���⣺����Ϊɶ����int ��Ҫ��Integer �أ���Ϊ������ֻ��ʹ�ð�װ��
		Point <Integer>p = new Point<Integer>();
		p.sety(89);
		p.setx(34);
		System.out.println(p.getx());
		System.out.println(p.gety());
	}

}
