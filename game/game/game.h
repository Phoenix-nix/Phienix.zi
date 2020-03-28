#define ROW 9
#define COL 9

#define ROWS ROW+2
#define COLS COL+2

#define EASY_COUNT 10

#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void InitBoard(char board[ROWS][COLS], int rows, int col,char set);
void DisplayBoard(char board[ROWS][COLS], int rows, int col);
void SetMine(char mine[ROWS][COLS], int rows, int col);
void FindMine(char mine[ROWS][COLS], char show[ROWS][COLS], int row, int col);