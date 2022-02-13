package ru.lookBag;

public class Main {

    public static void main(String[] args) {
        Gryffindor garryPotter = new Gryffindor("Гарри", "Поттер", 85, 79, 87, 84, 90);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", "Грейнджер", 87, 75, 85, 87, 89);
        Gryffindor ronWeasley = new Gryffindor("Рон", "Уизли", 80, 71, 79, 86, 84);
        Slytherin dracoMalfoy = new Slytherin("Драко", "Малфой", 79, 79, 69, 90, 84, 80, 90);
        Slytherin grahamMontague = new Slytherin("Грэхэм", "Монтегю", 80, 71, 79, 81, 84, 80, 84);
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", 81, 78, 90, 82, 94, 81, 75);
        Hufflepuff zachariahSmith = new Hufflepuff("Захария", "Смит", 68, 71, 84, 86, 98);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", "Диггори", 77, 79, 85, 81, 88);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", "Финч-Флетчли", 76, 78, 87, 82, 85);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу", "Чанг", 73, 90, 86, 90, 82, 85);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", 80, 76, 78, 75, 80, 93);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", "Белби", 82, 78, 79, 85, 91, 74);

        Hogwarts.descriptionStudent(garryPotter);
        Hogwarts.descriptionStudent(dracoMalfoy);
        Hogwarts.descriptionStudent(zachariahSmith);
        Hogwarts.descriptionStudent(zhouChang);

        Hogwarts.comparisonPowerMagic(ronWeasley, hermioneGranger);
        Hogwarts.comparisonTransgress(marcusBelby,grahamMontague);

        Gryffindor.comparison(garryPotter, ronWeasley);
        Gryffindor.comparison(garryPotter, hermioneGranger);
        Gryffindor.comparison(hermioneGranger, ronWeasley);

        Hufflepuff.comparison(cedricDiggory, justinFinchFletchley);
        Hufflepuff.comparison(cedricDiggory, zachariahSmith);
        Hufflepuff.comparison(justinFinchFletchley, zachariahSmith);

        Ravenclaw.comparison(zhouChang, padmaPatil);
        Ravenclaw.comparison(zhouChang, marcusBelby);
        Ravenclaw.comparison(padmaPatil, marcusBelby);

        Slytherin.comparison(dracoMalfoy, grahamMontague);
        Slytherin.comparison(dracoMalfoy, gregoryGoyle);
        Slytherin.comparison(grahamMontague, gregoryGoyle);
    }
}
