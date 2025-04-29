package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> cars = List.of(
            new Car("green",2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );

    public static void main(String[] args) {
        System.out.println( filterGreenCar(cars));
    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars){
            if(car.getColor().equals("green")){
                greenCars.add(car);
            }
        }
        return greenCars;
    }

}
