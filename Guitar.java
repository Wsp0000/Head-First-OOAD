package ch1;

public class Guitar {

    private String SerialNumber, builder, model, type, backWood, topWood;
    private double price;

    public Guitar(String serialNumber,
                  double price,
                  String builder,
                  String model,
                  String type,
                  String backWood,
                  String topWood
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

    public String getBuilder() {return builder;}

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public double getPrice() {
        return price;
    }
}
