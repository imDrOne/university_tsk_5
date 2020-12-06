package ru.miit;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;

public class App {
    private static void validateRollingStock(RollingStock rollingStock) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<RollingStock>> violations = validator.validate(rollingStock);

        for (ConstraintViolation<RollingStock> violation : violations) {
            System.out.println(violation.getMessage() + "\n");
            throw new Error("Test");
        }
    }

    public static void main(String[] args) {
        ArrayList<Wagon> wagonArrayList = new ArrayList<>();
        Wagon firstWagon = new Wagon(UUID.randomUUID(), 1, 4, 10, 20);
        Wagon secondWagon = new Wagon(UUID.randomUUID(), 2, 4, 25, 10);
        Wagon thirdWagon = new Wagon(UUID.randomUUID(), 3, 4, 71, 50);

        wagonArrayList.add(firstWagon);
        wagonArrayList.add(secondWagon);
        wagonArrayList.add(thirdWagon);

        RollingStock rollingStock = new RollingStock(2, wagonArrayList);

        try {
            validateRollingStock(rollingStock);
        } catch (Error e) {
            e.printStackTrace();
        }


        System.out.println(rollingStock.toString());
    }
}
