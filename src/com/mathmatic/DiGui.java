package com.mathmatic;
/**
 * 
 * @author �ݹ��Ӧ��
 *
 */
public class DiGui {
    //������ ��ν���������ǵ�n���ֵ����n-1���ֵ��n
	public static int threeMath(int n) {
		if(n==1) {
			return 1;
		}
		return threeMath(n-1) + n;
	}
	
	//쳲������� ��ν쳲��������о��ǵ�һ��Ϊ0,�ڶ���Ϊ1,��n���ֵΪn-2���ֵ��n-1���ֵ
	public static int feiBoNaQi(int n) {
		if(n == 1) {
			return 0;
		}else if(n == 2) {
			return 1;
		}else {
			return feiBoNaQi(n-1) + feiBoNaQi(n-2);
		}
	}
	/**��ŵ������ ��ν��ŵ��������� ��A B C ������,��A���ϵ����ӽ����м��B��Ϊ����
             ȫ���ƶ���C��,ÿ��ֻ���ƶ�һ��,����ÿ�����Ӳ��ܷŵ����Լ�С����������
	 * totalPan:һ���ж��ٸ�����
	 * from:��ʼ��
	 * center:�м���
	 * to:Ŀ����
	 */
	
	public static void hanNuoTa(int totalPan,char from,char center,char to) {
		if(totalPan == 1) {
			System.out.println("����" + totalPan + "��" + "��" + from  + "�ƶ���" +  "��" + to);
		}else {
			hanNuoTa(totalPan-1,from,to,center);
			System.out.println("����" + totalPan + "��" + "��" + from  + "�ƶ���" + "��" + to);
            hanNuoTa(totalPan-1, center, from, to);
		}
	}
	public static void main(String[] args) {
		 //System.out.println(DiGui.threeMath(4));
		//System.out.println(feiBoNaQi(5));
		hanNuoTa(5, 'A', 'B', 'C');
	}
}
