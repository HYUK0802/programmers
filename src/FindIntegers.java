public class FindIntegers {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        //for(int i : num_list)은 향상된 for문으로, 배열 num_list의 각 원소를 변수 i에 순차적으로 할당합니다.
        for(int i : num_list){
            if(i == n){
                answer = 1;
            }
        }
        return answer;
    }
}
