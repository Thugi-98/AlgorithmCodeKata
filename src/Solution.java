import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        if (n > 0 && n <= 100000000) {
            for (int i = 1; i <= 100000000;) {
                sum += (n / i) % 10;
                i *= 10;
            }
        }
        answer = sum;

        System.out.println("answer = " + answer);

        return answer;
    }
}