package com.dmze;

public class Samochod {
    public interface Felga {
        int srednica = 16;
        double szerokosc = 6.5;
    }
        public void wyswietlParametryKol() {
            System.out.println("Średnica felgi to " + Felga.srednica + " cali, a jej szerokość wynosi " + Felga.szerokosc + " ET");

    }
}
