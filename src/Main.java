
public class Main {
    public static void main(String[] args) {
                task1();
                task2();
                task3();
                task4();
                task5();
                task6();
                task7();
                task8();
            }


    public static void task1 () {
                System.out.println("Задача 1");
                var dog = 8.0;
                System.out.println (dog);
                var cat = 3.6;
                System.out.println (cat);
                var paper = 763789;
                System.out.println (paper);
            }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog += 4;
        System.out.println (dog);
        var cat = 3.6;
        cat += 4;
        System.out.println (cat);
        var paper = 763789;
        paper += 4;
        System.out.println (paper);
    }

    private static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog -= 3.5;
        System.out.println (dog);
        var cat = 3.6;
        cat -= 1.6;
        System.out.println (cat);
        var paper = 763789;
        paper -= 7639;
        System.out.println (paper);
    }

    private static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println (friend);
        friend += 2;
        System.out.println (friend);
        friend /= 7;
        System.out.println (friend);
    }

    private static void task5() {
        System.out.println("Задача 5");
        var frog =3.5;
        System.out.println (frog);
        frog *= 10;
        System.out.println (frog);
        frog /= 3.5;
        System.out.println (frog);
        frog += 4;
        System.out.println (frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightTogether = weightBoxer1 + weightBoxer2;
        System.out.println (weightTogether);
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println (weightDifference);
    }

    private static void task7() {
        System.out.println("Задача 7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println (weightDifference);
        var weightDifference2 = weightBoxer2 % weightBoxer1;
        System.out.println (weightDifference2);
    }

    private static void task8() {
        System.out.println("Задача 8");
        var generalHoursOfWork = 640;
        var individualHoursOfWork = 8;
        var numberOfEmployees = generalHoursOfWork / individualHoursOfWork;
        System.out.println ("Всего работников в компании - " + numberOfEmployees + "человек");
        var numberOfEmployees2 = numberOfEmployees + 94;
        var generalHoursOfWork2 = numberOfEmployees2 * individualHoursOfWork;
        System.out.println ("Если в компании работает " + numberOfEmployees2 + " человека, то всего " + generalHoursOfWork2 + " часов работы может быть поделено между сотрудниками");
    }
}