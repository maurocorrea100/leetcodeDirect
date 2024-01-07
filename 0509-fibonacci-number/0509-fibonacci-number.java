class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;
        int sum = 0;
        int num1 = 1, num2 = 1;
        for(int i = 3; i <= n; i++){
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        return sum;
    }
}