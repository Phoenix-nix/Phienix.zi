#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//д���룬ģ���û���¼�龰��ֻ�ܵ�¼����

int main()
{
	int i = 0;
	char password[20] = { 0 };
	for (i = 0; i < 3; i++)
	{
		printf("���������룺>");
		scanf("%s ",password);
		//�ж�
		//�����ַ����Ƚϴ�С������ֱ����==��Ӧ����strcmp������string compare
		if (0 == strcmp(password, "123456"))
		{
			printf("��½�ɹ�\n");
				break;
		}
		else
		{
			printf("�������\n");
		}
	}
	if (i == 3)
	{
		printf("����������󣬵�½�˳�\n");
	}
	return 0;
}