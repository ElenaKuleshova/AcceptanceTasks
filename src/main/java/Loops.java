public class Loops {

    /**
     * Task 1: Создать переменную типа String и присвоить ей значение. Определить, является ли это значение палиндромом.
     * (палиндром: “123321” или “aba” или “a1b99b1a”). Использовать разные циклы (for, while).
     */

    static boolean isPalindromeFor(String text){
        int stringMaxIndex = text.length() - 1;
        for(int i = 0; i < text.length()/2; i++){
            if (text.charAt(i) != text.charAt(stringMaxIndex - i)){
                return false;
            }
        }
        return true;
    }

    static boolean isPalindromeWhile(String text){
        int stringMaxIndex = text.length() - 1;
        int i = 0;
        while(i < text.length()/2){
            if(text.charAt(i) != text.charAt(stringMaxIndex - i)){
                return false;
            }
            i++;
        }
        return true;
    }

    /**
     * Task 2: Написать код, который будет выводить в консоль числа в определенном диапазоне
     * с определенным шагом (например, min = 0, max = 15, step = 5 выведет 0, 5, 10, 15).
     * Использовать разные циклы (for, while).
     */
    static String getIntRangeFor(int rangeStart, int rangeFinish, int step){
        if (step < 1) {
            return "Шаг должен быть больше либо равен 1. Попробуйте снова.";
        }
        String txt = "Числа в диапазоне от " + rangeStart + " до " + rangeFinish + ": ";
        if (rangeStart < rangeFinish){
        for(int i = rangeStart; i <= rangeFinish; i += step){
            txt += i + " ";
            }
        } else if (rangeStart > rangeFinish) {
            for(int i = rangeStart; i >= rangeFinish; i -= step){
                txt += i + " ";
            }
        } else {
            txt += rangeStart;
        }
        System.out.println(txt);
        return txt.trim();
    }

    static String getIntRangeWhile(int rangeStart, int rangeFinish, int step){
        if (step < 1) {
            return "Шаг должен быть больше либо равен 1. Попробуйте снова.";
        }
        String txt = "Числа в диапазоне от " + rangeStart + " до " + rangeFinish + ": ";
        int i = rangeStart;
        if (rangeStart < rangeFinish){
            while (i <= rangeFinish){
            txt += i + " ";
            i += step;
            }
        }
        if (rangeStart > rangeFinish){
            while (i >= rangeFinish){
                txt += i + " ";
                i -= step;
            }
        }
        if (rangeStart == rangeFinish){
            txt += rangeStart;
        }
        System.out.println(txt);
        return txt.trim();
    }

    /**
     * Task 3: Создать переменную типа int и присвоить ей значение (минимум 6 знаков).
     * Вывести в консоль каждую цифру данного числа, начиная с последней.
     */
    static String splitNumberToIntegers(int number){
        if(number / 100000 < 1 ) {
            return "Число содержит меньше 6 знаков";
        }
        String digitsString = "";
        while (number > 0) {
            int digit = number % 10;
            digitsString += digit + " ";
            number /= 10;
            }
        System.out.println(digitsString);
        return digitsString.trim();
    }

    /**
     * Task 4: Модифицировать задачу 4 так, чтобы дополнительно выводилась сумма цифр числа.
     */
    static String splitAndSumIntegers(int number){
        if(number / 100000 < 1 ) {
            return "Число содержит меньше 6 знаков";
        }
        String digitsString = "";
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            digitsString += digit + " ";
            sum += digit;
            number /= 10;
        }
        System.out.println(digitsString + "\nСумма = " + sum);
        return digitsString.trim() + "\nСумма = " + sum;
    }

    /**
     * Task 5:Написать код, который будет выводить таблицу умножения в диапазоне между 0 и 9.
     */
    static void printMultiplicationTable(){
        for (int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.print(j + " x " + i + " = " + (j*i) + "\t");
            }
            System.out.println("\n");
        }
    }

    static void printMultiplicationTableNM(int rows, int columns){
        int n = rows;
        int m = columns;
        String table;
        table = "\t|\t";
        for (int i = 1; i <= m; i++){
            table += i + "\t";
        }
        table += "\n";
        for (int j = 1; j <= n; j++){
            table += j + "\t|\t";
            for (int k = 1; k <= m; k++){
                table += (j*k) + "\t";
            }
            table += "\n";
        }
        System.out.print(table);
    }


    /**
     * Task 6:Есть семья из n детей (n - переменная). У каждого ребенка есть яблоки: у первого - одно, у второго - два, etc.
     * Вывести в консоль положительный баланс семьи в яблоках, используя циклы.
     */
    static int getAppleBalance(int n){
        if (n < 0){
            System.out.println("Number should be more or equal to 0, return result '-1' for invalid values");
            return -1;
        }
        int balance = 0;
        for (int i = 0; i <= n; i++){
            balance += i;
        }
        System.out.println("Положительный баланс семьи в яблоках: " + balance);
        return balance;
    }

    /**
     * Task 7: Написать метод расчета факториала числа.
     */
    static int calculateFactorial(int n){
        if (n < 1){
            System.out.println("Number should be a positive integer, return result -1 for invalid values");
            return -1;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Task 8: Дано 2 строки. Вывести все символы из первой строки, которых нет во второй.
     */
    static String findMissedCharacter(String a, String b){
    if (a.length() == 0 || b.length() == 0){
        return "Invalid string length";
    }
    String missedCharacters = "";
    for (int i = 0; i < a.length(); i++){
        boolean charExists = false;
        for (int j = 0; j < b.length(); j++){
           if (a.charAt(i) == b.charAt(j)){
               charExists = true;
               break;
           }
        }
        if (!charExists) {
            missedCharacters += a.charAt(i) + " ";
        }
    }
    System.out.println("Символы из первой строки, которых нет во второй: " + missedCharacters);
    return missedCharacters.trim();
    }

    /**
     * Task 9: Написать цикл, что будет выводить в консоль фигуры с помощью *:
     * квадрат со стороной из 4 звезд, равносторонний треугольник с основанием из 7 звезд
     */
    static void printSquare(int sideLength){

    }
}
