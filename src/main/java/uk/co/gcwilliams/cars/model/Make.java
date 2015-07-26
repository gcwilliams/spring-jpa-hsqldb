package uk.co.gcwilliams.cars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * The car make
 *
 * Created by GWilliams on 26/07/2015.
 */
@Entity
public class Make {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    /**
     * Gets the ID
     *
     * @return the ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID
     *
     * @param id the ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the name
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
}
