package ch01;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
	// public static void main(String[] args) {
	// String[] strArray = new String[3];
	// strArray[0] = "Java";
	// strArray[1] = "Java";
	// strArray[2] = new String("Java");

	// System.out.println( strArray[0] == strArray[1] ); //true: 같은 객체 참조
	// System.out.println( strArray[0] == strArray[2] ); //false: 다른 객체를 참조
	// System.out.println( strArray[0].equals(strArray[2]) ); //true: 문자열이 동일
	// }
	int[][] mathScores =new int[2][3];// 1차원의 열이3인 2차원배열
	//
	mathScores[0][0]=80;mathScores[0][1]=83;mathScores[0][2]=85;mathScores[1][0]=86;mathScores[1][1]=90;mathScores[1][2]=92;

	// 전체학생의 수학 평균 구하기
	int totalStudent = 0;
	int totalMathSum = 0;System.out.println("1번|2번|3번|소계|평균");for(
	int i = 0;i<mathScores.length;i++)
	{
		for (int j = 0; j < mathScores[i].length; j++) {

			System.out.print(mathScores[i][j] + "|");
			totalMathSum += mathScores[i][j];
		}
		System.out.print(totalMathSum + "|");
		System.out.print(totalMathSum / mathScores[i].length);
		System.out.println();
		totalMathSum = 0;
	}
}
}