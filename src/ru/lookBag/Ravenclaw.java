package ru.lookBag;

public class Ravenclaw extends Hogwarts{
    private int mind= 0;
    private int wisdom = 0;
    private int wit = 0;
    private int creativity = 0;

    public Ravenclaw(String firstName, String secondName, int powerMagic, int transgress, int mind, int wisdom, int wit, int creativity) {
        super(firstName, secondName, powerMagic, transgress);
        this.mind = ServiceHogwarts.checkRangeHundred(mind);
        this.wisdom = ServiceHogwarts.checkRangeHundred(wisdom);
        this.wit = ServiceHogwarts.checkRangeHundred(mind);
        this.creativity = ServiceHogwarts.checkRangeHundred(creativity);
    }

    public int getMind() {
        return ServiceHogwarts.checkRangeHundred(mind);
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = ServiceHogwarts.checkRangeHundred(wisdom);
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = ServiceHogwarts.checkRangeHundred(wit);
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = ServiceHogwarts.checkRangeHundred(creativity);
    }

    public static void comparison(Ravenclaw student1, Ravenclaw student2){
        if(student1.getMind() > student2.getMind()){
            System.out.println(student1.getFullName() + " обладает большим умом, чем " + student2.getFullName());
        } else if(student1.getMind() < student2.getMind()){
            System.out.println(student2.getFullName() + " обладает большим умом, чем " + student1.getFullName());
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по уму");
        }
        if(student1.getWisdom() > student2.getWisdom()){
            System.out.println(student1.getFullName() + " обладает большей мудростью, чем " + student2.getFullName());
        } else if(student1.getWisdom() < student2.getWisdom()){
            System.out.println(student2.getFullName() + " обладает большей мудростью, чем " + student1.getFullName());
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по мудрости");
        }
        if(student1.getWit() > student2.getWit()){
            System.out.println(student1.getFullName() + " обладает большим остроумием, чем " + student2.getFullName());
        } else if(student1.getWit() < student2.getWit()){
            System.out.println(student2.getFullName() + " обладает большим остроумием, чем " + student1.getFullName());
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по остроумию");
        }
        if(student1.getCreativity() > student2.getCreativity()){
            System.out.println(student1.getFullName() + " обладает большей креативностью, чем " + student2.getFullName());
            System.out.println();
        } else if(student1.getCreativity() < student2.getCreativity()){
            System.out.println(student2.getFullName() + " обладает большей креативностью, чем " + student1.getFullName());
            System.out.println();
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по креативности");
            System.out.println();
        }
    }
}
