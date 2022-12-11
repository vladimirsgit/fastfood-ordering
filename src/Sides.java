import java.util.Scanner;

public class Sides {
    private double price;
    private String size;

    public double getPrice() {
        return price;
    }


    public void setSize() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What size would you like your fries? \nS/M/L:");
        String s = scan.nextLine();
        s = s.toUpperCase();
        switch (s) {
            case "S" -> {
                this.price = 3;
                this.size = s;
            }
            case "M" -> {
                this.price = 4;
                this.size = s;
            }
            case "L" -> {
                this.price = 5;
                this.size = s;
            }
            default -> {
                System.out.println("Please choose between the available sizes!");
                setSize();
            }
        }
    }


    @Override
    public String toString() {
        String type = "Fries";

        return "side - " + type + "; size - " + size + "; price - " + price;
    }
}