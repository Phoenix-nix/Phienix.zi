#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//��д������һ�� 1�� 100 �����������г��ֶ��ٸ�����9

int main()
{
	int i = 0;
	int count = 0;
	for (i = 0; i <= 100; i++)
	{
		if (i % 10 == 9)//��i����10��9��ʱ����������9�� 9,19,29,39,49,59,69,79,89,99
		{
			count++;
		}
		if (i / 10 == 9)//��i����10����Ϊ9ʱ����������9  90,91,92,93,94,95,96,97,98,99
		{
			count++;
		}
	}
	printf("%d ", count);
	return 0;
}