package homework;

// Слизерин
public class Slytherin extends Hogwarts {
    private int trick; // Хитрость
    private int determination; // Решительность
    private int ambition; // Амбициозность
    private int ingenuity; // Находчивость
    private int lustForPower; // Жажда власти


    public Slytherin(String fullName, int magicPower, int transgression, int trick, int determination,
                     int ambition, int ingenuity, int lustForPower) {
        super(fullName, magicPower, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "fullName=" + getFullName() +
                "magicPower=" + getMagicPower() +
                "transgression=" + getTransgression() +
                "trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", ingenuity=" + ingenuity +
                ", lustForPower=" + lustForPower +
                '}';
    }

    /**
     * Сравнение студентов Слизерина
     *
     * @param anotherStudent Студент
     */
    @Override
    public void compareStudentsFromTheSameFaculty(Hogwarts anotherStudent) {
        if (anotherStudent != null && anotherStudent.getClass() == this.getClass()) {
            Slytherin slytherinStudent = (Slytherin) anotherStudent;
            int resOfCompare = Integer.compare(trick + determination + ambition + ingenuity + lustForPower,
                    slytherinStudent.trick + slytherinStudent.determination + slytherinStudent.ambition + slytherinStudent.ingenuity + slytherinStudent.lustForPower);
            if (resOfCompare > 0) {
                System.out.println(getFullName() + " лучший Слизеринец, чем " + slytherinStudent.getFullName());
            } else if (resOfCompare < 0) {
                System.out.println(slytherinStudent.getFullName() + " лучший Слизеринец, чем " + getFullName());
            } else {
                System.out.println("Студенты равны");
            }
        }
    }
}
