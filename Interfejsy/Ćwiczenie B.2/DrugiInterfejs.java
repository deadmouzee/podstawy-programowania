package com.dmze;
import java.util.*;

public interface DrugiInterfejs {
    Scanner scanner = new Scanner(System.in);

    default void wzrost(){
        System.out.println("Podaj swój wzrost w metrach:");
        double metry = scanner.nextInt();
    }
}
