/**
 * 
 * �ж�101-200֮���ж��ٸ�����,�������������
 *
 */
public class Math {
	public static void main(String[] args) {
		int count=0;
		boolean a=false;
		for(int i=101;i<200;i+=2){
			for(int j=2;j<=java.lang.Math.sqrt(i);j++){
				if (i%j==0) {
					a=false;
					break;
				}else {
					a=true;
				}
			}
			if (a==true) {
				count++;
			}
		}
		System.out.println("101-200���ܹ���"+count+"������");
	}

	
}
