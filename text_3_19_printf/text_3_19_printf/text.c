#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//дһ�������ӡ1 - 100֮������3�ı���������
int main()
{
	int i = 1;//�������i
	for (i = 1; i <= 100; i++)//����ѭ������
	{
		if ( i%3 == 0 )       //����3������Ϊ0ʱ
			printf("%d ", i);//���
	}
	return 0;
}