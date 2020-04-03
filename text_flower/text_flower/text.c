#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<math.h>

//水仙花数


int main()
{
	int i = 0;
	for (i = 0; i <= 100000; i++)
	{
		int sum = 0;
		int count = 1;
		//判断i是否是水仙花数
		//1.计算i的位数
		int tmp = i;
		while (tmp/=10)
		{

			count++;

		}
		//2.得到i的每一位，计算每一位的位数次方和
		tmp = i;
		while (tmp)
		{
			sum+=pow(tmp % 10, count);
			tmp /= 10;
		}
		//3.判断
		if (sum == i)
		{
			printf("%d ", i);
		}
	}
	return 0;
}
