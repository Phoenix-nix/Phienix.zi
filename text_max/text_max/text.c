#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//求10 个整数中最大值
int main()
{
	int i = 10;
	int a[10] = {0};//定义一个数组存放10个数
	int max = 0;//定义一个max最大值

	printf("请输入十个数：\n");

	for (i = 0; i < 10 ; i++)
	{
		scanf("%d", &a[i]);

		if (a[i]>max)//将数组中的10个数与max进行比较
		{
			max = a[i];//如果此数大于max，则赋值给max
		}

	}
	printf("%d ",max);//输出结果
	return 0;

}