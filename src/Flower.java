public class Flower {

    private String flowerName;
    private String country;
    private double cost;
    public Integer lifeSpan;

    public Flower(String flowerName, String country, double cost, Integer lifeSpan) {
        if (flowerName != null && flowerName.isEmpty()) {
            this.flowerName = "Белый";
        } else {
            this.flowerName = flowerName;
        }
        if (country != null && country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1.00;
        } else {
            this.cost = cost;
        }
        if (lifeSpan == null) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerName() {
        return this.flowerName;
    }

    public String getCountry() {
        return this.country;
    }

    public double getCost() {
        return this.cost;
    }

    void setFlowerName(String flowerName) {
        if (flowerName != null && flowerName.isEmpty()) {
            this.flowerName = "Белый";
        } else {
            this.flowerName = flowerName;
        }
    }

    void setCountry(String country) {
        if (country != null && country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1.00;
        } else {
            this.cost = cost;
        }
    }

    public double calculateCostFlowers(int count) {
        double sum = 0;
        sum += this.getCost() * count;
        return sum;
    }

    public String toString() {
        return "Название цветка - " + flowerName + ", страна происхождения - " + country + ", стоимость " + getCost() +
                " рублей. Срок стояния " + lifeSpan + " дней.";
    }

}
