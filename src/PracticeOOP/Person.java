package PracticeOOP;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.InputMismatchException;

public class Person {

    private String name;
    private String sex;
    private String religion;
    private String languageSpoken;
    private String job;
    private String nationality;
    private String pin;
    private LocalDate dateOfBirth;
    private int age;
    private String countryOfResidence;

    public Person(String name, String sex, String religion, String languageSpoken, String job, String nationality, String pin, String countryOfResidence) {
        this.name = name;
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        this.countryOfResidence = countryOfResidence;

        try{
            if("male".equalsIgnoreCase(sex) || "m".equalsIgnoreCase(sex) || "female".equalsIgnoreCase(sex) || "f".equalsIgnoreCase(sex)){
                this.sex = sex;
            }else{
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException ie){
            System.out.println("Illegal sex option is added!");
        }
        try{
            if(pin.length() == 10){
                this.pin = pin;
            }else{
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException ie){
            System.out.println("Illegal pin added!");
        }
        int yearOfBirth = 0;
        int monthOfBirth = 0;
        int dayOfBirth = 0;
        try{
            yearOfBirth = Integer.parseInt(pin.substring(0,2));
            monthOfBirth = Integer.parseInt(pin.substring(2,4));
            dayOfBirth = Integer.parseInt(pin.substring(4,6));
        } catch (NumberFormatException ne){
            System.out.println("You have typed incorrect PIN number: " + ne.getMessage());
        }

        int centuryCheck = Integer.parseInt(pin.substring(2,3));
        if(centuryCheck == 4 || centuryCheck == 5){
            //над 2000
            yearOfBirth += 2000;
            monthOfBirth -= 40;
        }else{
            //1900 - 1999
            yearOfBirth += 1900;
        }

        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.age = LocalDate.now().getYear() - yearOfBirth;

    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getReligion() {
        return religion;
    }

    public String getLanguageSpoken() {
        return languageSpoken;
    }

    public String getJob() {
        return job;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPin() {
        return pin;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", religion='" + religion + '\'' +
                ", languageSpoken='" + languageSpoken + '\'' +
                ", job='" + job + '\'' +
                ", nationality='" + nationality + '\'' +
                ", pin='" + pin + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", countryOfResidence='" + countryOfResidence + '\'' +
                '}';
    }
    public void sayHello(){
        if(getLanguageSpoken().equalsIgnoreCase("Bulgarian")){
            System.out.println("Здравей!");
        }else if(getLanguageSpoken().equalsIgnoreCase("Italian")){
            System.out.println("Chao");
        }else{
            System.out.println("Hello!");
        }
    }
    public void celebrateEaster(){
        if(getReligion().equalsIgnoreCase("Orthodox") || getReligion().equalsIgnoreCase("Catholic") ){
            System.out.println("Happy Easter!");
        }else{
            System.out.println("This religion does not cerebrates Easter!");
        }
    }
    public boolean isAdult(){
        if(getAge() >= 18){
            return true;
        }else {
            return false;
        }
    }
    public boolean canTakeLoan(){
        if(isAdult() && getJob() != null){
            System.out.println("City cash is waiting for you!");
            return true;
        }else{
            System.out.println("Can not take a loan!");
            return false;
        }
    }
}
