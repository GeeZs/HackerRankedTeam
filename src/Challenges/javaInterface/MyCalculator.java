package Challenges.javaInterface;
class MyCalculator implements AdvancedArithmetic{

    @Override
    public int divisor_sum(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (i != 0 && n % i == 0){
                result += i;
            }
        }
        return result;
    }
}
