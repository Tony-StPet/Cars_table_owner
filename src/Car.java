import java.util.Objects;

public class Car {

    String model;
    String year;
    String color;

    public Car(String model, String year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", year=" + year + ", color='" + color + '\'' + '}';
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(year, car.year) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, color);
    }
}
