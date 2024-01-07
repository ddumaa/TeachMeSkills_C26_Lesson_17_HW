package homework.task_1.services;

import homework.task_1.utils.CustomInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UseCustomInterface {
    public static void method (){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("""
                    Введите число для выбора операции:
                    1: реверс введенного текста
                    2: нахождения факториала числа""");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Введите свой текст");
                    String s = scanner.nextLine();
                    CustomInterface<String> customInterface1 = (st) -> {
                        String p = "";
                        for (int i = st.length() - 1; i >= 0; i--)
                            p += st.charAt(i);
                        return p;
                    };
                    System.out.println(customInterface1.myMethod(String.valueOf(s)));
                    break;
                case 2:
                    try {
                        scanner.nextLine();
                        System.out.println("Введите число");
                        int i = scanner.nextInt();
                        CustomInterface<Integer> customInterface2 = (in) -> {
                            Integer sum = 1;
                            for (int n = 1; n <= in; n++) {
                                sum *= n;
                            }
                            return sum;
                        };
                        System.out.println(customInterface2.myMethod(i));
                    } catch (InputMismatchException e) {
                        System.out.println("Ошибка: Введены некорректные данные");
                    }
                    break;
                default:
                    System.out.println("Ошибка: Неверный выбор операции.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введите число для выбора операции.");
        }
    }
}
