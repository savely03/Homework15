package homework;

// Пуффендуй
public class Hufflepuff extends Hogwarts implements Comparable<Hufflepuff> {
    private int hardWork; // Трудолюбие
    private int loyalty; // Верность
    private int honesty; // Честность

    public Hufflepuff(String fullName, int magicPower, int transgression, int hardWork, int loyalty, int honesty) {
        super(fullName, magicPower, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    /**
     * Сравнение студентов Пуффендуйя
     *
     * @param anotherStudent Студент
     */
    public void compareStudents(Hufflepuff anotherStudent) {
        int resOfCompare = compareTo(anotherStudent);
        if (resOfCompare > 0) {
            System.out.println(getFullName() + " лучший Пуффендуйец, чем " + anotherStudent.getFullName());
        } else if (resOfCompare < 0) {
            System.out.println(anotherStudent.getFullName() + " лучший Пуффендуйец, чем " + getFullName());
        } else {
            System.out.println("Студенты равны");
        }
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "fullName=" + getFullName() +
                "magicPower=" + getMagicPower() +
                "transgression=" + getTransgression() +
                "hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    @Override
    public int compareTo(Hufflepuff o) {
        return Integer.compare(hardWork + loyalty + honesty, o.hardWork + o.loyalty + o.honesty);
    }

}
