public class Main {
    public static void main(String[] args) {
        //задача 1..
        int a = 3000;
        byte b = 123;
        long c = 3232323232l;
        float d= 4.32f;
        double e = 4.323434;
        System.out.println("Значение переменной a с типом int равно "+a);
        System.out.println("Значение переменной b с типом int равно "+b);
        System.out.println("Значение переменной c с типом int равно "+c);
        System.out.println("Значение переменной d с типом int равно "+d);
        System.out.println("Значение переменной e с типом int равно "+e);

        //задача 2
        float a1 = 27.12f;
        long b1 = 987678965549l;
        byte c1 = 2;
        char d1 = 786;
        boolean l = false;
        int j = 569;
        short v = -159;
        short bi = 27897;
        double ji= 67.0;

        //задача 3
        byte ludaPavlovna = 23;
        byte annaSergeevna = 27;
        byte katyaAndreevna = 30;
        short paper = 480;

        System.out.println("На каждого ученика рассчитано"+480/(ludaPavlovna+annaSergeevna+katyaAndreevna)+"листов бумаги");

        //задача 4
        int For2minutes = 16;
        int kpdMachineFor1Min = 16/2;
        int for1Hour = kpdMachineFor1Min*60;
        int for20min = for1Hour* 20/60;
        int forDay = for1Hour*24;
        int for3Days = forDay*3;
        int forMonth = forDay*31;

        System.out.println("За 20 минут машина произвела бутылок "+ for20min+" штук ");
        System.out.println("За сутки минут машина произвела бутылок "+ forDay+" штук ");
        System.out.println("За 3 дня машина произвела бутылок "+ for3Days+" штук ");
        System.out.println("За месяц машина произвела бутылок "+ forMonth+" штук ");
        //задача 5
        short totalColor = 120;
        short whiteForRoom = 2;
        short brownForRoom = 4;
        int totalRooms = totalColor/(whiteForRoom+brownForRoom);
        int totalWhite = totalRooms*whiteForRoom;
        int totalBrown = totalRooms*brownForRoom;
        System.out.println("В школе, где "+totalRooms+" классов, нужно "+totalWhite+" банок белой краски" +
                " и "+totalBrown+" банок коричневой краски");

        //задача 6
        short totalBananas = 5;
        short bananasMass1 = 80;
        float totalBananasMassGr = totalBananas*bananasMass1;

        short totalMilk = 2;
        short milkMass1 = 105;
        float totalMilkMassGr = totalMilk * milkMass1;

        short totalIcecream = 2;
        short icecreamMass1 = 100;
        float totalIcecreamMassGr = totalIcecream* icecreamMass1;

        short totalEggs = 4;
        short eggMass1 = 70;
        float totalEggsMassGr = totalEggs*eggMass1;

        float totalBreakfastMassKg =
                (totalEggsMassGr*totalBananasMassGr*totalIcecreamMassGr*totalMilkMassGr)/1000;
        System.out.println("вес всего спортивного завтрака в киллограмах: "+ totalBreakfastMassKg);
        System.out.println();

        //задача 7
        double needQuitGr = 7000;
        double quit250Gr = 250;
        double quit500Gr = 500;
        int needDays250 = (int) (needQuitGr/quit250Gr);
        System.out.println("если сбрасывать по 250гр в день то всего 7 кг можно сбросить за:"+ needDays250);
        int needDays500 = (int) (needQuitGr/quit500Gr);
        System.out.println("если сбрасывать по 500гр в день то всего 7 кг можно сбросить за:"+ needDays500);
        int sredDays = (needDays250+needDays500)/2;
        System.out.println("в среднем понадобиться "+ sredDays);


        //задача 8
        float pastSolaryMashaMonth = 67760;
        float pastSolaryMashaYear = pastSolaryMashaMonth*12;
        float newSolaryMashaMonth = (float) (pastSolaryMashaMonth*1.1);
        float differenceMasha = newSolaryMashaMonth*12 - pastSolaryMashaYear;
        System.out.println("Маша теперь получает "+newSolaryMashaMonth+" рублей. Годовой доход вырос на "+differenceMasha+" рублей");

        float pastSolaryDenysMonth = 83690;
        float pastSolaryDenysYear = pastSolaryDenysMonth*12;
        float newSolaryDenysMonth = (float) (pastSolaryDenysMonth*1.1);
        float differenceDenys = newSolaryDenysMonth*12- pastSolaryDenysYear;
        System.out.println("Денис теперь получает "+newSolaryDenysMonth+" рублей. Годовой доход вырос на "+differenceDenys+" рублей");

        float pastSolaryKristinaMonth = 76230;
        float pastSolaryKristinaYear = pastSolaryKristinaMonth*12;
        float newSolaryKristinaMonth = (float) (pastSolaryKristinaMonth*1.1);
        float differenceKristina = newSolaryKristinaMonth*12- pastSolaryKristinaYear;
        System.out.println("Кристина теперь получает "+newSolaryKristinaMonth+" рублей. Годовой доход вырос на "+differenceKristina+" рублей");



    }
}