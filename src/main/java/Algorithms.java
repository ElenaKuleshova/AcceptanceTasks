public class Algorithms {

    /**
     * Task 1: Given the triangle of consecutive odd numbers сalculate
     * the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)
     */

    static int sumNumbersInRow(int n){
        int firstRowItem = n * (n - 1) + 1;
        int lastRowItem = firstRowItem + 2 * ( n - 1);
        int sum = 0;
        for (int i = firstRowItem; i <= lastRowItem; i += 2 ){
            sum += i;
        }
        return sum;
    }

    /**
     * Task 2: "Given two integers a and b, which can be positive or negative,
     * find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.
     *
     * Note: a and b are not ordered!"
     */

    static int sumIntegersInRange(int a, int b){
        if (a == b){
            return a;
        }
        int firstItem = a < b ? a : b;
        int lastItem = a > b ? a : b;
        int sum = 0;
        for (int i = firstItem; i <= lastItem; i++){
            sum += i;
        }
        return sum;
    }
}
