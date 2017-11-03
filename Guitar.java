package ch1;

import ch1.enums.*;

public class Guitar {

    private String SerialNumber, model;
    private Builder builder;
    private Type type;
    private Wood backWood, topWood;
    private double price;

    public Guitar(String serialNumber,
                  double price,
                  Builder builder,
                  String model,
                  Type type,
                  Wood backWood,
                  Wood topWood
                  ) {
        SerialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSerialNumber() {return SerialNumber;}

    public Builder getBuilder() {return builder;}

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public double getPrice() {
        return price;
    }
}
