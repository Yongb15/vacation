#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <malloc.h>

int main() {

	// for문

	/*// 기본 for문
	 int i;

	for (i = 0; i < 5; i++) {
		printf("%d", i);
	} */

	/* // 5개 정수를 입력받아 모두 더하기
	int num = 0;
	int sum = 0;										// sum을 초기화 안시키면 쓰레기값이 들어있으므로 꼭 0으로 초기화를 시켜야함.

	for (int i = 0; i < 5; i++) {
		scanf("%d", &num);
		sum += num;
	}
	printf("%d", sum); */

	/*// 2중 for문 10번 별을 찍고 줄바꿈 후 다시 i의 참, 거짓을 계산 -> 다시 별을 찍음 거짓이 될때까지 반복!

	int i, j;

	for (i = 0; i < 3; i++) {
		for (j = 0; j < 10; j++) {
			printf("*");
		}
		printf("\n");
	}*/

	/* // 중첩 for문을 이용해서 별모양으로 폭이 5 높이가 6인 직사각형 만들기!
	int i, j;

	for (i = 0; i < 6; i++) {							// 높이
		for (j = 0; j < 5; j++) {						// 폭
			printf("*");
		}
		printf("\n");
	}*/

	/* // 별찍기				// 내가 한 것!

	for (int i = 0; i < 4; i++) {
		for (int j = 4; j > i; j--) {
			printf(" ");
		}
		for (int k = 0; k < 1 + i * 2; k++) {
			printf("*");
		}
		printf("\n");
	}
	for (int i = 4; i >= 0; i--) {
		for (int j = 4; j > i; j--) {
			printf(" ");
		}
		for (int k = 0; k < 1 + i * 2; k++) {
			printf("*");
		}
		printf("\n");
	} */

	/*			// 답				// 풀어주신 것 
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 4 - i; j++) {
			printf(" ");
		}
		for (int k = 0; k < ((1 + i) * 2) - 1; k++) {
			printf("*");
		}
		printf("\n");
	}
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < i + 1; j++) {
			printf(" ");
		}
		for (int k = 0; k < ((4 - i) * 2) - 1; k++) {
			printf("*");
		}
		printf("\n");
	} */

	/*  // 모래시계
	for (int i = 4; i >= 0; i--) {
		for (int j = 4; j > i; j--) {
			printf(" ");
		}
		for (int k = 0; k < 1 + i * 2; k++) {
			printf("*");
		}
		printf("\n");
	}
	for (int i = 1; i <= 4; i++) {
		for (int j = 4; j > i; j--) {
			printf(" ");
		}
		for (int k = 0; k < 1 + i * 2; k++) {
			printf("*");
		}
		printf("\n");
	}  */

	/* // 배열

	int i = 0, j = 0;
	int arr[9] = { 0, 1, 5, 3};				// 일차원 배열		// 자료형의 따라 배열의 크기가 정해짐	// 자료형을 선언하면 변경 불가	
										// 배열의 초기값을 정하지 않으면 쓰레기값으로 채워지게 됨.	// { 0 , } <- 0으로 초기화

	int arr1[3][3] = { { 0, }, { 0, }, { 0, } };				// 이차원 배열		// 컴퓨터는 일차원 배열과 이차원 배열을 구분 못함

	char c[8] = { 'a', };				// 문자열 배열		// 문자열의 끝을 나타내기 위해 마지막값을 NULL로 넣어야함 이렇게 안하면 쓰레기값으로 채워지게 됨.		// NULL을 위해 한 칸을 늘려야 함
										// 첨부터 NULL==\0으로 초기화 ex) char a[2] = { 'd', 'c', \0 }		// ★ 문자형 자료형에 사용!

	int* p = arr;

	// scanf("%d", &i);
	int* ray = (int*)malloc(sizeof(int)*i);				// 원하는 만큼의 크기를 정함.		// malloc은 void라 int*를 사용.		// void포인터는 한 칸씨만 할당받음. 보안!
	// ※ int(4byte)를 i번 곱해서 공간을 만듬.			// sizeof()는 자료형의 크기 확인!

	for (j = 0; j < sizeof(ray) / sizeof(int); j++) {				
		printf("8\n");
	}

	printf("%d\n", *p + 2);											// arr[0] + 2 == 2
	printf("%d\n", *(p + 2));										// arr[2] == 5 
	*/
}