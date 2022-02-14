package ru.lookBag;

public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    // Не совсем понял какую логику вынести в отдельный метод, проверка от 0 до 100 у меня находится в отдельном классе
    public Gryffindor(String firstName, String secondName, int powerMagic, int transgress, int nobility, int honor, int bravery) {
        super(firstName, secondName, powerMagic, transgress);
        this.nobility = ServiceHogwarts.checkRangeHundred(nobility);
        this.honor = ServiceHogwarts.checkRangeHundred(honor);
        this.bravery = ServiceHogwarts.checkRangeHundred(bravery);
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = ServiceHogwarts.checkRangeHundred(nobility);
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = ServiceHogwarts.checkRangeHundred(honor);
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = ServiceHogwarts.checkRangeHundred(bravery);
    }

    public void getStudentDescription (){
        super.getStudentDescription();
        System.out.println("Храбрость: " + getBravery());
        System.out.println("Честь: " + getHonor());
        System.out.println("Благородство: " + getNobility());
        System.out.println();
    }

    public static void compareGryffindorStudents(Gryffindor student1, Gryffindor student2){
        if(student1.getNobility() > student2.getNobility()){
            System.out.println(student1.getFullName() + " обладает большей благородностью, чем " + student2.getFullName());
        } else if(student1.getNobility() < student2.getNobility()){
            System.out.println(student2.getFullName() + " обладает большей благородностью, чем " + student1.getFullName());
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по благородности");
        }
        if(student1.getHonor() > student2.getHonor()){
            System.out.println(student1.getFullName() + " обладает большей честью, чем " + student2.getFullName());
        } else if(student1.getHonor() < student2.getHonor()){
            System.out.println(student2.getFullName() + " обладает большей честью, чем " + student1.getFullName());
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по чести");
        }
        if(student1.getBravery() > student2.getBravery()){
            System.out.println(student1.getFullName() + " обладает большей храбростью, чем " + student2.getFullName());
            System.out.println();
        } else if(student1.getBravery() < student2.getBravery()){
            System.out.println(student2.getFullName() + " обладает большей храбростью, чем " + student1.getFullName());
            System.out.println();
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по храбрости");
            System.out.println();
        }
    }
}
