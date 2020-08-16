package com.mathmatic;

/**
 * 
 * @author cdh 蹇�熸帓搴忕畻娉� 蹇�熸帓搴忕敱C. A. R. Hoare鍦�1962骞存彁鍑恒�傚畠鐨勫熀鏈�濇兂鏄細
 *         閫夋嫨搴忓垪涓殑鏌愪釜鏁颁綔涓哄熀鍑嗗�� 閫氳繃涓�瓒熸帓搴忓皢瑕佹帓搴忕殑鏁版嵁鍒嗗壊鎴愮嫭绔嬬殑涓ら儴鍒嗭紝
 *         鍏朵腑宸﹁竟鐨勬暟鎹兘姣斿熀鍑嗗�煎皬,鍙宠竟鐨勬暟鎹兘姣斿熀鍑嗗�煎ぇ
 *         鐒跺悗鍐嶆寜姝ゆ柟娉曞杩欎袱閮ㄥ垎鏁版嵁鍒嗗埆杩涜蹇�熸帓搴忥紝
 *         鏁翠釜鎺掑簭杩囩▼鍙互閫掑綊杩涜锛屼互姝よ揪鍒版暣涓暟鎹彉鎴愭湁搴忓簭鍒椼��
 *
 */
public class QuikSort {

	/**
	 * 鑾峰彇涓�瓒熸帓搴忓悗鐨勫熀鍑嗗�兼墍鍦ㄧ储寮�
	 * 
	 * @param dataArr 闇�瑕佹帓搴忕殑鏁扮粍
	 * @param start   鏁扮粍鐨勮捣濮嬩笅鏍�
	 * @param end     鏁扮粍鐨勭粨鏉熶笅鏍�
	 * @return 姣忎竴杞帓搴忓悗鐨勫熀鍑嗗�兼墍鍦ㄧ殑绱㈠紩
	 */
	public static int getBasicIndex(int[] dataArr, int start, int end) {
		int base = dataArr[start];
		while (start < end) {
			while (start < end && dataArr[end] >= base) {
				end--;
			}
			if (start < end) {
				int temp = dataArr[start];
				dataArr[start] = dataArr[end];
				dataArr[end] = temp;
				start++;
			}

			while (start < end && dataArr[start] <= base) {
				start++;
			}
			if (start < end) {
				int temp = dataArr[end];
				dataArr[end] = dataArr[start];
				dataArr[start] = temp;
				end--;
			}

		}
		return start;
	}

	public static void sort(int[] dataArr, int start, int end) {
		if (start > end) {
			return;
		} else {
			int basicIndex = getBasicIndex(dataArr, start, end);
			sort(dataArr, start, basicIndex - 1);
			sort(dataArr, basicIndex + 1, end);
		}
	}

	public static void quickSort(int[] arr, int low, int high) {
		int i, j, temp;
		if (low > high) {
			return;
		}
		i = low;
		j = high;
		// temp就是基准位
		temp = arr[low];

		while (i < j) {
			// 先看右边，依次往左递减
			while (temp <= arr[j] && i < j) {
				j--;
			}

			// 再看左边，依次往右递增
			while (temp >= arr[i] && i < j) {
				i++;
			}

			// 如果满足条件则交换
			if (i < j) {

				int z = arr[i];
				int y = arr[j];

				arr[i] = y;
				arr[j] = z;

			}

		}

		// 最后将基准为与i和j相等位置的数字交换
		arr[low] = arr[i];
		arr[i] = temp;

		// 递归调用左半数组
		quickSort(arr, low, j - 1);
		// 递归调用右半数组
		quickSort(arr, j + 1, high);
	}

	public static void main(String[] args) {
		int[] dataArr = { 2, 4, 1, 9, 100, 45, 34, 2, 92, -8 };
		//QuikSort.sort(dataArr, 0, dataArr.length - 1);
		quickSort(dataArr, 0, dataArr.length-1);
		for (int i = 0; i < dataArr.length; i++) {
			System.out.print(dataArr[i] + " ");
		}

	}
}
