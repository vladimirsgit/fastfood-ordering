
import java.util.Scanner;

public class Burger {
    private String type;
    private double price;
    private String topping;

    public Burger(){
        this.topping = "Without toppings";
    }
    public double getPrice() {
        return price;
    }


    public void setType(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What type of burger would you like?");
        System.out.println("Hamburger - $5.5\nCheeseburger - $5.0\nChickenburger - $4.5");
        System.out.println("Hint: Typing only the first 3 letters should be enough.");
        String s = scan.nextLine();
        s = s.toLowerCase();
        if(s.startsWith("ha")){
            this.price = 5.5;
            this.type = "hamburger";
        }
        else if(s.startsWith("che")){
            this.price = 5.0;
            this.type = "cheeseburger";
        }
        else if(s.startsWith("chi")){
            this.price = 4.5;
            this.type = "chickenburger";
        }
        else {
            System.out.println("You must choose between these 3 types of burgers!");
            setType();
        }

    }
    public void chooseTopping(int nrTopp){
        if(nrTopp < 1) return;
        Scanner scan = new Scanner(System.in);
        this.topping = "";
        int i = 0;

        System.out.println("1 = Cheddar\n2 = Bacon\n3 = Pickles\n4 = Mayo\n5 = Ketchup");
        do{
            switch(scan.nextInt()){
                case 1 -> {
                    this.price += 1;
                    this.topping+="Cheddar |";
                }
                case 2 -> {
                    this.price += 1.5;
                    this.topping+="Bacon |";
                }
                case 3 -> {
                    this.price += 0.5;
                    this.topping+="Pickles |";
                }
                case 4 -> {
                    this.price += 0.25;
                    this.topping+="Mayo |";
                }
                case 5 -> {
                    this.price+=0.25;
                    this.topping+="Ketchup |";
                }
                default -> {
                    System.out.println("Number must be between 1 and 5!");
                    continue;
                }
            }

            i++;
        }while(i < nrTopp);
    }

    public int setTopping() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cheddar - $1.0\nBacon - $1.5\nPickles -$0.5\nMayo/Ketchup -$0.25\nHow many toppings do you want? 3 is the max allowed.");
        int i = 0;
        do{
            System.out.println("Number must be between 0 and 3.");
            i = scan.nextInt();
        }while(i < 0 || i > 3);
        return i;
    }

    @Override
    public String toString() {
        return "burger - " + type + "; topping -  " + topping + "; price - " + price;
    }
}