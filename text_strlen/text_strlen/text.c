#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//strlen的模拟（递归实现）
my_strlen(char* str)
{
	int count = 0;

	if (*str != '\0')
		return 1 + my_strlen(str + 1);
	else
		return 0;
}
#include<string.h>
int main()
{
	char arr[] = "bit";//数组名是首元素地址—char—的地址 char*
	int len = my_strlen(arr);
	printf("%d", len);

	/*my_strlen("bit");
	1 + my_strlen("it");
	1 + 1 + my_strlen("t");
	1 + 1 + 1 + my_strlen("");
	1 + 1 + 1 + 0;
	3;*/
	return 0;
}