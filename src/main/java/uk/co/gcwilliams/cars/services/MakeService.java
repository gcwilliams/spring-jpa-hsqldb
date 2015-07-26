package uk.co.gcwilliams.cars.services;

import uk.co.gcwilliams.cars.model.Make;

import java.util.List;

/**
 * The car make service
 *
 * Created by GWilliams on 26/07/2015.
 */
public interface MakeService {

    /**
     * Gets the models
     *
     * @return the models
     */
    List<Make> getMakes();

    /**
     * Adds a new make
     *
     * @param make the make
     */
    void addMake(String make);
}
