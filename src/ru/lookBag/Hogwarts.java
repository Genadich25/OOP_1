package ru.lookBag;

import java.security.Provider;

public class Hogwarts {
    private String firstName;
    private String secondName;
    private final String fullName;
    private int powerMagic = 0;
    private int transgress = 0;

    public Hogwarts(String firstName, String secondName, int powerMagic, int transgress) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.fullName = firstName + " " + secondName;
        this.powerMagic = ServiceHogwarts.checkRangeHundred(powerMagic);
        this.transgress = ServiceHogwarts.checkRangeHundred(transgress);
    }

    public String getFullName() {
        return fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = ServiceHogwarts.checkRangeHundred(powerMagic);
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = ServiceHogwarts.checkRangeHundred(transgress);
    }

    public static void descriptionStudent (Gryffindor student){
        System.out.println(student.getFullName() + ":");
        System.out.println("Сила магии: " + student.getPowerMagic());
        System.out.println("Расстояние трансгресии: " + student.getTransgress());
        System.out.println("Храбрость: " + student.getBravery());
        System.out.println("Честь: " + student.getHonor());
        System.out.println("Благородство: " + student.getNobility());
        System.out.println();
    }

    public static void descriptionStudent (Slytherin student){
        System.out.println(student.getFullName() + ":");
        System.out.println("Сила магии: " + student.getPowerMagic());
        System.out.println("Расстояние трансгресии: " + student.getTransgress());
        System.out.println("Амбициозность: " + student.getAmbition());
        System.out.println("Решительность: " + student.getDetermination());
        System.out.println("Хитрость: " + student.getTrick());
        System.out.println("Жажда власти: " + student.getLustForPower());
        System.out.println("Находчивость: " + student.getResourcefulness());
        System.out.println();
    }

    public static void descriptionStudent (Hufflepuff student){
        System.out.println(student.getFullName() + ":");
        System.out.println("Сила магии: " + student.getPowerMagic());
        System.out.println("Расстояние трансгресии: " + student.getTransgress());
        System.out.println("Трудолюбие: " + student.getIndustriousness());
        System.out.println("Честность: " + student.getHonesty());
        System.out.println("Верность: " + student.getLoyalty());
        System.out.println();
    }

    public static void descriptionStudent (Ravenclaw student){
        System.out.println(student.getFullName() + ":");
        System.out.println("Сила магии: " + student.getPowerMagic());
        System.out.println("Расстояние трансгресии: " + student.getTransgress());
        System.out.println("Ум: " + student.getMind());
        System.out.println("Творчество: " + student.getCreativity());
        System.out.println("Мудрость: " + student.getWisdom());
        System.out.println("Остроумие: " + student.getWit());
        System.out.println();
    }

    public static void comparisonPowerMagic(Hogwarts student1, Hogwarts student2){
        if(student1.getPowerMagic() > student2.getPowerMagic()){
            System.out.println(student1.getFullName() + " обладает большей мощностью магии, чем " + student2.getFullName());
            System.out.println();
        } else if(student1.getPowerMagic() < student2.getPowerMagic()){
            System.out.println(student2.getFullName() + " обладает большей мощностью магии, чем " + student1.getFullName());
            System.out.println();
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по силе магии");
            System.out.println();
        }
    }

    public static void comparisonTransgress(Hogwarts student1, Hogwarts student2){
        if(student1.getTransgress() > student2.getTransgress()){
            System.out.println(student1.getFullName() + " обладает большей мощностью магии, чем " + student2.getFullName());
            System.out.println();
        } else if(student1.getTransgress() < student2.getTransgress()){
            System.out.println(student2.getFullName() + " обладает большей мощностью магии, чем " + student1.getFullName());
            System.out.println();
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по силе магии");
            System.out.println();
        }
    }
}
