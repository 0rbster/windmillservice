package nl.hu.iac.service.model;

/**
 * Created by Jeroen on 23-Mar-17.
 */


public class Windmill {
    int id;
    String name;
    // baseOutput = kWh per hour
    int baseOutput;
    int price;

    public Windmill() {super();}

    public Windmill(int id, String name, int baseOutput, int price) {
        this.id = id;
        this.name = name;
        this.baseOutput = baseOutput;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseOutput() {
        return baseOutput;
    }

    public void setBaseOutput(int baseOutput) {
        this.baseOutput = baseOutput;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
