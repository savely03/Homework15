package homework;

// Гриффиндор
public class Gryffindor extends Hogwarts implements Comparable<Gryffindor> {
    private int nobility; // Благородство
    private int honor; // Честь
    private int bravery; // Храбрость

    public Gryffindor(String fullName, int magicPower, int transgression, int nobility, int honor, int bravery) {
        super(fullName, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    /**
     * Сравнение студентов Гриффиндора
     *
     * @param anotherStudent Студент
     */
    public void compareStudents(Gryffindor anotherStudent) {
        int resOfCompare = compareTo(anotherStudent);
        if (resOfCompare > 0) {
            System.out.println(getFullName() + " лучший Гриффиндорец, чем " + anotherStudent.getFullName());
        } else if (resOfCompare < 0) {
            System.out.println(anotherStudent.getFullName() + " лучший Гриффиндорец, чем " + getFullName());
        } else {
            System.out.println("Студенты равны");
        }
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "fullName=" + getFullName() +
                "magicPower=" + getMagicPower() +
                "transgression=" + getTransgression() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    @Override
    public int compareTo(Gryffindor o) {
        return Integer.compare(nobility + honor + bravery, o.nobility + o.honor + o.bravery);
    }
}
