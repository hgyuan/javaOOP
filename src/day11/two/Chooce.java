package day11.two;

import java.util.ArrayList;
import java.util.List;

public class Chooce {
    public static void main(String[] args) {
        List<Transportation> list = new ArrayList<>();
        Transportation bus = new Bus();
        bus.setPrice(300.0);
        bus.setName("bus");
        list.add(bus);
        Transportation car = new Car();
        car.setPrice(500.0);
        car.setName("car");
        list.add(car);
        Transportation plane = new Plane();
        plane.setPrice(1000.0);
        plane.setName("plane");
        list.add(plane);
        Transportation train = new Train();
        train.setPrice(400.0);
        train.setName("train");
        list.add(train);

        for(Transportation t:list){
            if(t.getPrice()<=500){
                System.out.println("你可以乘坐" + t.getName());
            }
        }
    }
}
