#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//��10 �����������ֵ
int main()
{
	int i = 10;
	int a[10] = {0};//����һ��������10����
	int max = 0;//����һ��max���ֵ

	printf("������ʮ������\n");

	for (i = 0; i < 10 ; i++)
	{
		scanf("%d", &a[i]);

		if (a[i]>max)//�������е�10������max���бȽ�
		{
			max = a[i];//�����������max����ֵ��max
		}

	}
	printf("%d ",max);//������
	return 0;

}