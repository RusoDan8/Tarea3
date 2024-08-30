// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Coffee myCoffee = new BasicCoffee();
        System.out.println(myCoffee.getDescription() + " Cost: $" + myCoffee.getCost());

        // Add milk to the coffee
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " Cost: $" + myCoffee.getCost());

        // Add sugar to the coffee
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " Cost: $" + myCoffee.getCost());

        // Add whipped cream to the coffee
        myCoffee = new WhippedCreamDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " Cost: $" + myCoffee.getCost());
    }
}