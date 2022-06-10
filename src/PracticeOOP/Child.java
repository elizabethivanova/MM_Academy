package PracticeOOP;

public class Child extends Person{


    public Child(String name, String sex, String religion, String languageSpoken, String nationality, String countryOfResidence) {
        super(name, sex, religion, languageSpoken, null, nationality, "095221****", countryOfResidence);
    }

    public void play(){
        System.out.printf("%s is playing games!", getName());
        System.out.println();
    }
    @Override
    public boolean isAdult() {
        return false;
    }

    @Override
    public boolean canTakeLoan() {
        return false;
    }
}
