public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача №1:");
        byte b=2;
        short sh=200;
        int in=sh*b;
        long l=5000L;
        float f=2.5f;
        double dd=f*f;
        System.out.println("Значение переменной b с типом byte равно "+b);
        System.out.println("Значение переменной sh с типом short равно "+sh);
        System.out.println("Значение переменной in с типом int равно "+in);
        System.out.println("Значение переменной l с типом long равно "+l);
        System.out.println("Значение переменной f с типом float равно "+f);
        System.out.println("Значение переменной dd с типом double равно "+dd);

        //Задача 2
        System.out.println();
        System.out.println("Задача №2:");
        float bbb=27.12f;
        long lon=987678965549L;
        double inFloat=2.786;
        short lShort=569;
        short fShort=-159;
        short ddShort=27897;
        byte byByte=57;
        System.out.println("Значение переменной bbb с типом float равно "+bbb);
        System.out.println("Значение переменной lon с типом long равно "+lon);
        System.out.println("Значение переменной inFloat с типом double равно "+inFloat);
        System.out.println("Значение переменной lShort с типом short равно "+lShort);
        System.out.println("Значение переменной fShort с типом short равно "+fShort);
        System.out.println("Значение переменной ddShort с типом short равно "+ddShort);
        System.out.println("Значение переменной byByte с типом byte равно "+byByte);

        //Задача 3
        System.out.println();
        System.out.println("Задача №3:");
        short lud=23, ann=27, ekat=30;
        int all=lud+ann+ekat;
        short list=480;
        int each=list/all;
        System.out.println("На каждого ученика рассчитано " +each+ " листов бумаги");

        //Задача 4
        System.out.println();
        System.out.println("Задача №4:");
        int bottle=16;
        int timeNorma=2;
        int min20=bottle/timeNorma*20;
        int day=bottle/timeNorma*60*24;
        int day3=day*3;
        int month=day*30;
        System.out.println("За 20 минут машина произвела " +min20+ " штук бутылок");
        System.out.println("За сутки машина произвела " +day+ " штук бутылок");
        System.out.println("За 3 дня машина произвела " +day3+ " штук бутылок");
        System.out.println("За 1 месяц машина произвела " +month+ " штук бутылок");

        //Задача 5
        System.out.println();
        System.out.println("Задача №5:");
        short can=120;
        byte white=2;
        byte brown=4;
        int schoolClass=white+brown;
        int allClass=can/schoolClass;
        int wightCan=allClass*white;
        int brownCan=allClass*brown;
        System.out.println("В школе, где "+allClass+" классов, нужно "+wightCan+
                " банок белой краски и "+brownCan+" банок коричневой краски");

        //Задача 6
        System.out.println();
        System.out.println("Задача №6:");
        byte bananas=5;
        int weightBananas=80;
        weightBananas*=bananas;
        double milkMl=200;
        double weightMilk=milkMl/100*105;
        int ice=2;
        int weightIce=ice*100;
        int egg=4;
        int weightEgg=egg*70;
        double weightGramm;
        weightGramm=weightBananas+weightMilk+weightIce+weightEgg;
        double weightKilo=weightGramm/1000;
        System.out.println("Вес завтрака в граммах "+weightGramm+" грамм");
        System.out.println("Вес завтрака в килограммах "+weightKilo+" килограмм");

        //Задача 7
        System.out.println();
        System.out.println("Задача №7:");
        int targetWeight=7;
        int daysMax, daysMin, days;
        int weightDayMin=250, weightDayMax=500;
        daysMin=targetWeight*1000/weightDayMin;
        System.out.println("Если спортсмен будет терять каждый день по "+weightDayMin+
                " грамм, на похудение уйдет "+daysMin+" дней");
        daysMax=targetWeight*1000/weightDayMax;
        System.out.println("Если спортсмен будет терять каждый день по "+weightDayMax+
                " грамм, на похудение уйдет "+daysMax+" дней");
        days=(daysMax+daysMin)/2;
        System.out.println("Чтобы добиться результата похудения потребуется " +
                "в среднем "+days+" день(дней)");

        //Задача 8
        System.out.println();
        System.out.println("Задача №8:");
        int person1=67760, person2=83690, person3=76230;
        int new1, new2, new3;
        new1=person1*110/100;
        new2=person2*110/100;
        new3=person3*110/100;
        int plus1, plus2, plus3;
        plus1=new1-person1;
        plus2=new2-person2;
        plus3=new3-person3;
        System.out.println("Маша теперь получает "+new1+
                " рублей. Годовой доход вырос на "+plus1+" рублей");
        System.out.println("Денис теперь получает "+new2+
                " рублей. Годовой доход вырос на "+plus2+" рублей");
        System.out.println("Кристина теперь получает "+new3+
                " рублей. Годовой доход вырос на "+plus3+" рублей");
    }
}