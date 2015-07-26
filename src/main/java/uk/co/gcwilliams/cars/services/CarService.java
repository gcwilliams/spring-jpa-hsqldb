package uk.co.gcwilliams.cars.services;

import uk.co.gcwilliams.cars.model.Car;

import java.util.List;

/**
 * The car service
 *
 * Created by GWilliams on 25/07/2015.
 */
public interface CarService {

    /**
     * Gets all the cars in the database
     *
     * @return the cars
     */
    List<Car> getCars();

    /**
     * Saves a new car with the specified make and model
     *
     * @param registration the car registration
     * @param make the make
     * @param model the model
     */
    void addCar(String registration, long make, long model);
}
