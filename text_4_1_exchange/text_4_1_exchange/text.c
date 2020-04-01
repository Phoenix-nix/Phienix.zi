#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//不允许创建临时变量，交换两个整型变量

int main()
{
	int a = 3;
	int b = 5;

	//a = a + b;
	//b = a - b;    可能会溢出
	//a = a - b;

	a = a^b;
	b = a^b;        //按位异或
	a = a^b;        //可读性差，代码执行慢

	printf("a=%d b=%d\n", a, b);
	return 0;
}