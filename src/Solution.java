class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        int i;

        // 배열 길이 검증
        if (numbers.length >= 1 && numbers.length <= 100) {
            for (i = 0; i < numbers.length; i++) {

                // 배열값 범위 검증
                if (numbers[i] >= 0 && numbers[i] <= 1000)
                    sum += numbers[i];
                else throw new RuntimeException("배열 값이 범위를 벗어났습니다.");
            }

        } else throw new RuntimeException("배열 길이가 범위를 벗어났습니다.");

        answer = (double) sum / i;

        return answer;
    }
}