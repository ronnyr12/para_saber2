package com.company.q7;

public class PairOfNums {
    private int num1;
    private int num2;

    public PairOfNums(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * q7.a - solution
     * @return true if sum of two nums lms is prime
     */
    public boolean sumPrime() {
        int d1 = this.num1, d2 = this.num2;

        while (d1 >= 10)
            d1 /= 10;
        while (d2 >= 10)
            d2 /= 10;

        return isPrime(d1+d2);

    }

    /**
     * custom method
     *
     * @param num
     * @return true if num is a prime number
     */
    public static boolean isPrime(int num) {
        int dividers = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                dividers++;
        }
        return (dividers == 2);

    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
