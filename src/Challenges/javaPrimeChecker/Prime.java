package Challenges.javaPrimeChecker;

class Prime {
    void checkPrime(int... args){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            if (isPrime(args[i])){
                if (builder.length() != 0){
                    builder.append(" ");
                }
                builder.append(args[i]);
            }
        }
        System.out.println(builder.toString());
    }

    private boolean isPrime(int number) {
        for (int i = 2;  i <= Math.sqrt(number); i++) {
            if(number % i == 0 || number <= 1)
                return false;
        }
        return true;
    }

}
