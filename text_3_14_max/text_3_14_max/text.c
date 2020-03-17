#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int max(int x, int y)
{
	int z;
	if (x > y)
		z = x;
	else
		z = y;
	return (z);
}
int main()
{
	int max(int x, int y);
	int a = 0;
	int b = 0;
	int c = 0;
	scanf("%d,%d", &a, &b);
	c = max(a, b);
		printf("max=%d\n", c);
	return 0;
}