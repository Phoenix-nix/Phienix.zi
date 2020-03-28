#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include <stdlib.h>



void init(int *arr, int len)//ʵ�ֺ���init() ��ʼ������Ϊȫ0
{
	int i = 0;
	for (i = 0; i < len; i++)
	{
		scanf("%d", &arr[i]);//arr[len] = '\0';
	}
	printf("��ʼ������\n");
	for (i = 0; i < len; i++)
	{
		printf("%d", arr[i]);
	}
}

void print(int *arr, int len)//ʵ��print()  ��ӡ�����ÿ��Ԫ��
{
	int i = 0;
	for (i = 0; i < len; i++)
	{
		printf("%d", arr[i]);
	}
	printf("\n");
}

void reverse(int *arr, int len)//ʵ��reverse()  �����������Ԫ�ص�����
{
	int temp = 0, i = 0;
	for (i = 0; i < len / 2; i++)
	{
		temp = arr[i];
		arr[i] = arr[len - 1 - i];
		arr[len - 1 - i] = temp;
	}
	printf("��������\n");
	for (i = 0; i < len; i++)
	{
		printf("%d", arr[i]);
	}
}
void menu()
{
	printf("*******************************************\n");
	printf("**************1����ʼ������****************\n");
	printf("**************2����ӡ����******************\n");
	printf("**************3������Ԫ�ص�����************\n");
	printf("**************4���˳�����******************\n");
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
	printf("����Ĵ�С��");
	scanf("%d", &n);
	arr = (int *)malloc(n);//����ָ�벢�����ڴ浥Ԫ����
	menu();

	while (count)
	{
		printf("\n��ѡ��:\n");
		scanf("%d", &a);
		printf("\n");
		switch (a)
		{
		case 1:
			init(arr, n - 1);//n������Ԫ�ظ���������\0������n-1
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
			printf("����������������룺\n");
		}
	}

	return 0;
}