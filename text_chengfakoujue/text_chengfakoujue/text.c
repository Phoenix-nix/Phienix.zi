#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//����Ļ�����9 * 9�˷��ھ���
int main()
{
		int i = 0;
		int j = 0;
		int a = 0;
		int count = 0;
		int tmp = 0;

		scanf("%d", &a);
		tmp = a*a;

		while (tmp)
		{
			tmp /= 10;
			count++;
		}
		for (i = 1; i <= a; i++)
		{
			for (j = 1; j <= i; j++)
			{
				printf("%*d*%*d=%*d ", count, j, count, i, count, i*j);
			}
			printf("\n");
		}

		return 0;
	}