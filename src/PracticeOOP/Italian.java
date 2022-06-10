package PracticeOOP;

public class Italian extends Person{

    public Italian(String name, String sex, String religion, String job, String pin) {
        super(name, sex, religion, "Italian", job, "Italian", pin, "Italy");
    }
    public void eatPizza(){
        System.out.printf("%s is eating original italian pizza!", getName());
        System.out.println();
    }
}
