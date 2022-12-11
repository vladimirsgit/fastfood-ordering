import java.util.Scanner;

public class Drink {
    private String type;
    private String size;
    private double price;


    public double getPrice() {
        return price;
    }

    public void setType() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter what drink you want: Coke, Fanta, Sprite, Nestea");

        String s = scan.nextLine();
        s = s.toLowerCase();
        if(s.startsWith("co"))
            this.type = "coke";
        else if(s.startsWith("fa"))
            this.type = "fanta";
        else if(s.startsWith("sp"))
            this.type = "sprite";
        else if(s.startsWith("nes"))
            this.type = "nestea";
        else {
            System.out.println("Please choose between the available drinks!");
            setType();
        }
    }

    public void setSize() {
        Scanner scan = new Scanner(System.in);
        System.out.println("The small drink is $3, medium one is $3.5 and the large one is $4." +
                "\nEnter your wanted size, S/M/L:");
        String s = scan.nextLine();
        s = s.toUpperCase();
        switch (s) {
            case "S" -> {
                this.price = 3;
                this.size = s;
            }
            case "M" -> {
                this.price = 3.5;
                this.size = s;
            }
            case "L" -> {
                this.price = 4;
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

        return "drink - " + type + "; size - " + size + "; price - " + price;
    }
}