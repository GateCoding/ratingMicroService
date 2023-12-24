package ma.emsi.service_rating.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int ratingOn;
    private int ratingOff;
    private Long category_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRatingOn() {
        return ratingOn;
    }

    public void setRatingOn(int ratingOn) {
        this.ratingOn = ratingOn;
    }

    public int getRatingOff() {
        return ratingOff;
    }

    public void setRatingOff(int ratingOff) {
        this.ratingOff = ratingOff;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }
}
