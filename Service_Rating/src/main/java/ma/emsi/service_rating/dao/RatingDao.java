package ma.emsi.service_rating.dao;

import ma.emsi.service_rating.beans.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingDao extends JpaRepository<Rating,Long> {
}
