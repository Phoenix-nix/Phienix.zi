#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//给定两个数，求这两个数的最大公约数
int main()
{
	int a;
	int b;
	int c;

	printf("请输入你要求的两个数：\n");
	scanf("%d %d", &a, &b);         //输入要求的数a,b

	c =(a > b) ? b : a;             //三目运算符，将小的值赋给c
	
	if (a%c != 0 || b%c != 0)       //如果ab无法除尽c
	{
		c--;                        //c--再继续除直到除尽
	}

		printf("最大公约数是：%d\n", c);//输出此时的数

	return 0;
}