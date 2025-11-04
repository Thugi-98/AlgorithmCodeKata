class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        int i;

        if (arr.length >= 1 && arr.length <= 100) {
            for (i = 0; i < arr.length; i++) {

                if (arr[i] >= -10000 && arr[i] <= 10000) {
                    sum += arr[i];
                } else throw new RuntimeException("배열 값이 범위를 벗어났습니다.");
            }

        } else throw new RuntimeException("배열 길이가 범위를 벗어났습니다.");

        answer = (double) sum / i;

        return answer;
    }
}