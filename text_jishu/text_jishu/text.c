#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//编写程序数一下 1到 100 的所有整数中出现多少个数字9

int main()
{
	int i = 0;
	int count = 0;
	for (i = 0; i <= 100; i++)
	{
		if (i % 10 == 9)//当i除以10余9的时候，数字中有9， 9,19,29,39,49,59,69,79,89,99
		{
			count++;
		}
		if (i / 10 == 9)//当i除以10的商为9时，数字中有9  90,91,92,93,94,95,96,97,98,99
		{
			count++;
		}
	}
	printf("%d ", count);
	return 0;
}