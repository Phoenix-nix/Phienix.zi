#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//дһ�����룺��ӡ100~200֮�������
//������ֻ�ܱ������1����
int main()
{
	int i, j;
	for (i = 100; i <= 200; i++)
	{
		for (j = 2; j < i; j++)        //����һ����j���ж����ܷ�i��������Ϊ����ֻ�ܱ������1����������j�ķ�Χ[2,i-1]
		{
			if (i%j == 0)              //���i�ܹ�����j,��ʱ����
				break;
		}
		if (j == i)                    //��������j����i����Ϊ����
			printf("%d\n", i);         //���
	}
	return 0;
}
