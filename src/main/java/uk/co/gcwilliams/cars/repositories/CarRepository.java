package uk.co.gcwilliams.cars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.co.gcwilliams.cars.model.Car;

/**
 * The car repository
 *
 * Created by GWilliams on 26/07/2015.
 */
public interface CarRepository extends JpaRepository<Car, Long> {
}
