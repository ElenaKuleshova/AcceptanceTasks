public class Primitives {

    /**
     * Task 1: Создать примитив каждого типа 2 раза (с и без значения). Проверить значение каждого примитива.
     * <p>
     * Comments: Можем проверить значение только примитивов со значениями.
     * При обращении к переменным, которые были объявлены в методе, но не инициализированы, получаем compile error.
     * У локальных переменных нет дефолтных значений.
     */
    static void primitiveTaskOne() {
        byte byteVariableA;
        byte byteVariableB = 127;
        short shortVariableA;
        short shortVariableB = 32767;
        int intVariableA;
        int intVariableB = 2147483647;
        long longVariableA;
        long longVariableB = 1000000000000000L;
        double doubleVariableA;
        double doubleVariableB = 25.6;
        float floatVariableA;
        float floatVariableB = 256.9F;
        boolean booleanVariableA;
        boolean booleanVariableB = false;
        char charVariableA;
        char charVariableB = 'A';
        System.out.println(byteVariableB + ", " + shortVariableB + ", " + intVariableB + ", " +
                longVariableB + ", " + doubleVariableB + ", " + floatVariableB + ", " +
                booleanVariableB + ", " + charVariableB);
       /* System.out.println(byteVariableA + ", " + shortVariableA + ", " + intVariableA + ", " +
                longVariableA + ", " + doubleVariableA + ", " + floatVariableA + ", " +
                booleanVariableA + ", " + charVariableA;        --> локальные переменные не инициализированы, при обращении появляется ошибка*/


    }

    /**
     * Task 2: Создать примитив каждого типа. Вывести в консоль суммы пар (например, int + float)
     *
     * Comments: Возможно не правильно поняла задание, но пропишу выводы по сложению
     * - оператор '+' не работает с типом boolean;
     * - при сложении с переменной типа char используется unicode символа;
     * - если в выражении есть переменная double, то остальные тоже расширяются до double
     * - если в выражении есть float и при этом нет double, то расширение происходит до типа float
     * - если в выражении только целочисленные типы:
     * -- если есть long - то расширяем до long;
     * -- если нет long, то расширяется до int во том числе (byte + short)
     */

    static void primitiveTaskTwo() {
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483640;
        long longVar = 9_223_372_036_854_700_000L;
        double doubleVar = 2.3333333333333335;
        float floatVar = 100.00F;
        boolean booleanVar = true;
        char charVar = 'A';
        System.out.println("byte + short = " + byteVar +" + " + shortVar + " = " + (byteVar + shortVar) + "\n" +
                "byte + int = " + byteVar +" + " + intVar + " = " + (byteVar + intVar) + "\n" +
                "byte + long = " + byteVar +" + " + longVar + " = " + (byteVar + longVar) + "\n" +
                "byte + double = " + byteVar +" + " + doubleVar + " = " + (byteVar + doubleVar) + "\n" +
                "byte + float = " + byteVar +" + " + floatVar + " = " + (byteVar + floatVar) + "\n" +
                "byte + char = " + byteVar +" + " + charVar + " = " + (byteVar + charVar)); //codes of chars are used with '+' operator
        // System.out.println("byte + boolean = " + (byteVar + booleanVar)); '+' operator is N/A for boolean type
        System.out.println("short + int = " + shortVar +" + " + intVar + " = " + (shortVar + intVar) + "\n" +
                "short + long = " + shortVar +" + " + longVar + " = " + (shortVar + longVar) + "\n" +
                "short + double = " + shortVar +" + " + doubleVar + " = " + (shortVar + doubleVar) + "\n" +
                "short + float = " + shortVar +" + " + floatVar + " = " + (shortVar + floatVar) + "\n" +
                "short + char = " + shortVar +" + " + charVar + " = " + (shortVar + charVar));
        System.out.println("int + long = " + intVar +" + " + longVar + " = " + (intVar + longVar) + "\n" +
                "int + double = " + intVar +" + " + doubleVar + " = " + (intVar + doubleVar) + "\n" +
                "int + float = " + intVar +" + " + floatVar + " = " + (intVar + floatVar) + "\n" +
                "int + char = " + intVar +" + " + charVar + " = " + (intVar + charVar));
        System.out.println("long + double = " + longVar +" + " + doubleVar + " = " + (longVar + doubleVar) + "\n" +
                "long + float = " + longVar +" + " + floatVar + " = " + (longVar + floatVar) + "\n" +
                "long + char = " + longVar +" + " + charVar + " = " + (longVar + charVar));
        System.out.println("double + float = " + doubleVar +" + " + floatVar + " = " + (doubleVar + floatVar) + "\n" +
                "double + char = " + doubleVar +" + " + charVar + " = " + (doubleVar + charVar));
        System.out.println("float + char = " + floatVar +" + " + charVar + " = " + (floatVar + charVar));



    }

    /**
     * Task 3: Создать 2 переменные типа byte со значениями -127 и 128.
     * Попробовать сделать инкремент/декремент значений. Объяснить результат.
     *
     * Comments: Наверное, переменным byte нужно присвоить значения нижней и верхней границы (-128 и 127).
     * В результате декремента/инкремента значений происходит переполнения(вроде так называется), т.е пытаемся присвоить значение
     * выходящее за пределы объявленного типа. В таком случае переходим к противоположной границе, например: -128 - 2 = 126,
     * 127 + 2 = -127.
     */
    static void primitiveTaskThree(){
        byte a = -128;
        byte b = 127;
        a--; // a = -128 -1 = -129 - значение слишком маленькое (underflow), переходим на верхнюю границу -> a = 127
        b++; // b = 127 +1 = 128 - значение слишком большое (overflow), переходим к нижней границе -> b = -128
        System.out.println("-128 после декремента = " + a);
        System.out.println("127 после инкремента = " + b);
    }

    /**
     * Task 4:Создать 2 переменные, где а = число, b = a (с пре/пост инкрементом/декрементом).
     * Попробовать угадать результат. Вывести результат в консоль. Попробовать объяснить результат.
     */
    static void primitiveTaskFour(){
        int a = 5;
        int b = ++a; // b = 6 (значение сначала увеличивается на 1, потом используется в выражении)
        System.out.println("b = ++a " + "-> " + b);
        b = --a; // b = 5 (значение сначала уменьшается на 1, потом используется)
        System.out.println("b = --a " + "-> " + b);
        b = a++; //b = 5 (значение увеличится на 1 после того, как будет использовано в выражении)
        System.out.println("b = a++ " + "-> " + b);
        b = a--; // b = 6 (значение 'a' увеличилось на один после последнего инкремента, но уменьшится на 1 после того как использовано в выражении)
        System.out.println("b = a-- " + "-> " + b);

    }

    /**
     * Task 5:Cоздать 2 переменные a и b, равные 3.
     * Чему будет равно a = a++ + ++a и b = --b - b--? Вывести результат в консоль и проверить свой ответ.
     */
    static void primitiveTaskFive(){
        int a = 3;
        int b = 3;
        a = a++ + ++a; //a = 3 + 5 = 8?
        b = --b - b--; // b = 2 - 2 = 0

        System.out.println("a = 3, a = a++ + ++a = " + a);
        System.out.println("b = 3, b = --b - b-- = " + b);
    }

    /**
     * Task 6:int result1;
     * double result2;
     * double result3;
     * int a = 7;
     * double b = 3;
     * result1 = a/b;
     * result2 = a/b;
     * result3 = a%b;
     *
     * Вывести result1, result2 и result3 в консоль и попробовать объяснить результат
     *
     * Comments: если в выражении есть операнд типа double, то все остальные операнды тое расширяются до типа double
     * с result1 возникает ошибка incompatible types,тк переменная int,а  справой стороны у наc все выражение типа double, нужно приведение типов.
     */
    static void primitiveTaskSix(){
        int a = 7;
        double b = 3;
        int result1 =  (int) (a/b); // приведение типа к int, т.к в выражении есть операнд double и все остальные тоже расширяются до double
        double result2 = a/b; // 7.0 / 3.0 = 2.3333333333333335
        double result3 = a%b; // 7.0 % 3.0 = 1.0
        System.out.println("int result1 = a/b = " + result1);
        System.out.println("double result2 = a/b = " + result2);
        System.out.println("double result3 = a%b = " + result3);
    }

    /**
     * Task 7:int x = 2;
     * int y = 5;
     * int result = y * 3 + 20 / 2 * x--;
     *
     * Используя знания о приоритетах операций, разложить выражение в последней строчке (y * 3 + 20 / 2 * x--) по шагам
     * и попробовать угадать результат.
     * Запустить код и вывести результат в консоль. Сравнить ожидаемый результат с тем, что будет выведено в консоли.
     */
    static void primitiveTaskSeven(){
        int x =2;
        int y = 5;
        int result = y * 3 + 20 / 2 * x--;
            // result = (y * 3) + ((20 / 2) * (x--))
            // 1 шаг: x-- = 2
            // 2 шаг: y*3 = 5 * 3 = 15
            // 3 шаг: 20 / 2 = 10
            // 4 шаг: 10 * 2 = 20
            // 5 шаг: 15 + 20 = 35
        System.out.println("x = 2, y = 5, y * 3 + 20 / 2 * x-- = " + result);
    }

    /** Task 8:
     * int a = 1;
     * double b = 2;
     * char c = '3';
     * System.out.println(a < b);
     * System.out.println(b > c);
     * System.out.println(a >= c);
     * System.out.println(a == b);
     * System.out.println(b != c);
     * System.out.println(a <= b && b < c);
     * System.out.println(a >= b && b < c);
     * System.out.println(a <= b || b < c);
     * System.out.println(a >= b || b < c);
     * System.out.println(a <= b && b < c || c < a);
     * System.out.println(a <= b || b < c && c < a);
     *
     * Попробуйте объяснить результат вывода в консоль
     */
    static void primitiveTaskEight(){
        int a = 1;
        double b = 2;
        char c = 'c'; //ascii code
        System.out.println("code of char 'c' = " + (int) c);
        System.out.println(a < b); // 1.0 < 2.0 --> TRUE
        System.out.println(b > c); // 2.0 > 99.0 --> false
        System.out.println(a >= c); // 1 >= 99 --> false
        System.out.println(a == b); // 1.0 == 2.0 --> false
        System.out.println(b != c); // 2.0 != 99.0 --> TRUE
        System.out.println(a <= b && b < c); // 1.0 <= 2.0 (true) && 2.0 < 99.0 (true) --> TRUE
        System.out.println(a >= b && b < c); // 1.0 >= 2.0 (false) && 2.0 < 99.0 (true) --> false
        System.out.println(a <= b || b < c); // 1.0 <= 2.0 (true) || 2.0 < 99.0 (true) --> TRUE
        System.out.println(a >= b || b < c); // 1.0 >= 2.0 (false) && 2.0 < 99.0 (true) --> TRUE
        System.out.println(a <= b && b < c || c < a); // (1.0 <= 2.0 (true) && 2.0 < 99.0 (true)) || 99 < 1 (false) --> TRUE
        System.out.println(a <= b || b < c && c < a); // 1.0 <= 2.0 (true) || (2.0 < 99.0 (true) && 99 < 1 (false)) --> TRUE
    }

    /** Task 9:
     Создать переменную х типа int и присвойте ей значение. Написать 3 вывода в консоль, которые проверяют:
     - х - Четное число?
     - х больше нуля?
     - х одновременно кратен 3 и 5?

     */
    static void primitiveTaskNine(int number){
        int x = number;
        if (number % 2 == 0) {
            System.out.println(number + " - Четное число");
        } else System.out.println(number + " - Нечетное число");
        if (number > 0) {
            System.out.println(number + " - больше нуля");
        } else System.out.println(number + " - меньше нуля");
        if (number % 3 == 0 && number % 5 ==0){
            System.out.println(number + " - Кратен 3 и 5");
        } else System.out.println(number + " - одновременно не кратен 3 и 5");
    }

    /**
     * Task 10: Создать переменную year типа int и присвоить ей значение. Написать вывод в консоль,
     * который проверяет, является ли year високосным годом
     * (високосным годом является год, который делится без остатка на 4 за исключением годов
     * которые кратны 100 и не кратны 400)
     *
     * Comments: Не делала вывод в консоль, проверяется ассертами в main.
     */

    static boolean isLeapYear(int year) {
        if (year < 1) {
            System.out.println("Invalid value");
            return false;
        }
        return (year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0);
    }

    /**
     * Task 11: Создать объекты-враперы каждого примитива 2 раза (с и без значения).
     * Проверить значение каждого объекта. Соотнести результаты с заданием 1
     *
     * Comments: Результаты такие же как и в задании 1, при обращении к переменным без значений получаем ошибку.
     */

    static void primitiveTaskEleven() {
        Byte byteVariableA;
        Byte byteVariableB = 127;
        Short shortVariableA;
        Short shortVariableB = 256;
        Integer intVariableA;
        Integer intVariableB = 512;
        Long longVariableA;
        Long longVariableB = 1000L;
        Double doubleVariableA;
        Double doubleVariableB = 25.6;
        Float floatVariableA;
        Float floatVariableB = 256.9F;
        Boolean booleanVariableA;
        Boolean booleanVariableB = false;
        Character charVariableA;
        Character charVariableB = 'A';
        String s = "Variables of wrapper classes: ";
        s += byteVariableB + ", " + shortVariableB + ", " + intVariableB + ", " +
                longVariableB + ", " + doubleVariableB + ", " + floatVariableB + ", " +
                booleanVariableB + ", " + charVariableB;
        /*s += byteVariableA + ", " + shortVariableA + ", " + intVariableA + ", " +
                longVariableA + ", " + doubleVariableA + ", " + floatVariableA + ", " +
                booleanVariableA + ", " + charVariableA;*/
        System.out.println(s);
    }
}
