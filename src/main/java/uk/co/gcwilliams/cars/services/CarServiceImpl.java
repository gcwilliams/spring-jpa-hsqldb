package uk.co.gcwilliams.cars.services;

import uk.co.gcwilliams.cars.model.Car;
import uk.co.gcwilliams.cars.repositories.CarRepository;
import uk.co.gcwilliams.cars.repositories.MakeRepository;
import uk.co.gcwilliams.cars.repositories.ModelRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * The car service implementation
 *
 * Created by GWilliams on 25/07/2015.
 */
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    private final MakeRepository makeRepository;

    private final ModelRepository modelRepository;

    /**
     * Default constructor
     *
     * @param carRepository the car repository
     * @param makeRepository the make repository
     * @param modelRepository the model repository
     */
    public CarServiceImpl(CarRepository carRepository, MakeRepository makeRepository, ModelRepository modelRepository) {
        this.carRepository = carRepository;
        this.makeRepository = makeRepository;
        this.modelRepository = modelRepository;
    }

    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @Override
    @Transactional
    public void addCar(String registration, long make, long model) {
        Car car = new Car();
        car.setRegistration(registration);
        car.setMake(makeRepository.findOne(make));
        car.setModel(modelRepository.findOne(model));
        carRepository.save(car);
    }
}
