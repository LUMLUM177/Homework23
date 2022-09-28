import transport.Car;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Human maxim = new Human("Максим", "Минск", 1987, "бренд-менеджером");
        Human anya = new Human("Аня", "Москва", 1993, "методистом обраовательных программ");
        Human katya = new Human("Катя", "Калининград", 1994, "продакт-менеджером");
        Human artem = new Human("Артём", "Москва", 1995, "директором по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 2001, "нигде не работаю");
        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(vladimir);
        System.out.println();

        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59, null);
        Flower chrysanthemum = new Flower("Хризантема", "", 15.00, 5);
        Flower pion = new Flower("Пион", "Англия", 69.90, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.50, 10);
        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(pion);
        System.out.println(gypsophila);

        double sum = 0;
        int roseCount = 3;
        int chrysanthemumCount = 5;
        int gypsophilaCount = 1;
        int pionCount = 0;
        sum += rose.calculateCostFlowers(roseCount);
        sum += chrysanthemum.calculateCostFlowers(chrysanthemumCount);
        sum += gypsophila.calculateCostFlowers(gypsophilaCount);
        sum += pion.calculateCostFlowers(pionCount);
        sum += 0.1 * sum;

        Integer lifeRose = rose.lifeSpan;
        Integer lifeChrysathemum = chrysanthemum.lifeSpan;
        Integer lifePion = pion.lifeSpan;
        Integer lifeGypsophila = gypsophila.lifeSpan;

        if (roseCount == 0) {
            lifeRose = Integer.MAX_VALUE;
        }
        if (pionCount == 0) {
            lifePion = Integer.MAX_VALUE;
        }
        if (chrysanthemumCount == 0) {
            lifeChrysathemum = Integer.MAX_VALUE;
        }
        if (gypsophilaCount == 0) {
            lifeGypsophila = Integer.MAX_VALUE;
        }

        Integer lifeSpan = Math.min(Math.min(lifeRose, lifePion), Math.min(lifeGypsophila, lifeChrysathemum));

        if (roseCount == 0 && pionCount == 0 && chrysanthemumCount == 0 && gypsophilaCount == 0) {
            lifeSpan = 0;
        }

        System.out.println();
        System.out.print("Общая стоимость букета, состоящего из " + roseCount + " роз, " + chrysanthemumCount +
                " хризантем, " + gypsophilaCount + " гипсофил и " + pionCount + " пионов, составит: ");
        System.out.printf("%.2f", sum);
        System.out.println(" рублей. Срок стояния букета - " + lifeSpan + " суток.");
        System.out.println();


        Car ladaGrande = new Car("Lada", "Grande", 1.7, "жёлтый", 2015, "Россия",
                "автомат", "седан", "Т001СУ123", 5, "летняя");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, "Германия",
                "автомат", "хэтчбек", "Т003СК023", 4, "летняя");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "чёрный", 2021, "Германия",
                "ручная", "лифтбэк", "В105СУ031", 5, "зимняя");
        Car kiaSportage = new Car("KIA", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея",
                "гибрид", "кабриолет", "К777СУ177", 8, "зимняя");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея",
                "ручная", "купе", "Т548СУ001", 2, "летняя");

        System.out.println(ladaGrande);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
        hyundaiAvante.changeTyreTypes();
        bmwZ8.changeTyreTypes();
        System.out.println();
        System.out.println(hyundaiAvante);
        System.out.println(bmwZ8);

        bmwZ8.verificationRegistrationNumber();
        Car.Insurance audiA8Insurance = audiA8.new Insurance(LocalDate.of(2020, 8, 13), 5000.00, "545687999");
        Car.Insurance ladaGrandeInsurance = ladaGrande.new Insurance(LocalDate.of(2022, 11, 27), 10000.00, "355987567");
        Car.Insurance bmwZ8Insurance = bmwZ8.new Insurance(LocalDate.of(2022, 9, 29), 4000.00, "159798523243");
        Car.Insurance kiaSportageInsurance = kiaSportage.new Insurance(LocalDate.of(2022, 9, 20), 7000.00, "5556664");
        Car.Insurance hyundaiAvanteInsurance = hyundaiAvante.new Insurance(LocalDate.of(2022, 5, 20), 5301.15, "997987545");
        audiA8.setInsurance(audiA8Insurance);
        ladaGrande.setInsurance(ladaGrandeInsurance);
        bmwZ8.setInsurance(bmwZ8Insurance);
        kiaSportage.setInsurance(kiaSportageInsurance);
        hyundaiAvante.setInsurance(hyundaiAvanteInsurance);

        hyundaiAvanteInsurance.checkNumberInsurance();
        audiA8Insurance.checkNumberInsurance();
        ladaGrandeInsurance.checkNumberInsurance();
        bmwZ8Insurance.checkNumberInsurance();
        kiaSportageInsurance.checkNumberInsurance();

        hyundaiAvanteInsurance.checkDateInsurance();
        audiA8Insurance.checkDateInsurance();
        ladaGrandeInsurance.checkDateInsurance();
        bmwZ8Insurance.checkDateInsurance();
        kiaSportageInsurance.checkDateInsurance();

    }
}