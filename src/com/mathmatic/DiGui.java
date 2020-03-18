package com.mathmatic;
/**
 * 
 * @author 递归的应用
 *
 */
public class DiGui {
    //三角数 所谓三角数就是第n项的值等于n-1项的值加n
	public static int threeMath(int n) {
		if(n==1) {
			return 1;
		}
		return threeMath(n-1) + n;
	}
	
	//斐波那契数 所谓斐波那契数列就是第一项为0,第二项为1,第n项的值为n-2项的值加n-1项的值
	public static int feiBoNaQi(int n) {
		if(n == 1) {
			return 0;
		}else if(n == 2) {
			return 1;
		}else {
			return feiBoNaQi(n-1) + feiBoNaQi(n-2);
		}
	}
	/**汉诺塔问题 所谓汉诺塔问题就是 有A B C 三个塔,将A塔上的盘子借助中间的B塔为助塔
             全部移动到C塔,每次只能移动一个,并且每个盘子不能放到比自己小的盘子下面
	 * totalPan:一共有多少个盘子
	 * from:起始塔
	 * center:中间塔
	 * to:目标塔
	 */
	
	public static void hanNuoTa(int totalPan,char from,char center,char to) {
		if(totalPan == 1) {
			System.out.println("盘子" + totalPan + "从" + "塔" + from  + "移动到" +  "塔" + to);
		}else {
			hanNuoTa(totalPan-1,from,to,center);
			System.out.println("盘子" + totalPan + "从" + "塔" + from  + "移动到" + "塔" + to);
            hanNuoTa(totalPan-1, center, from, to);
		}
	}
	public static void main(String[] args) {
		 //System.out.println(DiGui.threeMath(4));
		//System.out.println(feiBoNaQi(5));
		hanNuoTa(5, 'A', 'B', 'C');
	}
}
