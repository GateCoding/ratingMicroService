package ma.emsi.service_appreils.dao;

import ma.emsi.service_appreils.beans.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
