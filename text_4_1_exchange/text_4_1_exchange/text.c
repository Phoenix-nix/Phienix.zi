#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//����������ʱ�����������������ͱ���

int main()
{
	int a = 3;
	int b = 5;

	//a = a + b;
	//b = a - b;    ���ܻ����
	//a = a - b;

	a = a^b;
	b = a^b;        //��λ���
	a = a^b;        //�ɶ��Բ����ִ����

	printf("a=%d b=%d\n", a, b);
	return 0;
}