package enums;

public class EnumsWithFieldsExample {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.printf(planet.getName(), planet.getDistanceFromSun());
        }
    }
}
