package app.components;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Location;
import app.repositories.LocationRepository;

@Component
public class LostAndFoundComponent {

	@Autowired
	private LocationRepository locrepo;
	
	public Location findLocationById(Long id) {
		Location location = locrepo.findById(id).orElse(null);
		return location;
	}
	
	
	
}