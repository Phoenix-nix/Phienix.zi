#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//���������������������������Լ��
int main()
{
	int a;
	int b;
	int c;

	printf("��������Ҫ�����������\n");
	scanf("%d %d", &a, &b);         //����Ҫ�����a,b

	c =(a > b) ? b : a;             //��Ŀ���������С��ֵ����c
	
	if (a%c != 0 || b%c != 0)       //���ab�޷�����c
	{
		c--;                        //c--�ټ�����ֱ������
	}

		printf("���Լ���ǣ�%d\n", c);//�����ʱ����

	return 0;
}