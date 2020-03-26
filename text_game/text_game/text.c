#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//写代码，模拟用户登录情景，只能登录三次

int main()
{
	int i = 0;
	char password[20] = { 0 };
	for (i = 0; i < 3; i++)
	{
		printf("请输入密码：>");
		scanf("%s ",password);
		//判断
		//两个字符串比较大小，不能直接用==，应该用strcmp（），string compare
		if (0 == strcmp(password, "123456"))
		{
			printf("登陆成功\n");
				break;
		}
		else
		{
			printf("密码错误\n");
		}
	}
	if (i == 3)
	{
		printf("三次输入错误，登陆退出\n");
	}
	return 0;
}