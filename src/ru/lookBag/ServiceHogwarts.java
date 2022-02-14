package ru.lookBag;

public class ServiceHogwarts {
    public static int checkRangeHundred(int value){
        if(value < 0){
            return 0;
        } else if(value > 100){
            return 100;
        } else {
            return value;
        }
    }
}
