package geekbrains.com;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        System.out.println("======Задача №1=======");
//        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arrayTask1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arrayTask1));
        for (int i = 0; i < arrayTask1.length; i++) {
            if (arrayTask1[i] == 0) {
                arrayTask1[i] = 1;
            } else {
                arrayTask1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrayTask1));

        System.out.println("======Задача №2=======");
//        2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6… 100;
        int[] arrayTask2 = new int[100];
        for (int i = 0; i < arrayTask2.length; i++) {
            arrayTask2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrayTask2));

        System.out.println("======Задача №3=======");
//      3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arrayTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrayTask3));
        for (int i = 0; i < arrayTask3.length; i++) {
            if (arrayTask3[i] < 6) {
                arrayTask3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrayTask3));

        System.out.println("======Задача №4=======");
//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
//        если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
//        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int[][] arrayTask4 = new int[10][10];
        for (int i = 0; i < arrayTask4.length; i++) {
            for (int j = 0; j < arrayTask4[0].length; j++) {
                if ((i == j) || (i + j) == arrayTask4.length - 1) {
                    arrayTask4[i][j] = 1;
                }
                //можно присваивать 0 в else, но java инициализирует 0 автоматически
                System.out.printf("%d  ", arrayTask4[i][j]);
            }
            System.out.println();
        }

        System.out.println("======Задача №5=======");
        int[] arrayTask5_1 = createArray(4, -1);
        System.out.println(Arrays.toString(arrayTask5_1));
        int[] arrayTask5_2 = createArray(0, -3);
        System.out.println(Arrays.toString(arrayTask5_2));

        System.out.println("======Задача №6=======");
        //* Задать одномерный массив и найти в нем минимальный и максимальный элементы;
        int[] arrayTask6_1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printMaxMin(arrayTask6_1);
        int[] arrayTask6_2 = {1};
        printMaxMin(arrayTask6_2);
        printMaxMin(arrayTask2);

        System.out.println("======Задача №7=======");
        int[] arrayTask7_1 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(Arrays.toString(arrayTask7_1) + " -> " + checkBalance(arrayTask7_1));
        int[] arrayTask7_2 = {1, 1, 1, 2, 1};
        System.out.println(Arrays.toString(arrayTask7_2) + " -> " + checkBalance(arrayTask7_1));
        int[] arrayTask7_3 = {4, 2};
        System.out.println(Arrays.toString(arrayTask7_3) + " -> " + checkBalance(arrayTask7_3));
        int[] arrayTask7_4 = {4};
        System.out.println(Arrays.toString(arrayTask7_4) + " -> " + checkBalance(arrayTask7_4));
        int[] arrayTask7_5 = {7, 1, 1, 2, 1};
        System.out.println(Arrays.toString(arrayTask7_5) + " -> " + checkBalance(arrayTask7_5));
        int[] arrayTask7_6 = {7, 6, 1};
        System.out.println(Arrays.toString(arrayTask7_6) + " -> " + checkBalance(arrayTask7_6));
        int[] arrayTask7_7 = {};
        System.out.println(Arrays.toString(arrayTask7_7) + " -> " + checkBalance(arrayTask7_7));
        int[] arrayTask7_8 = {-7, 7, 0};
        System.out.println(Arrays.toString(arrayTask7_8) + " -> " + checkBalance(arrayTask7_8));
        int[] arrayTask7_9 = {0, 0, 0, 0};
        System.out.println(Arrays.toString(arrayTask7_9) + " -> " + checkBalance(arrayTask7_9));
        int[] arrayTask7_10 = {4, 4};
        System.out.println(Arrays.toString(arrayTask7_10) + " -> " + checkBalance(arrayTask7_10));

        System.out.println("======Задача №8=======");
        int[] arrayTask8_1 = {1, 2, 3};
        System.out.println(Arrays.toString(arrayTask8_1));
        shiftArray(arrayTask8_1, 1);
        System.out.println(Arrays.toString(arrayTask8_1));
        shiftArray(arrayTask8_1, -1);
        System.out.println(Arrays.toString(arrayTask8_1));

        int[] arrayTask8_2 = {3, 5, 6, 1};
        System.out.println(Arrays.toString(arrayTask8_2));
        shiftArray(arrayTask8_2, -2);
        System.out.println(Arrays.toString(arrayTask8_2));
        shiftArray(arrayTask8_2, 2);
        System.out.println(Arrays.toString(arrayTask8_2));

        shiftArray(arrayTask2, -20);
        System.out.println(Arrays.toString(arrayTask2));


    }

    public static int[] createArray(int len, int initialValue) {
//        Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа
//        int длиной len, каждая ячейка которого равна initialValue;

        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void printMaxMin(int[] array) {
        int maxValue = array[0];
        int minValue = array[0];

        // такой способ обхода массива демонстрировали на уроке
        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
            if (value < minValue) {
                minValue = value;
            }
        }

        System.out.printf("max = %d, min = %d\n", maxValue, minValue);
    }

    public static boolean checkBalance(int[] array) {
//        Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//        если в массиве есть место, в котором сумма левой и правой части массива

        //вырожденный случай
        if (array.length <= 1) {
            return false;
        }

        //длинна массива >=2
        //вычисляем сумму элементов в массиве
        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        if ((sum % 2) > 0) {
            //сумма элементов нечетная => правая и левая часть не могут совпадать
            return false;
        } else {
            //сумма элементов - четная, значит надо проверить на сбалансированность

            //вычисляем граничное значение для правой/левой части массива
            int mid = sum / 2; //делится на 2 без остатка
            int leftSum = 0;
            int rightSum = 0;
            for (int value : array) {
                if (mid > leftSum) {
                    leftSum += value;
                } else {
                    rightSum += value;
                }
            }
            //если правая и левая сумма не совпадают, то массив не сбалансирован
            return rightSum == leftSum;
        }

    }

    public static void shiftArray(int[] array, int n) {
        //Если массив имеет 0 или 1 элемент, или сдвигается на 0 элементов, то он останется как таким же.
        //Проверка на то, что n == 0 не обязательна
        if (array.length > 1 && n != 0) {

            //Сдвиг на право
            // при отрицательном n в этот цикл не попадем
            for (int j = 0; j < n; j++) {
                // Запоминаем последнее значение, оно станет первым.
                // Длина массива больше 1, значит исключения не будет
                int value = array[array.length - 1];
                for (int i = array.length - 1; i > 0; i--) {
                    array[i] = array[i - 1];
                }
                array[0] = value;
            }
            // Сдвиг на лево
            // при положительном n в этот цикл не попадем
            for (int j = 0; j > n; j--) {
                // Запоминаем последнее значение, оно станет первым.
                // Длина массива больше 1, значит исключения не будет
                int value = array[0];
                for (int i = 0; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[array.length - 1] = value;
            }

        }
    }
}
