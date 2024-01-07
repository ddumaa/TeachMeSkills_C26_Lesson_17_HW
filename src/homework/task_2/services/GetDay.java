package homework.task_2.services;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class GetDay {
    public static void getDayOfWeekFromDate () {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Для получения дня недели, введите дату по шаблону - yyyy-mm-dd");
            String date = scanner.nextLine();
            try {
                DayOfWeek dayOfWeek = LocalDate.parse(date).getDayOfWeek();
                System.out.println(dayOfWeek);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Произошла ошибка. Проверьте введённые данные");
            }
        }
    }
}
