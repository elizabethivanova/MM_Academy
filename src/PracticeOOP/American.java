package PracticeOOP;

public class American extends Person{

    public American(String name, String sex, String religion, String job, String pin) {
        super(name, sex, religion, "English", job, "American", pin, "USA");
    }

    public void watchFootball(){
        System.out.printf("%s is watching american football!", getName());
        System.out.println();
    }
    @Override
    public boolean isAdult() {
        if(getAge() >= 21){
            return true;
        }else {
            return false;
        }
    }


}
