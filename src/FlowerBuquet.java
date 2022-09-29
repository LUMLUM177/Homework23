public class FlowerBuquet {

    private final Flower[] flowers;

    public FlowerBuquet() {
        this.flowers = new Flower[4];
    }

    public void addFlower(String flowerName, String country, double cost, Integer lifeSpan, int count) {
        Flower newFlower = new Flower(flowerName, country, cost, lifeSpan, count);
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] == null) {
                flowers[i] = newFlower;
                break;
            }
        }
    }

    public void calculateCostFlowers() {
        System.out.println("===========================   Высчитываем стоимость букета          ============================");
        System.out.println();
        double sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null) {
                sum += flowers[i].getCost() * flowers[i].getCount();
            }
            if (flowers[i].getLifeSpan() < min && flowers[i].getCount() != 0) {
                min = flowers[i].getLifeSpan();
            }
        }
        sum += 0.1 * sum;
        System.out.println();
        System.out.print("Общая стоимость букета, состоящего из " + flowers[0].getCount() + " роз, " + flowers[1].getCount() +
                " хризантем, " + flowers[2].getCount() + " пионов и " + flowers[3].getCount() + " гипсофил, составит: ");
        System.out.printf("%.2f", sum);
        System.out.println(" рублей. Срок стояния букета - " + min + " суток.");
        System.out.println();
    }
}
