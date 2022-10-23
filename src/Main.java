public class Main {
    public static void main(String[] args) {
       // Задача 1
       int  apples = 7;
       System.out.println("количество яблок " + apples + " кг");
       byte hourDay = 12;
       System.out.println("часов длится день " + hourDay + " часов");
       short cash = 1000;
       System.out.println("остаток на счете денег " + cash + " рублей");
       long hoursYear = 1973;
       System.out.println("рабочих часов в году " + hoursYear + " часов");
       float percentDiscount = -2.5F;
       System.out.println("процентная скидка " + percentDiscount + " процентов");
       double price = 5.0;
       System.out.println("цена " + price + " $");

       //Задача 2
        float a = 27.12f;
        long b = 987678965549L;
        byte c = 2;
        short d = 768;
        boolean e = false;
        short f = 569;
        short g = -159;
        short h = 27897;
        byte i = 67;
        System.out.println("переменная " + a);
        System.out.println("переменная " + b);
        System.out.println("переменная " + c);
        System.out.println("переменная " + d);
        System.out.println("переменная " + e);
        System.out.println("переменная " + f);
        System.out.println("переменная " + g);
        System.out.println("переменная " + h);
        System.out.println("переменная " + i);

       //Задача 3
        int teacherLudmila = 23;
        System.out.println("учеников у Людмилы Павловны " + teacherLudmila + " учеников");
        int teacherAnna = 27;
        System.out.println("учеников у Анны Сергеевны " + teacherAnna + " учеников");
        int teacherKatya = 30;
        System.out.println("учеников у Екатерины Андреевны "+ teacherKatya + " учеников");
        short paperAll = 480;
        System.out.println("Всего бумаги " + paperAll + " листов");
        int studentAll = teacherLudmila + teacherAnna + teacherKatya;
        System.out.println("всего учеников " + studentAll);
        int onePortion = paperAll / studentAll;
        System.out.println("на одного ученика " + onePortion + " листов");

        //Задача 4
        int bottles = 16;
        System.out.println("производится за 2 минуты " + bottles + " бутылок");
        byte a1 = 20;
        short b2 = 1440;
        int c3 = 4320;
        int d4 = 43800;
        int bottlesOne = bottles * a1;
        System.out.println("за 20 минут работы машины было произведено "+ bottlesOne + " бутылок");
        int bottles2Two = bottles * b2;
        System.out.println("за 1440 минут работы машины было произведено " + bottles2Two + " бутылок");
        int bottlesThree = bottles * 3;
        System.out.println("за 4320 минут работы машины было произведено " + bottlesThree + " бутылок");
        int bottlesFour = bottles * d4;
        System.out.println("за 43800 минут работы машины было произведено " + bottlesFour + " бутылок");
        int allMinutes = a1 + b2 + c3 + d4;
        System.out.println("потрачено минут за весь периуд работы " + allMinutes + " минут");
        int allBottles = bottlesOne + bottles2Two + bottlesThree + bottlesFour;
        System.out.println("всего произведено " + allBottles + " бутылок");

        //Задача 5
        byte jars = 120;
        System.out.println("всего нужно " + jars + " банок");
        byte white = 2;
        byte brow = 4;
        System.out.println("на один класс уходи белой краски "+ white + " банок");
        System.out.println("на один класс уходит коричневой краски " + brow + " банок");
        int classRome = white + brow;
        System.out.println("на один класс уходит белой и коричневой краски " + classRome + " банок");
        int allClassRome = jars / classRome;
        System.out.println("всего в школе " + allClassRome + " классов");
        int whiteJars = allClassRome * white;
        System.out.println("на 20 классов нужно " + whiteJars + " банок белой краски ");
        int browJars = allClassRome * brow;
        System.out.println("на 20 классов нужно "+ browJars + " коричневой краски");
        System.out.println("В школе где " + allClassRome + " классов нужно " + whiteJars + " банок белой краски " + browJars + " банок коричневой краски");

        //Задача 6
        byte gramBanana = 80;
        byte gramMilk = 105;
        byte gramIceCream = 100;
        byte gramEgg = 70;
        byte allBananas = 5;
        byte allMilk = 2;
        byte allIceCream = 2;
        byte allEggs = 4;
        double kilogram = 0.001;
        int allGramBananas = allBananas * gramBanana;
        System.out.println("5 баннов весят " + allGramBananas + " грамм");
        int allGramMilk = gramMilk * allMilk;
        System.out.println("200 миллилитров весят " + allGramMilk + " грамм");
        int allGramIceCream = gramIceCream * allIceCream;
        System.out.println("2 мороженых весят " + allGramIceCream + " грамм");
        int allGramEgg = gramEgg * allEggs;
        System.out.println("4 яйца весят " + allGramEgg + " грамм");
        System.out.println("в одном килограмме " + kilogram + " грамм");
        int breakfast = allGramBananas + allGramEgg + allGramIceCream + allGramMilk;
        System.out.println("весь завтрак весит " + breakfast + " грамм");
        double breakfast1 = breakfast * kilogram;
        System.out.println("весь завтрак весит " + breakfast1 + " кг");

        //Задача 7
        int weight = 7000;
        System.out.println("нужно сбросить " + weight + " кг");
        int weigh1 = 250;
        System.out.println("будет терять по " + weigh1 + " грамм" );
        int weigh2 = 500;
        System.out.println("будет терять по " + weigh2 + " кг");
        float try1 = weight / weigh1;
        System.out.println("в первом случае сбросит за " + try1 + " дней");
        float try2 = weight / weigh2;
        System.out.println("во втором случае сбросит за " + try2 + " дней");
        float day = (try1 + try2) / 2;
        System.out.println("среднее количество дней потребуется " + day + " дней");

        //Задача 8
        int Masha = 67760;
        System.out.println("получает Маша " + Masha + " рублей");
        int Denis = 83690;
        System.out.println("Получает Денис " + Denis + " рублей");
        int Kristina = 76230;
        System.out.println("получает Криситна " + Kristina + " рублей");
        float cash1 = Masha * 10 / 100;
        System.out.println("10 процентов от ЗП Маши " + cash1 + " рублей");
        float cash2 = Denis * 10/100;
        System.out.println("10 процетов от ЗП Дениса " + cash2 + " рублей");
        float cash3 = Kristina * 10/100;
        System.out.println("10 процентов от ЗП Кристины " + cash3 + " рублей");
        float Masha1 = Masha + cash1;
        System.out.println("ЗП после прибавки "+ Masha1 + " рублей");
        float Denis1 = Denis + cash2;
        System.out.println("ЗП после прибавки " + Denis1 + " рублей");
        float Kristina1 = Kristina + cash3;
        System.out.println("ЗП после прибавки " + Kristina1 + "рублей");
        int Cash1 = Masha * 12;
        System.out.println("получает Маша в год " + Cash1 + " рублей");
        int Cash2 = Denis * 12;
        System.out.println("Получает Денис в год " + Cash2 + " рублей");
        int Cash3 = Kristina * 12;
        System.out.println("получает Кристина в год " + Cash3 + " рублей" );
        float Cash4 = Masha1 * 12;
        System.out.println("получает Маша в год после прибавки " + Cash4 + " рублей");
        float Cash5 = Denis1 * 12;
        System.out.println("получает Денис в год после прибавки " + Cash5 + " рублей");
        float Cash6 = Kristina1 * 12;
        System.out.println("получает Кристина в год после прибавки " + Cash6 + " рублей");
        float A = Masha1 - Masha;
        System.out.println("разница между годовым доходом Маши " + A + " рублей");
        float B = Denis1 - Denis;
        System.out.println("разница между годовым доходом Дениса " + B + " рублей");
        float C = Kristina1 - Kristina;
        System.out.println("разница между годовым доходом Кристины " + C + " рублей");
        System.out.println("Маша теперь получает " + Masha1 + " рублей " + " Годовой доход вырос на " + A + " рублей");
        System.out.println("Денис тепереь получает " + Denis1 + " рублей " + " Годовой доход вырос на " + B + " рублей");
        System.out.println("Кристина теперь получает " + Kristina1 + " рублей" + " Годовой доход вырос на " + C + " рублей");

    }
}