public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(" Задача 1 ");
        int age = 16;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + " то он совершенно летний");
        } else {
            System.out.println(" Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println(" Задача 2 ");

        int temperature = 2;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градуса можно идти без шапки");
        }

        System.out.println(" Задача 3");
        int speed = 80;
        if (speed > 60) {
            System.out.println(" Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println(" Если скорость " + speed + " можно ездить спокойно");
        }

        System.out.println(" Задача 4");
        int age2 = 22;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println(" Если возраст человека равен " + age2 + " то ему нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println(" Если возраст человека равен " + age2 + " то ему нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в университет");
        } else if (age2 > 24) {
            System.out.println(" Если возраст человека равен" + age2 + " то ему нужно ходить на работу");
        }

        System.out.println(" Задача 5");
        int ageChild = 16;
        if (ageChild < 5) {
            System.out.println(" Если возраст ребенка равен " + ageChild + " лет то он не может кататься на аттракционе ");
        } else if (ageChild > 5 && ageChild < 14) {
            System.out.println(" Если возраст ребенка равен " + ageChild + " лет то он может кататься только в сопровождении взрослого. ");
        } else if (ageChild > 14) {
            System.out.println(" Если возраст ребенка равен " + ageChild + " лет то он может кататься без сопровождения взрослого ");
        }

        System.out.println(" Задача 6");
        int peopleCapacity = 105;
        if (peopleCapacity <= 60) {
            System.out.println(" Если в вагоне " + peopleCapacity + " человек то есть сидячие места ");
        } else if (peopleCapacity > 60 && peopleCapacity <= 102) {
            System.out.println(" Если в вагоне " + peopleCapacity + " человек то сидячих мест нет");
        } else if (peopleCapacity > 102) {
            System.out.println(" Если в вагоне " + peopleCapacity + " человек то вагон полностью забит ");
        }
        System.out.println(" Задача 7");
        int one = 15;
        int two = 40;
        int three = 13;
        if (one > two && one > three) {
            System.out.println(" Число " + one + " больше всех ");
        }
        if (two > one && two > three) {
            System.out.println(" Число " + two + " больше всех");
        }
        if (three > one && three > two) {
            System.out.println(" Число " + three + " больше всех");

        }


    }
}