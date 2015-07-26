package uk.co.gcwilliams.cars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * The car
 *
 * Created by GWilliams on 25/07/2015.
 */
@Entity
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String registration;

    @ManyToOne(optional = false)
    private Make make;

    @ManyToOne(optional = false)
    private Model model;

    /**
     * Gets the ID of the car
     *
     * @return the ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the car
     *
     * @param id the ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the registration
     *
     * @return the registration
     */
    public String getRegistration() {
        return registration;
    }

    /**
     * Sets the registration
     *
     * @param registration the registration
     */
    public void setRegistration(String registration) {
        this.registration = registration;
    }

    /**
     * Gets the make of the car
     *
     * @return the make
     */
    public Make getMake() {
        return make;
    }

    /**
     * Sets the make of the car
     *
     * @param make the make for the car
     */
    public void setMake(Make make) {
        this.make = make;
    }

    /**
     * Gets the model of the car
     *
     * @return the model
     */
    public Model getModel() {
        return model;
    }

    /**
     * Sets the model of the car
     *
     * @param model the model
     */
    public void setModel(Model model) {
        this.model = model;
    }
}
