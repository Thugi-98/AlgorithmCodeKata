class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];
        int ans = x;

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                answer[i] = ans;
                ans += x;
            }
        } else throw new RuntimeException("n이 자연수가 아닙니다.");
        return answer;
    }
}