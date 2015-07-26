package uk.co.gcwilliams.cars.services;

import uk.co.gcwilliams.cars.model.Make;
import uk.co.gcwilliams.cars.model.Model;
import uk.co.gcwilliams.cars.repositories.ModelRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * The model service implementation
 *
 * Created by GWilliams on 26/07/2015.
 */
public class ModelServiceImpl implements ModelService {

    private final ModelRepository modelRepository;

    /**
     * Default constructor
     *
     * @param modelRepository the model repository
     */
    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public List<Model> getModels() {
        return modelRepository.findAll();
    }

    @Override
    @Transactional
    public void addModel(String model) {
        Model carModel = new Model();
        carModel.setName(model);
        modelRepository.save(carModel);
    }
}
