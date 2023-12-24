package ma.emsi.service_appreils.dao;

import ma.emsi.service_appreils.beans.Appareil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppareilRepository extends JpaRepository<Appareil,Long> {
}
