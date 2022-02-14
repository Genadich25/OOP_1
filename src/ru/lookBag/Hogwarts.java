package ru.lookBag;

public abstract class Hogwarts {
    private String firstName;
    private String secondName;
    private final String fullName;
    private int powerMagic;
    private int transgress;

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

    public void getStudentDescription (){
        System.out.println(getFullName() + ":");
        System.out.println("Сила магии: " + getPowerMagic());
        System.out.println("Расстояние трансгресии: " + getTransgress());
    }

    public static void comparePowerMagic(Hogwarts student1, Hogwarts student2){
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

    public static void compareTransgress(Hogwarts student1, Hogwarts student2){
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
