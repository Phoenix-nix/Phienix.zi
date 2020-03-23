#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//计算1/1 - 1/2 + 1/3 - 1/4 + 1/5 …… + 1/99 - 1/100 的值，打印出结果
int main()
{
	int i = 0;
	double sum = 0.0;//既然有分母，最终结果肯定为小数
	int a = 1;

	for (i = 1; i <= 100; i++)
	{
		sum += (1.0 * a) / i;//所求数的表达式
		a = -a;//观察可知偶分母为负数，奇数分母为正数，可用a=-a来变化
	}

	printf("sum=%lf ", sum);
	return 0;
}