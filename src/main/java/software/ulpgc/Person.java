package software.ulpgc;

import java.time.LocalDate;

public class Person {
    public static final int DAYS_PER_YEAR = 365;
    private final String name;
    private  final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int getAge(){
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/ DAYS_PER_YEAR);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + getAge() +
                '}';
    }
}
