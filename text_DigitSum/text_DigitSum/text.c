#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//��ҵ����
//����һ������ÿλ֮�ͣ��ݹ�ʵ�֣�
//
//��ҵ����
//дһ���ݹ麯��DigitSum(n)������һ���Ǹ����������������������֮��
//
//���磬����DigitSum(1729)����Ӧ�÷���1 + 7 + 2 + 9�����ĺ���19
//
//���룺1729�������19

int DigitSum(int n)
{
	int sum = 0;
	int m = 0;
	if (n != 0)
	{
		m = n % 10;
		n = n / 10;
		sum = m + DigitSum(n);
	}
		return sum;
}
int main()
{
	int x = 0;
	printf("������һ������\n");
	scanf("%d", &x);
	printf("sum = %d\n", DigitSum(x));
	return 0;
}