package ru.ssu.kabanov;


public class AppTest {

    public static void main(String[] args) {





        try {
            int[] array = null; // специально делаем null, чтобы вызвать исключение

            for (int i = 0; i < 11; i++) {
                array[i] = i;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Упс, выход за границы массива: " + e);
        } catch (NullPointerException e) {
            System.out.println("Массив не инициализирован: " + e);
        }
//asdfasd
        System.out.println("Program end");

    }
}
