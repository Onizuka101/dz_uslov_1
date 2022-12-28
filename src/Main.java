public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }
    public static void task1(){
        int a = 17;
        if (a >= 18) {
            System.out.println("Если возраст человека равен" + a + " , то он совершеннолетний");
        }
        else {
            System.out.println("«Если возраст человека равен" + a + " , то он не достиг совершеннолетия, нужно немного подождать».");
        }
    }


    public static void task2(){
        int a = 17;
        if (a >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        else {
            System.out.println("«На улице холодно, нужно надеть шапку».");
        }
    }
    public static void task3(){
        int a = 17;
        if (a >= 60) {
            System.out.println("Если скорость" + a + " , то придется заплатить штраф»");
        }
        else {
            System.out.println("Если скорость" + a + " , можно ездить спокойно»");
        }
    }
    public static void task4(){
        int a = 24;
        if (a > 2 && 6> a)
        {
            System.out.println("«Если возраст человека равен" + a + "  то ему нужно ходить в детский сад»");}
        if (a > 7 && 18> a)
        {
            System.out.println("«Если возраст человека равен" + a + "  то ему нужно ходить в школу»");}
        if (a >= 18 && 24> a)
        {
            System.out.println("«Если возраст человека равен" + a + "  то ему нужно ходить в университетет»");}
        if ( 24 <= a) {
            System.out.println("«Если возраст человека равен" + a + "  то ему пора ходить на работу»");}
        }



    public static void task5(){
        int a = 24;
        if (a > 5)
        {
            System.out.println("«Если возраст ребенка равен" + a + "   лет, то он не может кататься на аттракционе»");}
        if (a >= 5 && 14> a)
        {
            System.out.println("«Если возраст ребенка равен" + a + "  лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя»");}
        if (a >= 14)
        {
            System.out.println("«Если возраст человека равен" + a + "  лет, то он может кататься без сопровождения взрослого»");}
    }


    public static void task6() {
        int a = 60;
        if (a > 0 && 60 >= a) {
            System.out.println("в вагоне есть сидячее место»");
        }
        if (a > 60 && 120 >= a) {
            System.out.println("в вагоне есть стоячее место»");
        } else {
            System.out.println("вагон уже полностью забит»"/);
        }
    }


    public static void task7() {
        int one = 1;
        int two = 4;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        }
        if (one < two && two > three) {
            System.out.println(two);
        }
        if (three > two && one < three) {
            System.out.println(three);
        }
    }


}