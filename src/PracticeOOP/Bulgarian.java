package PracticeOOP;

public class Bulgarian extends Person{
    public Bulgarian(String name, String sex, String religion, String job, String pin) {
        super(name, sex, religion, "Bulgarian", job, "Bulgarian", pin, "Bulgaria");
    }

    public void drink(){
        if(isAdult()){
            System.out.printf("Cheers, %s!", getName());
            System.out.println();
        }else{
            System.out.println("Not yet!");
        }
    }



}
