#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>

char *reverse_string(char *string)
{
	if (!string)                     //判断输入字符串是否为空串
	{
		return NULL;                  //若为空串则返回NULL
	}

	int len = strlen(string);           //计算字符串长度
	if (len > 1)
	{
		char tmp = string[0];         //把第一个赋给tmp
		string[0] = string[len - 1];    //\0前一个赋给第一个
		string[len - 1] = '\0';      // 最后一个字符在下次递归时不再处理   
		reverse_string(string + 1);         // 递归调用   
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