package com.dmze;

public class Main{
    public static void main(String[] args) {

        Golf golf8 = new Golf();
        golf8.setRokProdukcji(2019);
        golf8.setRodzajSilnika("elektryczny");
        golf8.setKolor("biały");
        golf8.setMasa(1200);
        golf8.setRozmiarOpony("195/70 R15");
        golf8.setIloscOsob(4);

        Golf golf7 = new Golf();
        golf7.setRokProdukcji(2012);
        golf7.setRodzajSilnika("benzynowy");
        golf7.setKolor("czerwony");
        golf7.setMasa(1500);
        golf7.setRozmiarOpony("185/70 R16");
        golf7.setIloscOsob(5);

        Golf golf6 = new Golf();
        golf6.setRokProdukcji(2009);
        golf6.setRodzajSilnika("diesel");
        golf6.setKolor("niebieski");
        golf6.setMasa(1800);
        golf6.setRozmiarOpony("195/80 R17");
        golf6.setIloscOsob(5);

    }
}