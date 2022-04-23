package com.dmze;
import java.util.*;

public interface PierwszyInterfejs {
    Scanner scanner = new Scanner(System.in);

    default void wiek(){
        System.out.println("Podaj swój wiek:");
        int lata = scanner.nextInt();
    }
}
