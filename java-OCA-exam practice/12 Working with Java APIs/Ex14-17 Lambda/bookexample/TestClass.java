import java.util.ArrayList;
import java.util.List;

//BOOK EXAMPLE
public class TestClass {

    public static void main(String[] args){

/*
        //No  Lambda expression
		CarMall cm = new CarMall();
		CarFilter cf = new CompanyFilter("Honda");
		List<Car> carsByCompany = cm.showCars(cf);
		System.out.println(carsByCompany);
*/

		//Lambda Expression
		CarMall cm = new CarMall();
		List <Car> carsByCompany = cm.showCars( c -> c.company.equals("Honda"));
		System.out.println( carsByCompany);


/*
        //How compiler sees it
        CarMall cm = new CarMall();
        List <Car> carsByCompany = cm.showCars( new XYZ().showCar()); 
        System.out.println( carsByCompany);
*/
    }
}

class Car {

    String company;
    int year;
    double price;
    String type;

    Car( String c, int y, double p, String t){
        this.company = c;
        this.year = y;
        this.price = p;
        this.type = t;
    }

    public String toString(){ 
		return "(" + company +" "+ year +")"; 
	}
}

class CarMall {
    List<Car> cars = new ArrayList<>();

    CarMall() {
        cars.add(new Car("Honda", 2012, 9000.0, "HATCH"));
        cars.add(new Car("Honda", 2018, 17000.0, "SEDAN"));
        cars.add( new Car("Toyota", 2014, 19000.0, "SUV"));
        cars.add( new Car("Ford", 2014, 13000.0, "SPORTS"));
        cars.add( new Car("Nissan", 2017, 8000.0, "SUV"));
    }

    List<Car> showCars(CarFilter cf){
        ArrayList<Car> carsToShow = new ArrayList <>();
        for(Car c : cars){
            if(cf.showCar(c))
                carsToShow.add(c);
        }
        return carsToShow;
    }
}

interface CarFilter {
    boolean showCar(Car c);
}

//No  Lambda expression
/*
class CompanyFilter implements CarFilter{
    private String company;
    public CompanyFilter(String c){
        this.company = c;
    }
    public boolean showCar(Car c){
        return company.equals(c.company);
    }
}
*/
class XYZ implements CarFilter {
    public boolean showCar(Car c) {
        return c.company.equals(" Honda");
    }
}
