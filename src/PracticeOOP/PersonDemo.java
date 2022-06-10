package PracticeOOP;

public class PersonDemo {
    public static void main(String[] args) {
        Bulgarian bulgarian = new Bulgarian("Grigor Dimitrov", "m", "Orthodox",  "QA" , "9409226359");
        Italian italian = new Italian("Rafael Nadal", "m", "Catholic",  null,  "8302117263");
        American american = new American("Novak Djokovic", "m", "Islam", "Dev", "0543218763");
        Child child = new Child("Denis Belqta", "m", null, "Bulgarian", "Bulgarian", "Bulgaria");

        System.out.println(bulgarian);
        System.out.println(italian);
        System.out.println(american);
        System.out.println("-------");
        bulgarian.sayHello();
        italian.sayHello();
        american.sayHello();
        System.out.println("-------");
        bulgarian.celebrateEaster();
        american.celebrateEaster();
        italian.celebrateEaster();
        System.out.println("-------");
        bulgarian.canTakeLoan();
        american.canTakeLoan(); //HE
        italian.canTakeLoan(); //HE
        System.out.println("-------");
        italian.setJob("Driver");
        italian.canTakeLoan();
        System.out.println("-------");
        child.canTakeLoan();
        child.play();
        bulgarian.drink();
        american.watchFootball();
        italian.eatPizza();

    }
}
