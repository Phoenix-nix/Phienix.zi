#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//��ϰ�ҳ�1��100֮�������

int main()//������
{
	int num = 1;//����һ������num
	for (num = 1; num <= 100 ; num++)//for��������еĴ����ʾѭ������������
	{
		if (num % 2 == 1)//��num����2��������1ʱ����Ϊ����
			printf("%d  ",num);//�����ʱ����
	}
	return 0;
}