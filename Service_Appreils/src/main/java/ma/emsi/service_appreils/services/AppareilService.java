package ma.emsi.service_appreils.services;


import ma.emsi.service_appreils.beans.Appareil;
import ma.emsi.service_appreils.beans.Categorie;
import ma.emsi.service_appreils.dao.AppareilRepository;
import ma.emsi.service_appreils.dao.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppareilService {


    @Autowired
    private AppareilRepository appareilRepository;
    @Autowired
    private CategorieRepository categorieRepository;

    public Appareil save(Appareil appareil) {
        Optional<Categorie> categorie = categorieRepository.findById(appareil.getCategorie().getId());
        if (categorie.isEmpty()) {
            throw new RuntimeException("Category not found.");
        }
        appareil.setCategorie(categorie.get());
        return appareilRepository.save(appareil);
    }

    public Optional<Appareil> findById(Long id) {
        return appareilRepository.findById(id);
    }

    public void deleteById(Long id) {
        appareilRepository.deleteById(id);
    }

    public List<Appareil> findAll() {
        return appareilRepository.findAll();
    }

    public void update(Long id, Appareil appInfo) {
        Appareil appareil = appareilRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("app not found with id " + id));
        appareil.setState(appInfo.isState());
        appareilRepository.save(appareil);
    }

    public void updateAll(boolean state) {
        List<Appareil> appareilList = appareilRepository.findAll();
        appareilList.forEach(s -> s.setState(state));
        appareilRepository.saveAll(appareilList);
    }
}
