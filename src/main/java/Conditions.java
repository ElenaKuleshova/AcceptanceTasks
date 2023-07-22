public class Conditions {
    /**
     * Task 1: Создать 3 переменные типа int и присвоить им значения.
     * Написать код, который будет находить среднее из них (например, из чисел 1, 3 и 5 средним является число 3).
     */
    static int findMedium(int a, int b, int c){
        if (a == b || b == c || a == c){
            return 0;
        }
        if ((a < b && a > c) || (a < c && a > b)){
            System.out.println("Medium number is " + a);
            return a;
        } else if ((b < a && b > c) || (b > a && b < c)){
            System.out.println("Medium number is " + b);
            return b;
        } else{
            System.out.println("Medium number is " + c);
            return c;
        }
    }

    /**
     * Task 2: Создать переменную типа int и присвоить ей значение.
     * Если она кратна 3 - вывести в консоль слово "Fiz", если кратна 5 - "Buz",
     * если кратна и 3,и 5 - "FizBuz". Решение задачи должно использовать if-else.
     */

    static String printFizBuz(int a){
        if (a % 3 == 0 && a % 5 == 0){
            return "FizBuz";
        } else if (a % 3 == 0) {
            return "Fiz";
        } else if (a % 5 == 0){
            return "Buz";
        } else return "The number is not a multiple of 3 or 5";
    }

    /**
     * Task 3: Создать 3 переменные типа int и присвоить им значения.
     * Определить, может ли быть построен треугольник с длинами сторон, равными значениям этих переменных.
     */

    static boolean isTriangle(int a, int b, int c){
        return (a + b > c && b + c > a && a + c > b);
    }

    /**
     * Task 4: Решить задачу 2, используя switch
     */

    static String printFizBuzSwitch(int a){
        String s;
        switch (a % 3){
            case 0 -> {
                s = "Fiz";
                if (a % 5 == 0){
                    s += "Buz";
                }
            }
            default -> {
                if (a % 5 == 0){
                    s = "Buz";
                } else s = "The number is not a multiple of 3 or 5";
            }
        }
        return s;
    }

    /**
     * Task 5: В три переменные a, b и c записаны три вещественных числа.
     * Создать программу, которая будет находить и выводить на экран вещественные корни
     * квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
     */

    static String findSquareRoots(double a, double b, double c){
        double d = b * b - 4 * a * c;
        double x1;
        double x2;
        if (a < 0 || d < 0){
            return "Корней нет";
        }
        if (d == 0){
            x1 = - b / (2 * a);
            return "x1 = " + x1;
        }
        x1 = (-b + Math.sqrt(d))  / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);
        return "x1 = " + x1 + ", x2 = " + x2;
    }

    /**
     * Task 6: В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
     * Создать программу, которая переставит числа в переменных таким образом,
     * чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
     */

    static String printIntAscending(int a, int b, int c){
        if (a < b && a < c ){
            if ( b < c) {
                return a + ", " + b + ", " + c;
            } else return a + ", " + c + ", " + b;
        } else if ( b < a && b < c) {
            if (a < c){
                return b + ", " + a + ", " + c;
            } else return b + ", " + c + ", " + a;
        } else {
            if (a < b){
                return c + ", " + a + ", " + b;
            } else return c + ", " + b + ", " + a;
        }
    }

    /**
     * Task 7: Инженер Феродов создал устройство, на табло которого показывается количество секунд,
     * оставшихся до конца рабочего дня. Когда рабочий день начинается (9 утра) — табло отображает «28800»
     * (т.е. остаётся 8 часов), когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа),
     * а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
     * @param currentHour
     * @param currentMinutes
     */
    static int getSecondsToWorkDayEnd(int currentHour, int currentMinutes){
        if (currentHour < 0 || currentMinutes < 0 ){
            System.out.println("Invalid hour or minutes value");
            return -1;
        }
        if (currentHour < 9 || currentHour >= 17 ){
            return 0;
        }
        return ((17 - currentHour) * 60 - currentMinutes) * 60;
    }

    /**
     * Task 8: Программист Васильев заметил, как страдают офисные сотрудницы —
     * им неудобно оценивать остаток рабочего дня в секундах.
     * Васильев вызвался помочь сотрудницам и написать программу,
     * которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
     * сколько полных часов осталось до конца рабочего дня.
     * Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
     */

    static int getHoursToWorkDayEnd(int secondsLeft){
        return secondsLeft > 0 ? secondsLeft / 3600 : -1;
    }

    static int getHoursToWorkDayEnd(int currentHour, int currentMinutes){
        int secondsLeft = getSecondsToWorkDayEnd(currentHour, currentMinutes);
        return getHoursToWorkDayEnd(secondsLeft);
    }

    static String printHoursLeftToWorkEnd(int hoursLeft){
        if (hoursLeft < 0 ){
            return "произошла ошибка, пожалуйста, вводите часы с 9 до 17";
        }
        String text = "осталось " + hoursLeft;
        if (hoursLeft == 1) {
            return text + " час";
        } else if (hoursLeft <= 4 && hoursLeft >= 2){
            return text + " часа";
        } else if (hoursLeft <= 8 && hoursLeft >= 5) {
            return  text + " часов";
        } else return "осталось менее часа";
    }

    /**
     * Task 9: Итак, в переменную n должно записываться случайное (на время тестирования программы)
     * целое число из [0;28800], далее оно должно выводиться на экран (для Федорова)
     * и на следующей строке (для сотрудниц) должна выводиться фраза о количестве полных часов, содержащихся в n секундах.
     */
    static void printSecondsAndHoursToWorkDayEnd(int n){
        if (n < 0 || n > 28800){
            System.out.println("произошла ошибка, введено неверное число секунд");
        }
        System.out.println(n);
        System.out.println(printHoursLeftToWorkEnd(getHoursToWorkDayEnd(n)));
    }

}
