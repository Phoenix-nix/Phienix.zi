#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//作业标题
//计算一个数的每位之和（递归实现）
//
//作业内容
//写一个递归函数DigitSum(n)，输入一个非负整数，返回组成它的数字之和
//
//例如，调用DigitSum(1729)，则应该返回1 + 7 + 2 + 9，它的和是19
//
//输入：1729，输出：19

int DigitSum(int n)
{
	int sum = 0;
	int m = 0;
	if (n != 0)
	{
		m = n % 10;
		n = n / 10;
		sum = m + DigitSum(n);
	}
		return sum;
}
int main()
{
	int x = 0;
	printf("请输入一个数：\n");
	scanf("%d", &x);
	printf("sum = %d\n", DigitSum(x));
	return 0;
}