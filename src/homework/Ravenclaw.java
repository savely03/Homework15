package homework;

// Когтевран
public class Ravenclaw extends Hogwarts {
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

    /**
     * Сравнение студентов Когтеврана
     *
     * @param anotherStudent Студент
     */
    @Override
    public void compareStudentsFromTheSameFaculty(Hogwarts anotherStudent) {
        if (anotherStudent != null && anotherStudent.getClass() == this.getClass()) {
            Ravenclaw ravenclawStudent = (Ravenclaw) anotherStudent;
            int resOfCompare = Integer.compare(clever + wisdom + wit + creativity,
                    ravenclawStudent.clever + ravenclawStudent.wisdom + ravenclawStudent.wit + ravenclawStudent.creativity);
            if (resOfCompare > 0) {
                System.out.println(getFullName() + " лучший Когтевранец, чем " + ravenclawStudent.getFullName());
            } else if (resOfCompare < 0) {
                System.out.println(ravenclawStudent.getFullName() + " лучший Когтевранец, чем " + getFullName());
            } else {
                System.out.println("Студенты равны");
            }
        }
    }
}
