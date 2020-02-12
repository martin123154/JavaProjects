package com.teatr;

import java.util.List;

import com.teatr.domain.*;

public interface PrzedstawienieDAO {

    Przedstawienie addPrzedstawienie(Przedstawienie przedstawienie);
    void deletePrzedstawienie(Przedstawienie przedstawienie);
    Przedstawienie updatePrzedstawienie(Przedstawienie przedstawienie);
    List<Przedstawienie> getAllPrzedstawienia();
    Przedstawienie getPrzedstawienieByID(Long id);
    List<Przedstawienie> getPrzedstawieniaByScenaID(Scena scena);


}
