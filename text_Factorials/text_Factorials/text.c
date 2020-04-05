#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

int main()
{
	int n = 0;
	scanf("%d\n", &n);//5
	int i = 0;
	int ret = 1;
	int j = 0;
	int sum = 0;

	for (j = 1; j <= n; j++)
	{
		//¼ÆËãJµÄ½×³Ë
		ret = 1;
		for (i = 1; i <= j; i++)
		{
			ret *= i;
		}
		sum += ret;
	}

	printf("%d\n", sum);
	//1£¡+2£¡+3£¡+4£¡+5£¡

	return 0;
}