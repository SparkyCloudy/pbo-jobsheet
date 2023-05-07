package pnb.pbo1.latihan.dua.helper;

public class Cat {
    private static int objCounter;
    private String name;
    private int age;
    private int weight;
    private final boolean isStrict;

    public Cat(String name, int age, int weight, boolean isStrict) {
        this.isStrict = isStrict;
        setterStatus(name, age, weight);
        objCounter++;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.isBlank()) {
            if (isStrict) {
                throw new NullPointerException("Error! Name can't be empty.");
            }
            System.out.printf("| %-30s|\n", "Error! Name can't be empty.");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0) {
            if (isStrict) {
                throw new NullPointerException("Error! Age can't be negative" +
                        ".");
            }
            System.out.printf("| %-30s|\n", "Error! Age can't be negative.");
        }
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        if (weight < 0) {
            if (isStrict) {
                throw new NullPointerException("Error! Weight can't be " +
                        "negative.");
            }
            System.out.printf("| %-30s| \n", "Error! Weight can't be negative" +
                    ".");
        }
        this.weight = weight;
    }

    public void setterStatus(String name, int age, int weight) {
        System.out.printf("%-10s| ERROR |%10s\n", "+===========",
                "===========+");
        setName(name);
        setAge(age);
        setWeight(weight);
        System.out.printf("%-10s| ^^^^^ |%10s\n", "+===========",
                "===========+");
    }

    public int getObjectCounter() {
        return objCounter;
    }
}
