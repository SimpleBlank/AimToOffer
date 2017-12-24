package org.java.no11;

import java.math.BigDecimal;
import java.util.Scanner;

public class No11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();
		int m = scanner.nextInt();
		Boolean flag = true;  // mark the power is minus or not, true is postive
		Double TempResult = 1.0;
		BigDecimal result = new BigDecimal(0);
		if (n ==0 || m ==0)
		{
			System.out.println(1);
			return;
		}
		if (m < 0)
		{
			flag = false;
		}
		if (flag)
		{
			for(int i =0; i<m; i++)
			{
				TempResult *= n; 
			}
			result = new BigDecimal(TempResult.toString());
		}
		else {
			for(int i =0; i< -m; i++)
			{
				TempResult *= n; 
			}
			BigDecimal temp = new BigDecimal(TempResult.toString());
			temp = temp.setScale(2, BigDecimal.ROUND_HALF_UP);
			result = new BigDecimal(1).divide(temp, 5, BigDecimal.ROUND_HALF_UP); //防止出现循环小数
		}
		System.out.println(result);
	}

}

//通过BigDecimal的divide方法进行除法时当不整除，出现无限循环小数时，就会抛异常的，异常如下：
//java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result. at java.math.BigDecimal.divide(Unknown Source) 
//解决之道：就是给divide设置精确的小数点divide(xxxxx,2, BigDecimal.ROUND_HALF_EVEN) 
//BigDecimal定义了一下舍入模式，只有在作除法运算或四舍五入时才用到舍入模式，
