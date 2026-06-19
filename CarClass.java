class CarClass {
        String model;
        int year;
        String color;
        }
    
class Main {
    public static void main(String[] args){
        CarClass car1= new CarClass();
        car1.model= "Toyota";
        car1.year = 2019;
        car1.color = "Silver";

        CarClass car2= new CarClass();
        car2.model= "Honda";
        car2.year = 2016;
        car2.color = "White";

        CarClass car3= new CarClass();
        car3.model= "Mercedes";
        car3.year = 2035;
        car3.color = "Black";

        CarClass car4= new CarClass();
        car4.model= "BMW";
        car4.year = 2034;
        car4.color = "Black";

        

        System.out.println("Car 1: Model: " + car1.model + ", Year: " + car1.year + ", Color: " + car1.color);
        System.out.println("Car 2: Model: " + car2.model + ", Year: " + car2.year + ", Color: " + car2.color);
        System.out.println("Car 3: Model: " + car3.model + ", Year: " + car3.year + ", Color: " + car3.color);
        System.out.println("Car 4: Model: " + car4.model + ", Year: " + car4.year + ", Color: " + car4.color);
    }
}
