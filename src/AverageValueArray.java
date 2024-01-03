public class AverageValueArray {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
//        향상된 for문(for (int i : numbers))을 사용하여 배열 numbers의 각 원소를 변수 i에 순차적으로 할당합니다.
        for(int i : numbers){
            sum += i;
        }
//        numbers.length를 (double)로 형변환하여 정수 나눗셈에서 소수점 이하를 계산할 수 있도록 합니다.
        answer = sum / (double)numbers.length;
        return answer;
    }
}
