package lianjie.cn;
/*
 * �ַ��������Ӳ���
 *api:����
 StringBuffer	append(boolean b) 
          �� boolean �������ַ�����ʾ��ʽ׷�ӵ�����
 */
public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	//׷���ַ���
	sb.append("hello").append("world").append("!!!").append("\n");
	//׷������
	sb.append(123).append(456).append(789).append("\n");
	//׷���ַ�
	sb.append('A').append('B').append('C').append("\n");
	//׷�Ӳ������͵�
	sb.append(true).append(false).append("\n");
	System.out.println(sb);
}
}
