#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//写一个代码：打印100~200之间的素数
//素数：只能被自身和1整除
int main()
{
	int i, j;
	for (i = 100; i <= 200; i++)
	{
		for (j = 2; j < i; j++)        //给出一个数j，判断他能否被i整除，因为素数只能被自身和1整除，所以j的范围[2,i-1]
		{
			if (i%j == 0)              //如果i能够整除j,此时跳出
				break;
		}
		if (j == i)                    //如果这个数j等于i，其为素数
			printf("%d\n", i);         //输出
	}
	return 0;
}
