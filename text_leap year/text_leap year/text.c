#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//��ӡ1000�굽2000��֮�������
int main()
{ 
	int  i = 0;                         //�����������ʼ��
	for (i = 1000; i <= 2000; i++)     
	{

		if ((i % 4 == 0 && i % 100 != 0)||(i % 400 == 0))
		{//����=1.�ܱ�4���������ܱ�100���� + 2.�ܱ�400������
			printf("%d ", i);
		}
		
	}
	return 0;
}