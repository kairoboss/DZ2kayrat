package com.company;

public class Main {


    public static void main(String[] args) {



       String elderly = conditions1(50, 25);
        System.out.println(elderly);
        String old = conditions1(55, 30);
        System.out.println(old);
        String adult = conditions1(35, 35);
        System.out.println(adult);
        String young = conditions1(25, 28);
        System.out.println(young);
       String teenager = conditions1(18, 16);
        System.out.println(teenager);



    }

    public static String conditions1(int age, int temperature) {
String result;
        if (temperature < 30 && temperature > -20 && age > 20 && age < 45)
            result = "Можно идти гулять";
        else if (temperature < 28 && temperature > 0 && age < 20)
            result = "Можно идти гулять";
        else if (age > 45 && temperature > -10 && temperature < 25)
            result = "Можно идти гулять";
        else
            result = "Оставайтесь дома";

return result;

    }
}

