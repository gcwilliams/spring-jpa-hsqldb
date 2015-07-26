package uk.co.gcwilliams.cars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.co.gcwilliams.cars.model.Make;

/**
 * The make repository
 *
 * Created by GWilliams on 26/07/2015.
 */
public interface MakeRepository extends JpaRepository<Make, Long> {
}
