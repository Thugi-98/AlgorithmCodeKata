class Solution {
    public int solution(int n) {
        int answer = 0;

        if (n >= 3 && n <= 1000000) {
            for (int i = n; i > 0; i--) {
                if (n % i == 1) answer = i;
            }
        }

        return answer;
    }
}