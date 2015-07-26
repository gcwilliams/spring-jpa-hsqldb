package uk.co.gcwilliams.cars.services;

import uk.co.gcwilliams.cars.model.Model;

import java.util.List;

/**
 * The car model service
 *
 * Created by GWilliams on 26/07/2015.
 */
public interface ModelService {

    /**
     * Gets the models
     *
     * @return the models
     */
    List<Model> getModels();

    /**
     * Adds a new model
     *
     * @param model the model
     */
    void addModel(String model);
}
