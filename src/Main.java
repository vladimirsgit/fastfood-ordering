public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger();
        Drink drink = new Drink();
        Sides sides = new Sides();

        welcome();

        burger.setType();

        burger.chooseTopping(burger.setTopping());
        drink.setType();
        drink.setSize();

        sides.setSize();

        Order order = new Order(burger, drink, sides);

        order.setFinalPrice();

        System.out.println(order);

    }
    public static void welcome(){
        System.out.println('\n');
        System.out.println("Welcome!");
    }

}