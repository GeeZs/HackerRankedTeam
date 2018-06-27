package patterns.factory;

public class FoodFactory {
    public Food getFood(String order){
        if (order.equals(Cake.class.getSimpleName().toLowerCase())){
            return new Cake();
        }else {
            return new Pizza();
        }
    }
}
