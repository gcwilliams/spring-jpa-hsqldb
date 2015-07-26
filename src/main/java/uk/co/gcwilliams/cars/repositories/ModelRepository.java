package uk.co.gcwilliams.cars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.co.gcwilliams.cars.model.Model;

/**
 * The model repository
 *
 * Created by GWilliams on 26/07/2015.
 */
public interface ModelRepository extends JpaRepository<Model, Long> {
}
