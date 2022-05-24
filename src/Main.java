public class Main {
    /*
    recursive fibonacci
    fib(1) == 1
    fib(2) == 2 || fib(2) = fib(1) + fib(1)

    let n (input) = number of terms
    let sum (output) = terms total
    n = 5
    fib(5) = 1 + 1 + 2 + 3 + 5
    sum = 12 = 5 + fib(4)
    fib(4) =

    n > 2
    fib(5) = fib(4) + fib(3)
    fib(5) = [fib(3) + fib(2)] + [fib(2) + fib(1)]
    fib(5) = fib(2) + fib(1) + fib(2) + fib(2) + fib(1)
    fib(5) = 8

    fib(3) = fib(3-1) + fib(3-2)
    fib(3) = fib(2) + fib(1)
    fib(3) = fib(
     */

    public static void main(String[] args) {
        System.out.println(fib(9));
    }

    /**
     *
     * @param num amount of terms in the sequence. must be greater than 0
     * @return the fibonacci number at "num" term
     *          For example: fib(13) = 337;
     */

    public static int fib(int num){
        if(num == 1){
            return num;
        } else if(num == 2){
            return num;
        }
        return fib(num - 1) + fib(num - 2);
    }
}
