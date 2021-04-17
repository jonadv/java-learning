
class Food {
    void eat() {System.out.println("eat food");}
    void eatFood(){System.out.println("eat FOOD");}
}

class Rice extends Food {
    void eat() {System.out.println("eat rice");}
    void eatRice() {System.out.println("eat RICE");}
}

public class JustTesting {
        
    void passFood(Food f){ //no ClassCastException for rice_rice as argument
        f.eat();
//        f = (Food) f; //doenst change the class type (!!! and no ClassCastException for rice_rice !!!)
//        System.out.println(f.toString());
    }
    void passRice(Rice f){
        f.eat();
    }
    public static void main(String args[]) {
        Food food_food = new Food();
        Rice rice_rice = new Rice();
        Food food_rice = new Rice();
//        Rice rice_food = new Food(); //food cant be converted to rice

        food_food.eat(); //prints eat food
        rice_rice.eat(); //prints eat rice
        food_rice.eat(); //prints eat rice

        //acces method only available in subclass Rice:
//        food_food.eatRice(); //not found
        rice_rice.eatRice(); //prints eat RICE
//        food_rice.eatRice(); //not found (! cause its type Food so methods of subclass are not available (except for the overridden methods))
        
        //acces method only available in superclass Food:
        food_food.eatFood(); //prints eat FOOD
        rice_rice.eatFood(); //prints eat FOOD
        food_rice.eatFood(); //prints eat FOOD
        
        //downcasting, food to rice attempt:
//        food_food = (Rice) food_food; //ClassCastException, class Food cannot be cast to class Rice
//        food_food.eat(); //no print cause of interruption
        
        //upcasting, rice to food attempt:
//        rice_rice = (Food) rice_rice; //!!! ClassCastException: class Food cannot be cast to class Rice !!! 
//        rice_rice.eat(); //no print cause of interruption      

        //upcasting, rice to food attempt:
        food_rice = (Food) food_rice;
        food_rice.eat(); //eat rice (! cause method is overridden)
//        food_rice.eatRice(); //method not accesible
        food_rice.eatFood(); //prints eat FOOD
        
        //downcasting again, food to rice attempt:
        food_rice = (Rice) food_rice; //fine, not even warning given that type check is needed.
        food_rice.eat(); //eat rice (! cause method is still overridden)
//        food_rice.eatRice(); //method not accesible (because of dynamic binding, food_type stays faithfull to its 'primary' type (type it was initialised to).
        food_rice.eatFood(); //prints eat FOOD
        
        //change reference to new object (--> no diff effect then with casting)
        food_rice = new Rice();
//        food_rice.eatRice(); //method not accesible (because of dynamic binding, food_type stays faithfull to its 'primary' type (type it was initialised to).
        food_rice.eat(); //prints eat rice

        System.out.println("");
        //casting by passing as argument
        new JustTesting().passFood(food_food); //print eat food - Food@c818063
        new JustTesting().passFood(food_rice); //print eat rice - Rice@3f0ee7cb
        new JustTesting().passFood(rice_rice); //!!! print eat rice - Rice@75bd9247 !!! rice_rice cast to Food !!! //no class cast exception
        
//        new JustTesting().passRice(food_food); //incompatible types: Food cannot be converted to Rice
//        new JustTesting().passRice(food_rice); //incompatible types: Food cannot be converted to Rice
        new JustTesting().passRice(rice_rice); //print eat rice 
    }    
}
