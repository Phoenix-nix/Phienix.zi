#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//����1/1 - 1/2 + 1/3 - 1/4 + 1/5 ���� + 1/99 - 1/100 ��ֵ����ӡ�����
int main()
{
	int i = 0;
	double sum = 0.0;//��Ȼ�з�ĸ�����ս���϶�ΪС��
	int a = 1;

	for (i = 1; i <= 100; i++)
	{
		sum += (1.0 * a) / i;//�������ı��ʽ
		a = -a;//�۲��֪ż��ĸΪ������������ĸΪ����������a=-a���仯
	}

	printf("sum=%lf ", sum);
	return 0;
}