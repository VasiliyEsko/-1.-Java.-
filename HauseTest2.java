import java.util.Arrays;
import java.util.OptionalInt;

public class HauseTest2 {

    public static void main(String[] args) {

        //1 задание - Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int [] a = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        //2 задание - Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        a = new int[8];
        int b = 0;
        for (int i = 0; i <= 21; i = i + 3) {
            a[b] = i;
            System.out.println(i);
            b = b + 1;
        }
        System.out.println("Конец второго задания");
        System.out.println();

        //3 задание - Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        a = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
           if (a[i] < 6){
               a[i] = a[i] * 2;
               System.out.println(a[i]);
           }
        }
        System.out.println("Конец третьего задания");
        System.out.println();

        //4 задание - Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i == j) || (i == arr.length - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }
        //CHECK
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Конец четвертого задания"); //Что бы решить это задание пришлось по гуглить.
        System.out.println();

        //5 задание - Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        a = new int[]{9, 5, 3, 2, 11, 4, 5, 2, 4, 8, 12, 1};

        int min = a[0];
        int max = a[0];

        System.out.print("in array: ");

        for (int i : a) {
            System.out.print(i + " ");
        }

        for (int i = 1; i < a.length; i++) max = Math.max(max, a[i]);
        for (int i = 1; i < a.length; i++) min = Math.min(min, a[i]);

        System.out.println();
        System.out.println("minimal element is: " + min);
        System.out.println("maximal element is: " + max);

        System.out.println("Конец пятого задания"); //Что бы решить это задание пришлось по гуглить,
        // не смотря на то что задача стояла не пользоваться интернетом, для себя нужно было найти решение.
        System.out.println();

        //6 задание - ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры:
        // checkBalance([1, 1, 1, || 2, 1]) → true,
        // checkBalance ([2, 1, 1, 2, 1]) → false,
        // checkBalance ([10, || 10]) → true,
        // граница показана символами ||, эти символы в массив не входят.

        //--на занятии не проходили такие части массива.
        System.out.println("не выполнил шестое задание.");
        System.out.println();

        //7 задание - **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
        // при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.

        //{9, 5, 3, 2, 11, 4, 5, 2, 4, 8, 12, 1}
        modifyArray(a,-4);//Что бы решить это задание пришлось по гуглить

        System.out.println("Конец седьмого задания"); //Что бы решить это задание пришлось по гуглить,
        // Очень плохо то что на уроке не предоставляется полный объем примеров,
        // для решения домашнего задания, разве домашнее задание не должно закреплять пройденный материал???
        System.out.println();

    }

    static void modifyArray(int[] arr, int n) {
        System.out.print("BEFORE: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                // Right
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                // Left
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }

        System.out.print("\nAFTER:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
