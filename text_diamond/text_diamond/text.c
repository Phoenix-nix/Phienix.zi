#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//��ӡ����*
int main()
{
	int line = 0;
	scanf("%d", &line);//7
	//��ӡ�ϲ���
	int i = 0;
	for (i = 0; i < line; i++)
	{
		//��ӡһ��
		//�ȴ�ӡ�ո�
		int j = 0;
		for (j = 0; j < line - 1 - i; j++)
		{
			printf(" ");
		}
		//��ӡ*
		for (j = 0; j < 2 * i + 1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	//��ӡ�²���
	for (i = 0; i < line - 1; i++)
	{
		//��ӡһ��
		//�ȴ�ӡ�ո�
		int j = 0;
		for (j = 0; j < i + 1; j++)
		{
			printf(" ");
		}
		//
		for (j = 0; j < 2 * (line - 1 - i) - 1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}