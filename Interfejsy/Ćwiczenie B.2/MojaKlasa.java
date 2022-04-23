package com.dmze;

public class MojaKlasa implements PierwszyInterfejs,DrugiInterfejs{
    public void dane() {
        PierwszyInterfejs.super.wiek();
        DrugiInterfejs.super.wzrost();
    }
}
