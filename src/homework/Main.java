package homework;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №15");
        Gryffindor garryPotter = new Gryffindor("Garry Potter", 90, 90, 100, 100, 95);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 95, 95, 100, 100, 100);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 60, 70, 71, 80, 74);
        Hufflepuff zachariahSmith = new Hufflepuff("Zachariah Smith", 80, 70, 40, 75, 81);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 50, 55, 70, 75, 80, 36);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 60, 51, 75, 74, 70, 41);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 85, 85, 100, 50, 80, 95, 100);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 70, 50, 75, 36, 30, 71, 81);
        garryPotter.compareStudents(hermioneGranger);
        cedricDiggory.compareStudents(zachariahSmith);
        marcusBelby.compareStudents(padmaPatil);
        dracoMalfoy.compareStudents(gregoryGoyle);
        compareStudentsByMagicPower(garryPotter, dracoMalfoy);
        compareStudentsByTransgressionDistance(hermioneGranger, padmaPatil);


    }

    /**
     * Метод сравнивает студентов Хогвартса по силе магии
     *
     * @param student1 Студент 1
     * @param student2 Студент 2
     */
    public static void compareStudentsByMagicPower(Hogwarts student1, Hogwarts student2) {
        int resOfCompare = Integer.compare(student1.getMagicPower(), student2.getMagicPower());
        System.out.println(formTextResultOfComparingStudents(
                resOfCompare, " обладает большей мощностью магии", student1, student2));
    }

    /**
     * Метод сравнивает студентов Хогвартса по расстоянию трансгрессии
     *
     * @param student1 Студент 1
     * @param student2 Студент 2
     */
    public static void compareStudentsByTransgressionDistance(Hogwarts student1, Hogwarts student2) {
        int resOfCompare = Integer.compare(student1.getTransgression(), student2.getTransgression());
        System.out.println(formTextResultOfComparingStudents(
                resOfCompare, " обладает большим расстоянием трансгрессии", student1, student2));
    }


    /**
     * Метод формирует текстовый результат на основе целочисленного результата из метода compare
     *
     * @param resOfCompare результат метода compare в целочисленном виде
     * @param skillText    Текст умения
     * @param student1     Студент 1
     * @param student2     Студент 2
     * @return Результат сравнения двух студентов Хогвартса в текстовом виде
     */
    public static String formTextResultOfComparingStudents(int resOfCompare, String skillText, Hogwarts student1, Hogwarts student2) {
        String res = null;
        if (resOfCompare > 0) {
            res = student1.getFullName() + skillText + ", чем " + student2.getFullName();
        } else if (resOfCompare < 0) {
            res = student2.getFullName() + skillText + ", чем " + student1.getFullName();
        }
        return res == null ? "Студенты равны" : res;
    }
}