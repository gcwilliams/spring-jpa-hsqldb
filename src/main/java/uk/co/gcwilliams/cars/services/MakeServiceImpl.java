package uk.co.gcwilliams.cars.services;

import uk.co.gcwilliams.cars.model.Make;
import uk.co.gcwilliams.cars.repositories.MakeRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * The make service implementation
 *
 * Created by GWilliams on 26/07/2015.
 */
public class MakeServiceImpl implements MakeService {

    private final MakeRepository makeRepository;

    /**
     * Default constructor
     *
     * @param makeRepository the make repository
     */
    public MakeServiceImpl(MakeRepository makeRepository) {
        this.makeRepository = makeRepository;
    }

    @Override
    public List<Make> getMakes() {
        return makeRepository.findAll();
    }

    @Override
    @Transactional
    public void addMake(String make) {
        Make carMake = new Make();
        carMake.setName(make);
        makeRepository.save(carMake);
    }
}
