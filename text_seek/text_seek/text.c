#define _CRT_SECURE_NO_WARNINGS 1

#include<stdio.h>

//������������в���ĳ���������

int main()

{

	//int arr[10] = { 0 };

	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };//���

	//�±��0��ʼ

	int k = 7;//Ҫ������
	int sz = sizeof(arr) / sizeof(arr[0]);//����Ԫ�ظ���
	int i = 0;

	for (i = 0; i < sz; i++)

	{
		//0-9
		if (arr[i] == k)
		{
			printf("�ҵ��ˣ��±��ǣ�%d\n", i);
			break;
		}
	}

	if (i == sz)
	{
		printf("�Ҳ���");
	}

	return 0;

}