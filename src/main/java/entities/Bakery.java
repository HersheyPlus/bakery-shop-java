package entities;

public class Bakery {
    private String name;
    private String description;
    private int amount;
    private double price;

    public Bakery(String name, String description, int amount, double price) {
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {return name;}


    public String getDescription() {return description;}

    public int getAmount() {return amount;}

    public double getPrice() {return price;}

    public void setName(String name) {this.name = name;}

    public void setDescription(String description) {this.description = description;}

    public void setAmount(int amount) {this.amount = amount;}

    public void setPrice(double price) {this.price = price;}

    @Override
    public String toString(){
        return String.format("Bakery{name: '%s', description: '%s', amount: %d, price: %.2f}", name, description, amount,
                price);
    }

}
