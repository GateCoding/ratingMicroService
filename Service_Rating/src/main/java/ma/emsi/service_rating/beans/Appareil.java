package ma.emsi.service_rating.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Appareil {

    private Long id;
    private String name;
    private String description;
    private boolean state;



    private String label;


    private String photo;


    private Categorie categorie;












}
