package com.teatr;

import java.util.List;

import com.teatr.domain.Scena;

public interface ScenaDAO {

		Scena addScena(Scena scena);
	    void deleteScena(Scena scena);
	    Scena updateScena(Scena scena);
	    List<Scena> getAllSceny();
	    Scena getScenaByID(Long id);
}
