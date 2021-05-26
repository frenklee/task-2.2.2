package web.model;

public class Car {
    private int series;
    private String model;
    private int weight;

    public Car(){}
    public Car(int series, String model, int weight) {
        this.series = series;
        this.model = model;
        this.weight = weight;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
