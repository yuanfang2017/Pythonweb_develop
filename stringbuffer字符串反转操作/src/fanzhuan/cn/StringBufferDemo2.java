package fanzhuan.cn;
/*
 * �ַ����ķ�ת
 * api������
 *  StringBuffer	reverse() 
          �����ַ��������䷴ת��ʽȡ����
 */
public class StringBufferDemo2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
	    sb.insert(sb.length(), "world");
	    sb.reverse();
	     System.out.println(sb);    
	}

}
