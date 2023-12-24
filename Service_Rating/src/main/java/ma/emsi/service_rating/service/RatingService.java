package ma.emsi.service_rating.service;


import ma.emsi.service_rating.beans.Rating;
import ma.emsi.service_rating.dao.RatingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingService {
    @Autowired
    RatingDao ratingDao;

    public RatingDao getRatingDao() {
        return ratingDao;
    }

    public void setRatingDao(RatingDao ratingDao) {
        this.ratingDao = ratingDao;
    }

    public List<Rating> findAll() {
        return ratingDao.findAll();
    }

    public Rating save(Rating rating) {
        return ratingDao.save(rating);
    }

    public Optional<Rating> findById(Long aLong) {
        return ratingDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        ratingDao.deleteById(aLong);
    }
}
