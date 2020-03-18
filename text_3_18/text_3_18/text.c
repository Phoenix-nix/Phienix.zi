#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//练习找出1·100之间的奇数

int main()//主函数
{
	int num = 1;//定义一个变量num
	for (num = 1; num <= 100 ; num++)//for语句括号中的代码表示循环成立的条件
	{
		if (num % 2 == 1)//当num除以2的余数是1时，即为奇数
			printf("%d  ",num);//输出此时的数
	}
	return 0;
}