public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int a = 40560;
        byte b = -120;
        short c = 1040;
        long d = 69400L;
        float g = 564737f;
        double k = 6573658d;
        System.out.println("Значение переменной A с типом int равно " + a + " ");
        System.out.println("Значение переменной B с типом byte равно " + b + " ");
        System.out.println("Значение переменной C с типом short равно "+c+" ");
        System.out.println("Значение переменной D с типом long равно "+d+" ");
        System.out.println("Значение переменной G с типом float равно "+g+" ");
        System.out.println("Значение переменной K с типом double равно "+k+" ");

        System.out.println("Задача 2");
        System.out.println("float x1 = 27.12");
        System.out.println("double x2= 987.678965549");
        System.out.println("float x3 = 2.786f");
        System.out.println("short x4 = 569");
        System.out.println("short x5 = -159");
        System.out.println("short x6 = 27897");
        System.out.println("byte x7 = 67");

        System.out.println("Задача 3");
        byte x1 = 23;
        byte x2 = 27;
        byte x3 = 30;
        short paper = 480;
        int result1 = paper/(x1 + x2 + x3);
        System.out.println("На каждого ученика рассчитано "+result1+" листов бумаги");

        System.out.println("Задача 4");
        byte water = 16;
        byte time1 = 20;
        short time2 = 1440;
        short time3 = 4320;
        int time4 = 43200;
        int waterTime = (water*time1)/2;
        System.out.println("За "+time1+" минут машина произвела "+waterTime+" штук бутылок");
        int waterTime1 = (water*time2)/2;
        System.out.println("За "+time2+" минут машина произвела "+waterTime1+" штук бутылок");
        int waterTime2 = (water*time3)/2;
        System.out.println("За "+time3+" минут машина произвела "+waterTime2+" штук бутылок");
        int waterTime4 = (water*time4)/2;
        System.out.println("За "+time4+" минут машина произвела "+waterTime4+" штук бутылок");

        System.out.println("Задача 5");
        byte pots = 120;
        byte potsWhite = 2;
        byte potsBrown = 4;
        int result2 = pots / (potsBrown + potsWhite);
        int potsWhite1 = result2*potsWhite;
        int potsBrown1 = result2*potsBrown;
        System.out.println("В школе, где "+result2+" классов, нужно "+potsWhite1+" банок белой краски и "+potsBrown1+" банок коричневой краски");

        System.out.println("Задача 6");
        int bananas = 80*5;
        int milk = 105+105;
        int ice = 100+100;
        int eggs = 70*4;
        int breakfast = bananas + milk + ice + eggs;
        float breakfastOne = (bananas + milk + ice + eggs) / 1000F;
        System.out.println(breakfast+" грамм");
        System.out.println(breakfastOne+" килограмм");


        System.out.println("Задача 7");
        int weight = 7;
        weight = 7*1000;
        int day250 = 250;
        int weight250 = weight / day250;
        System.out.println(weight250+" дней ");
        int day500 = 500;
        int weight500 = weight/ day500;
        System.out.println(weight500+" дней ");
        int mid = (weight250+weight500)/2;
        System.out.println(mid+" день - среднее количество ");



    }

}



