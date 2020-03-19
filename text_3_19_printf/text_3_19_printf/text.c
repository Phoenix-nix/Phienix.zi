#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//写一个代码打印1 - 100之间所有3的倍数的数字
int main()
{
	int i = 1;//定义变量i
	for (i = 1; i <= 100; i++)//设置循环条件
	{
		if ( i%3 == 0 )       //除以3的余数为0时
			printf("%d ", i);//输出
	}
	return 0;
}