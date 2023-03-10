package homework;

public abstract class Hogwarts {
    private final String fullName; // Полное имя ученика
    private int magicPower; // Сила магии
    private int transgression; // Трансгрессия

    public String getFullName() {
        return fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public Hogwarts(String fullName, int magicPower, int transgression) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

}
