package javarush.complextask.abstractfactory.helicopters;

public class AgustaA109Helicopter extends Helicopter {

    private final String model = "Agusta A.109";
    private final int maxSpeed = 311;
    private final int maxWeight = 2850;
    private final String countryOfOrigin = "Italy";

    public AgustaA109Helicopter() {}

    public String getModel() {
        return model;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getMaxWeight() {
        return maxWeight;
    }
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Override
    public String toString() {
        return String.format("""
                Страна производитель: %s
                Модель: %s
                Максимальная скорость: %s
                Максимальная грузоподъёмность: %s""", countryOfOrigin, model, maxSpeed, maxWeight);
    }
}