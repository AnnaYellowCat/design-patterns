package main.java.com.neoflex.singleton;

import java.lang.reflect.Field;
import java.util.Arrays;

public class LoggClass {
    private static LoggClass loggClass;

    private LoggClass() {
    }

    public static LoggClass getInstance() {
        if (loggClass == null) {
            loggClass = new LoggClass();
        }
        return loggClass;
    }

    public void classLogg(Object object, String info) {
        String fields = Arrays.stream(object.getClass().getDeclaredFields())
                .map(Field::getName)
                .reduce((x, y) -> x + ", " + y)
                .orElse(null);

        System.out.println("Log info: " + info + " - " +
                object.getClass().getSimpleName() + " - " +
                "fields: " + fields);
    }
}
