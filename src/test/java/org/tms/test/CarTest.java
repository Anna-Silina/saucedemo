package org.tms.test;

import lombok.extern.log4j.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.model.Car;
@Log4j
public class CarTest {
    @Test
    public  void compareCarTest(){
        Car car1 = new Car("bmv", "3");
        Car car2 = new Car("bmv", "3");
        Car car3 = new Car();
        car3.setBrand("bmw");
        car3.setModel("3");
        Car car4 =Car.builder()
                .brand("bmv")
                .model("3")
                .build();
        Assert.assertEquals(car1,car3);

    }

    }

