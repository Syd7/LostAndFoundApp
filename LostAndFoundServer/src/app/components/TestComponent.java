package app.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Location;
import app.repositories.LocationRepository;

@Component
public class TestComponent {
	@Autowired
	private LocationRepository locRepo;
	
	@PostConstruct
	public void init() {
		if (locRepo.count()==0) {
			Location loc = makeLocation("Bellarmine");
			locRepo.save(loc);
		}
			
	}



private Location makeLocation(String name)
{
	Location x = new Location();
	x.setName(name);;
	
	return x;
}
}