#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<math.h>

//ˮ�ɻ���


int main()
{
	int i = 0;
	for (i = 0; i <= 100000; i++)
	{
		int sum = 0;
		int count = 1;
		//�ж�i�Ƿ���ˮ�ɻ���
		//1.����i��λ��
		int tmp = i;
		while (tmp/=10)
		{

			count++;

		}
		//2.�õ�i��ÿһλ������ÿһλ��λ���η���
		tmp = i;
		while (tmp)
		{
			sum+=pow(tmp % 10, count);
			tmp /= 10;
		}
		//3.�ж�
		if (sum == i)
		{
			printf("%d ", i);
		}
	}
	return 0;
}
