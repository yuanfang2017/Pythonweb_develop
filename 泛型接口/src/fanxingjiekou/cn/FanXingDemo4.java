package fanxingjiekou.cn;

import java.nio.charset.MalformedInputException;

/*
 * ���ͽӿ�
 * ������ʵ�ַ�ʽ��
 * 1��������Ķ�������������
 * 2��ֱ���ڽӿ���ָ�����������
 * ��case �Է�ʽ 2ʵ��
 */
//���巺�� �ӿ�
interface jiekou <t> {
//���󷽷�
	public t getinfo();
}
//����ʵ�ֽӿ� jiekou
class JieKouDemo implements jiekou <String>{
	private String  t;
	public JieKouDemo(String  t){
		this.t = t;
	}
	public void setinfo(String  t){
		this.t = t;
	}
	public String getinfo(){
		return t;
	}
}
public class FanXingDemo4 {
	public static void main(String[] args) {
		//����ӿڶ���
		jiekou<String> jdk = new JieKouDemo("lixinhua");
		System.out.println(jdk.getinfo());
	}

}
