public class Laptop implements Computer {
    
    private String companyName, os, color;
    private Double price, OfferRate;

    Laptop(String company, String opsoft, String colour, Double prix) {
        this.companyName = company;
        this.os = opsoft;
        this.color = colour;
        this.price = prix;
        this.OfferRate = 0.20;
    }

    public Double findFinalPrice() {
        return this.price*(1-this.OfferRate);
    }

    public void printDetails() {
        System.out.println(username + " has one " + color + " " + companyName + " " + this.getClass().getSimpleName() + " with " + os + "OS. Price:" + findFinalPrice());
    }

}
