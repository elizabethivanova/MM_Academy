package Constructors;

public class Car {
    private String name;
    private String color;
    private int year;
    private int horsePowers;
    private boolean isNew;

    Car(String name, String color, int year, int horsePowers, boolean isNew){
        this.name = name;
        this.color = color;
        this.horsePowers = horsePowers;
        this.year = year;
        this.isNew = isNew;
    }
    Car(String name, String color, boolean isNew){
       this(name, color, -1, -1, isNew);
    }
    Car(String name, String color, int year, int horsePowers){
        this(name, color, year, horsePowers, false);
    }
    Car(String name, int year, int horsePowers, boolean isNew){
        this(name, "N/A", year, horsePowers, isNew);
    }

    @Override
    public String toString() {
        return "Car " +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", horsePowers=" + horsePowers +
                ", isNew=" + isNew;
    }
}
