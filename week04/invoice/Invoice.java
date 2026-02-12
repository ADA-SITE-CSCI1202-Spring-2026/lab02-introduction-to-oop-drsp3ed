package week04.invoice;

public class Invoice {
    private String partNumber;
    private String description;
    private int quantity;
    private double price;

    public Invoice() {
        this.partNumber = "#P00000001";
        this.description = "Placeholder";
        this.quantity = 0;
        this.price = 0.0;
    }

    public Invoice(String partNumber, String description, int quantity, double price) {
        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPartNumber() {
        return this.partNumber;
    }

    public String getDescription() {
        return this.description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPartNumber(String s) {
        this.partNumber = s;
    }

    public void setDescription(String s) {
        this.description = s;
    }

    public void setQuantity(int q) {
        if (q < 0) {
            System.out.println("The minimal quantity is 0. Setting quantity to 0.");
            this.quantity = 0;
            return;
        }
        this.quantity = q;
    }

    public void setPrice(double p) {
        if (p < 0) {
            System.out.println("The minimal price is 0.0. Setting price to 0.0.");
            this.price = 0.0;
            return;
        }
        this.price = p;
    }



}
