#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <malloc.h>

int main() {

	// for��

	/*// �⺻ for��
	 int i;

	for (i = 0; i < 5; i++) {
		printf("%d", i);
	} */

	/* // 5�� ������ �Է¹޾� ��� ���ϱ�
	int num = 0;
	int sum = 0;										// sum�� �ʱ�ȭ �Ƚ�Ű�� �����Ⱚ�� ��������Ƿ� �� 0���� �ʱ�ȭ�� ���Ѿ���.

	for (int i = 0; i < 5; i++) {
		scanf("%d", &num);
		sum += num;
	}
	printf("%d", sum); */

	/*// 2�� for�� 10�� ���� ��� �ٹٲ� �� �ٽ� i�� ��, ������ ��� -> �ٽ� ���� ���� ������ �ɶ����� �ݺ�!

	int i, j;

	for (i = 0; i < 3; i++) {
		for (j = 0; j < 10; j++) {
			printf("*");
		}
		printf("\n");
	}*/

	/* // ��ø for���� �̿��ؼ� ��������� ���� 5 ���̰� 6�� ���簢�� �����!
	int i, j;

	for (i = 0; i < 6; i++) {							// ����
		for (j = 0; j < 5; j++) {						// ��
			printf("*");
		}
		printf("\n");
	}*/

	/* // �����				// ���� �� ��!

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

	/*			// ��				// Ǯ���ֽ� �� 
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

	/*  // �𷡽ð�
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

	/* // �迭

	int i = 0, j = 0;
	int arr[9] = { 0, 1, 5, 3};				// ������ �迭		// �ڷ����� ���� �迭�� ũ�Ⱑ ������	// �ڷ����� �����ϸ� ���� �Ұ�	
										// �迭�� �ʱⰪ�� ������ ������ �����Ⱚ���� ä������ ��.	// { 0 , } <- 0���� �ʱ�ȭ

	int arr1[3][3] = { { 0, }, { 0, }, { 0, } };				// ������ �迭		// ��ǻ�ʹ� ������ �迭�� ������ �迭�� ���� ����

	char c[8] = { 'a', };				// ���ڿ� �迭		// ���ڿ��� ���� ��Ÿ���� ���� ���������� NULL�� �־���� �̷��� ���ϸ� �����Ⱚ���� ä������ ��.		// NULL�� ���� �� ĭ�� �÷��� ��
										// ÷���� NULL==\0���� �ʱ�ȭ ex) char a[2] = { 'd', 'c', \0 }		// �� ������ �ڷ����� ���!

	int* p = arr;

	// scanf("%d", &i);
	int* ray = (int*)malloc(sizeof(int)*i);				// ���ϴ� ��ŭ�� ũ�⸦ ����.		// malloc�� void�� int*�� ���.		// void�����ʹ� �� ĭ���� �Ҵ����. ����!
	// �� int(4byte)�� i�� ���ؼ� ������ ����.			// sizeof()�� �ڷ����� ũ�� Ȯ��!

	for (j = 0; j < sizeof(ray) / sizeof(int); j++) {				
		printf("8\n");
	}

	printf("%d\n", *p + 2);											// arr[0] + 2 == 2
	printf("%d\n", *(p + 2));										// arr[2] == 5 
	*/
}