import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /**
         * Tasks related to Primitive types
         */
        //Task 1 - create variables of each primitive type with and w/o value.
        Primitives.primitiveTaskOne();

        //Task 2
        Primitives.primitiveTaskTwo();

        //Task 3 - decrement, increment byte with values -127, 128
        Primitives.primitiveTaskThree();

        //Task 4 - pre/post increment and decrement
        Primitives.primitiveTaskFour();

        //Task 5 - calculate a = a++ + ++a и b = --b - b--
        Primitives.primitiveTaskFive();

        //Task 6 - print result1, result2, result 3
        Primitives.primitiveTaskSix();

        //Task 7 - calculate y * 3 + 20 / 2 * x--
        Primitives.primitiveTaskSeven();

        //Task 8
        Primitives.primitiveTaskEight();

        //Task 9
        Primitives.primitiveTaskNine(30);
        Primitives.primitiveTaskNine(15);
        Primitives.primitiveTaskNine(-10);

        //Task 10
        assert Primitives.isLeapYear(1600);
        assert !Primitives.isLeapYear(2023);

        //Task 11
        Primitives.primitiveTaskEleven();

        /**
         * Asserts/println for Tasks related to Conditions
         */
        //Task 1
        assert Conditions.findMedium(7, 5, 9) == 7;

        //Task 2
        assert Conditions.printFizBuz(20).equals("Buz");
        assert Conditions.printFizBuz(9).equals("Fiz");
        assert Conditions.printFizBuz(15).equals("FizBuz");
        assert Conditions.printFizBuz(2).equals("The number is not a multiple of 3 or 5");

        //Task 3
        assert Conditions.isTriangle(3, 4 , 5);
        assert Conditions.isTriangle(5, 7, 3);

        //Task 4
        assert Conditions.printFizBuzSwitch(9).equals("Fiz");
        assert Conditions.printFizBuzSwitch(15).equals("FizBuz");
        assert Conditions.printFizBuzSwitch(20).equals("Buz");
        assert Conditions.printFizBuzSwitch(2).equals("The number is not a multiple of 3 or 5");

        //Task 5
        assert Conditions.findSquareRoots(1, -2, -3).equals("x1 = 3.0, x2 = -1.0");
        assert Conditions.findSquareRoots(-1, -2, 15).equals("Корней нет");
        assert Conditions.findSquareRoots(1, 12, 36).equals("x1 = -6.0");

        //Task 6
        assert Conditions.printIntAscending(89, 5, 69).equals("5, 69, 89");

        //Task 7
        assert Conditions.getSecondsToWorkDayEnd(10, 0) == 25200;
        assert Conditions.getSecondsToWorkDayEnd(12, 55) == 14700;
        assert Conditions.getSecondsToWorkDayEnd(14, 30) == 9000;
        assert Conditions.getSecondsToWorkDayEnd(18, 0) == 0;

        //Task 8

        assert Conditions.printHoursLeftToWorkEnd(Conditions.getHoursToWorkDayEnd(10,0)).equals("осталось 7 часов");
        assert Conditions.printHoursLeftToWorkEnd(Conditions.getHoursToWorkDayEnd(9,50)).equals("осталось 7 часов");
        assert Conditions.printHoursLeftToWorkEnd(Conditions.getHoursToWorkDayEnd(14,0)).equals("осталось 3 часа");
        assert Conditions.printHoursLeftToWorkEnd(Conditions.getHoursToWorkDayEnd(16,0)).equals("осталось 1 час");
        assert Conditions.printHoursLeftToWorkEnd(Conditions.getHoursToWorkDayEnd(16,30)).equals("осталось менее часа");

        //Task 9
        Conditions.printSecondsAndHoursToWorkDayEnd(14700);


        /**
         * Asserts for Tasks related to Loops
         */
        //Task 1 - Palindrome
        assert Loops.isPalindromeFor("123321");
        assert !Loops.isPalindromeFor("1233a");
        assert Loops.isPalindromeFor("123abba321");
        assert Loops.isPalindromeWhile("a1b99b1a");
        assert !Loops.isPalindromeWhile("a12r");

        //Task 2 - Integers range with min, max and step
        assert Loops.getIntRangeFor(-5, 8, 1).equals("Числа в диапазоне от -5 до 8: -5 -4 -3 -2 -1 0 1 2 3 4 5 6 7 8");
        assert Loops.getIntRangeWhile(0, 15, 5).equals("Числа в диапазоне от 0 до 15: 0 5 10 15");

        //Task 3 - Split Number to single digits starting form the end
        assert Loops.splitNumberToIntegers(123456).equals("6 5 4 3 2 1");


        //Task 4 - split number to single digits and get sum
        assert Loops.splitAndSumIntegers(123456).equals("6 5 4 3 2 1\n" + "Сумма = 21");

        //Task 5 - print multiplication table in range from 0 to 9
        //Loops.printMultiplicationTable();

        //Task 6 - one child has 1 apple, 2nd - 2, etc, show balance in apples
        assert Loops.getAppleBalance(3) == 6;
        assert Loops.getAppleBalance(2) == 3;
        assert Loops.getAppleBalance(0) == 0;

        //Task 7 - calculate factorial
        assert Loops.calculateFactorial(4) == 24;
        assert Loops.calculateFactorial(2) == 2;

        //Task 8 - find characters from 1st string which don't exist in the 2nd string
        assert Loops.findMissedCharacter("bcdhk", "adfbul").equals("c h k");


        /**
         * println for Tasks related to Arrays
         */

        //Task 1 - Sum 2 arrays and save them to the 3rd array
        int[] firstArray = new int[] {1, 2, 3};
        int[] secondArray = new int[] {5, 6, 9, 10};
        System.out.println(Arrays.toString(ArrayTasks.sumArrays(firstArray, secondArray)));

        //Task 2 - Reverse array
        int[] array = new int[] {1, 2 , 3, 4 , 5 , 6};
        System.out.println(Arrays.toString(ArrayTasks.reverseArrayFor(array)));
        System.out.println(Arrays.toString(ArrayTasks.reverseArrayWhile(array)));

       //Task 3 - find min and max value in array
        int[] testArray = new int[] {0, 5, 10 , 15};
        System.out.println(ArrayTasks.findMinMaxInArray(testArray));


        /**
         * Asserts for Tasks related to Algorithmization
         */

        //Task 1 - sum numbers in row of the triangle of consecutive odd number

        assert Algorithms.sumNumbersInRow(1) == 1;
        assert Algorithms.sumNumbersInRow(2) == 8;
        assert Algorithms.sumNumbersInRow(3) == 27;
        assert Algorithms.sumNumbersInRow(4) == 64;

        //Task 2 - find the sum of all the integers between and including two integers a and b
        assert Algorithms.sumIntegersInRange(5, 6) == 11;
        assert Algorithms.sumIntegersInRange(5, 8) == 26;
        assert Algorithms.sumIntegersInRange(8, 5) == 26;
        assert Algorithms.sumIntegersInRange(8, -5) == 21;
        assert Algorithms.sumIntegersInRange(10, 10) == 10;


    }


}
