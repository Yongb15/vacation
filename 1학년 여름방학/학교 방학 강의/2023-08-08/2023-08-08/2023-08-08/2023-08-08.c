/*#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <malloc.h>					// malloc �Լ� ���� �ʿ�
#include <stdlib.h>					// �̰Ÿ� �ᵵ ��

int main()
{
	// �����Ҵ�
	// �迭�� �̿��� ��ü �л��� ���� ���� ���϶�
	// ��, �л� ���� ����ڷκ��� �Է¹޴´�.

	int point = 0;
	int std_cnt = 8;				// �ʱ�ȭ �߿�
	int sum = 0;					// ���� ����
	int* ptr = 0;						// ������ ����

	printf("�л� ���� �Է��ϼ���\n");

	scanf_s("%d", &std_cnt);

	ptr = (int*)malloc(std_cnt * sizeof(int));			// �߿�!
	//			������(�л� ��) * ũ�⸦ ���ϴ� �Լ� size(int �ڷ���)
	// (�ڷ���)�ٸ� �ڷ����� ����; = ����� ����ȯ : ĳ����
	// 
	if (ptr == NULL) {
		printf("�����Ҵ� ����");
		return -1;
	}
	for (int i = 0; i < std_cnt; i++) {
		scanf_s("%d", &point);
		ptr[i] = point;
		sum += ptr[i];
	}
	printf("���� : %d\n", sum);
}*/

#include <stdio.h>
#define _CRT_SECURE_NO_WARNINGS