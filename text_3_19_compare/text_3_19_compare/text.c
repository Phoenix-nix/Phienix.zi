#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//д���뽫���������Ӵ�С���
int main()
{
	int a = 0;
	int b = 0;
	int c = 0;
	int x = 0;//����4������������ʼ��
	scanf("%d %d %d",&a, &b, &c);
	if (a < b)//�Ƚ�a,b��С
	{
		x = b;
		b = a;
		a = x;//��b>a������a,b��ֵ
	}

	if (a < c)//��ʱaΪ�ϴ�ֵ���Ƚ�a,c��С
	{
		x = c;
		c = a;
		a = x;//��c>a������a,c��ֵ
	}

	if (b < c)//��ʱaΪ�ϴ�ֵ������ȷ��b,c��С���Ƚ�b,c
	{
		x = c;
		c = b;
		b = x;//��c>b������b,c��ֵ
	}
	printf("%d %d %d", a, b, c);//������
	return 0;
}