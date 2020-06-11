package com.company;

public class Main {

    public static void main(String[] args) {

        conditions1(50, 25);
        conditions1(55, 30);
        conditions1(35, 35);
        conditions1(25, 28);
        conditions1(18, 16);
    }
    public static String conditions1(int age, int temperature ){
        String result;
        if (temperature <30 && temperature > -20 && age > 20 && age < 45 )
            result = "Можно идти гулять";

        else if (temperature <28 && temperature > 0 && age < 20)
            result = "Можно идти гулять";
        else if (age > 45 && temperature > -10 && temperature <25)
            result = "Можно идти гулять";
        else result = "Оставайтесь дома";
        System.out.println(age+ "лет");
        System.out.println(temperature + "градусов");
        System.out.println(result);
        return result;
    }
}

