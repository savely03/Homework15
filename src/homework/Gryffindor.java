package homework;

// Гриффиндор
public class Gryffindor extends Hogwarts {
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

    /**
     * Сравнение студентов Гриффиндора
     *
     * @param anotherStudent Студент
     */
    @Override
    public void compareStudentsFromTheSameFaculty(Hogwarts anotherStudent) {
        if (anotherStudent != null && anotherStudent.getClass() == this.getClass()) {
            Gryffindor gryffindorStudent = (Gryffindor) anotherStudent;
            int resOfCompare = Integer.compare(nobility + honor + bravery,
                    gryffindorStudent.nobility + gryffindorStudent.honor + gryffindorStudent.bravery);
            if (resOfCompare > 0) {
                System.out.println(getFullName() + " лучший Гриффиндорец, чем " + gryffindorStudent.getFullName());
            } else if (resOfCompare < 0) {
                System.out.println(gryffindorStudent.getFullName() + " лучший Гриффиндорец, чем " + getFullName());
            } else {
                System.out.println("Студенты равны");
            }
        }
    }
}
