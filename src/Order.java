public class Order {
    private Burger burger;
    private Drink drink;
    private Sides sides;
    private double finalPrice;

    public Order(Burger burger, Drink drink, Sides sides) {
        this.burger = burger;
        this.drink = drink;
        this.sides = sides;
    }
    public void setFinalPrice(){
        this.finalPrice = burger.getPrice() + drink.getPrice() + sides.getPrice();
    }

    @Override
    public String toString() {
        return "final order - " + burger + "\n_ _ _ _\n" + sides + "\n_ _ _ _\n" + drink + "\n_ _ _ _\nfinal price - " + finalPrice + "\n_ _ _ _";
    }

}