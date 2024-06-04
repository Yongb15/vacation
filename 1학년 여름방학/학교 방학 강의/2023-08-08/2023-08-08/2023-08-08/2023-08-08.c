/*#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <malloc.h>					// malloc 함수 쓸때 필요
#include <stdlib.h>					// 이거만 써도 됨

int main()
{
	// 동적할당
	// 배열을 이용해 전체 학생의 점수 합을 구하라
	// 단, 학생 수는 사용자로부터 입력받는다.

	int point = 0;
	int std_cnt = 8;				// 초기화 중요
	int sum = 0;					// 누적 변수
	int* ptr = 0;						// 포인터 변수

	printf("학생 수를 입력하세요\n");

	scanf_s("%d", &std_cnt);

	ptr = (int*)malloc(std_cnt * sizeof(int));			// 중요!
	//			변수값(학생 수) * 크기를 구하는 함수 size(int 자료형)
	// (자료형)다른 자료형의 변수; = 명시적 형변환 : 캐스팅
	// 
	if (ptr == NULL) {
		printf("동적할당 실패");
		return -1;
	}
	for (int i = 0; i < std_cnt; i++) {
		scanf_s("%d", &point);
		ptr[i] = point;
		sum += ptr[i];
	}
	printf("총점 : %d\n", sum);
}*/

#include <stdio.h>
#define _CRT_SECURE_NO_WARNINGS