package ru.lookBag;

public class Slytherin extends Hogwarts {
    private int trick = 0;
    private int determination = 0;
    private int ambition = 0;
    private int resourcefulness = 0;
    private int lustForPower = 0;

    public Slytherin(String firstName, String secondName, int powerMagic, int transgress, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(firstName, secondName, powerMagic, transgress);
        this.trick = ServiceHogwarts.checkRangeHundred(trick);
        this.determination = ServiceHogwarts.checkRangeHundred(determination);
        this.ambition = ServiceHogwarts.checkRangeHundred(ambition);
        this.resourcefulness = ServiceHogwarts.checkRangeHundred(resourcefulness);
        this.lustForPower = ServiceHogwarts.checkRangeHundred(lustForPower);
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = ServiceHogwarts.checkRangeHundred(trick);
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = ServiceHogwarts.checkRangeHundred(determination);
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ServiceHogwarts.checkRangeHundred(ambition);
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = ServiceHogwarts.checkRangeHundred(resourcefulness);
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = ServiceHogwarts.checkRangeHundred(lustForPower);
    }

    public static void comparison(Slytherin student1, Slytherin student2){
        if(student1.getTrick() > student2.getTrick()){
            System.out.println(student1.getFullName() + " обладает большей хитростью, чем " + student2.getFullName());
        } else if(student1.getTrick() < student2.getTrick()){
            System.out.println(student2.getFullName() + " обладает большей хитростью, чем " + student1.getFullName());
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по хитрости");
        }
        if(student1.getDetermination() > student2.getDetermination()){
            System.out.println(student1.getFullName() + " обладает большей решительностью, чем " + student2.getFullName());
        } else if(student1.getDetermination() < student2.getDetermination()){
            System.out.println(student2.getFullName() + " обладает большей решительностью, чем " + student1.getFullName());
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по решительности");
        }
        if(student1.getAmbition() > student2.getAmbition()){
            System.out.println(student1.getFullName() + " обладает большей амбициозностью, чем " + student2.getFullName());
        } else if(student1.getAmbition() < student2.getAmbition()){
            System.out.println(student2.getFullName() + " обладает большей амбициозностью, чем " + student1.getFullName());
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по остроумию");
        }
        if(student1.getResourcefulness() > student2.getResourcefulness()){
            System.out.println(student1.getFullName() + " обладает большей находчивостью, чем " + student2.getFullName());
        } else if(student1.getResourcefulness() < student2.getResourcefulness()){
            System.out.println(student2.getFullName() + " обладает большей находчивостью, чем " + student1.getFullName());
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по находчивости");
        }
        if(student1.getLustForPower() > student2.getLustForPower()){
            System.out.println(student1.getFullName() + " обладает большей жаждой власти, чем " + student2.getFullName());
            System.out.println();
        } else if(student1.getLustForPower() < student2.getLustForPower()){
            System.out.println(student2.getFullName() + " обладает большей жаждой власти, чем " + student1.getFullName());
            System.out.println();
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по жажде власти");
            System.out.println();
        }
    }
}


