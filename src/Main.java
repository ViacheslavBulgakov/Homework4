public class Main {
    public static void main(String[] args) {

        System.out.println("     Задание1");

        int ageMajority = 18;
        int age = 13;
        if (age >= ageMajority) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("    Задание2");

        int tempReference = 5;
        int tempReal = 5;
        if (tempReal > tempReference) {
            System.out.println("На улице " + tempReal + " градусов. Можно идти без шапки.");
        } else  {
            System.out.println("На улице " + tempReal + " градусов. Нужно надеть шапку.");
        }


        System.out.println("    Задание3");

        int speedLimit = 60;
        int speedReal = 60;
        if (speedReal > speedLimit) {
            System.out.println("Если скорость " + speedReal + " километров в час, то паридётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speedReal + " километров в час, можно ездить спокойно.");
        }

        System.out.println("    Задание4");

        int ageInfant = 2;
        int ageSchool = 7;
        int ageUniversity = 18;
        int ageWork = 24;
        int ageReal = 25;
        if (ageReal >= ageInfant && ageReal < ageSchool) {
            System.out.println("Если возраст человека равен " + ageReal + " , то ему нужно ходить в детский сад.");
        } else if (ageReal >= ageSchool && ageReal < ageUniversity) {
            System.out.println("Если возраст человека равен " + ageReal + " , то ему нужно ходить в школу.");
        } else if (ageReal >= ageUniversity && ageReal <= ageWork) {
            System.out.println("Если возраст человека равен " + ageReal + " , то его место в университете.");
        } else if (ageReal > ageWork) {
            System.out.println("Если возраст человека равен " + ageReal + " , то ему пора ходить на работу.");
        }

        System.out.println("    Задание5");

        int ageMin = 5;
        int ageMax = 14;
        int ageChild = 13;
        if (ageChild < ageMin) {
            System.out.println("Если возраст ребёнка равен " + ageChild + " , то он не может кататься на атракционе");
        } else if (ageChild >= ageMin && ageChild < ageMax) {
            System.out.println("Если возраст ребёнка равен " + ageChild + " , то он может кататься только в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребёнка равен " + ageChild + " , то он может кататься без сопровождения взрослого.");
        }

        System.out.println("    Задание6");

        int placeSeating = 60;
        int placeStanding = 102;
        int numberPassengers = 105;
        if (numberPassengers < placeSeating) {
            System.out.println("В вагоне имеются места для сидения.");
        } else if (numberPassengers >= placeSeating && numberPassengers < placeStanding) {
            System.out.println("В вагоне имеются стоячие места.");
        } else if (numberPassengers >= placeStanding) {
            System.out.println("Вагон уже полностью забит.");
        }

        System.out.println("    Задание7");

        int one = 5;
        int two = 3;
        int three = 3;
        if (one > two && one > three){
            System.out.println("Число " + one + " является максимальным из данных чисел." );
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " является максимальным из данных чисел." );
        } else if (three > one && three > two ){
            System.out.println("Число " + three + " является максимальным из данных чисел." );
        } else {
            System.out.println("Среди чисел нет одного максимального числа");
        }
    }
}