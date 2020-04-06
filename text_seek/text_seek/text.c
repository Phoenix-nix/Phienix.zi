#define _CRT_SECURE_NO_WARNINGS 1

#include<stdio.h>

//在有序的数组中查找某个具体的数

int main()

{

	//int arr[10] = { 0 };

	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };//相等

	//下标从0开始

	int k = 7;//要找数字
	int sz = sizeof(arr) / sizeof(arr[0]);//计算元素个数
	int i = 0;

	for (i = 0; i < sz; i++)

	{
		//0-9
		if (arr[i] == k)
		{
			printf("找到了，下标是：%d\n", i);
			break;
		}
	}

	if (i == sz)
	{
		printf("找不到");
	}

	return 0;

}