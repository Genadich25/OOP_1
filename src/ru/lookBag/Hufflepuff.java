package ru.lookBag;

public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String secondName, int powerMagic, int transgress, int industriousness, int loyalty, int honesty) {
        super(firstName, secondName, powerMagic, transgress);
        this.industriousness = ServiceHogwarts.checkRangeHundred(industriousness);
        this.loyalty = ServiceHogwarts.checkRangeHundred(loyalty);
        this.honesty = ServiceHogwarts.checkRangeHundred(honesty);

    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = ServiceHogwarts.checkRangeHundred(industriousness);
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = ServiceHogwarts.checkRangeHundred(loyalty);
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = ServiceHogwarts.checkRangeHundred(honesty);
    }

    public void getStudentDescription (){
        super.getStudentDescription();
        System.out.println("Трудолюбие: " + getIndustriousness());
        System.out.println("Честность: " + getHonesty());
        System.out.println("Верность: " + getLoyalty());
        System.out.println();
    }

    public static void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2){
        if(student1.getIndustriousness() > student2.getIndustriousness()){
            System.out.println(student1.getFullName() + " обладает большим трудолюбием, чем " + student2.getFullName());
        } else if(student1.getIndustriousness() < student2.getIndustriousness()){
            System.out.println(student2.getFullName() + " обладает большим трудолюбием, чем " + student1.getFullName());
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по трудолюбию");
        }
        if(student1.getLoyalty() > student2.getLoyalty()){
            System.out.println(student1.getFullName() + " обладает большей верностью, чем " + student2.getFullName());
        } else if(student1.getLoyalty() < student2.getLoyalty()){
            System.out.println(student2.getFullName() + " обладает большей верностью, чем " + student1.getFullName());
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по верности");
        }
        if(student1.getHonesty() > student2.getHonesty()){
            System.out.println(student1.getFullName() + " обладает большей честностью, чем " + student2.getFullName());
            System.out.println();
        } else if(student1.getHonesty() < student2.getHonesty()){
            System.out.println(student2.getFullName() + " обладает большей честностью, чем " + student1.getFullName());
            System.out.println();
        } else {
            System.out.println(student2.getFullName() + " и " + student1.getFullName() + " равны по честности");
            System.out.println();
        }
    }
}
