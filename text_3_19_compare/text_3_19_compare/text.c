#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//写代码将三个数按从大到小输出
int main()
{
	int a = 0;
	int b = 0;
	int c = 0;
	int x = 0;//定义4个变量，并初始化
	scanf("%d %d %d",&a, &b, &c);
	if (a < b)//比较a,b大小
	{
		x = b;
		b = a;
		a = x;//若b>a，交换a,b的值
	}

	if (a < c)//此时a为较大值，比较a,c大小
	{
		x = c;
		c = a;
		a = x;//若c>a，交换a,c的值
	}

	if (b < c)//此时a为较大值，但不确定b,c大小，比较b,c
	{
		x = c;
		c = b;
		b = x;//若c>b，交换b,c的值
	}
	printf("%d %d %d", a, b, c);//输出结果
	return 0;
}