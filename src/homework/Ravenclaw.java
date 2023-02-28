package homework;

// Когтевран
public class Ravenclaw extends Hogwarts implements Comparable<Ravenclaw> {
    private int clever; // Интеллект
    private int wisdom; // Мудрость
    private int wit; // Остроумность
    private int creativity; // Креативность

    public Ravenclaw(String fullName, int magicPower, int transgression, int clever, int wisdom, int wit, int creativity) {
        super(fullName, magicPower, transgression);
        this.clever = clever;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }


    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }


    /**
     * Сравнение студентов Когтеврана
     *
     * @param anotherStudent Студент
     */
    public void compareStudents(Ravenclaw anotherStudent) {
        int resOfCompare = compareTo(anotherStudent);
        if (resOfCompare > 0) {
            System.out.println(getFullName() + " лучший Когтевранец, чем " + anotherStudent.getFullName());
        } else if (resOfCompare < 0) {
            System.out.println(anotherStudent.getFullName() + " лучший Когтевранец, чем " + getFullName());
        } else {
            System.out.println("Студенты равны");
        }
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "fullName=" + getFullName() +
                "magicPower=" + getMagicPower() +
                "transgression=" + getTransgression() +
                "clever=" + clever +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    @Override
    public int compareTo(Ravenclaw o) {
        return Integer.compare(clever + wisdom + wit + creativity, o.clever + o.wisdom + o.wisdom + o.creativity);
    }
}
