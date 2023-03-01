package homework;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №15");
        Hogwarts garryPotter = new Gryffindor("Garry Potter", 90, 90, 100, 100, 95);
        Hogwarts hermioneGranger = new Gryffindor("Hermione Granger", 95, 95, 100, 100, 100);
        Hogwarts cedricDiggory = new Hufflepuff("Cedric Diggory", 60, 70, 71, 80, 74);
        Hogwarts zachariahSmith = new Hufflepuff("Zachariah Smith", 80, 70, 40, 75, 81);
        Hogwarts marcusBelby = new Ravenclaw("Marcus Belby", 50, 55, 70, 75, 80, 36);
        Hogwarts padmaPatil = new Ravenclaw("Padma Patil", 60, 51, 75, 74, 70, 41);
        Hogwarts dracoMalfoy = new Slytherin("Draco Malfoy", 85, 85, 100, 50, 80, 95, 100);
        Hogwarts gregoryGoyle = new Slytherin("Gregory Goyle", 70, 50, 75, 36, 30, 71, 81);
        garryPotter.compareStudentsFromTheSameFaculty(hermioneGranger);
        cedricDiggory.compareStudentsFromTheSameFaculty(zachariahSmith);
        marcusBelby.compareStudentsFromTheSameFaculty(padmaPatil);
        dracoMalfoy.compareStudentsFromTheSameFaculty(gregoryGoyle);
        compareStudentsByMagicPowerAndTransgressionDistance(garryPotter, dracoMalfoy);
    }

    /**
     * Метод сравнивает студентов Хогвартса по силе магии и расстоянию трансгрессии
     *
     * @param student1 Студент 1
     * @param student2 Студент 2
     */
    public static void compareStudentsByMagicPowerAndTransgressionDistance(Hogwarts student1, Hogwarts student2) {
        if (student1.compareTo(student2) > 0) {
            System.out.println(student1.getFullName() + " обладает большей мощностью магии, чем " + student2.getFullName());
        } else if (student1.compareTo(student2) < 0) {
            System.out.println(student2.getFullName() + " обладает большей мощностью магии, чем " + student1.getFullName());
        } else {
            System.out.println("Студенты равны");
        }
    }


}