public class Desktop implements Computer {
    
    private String companyName, os, headphoneName;
    private Double price, taxRate;

    Desktop(String company, String opsoft, Double prix, String hpName) {
        this.companyName = company;
        this.os = opsoft;
        this.headphoneName = hpName;
        this.price = prix;
        this.taxRate = 0.13;
    }

    public Double findFinalPrice() {
        return this.price*(1+this.taxRate);
    }

    public void printDetails() {
        System.out.println(username + " has one " + companyName + " " + this.getClass().getSimpleName() + " with " + os + " OS, uses " + headphoneName + ". Price: " + findFinalPrice());
    }
}
