package app.components;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.entity.Location;
import app.repositories.LocationRepository;


@Component
public class LocationInitializer 
{
	@Autowired
	private LocationRepository repo;
	
	
	@PostConstruct
	public void init()
	{
		if (repo.count()==0)
		{
			// happy
            Location l = makeLocation("Faura");
            repo.save(l);

            l = makeLocation("Leong Hall");
            repo.save(l);
            
            l = makeLocation("Berchmans Hall");
            repo.save(l);
            
            l = makeLocation("Kostka Hall");
            repo.save(l);
            
            l = makeLocation("Gonzaga");
            repo.save(l);
            
            l = makeLocation("JSEC");
            repo.save(l);

            

		}
	}
	
	private Location makeLocation(String name)
	{
		Location l = new Location();
		l.setName(name);
		
		return l;
	}
}