package transport;

import java.time.LocalDate;

public class Car {

    public class Key {

        private String remoteEngineStart;
        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            if (remoteEngineStart != null && remoteEngineStart.isEmpty() && remoteEngineStart.isBlank()) {
                this.remoteEngineStart = remoteEngineStart;
            } else {
                this.remoteEngineStart = "Информация не указана";
            }
            if (keylessAccess != null && keylessAccess.isEmpty() && keylessAccess.isBlank()) {
                this.keylessAccess = keylessAccess;
            } else {
                this.keylessAccess = "Информация не указана";
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        public void setKeylessAccess(String keylessAccess) {
            this.keylessAccess = keylessAccess;
        }
    }

    public class Insurance {

        private LocalDate periodValidation;
        private double costInsurance;
        private String numberInsurance;

        public Insurance(LocalDate period, double cost, String number) {
            if (period != null) {
                this.periodValidation = period;
            } else {
                this.periodValidation = LocalDate.now();
            }
            if (cost <= 0) {
                this.costInsurance = 0.00;
            } else {
                this.costInsurance = cost;
            }
            if (number != null && number.isEmpty() && number.isBlank()) {
                this.numberInsurance = "default";
            } else {
                this.numberInsurance = number;
            }
        }

        public LocalDate getPeriodValidation() {
            return periodValidation;
        }

        public void setPeriodValidation(LocalDate periodValidation) {
            this.periodValidation = periodValidation;
        }

        public double getCostInsurance() {
            return costInsurance;
        }

        public void setCostInsurance(double costInsurance) {
            this.costInsurance = costInsurance;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }

        public void setNumberInsurance(String numberInsurance) {
            this.numberInsurance = numberInsurance;
        }

        public void checkDateInsurance() {
            if (this.getPeriodValidation().isBefore(LocalDate.now())) {
                System.out.println("Страховка " + this.getNumberInsurance() + " просрочена. Срочно нужно оформить страховку!");
            }
        }

        public void checkNumberInsurance() {
            if (this.getNumberInsurance().length() == 9) {
                System.out.println(getNumberInsurance());
            } else {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }

    private String brand;
    private String model;
    double engineVolume;
    String color;
    private int productionYear;
    private String productionCountry;
    String transmission;
    private String bodyType;
    String registrationNumber;
    private int countSeats;
    String typeTyres;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry,
               String transmission, String bodyType, String registrationNumber, int countSeats, String typeTyres) {
        if (brand != null && brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model != null && model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color != null && color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry != null && productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (transmission != null && transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType != null && bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber != null && registrationNumber.isEmpty()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (countSeats <= 0) {
            this.countSeats = 1;
        } else {
            this.countSeats = countSeats;
        }
        if (typeTyres != null && typeTyres.isEmpty()) {
            this.typeTyres = "default";
        } else {
            this.typeTyres = typeTyres;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getCountSeats() {
        return countSeats;
    }

    public String getTypeTyres() {
        return typeTyres;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if (color != null && color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission != null && transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && registrationNumber.isEmpty()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setTypeTyres(String typeTyres) {
        if (typeTyres != null && typeTyres.isEmpty()) {
            this.typeTyres = "default";
        } else {
            this.typeTyres = typeTyres;
        }
    }

    public void changeTyreTypes() {
        if (this.typeTyres.equals("зимняя")) {
            setTypeTyres("летняя");
        } else if (this.typeTyres.equals("летняя")) {
            setTypeTyres("зимняя");
        } else {
            setTypeTyres("default");
        }
    }

    public void verificationRegistrationNumber() {
        if (this.registrationNumber.length() != 9) {
            System.out.println("Автомобильный номер " + getRegistrationNumber() + " не соответствует требованиям!");
        } else {

            int code1 = (int) this.registrationNumber.charAt(0);
            int code5 = (int) this.registrationNumber.charAt(4);
            int code6 = (int) this.registrationNumber.charAt(5);
            boolean firstSymbolAuto = ((code1 >= 1040 && code1 <= 1071) || (code1 >= 65 && code1 <= 90));
            boolean fifthSymbolAuto = ((code5 >= 1040 && code5 <= 1071) || (code5 >= 65 && code5 <= 90));
            boolean sixthSymbolAuto = ((code6 >= 1040 && code6 <= 1071) || (code6 >= 65 && code6 <= 90));

            int code2 = (int) this.registrationNumber.charAt(1);
            int code3 = (int) this.registrationNumber.charAt(2);
            int code4 = (int) this.registrationNumber.charAt(3);
            int code7 = (int) this.registrationNumber.charAt(6);
            int code8 = (int) this.registrationNumber.charAt(7);
            int code9 = (int) this.registrationNumber.charAt(8);
            boolean secondSymbolAuto = (code2 >= 48 && code2 <= 57);
            boolean thirdSymbolAuto = (code3 >= 48 && code3 <= 57);
            boolean fourthSymbolAuto = (code4 >= 48 && code4 <= 57);
            boolean seventhSymbolAuto = (code7 >= 48 && code7 <= 57);
            boolean eighthSymbolAuto = (code8 >= 48 && code8 <= 57);
            boolean ninthSymbolAuto = (code9 >= 48 && code9 <= 57);

            if (firstSymbolAuto && secondSymbolAuto && thirdSymbolAuto && fourthSymbolAuto && fifthSymbolAuto
                    && sixthSymbolAuto && seventhSymbolAuto && eighthSymbolAuto && ninthSymbolAuto) {
                System.out.println("Автомобильный номер " + getRegistrationNumber() + " удовлетворяет требованиям!");
            } else {
                System.out.println("Автомобильный номер " + getRegistrationNumber() + " не соответствует требованиям!");
            }
        }
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }


    public String toString() {
        return "Информация об автомобиле: " + brand + " " + model + ", " + productionYear + " год выпуска, сборка в "
                + productionCountry + ", " + color + " цвет кузова, объём двигателя - " + engineVolume + " литра. " +
                "Коробка передач " + transmission + ", тип кузова - " + bodyType + ", регистрационный номер - " +
                registrationNumber + ", количество мест - " + countSeats + ", тип резины - " + typeTyres + ".";

    }
}

