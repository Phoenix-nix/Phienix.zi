#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>

	int main()
	{
		int i;
		int t;
		int arr1[] = { 1, 3, 5, 8, 9, 0, 2 };
		int arr2[] = { 3, 6, 7, 8, 1, 2, 5 };//创建两个长度一样的数组

		for (i = 0; i < 7; i++)
		{
			t = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = t;
		}

		for (i = 0; i < 7; i++)
		{
			printf("%d ", arr1[i]);
		}
		printf("\n");

		for (i = 0; i < 7; i++)
		{
			printf("%d ", arr2[i]);
		}

		return 0;
	}