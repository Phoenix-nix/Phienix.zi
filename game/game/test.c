#define _CRT_SECURE_NO_WARNINGS 1

#include"game.h"

//三个数组
//一个布置好雷的信息 
//一个放排查出的雷的信息

void menu()
{
	printf("**********************\n");
	printf("******   1.play   ****\n");
	printf("******   0.exit   ****\n");
	printf("**********************\n");
}

void game()
{
	//一个布置好雷的信息
	char mine[ROWS][COLS] = {0};//'0' - 不是雷
	//一个放排查出的雷的信息
	char show[ROWS][COLS] = { 0 };//’*‘ - 神秘 未排查
	//初始化
	InitBoard(mine, ROWS, COLS,'0');
	InitBoard(show, ROWS, COLS, '*');
	//打印棋盘
	//DisplayBoard(mine, ROW, COL);
	//DisplayBoard(show, ROW, COL);
	//布置雷
	SetMine(mine, ROW, COL);
	//DisplayBoard(mine, ROW, COL);
	DisplayBoard(show, ROW, COL);
	//排查雷
	FindMine(mine, show, ROW, COL);

}
void test()
{
	int input = 0;
	srand((unsigned int)time(NULL));
	do
	{
		menu();
		printf("请选择：");
		scanf("%d", &input);
		switch(input)
		{
		case 1:
				//printf("扫雷\n");
				game();
				break;
		case 0:
				printf("退出游戏\n");
				break;
		default:
				printf("选择错误\n");
				break;
		}
	} while (input);
}
int main()
{
	test();
	return 0;
}