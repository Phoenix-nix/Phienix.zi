#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include <stdlib.h>



void init(int *arr, int len)//实现函数init() 初始化数组为全0
{
	int i = 0;
	for (i = 0; i < len; i++)
	{
		scanf("%d", &arr[i]);//arr[len] = '\0';
	}
	printf("初始化数组\n");
	for (i = 0; i < len; i++)
	{
		printf("%d", arr[i]);
	}
}

void print(int *arr, int len)//实现print()  打印数组的每个元素
{
	int i = 0;
	for (i = 0; i < len; i++)
	{
		printf("%d", arr[i]);
	}
	printf("\n");
}

void reverse(int *arr, int len)//实现reverse()  函数完成数组元素的逆置
{
	int temp = 0, i = 0;
	for (i = 0; i < len / 2; i++)
	{
		temp = arr[i];
		arr[i] = arr[len - 1 - i];
		arr[len - 1 - i] = temp;
	}
	printf("逆置数组\n");
	for (i = 0; i < len; i++)
	{
		printf("%d", arr[i]);
	}
}
void menu()
{
	printf("*******************************************\n");
	printf("**************1、初始化数组****************\n");
	printf("**************2、打印数组******************\n");
	printf("**************3、数组元素的逆置************\n");
	printf("**************4、退出程序******************\n");
	printf("*******************************************\n");
}

int main()
{
	int *arr;
	int n = 0;
	int m = 0;
	int a = 0;
	int count = 1;
	/*int len = 0;*/
	printf("数组的大小：");
	scanf("%d", &n);
	arr = (int *)malloc(n);//定义指针并进行内存单元分配
	menu();

	while (count)
	{
		printf("\n请选择:\n");
		scanf("%d", &a);
		printf("\n");
		switch (a)
		{
		case 1:
			init(arr, n - 1);//n是数组元素个数，包括\0，所以n-1
			count = 1;
			break;
		case 2:
			print(arr, n - 1);
			break;
		case 3:
			reverse(arr, n - 1);
			break;
		case 4:
			count = 0;
			break;
		default:
			printf("输入错误，请重新输入：\n");
		}
	}

	return 0;
}