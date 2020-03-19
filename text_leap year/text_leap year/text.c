#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//打印1000年到2000年之间的闰年
int main()
{ 
	int  i = 0;                         //定义变量并初始化
	for (i = 1000; i <= 2000; i++)     
	{

		if ((i % 4 == 0 && i % 100 != 0)||(i % 400 == 0))
		{//闰年=1.能被4整除但不能被100整除 + 2.能被400整除的
			printf("%d ", i);
		}
		
	}
	return 0;
}