import java.util.OptionalInt;

public class ArrayTasks {

    /**
     * Task 1: Создать 2 массива с числами. Написать код,
     * который будет складывать значение из одного массива со значением из второго и сохранять это в третий массив.
     * Вывести третий массив на экран.
     */

    static int[] sumArrays(int[] a, int[] b){
        int newArrayLength = a.length > b.length ? a.length : b.length;
        int[] newArray = new int[newArrayLength];
        for(int i = 0; i < newArrayLength; i++){
            int firstTerm = a.length > i ? a[i] : 0;
            int secondTerm = b.length > i ? b[i] : 0;
            newArray[i] = firstTerm + secondTerm;
        }
        return newArray;
    }

    /**
     * Task 2: Создать массив со значениями. С помощью for-each “перевернуть” массив и вывести его на экран.
     * Подумать и реализовать это с разными видами циклов.
     */

    static int[] reverseArrayFor(int[] array){
        int maxIndex = array.length - 1;
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        return array;
    }

    static int[] reverseArrayWhile(int[] array){
        int maxIndex = array.length - 1;
        int i = 0;
        while (i < array.length / 2){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            i++;
        }
        return array;
    }

    static int[] reverseAndCreateNewArray(int[] baseArray){
        int[] reversedArray = new int[baseArray.length];
        int maxIndex = reversedArray.length - 1;
        for (int i = 0; i < reversedArray.length; i++){
            reversedArray[i] = baseArray[maxIndex - i];
        }
        return reversedArray;
    }

    /**
     * Task 3: Создать массив со значениями. Найти минимальное и максимальное значения.
     * Вывести их на экран. Подумать и реализовать это с разными видами циклов.
     * Сделать решения с использованием if и switch.
     */

    static String findMinMaxInArray(int[] array){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int arrayElement : array){
            if (arrayElement < min){
                min = arrayElement;
            }
            if (arrayElement > max){
                max = arrayElement;
            }
        }
        return "Min value = " + min + ", Max value = " + max;
    }


}
