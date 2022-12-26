public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».
        System.out.println("Задача 1");
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int b1 : arr) {
            sum += b1;
        }
        System.out.println("Сумма трат за месяц :" + sum);

    }

    public static void task2() {
        //Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];

        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная затрата за день:" + min);
        System.out.println("Максимальная затрата за день:" + max);

    }

    public static void task3() {
        //Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        System.out.println("Задача 3");
        int[] numberArray = generateRandomArray();
        int sum = 0;
        for (int i : numberArray) {
            sum += i;
        }
        System.out.println(sum / (float) numberArray.length);
    }

    public static void task4() {
        //В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ»
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}