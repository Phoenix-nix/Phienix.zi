#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>

char *reverse_string(char *string)
{
	if (!string)                     //�ж������ַ����Ƿ�Ϊ�մ�
	{
		return NULL;                  //��Ϊ�մ��򷵻�NULL
	}

	int len = strlen(string);           //�����ַ�������
	if (len > 1)
	{
		char tmp = string[0];         //�ѵ�һ������tmp
		string[0] = string[len - 1];    //\0ǰһ��������һ��
		string[len - 1] = '\0';      // ���һ���ַ����´εݹ�ʱ���ٴ���   
		reverse_string(string + 1);         // �ݹ����   
		string[len - 1] = tmp;
	}

	return string;
}
int main()
{
	char string[100];
	gets(string);
	reverse_string(string);
	puts(string);
	return 0;
}