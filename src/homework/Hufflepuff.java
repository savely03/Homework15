package homework;

// Пуффендуй
public class Hufflepuff extends Hogwarts {
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

    /**
     * Сравнение студентов Пуффендуйя
     *
     * @param anotherStudent Студент
     */
    @Override
    public void compareStudentsFromTheSameFaculty(Hogwarts anotherStudent) {
        if (anotherStudent != null && anotherStudent.getClass() == this.getClass()) {
            Hufflepuff hufflepuffStudent = (Hufflepuff) anotherStudent;
            int resOfCompare = Integer.compare(hardWork + loyalty + honesty,
                    hufflepuffStudent.hardWork + hufflepuffStudent.loyalty + hufflepuffStudent.honesty);
            if (resOfCompare > 0) {
                System.out.println(getFullName() + " лучший Пуффендуйец, чем " + hufflepuffStudent.getFullName());
            } else if (resOfCompare < 0) {
                System.out.println(hufflepuffStudent.getFullName() + " лучший Пуффендуйец, чем " + getFullName());
            } else {
                System.out.println("Студенты равны");
            }
        }
    }
}
