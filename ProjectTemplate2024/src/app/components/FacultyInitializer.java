package app.components;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.entity.Faculty;
import app.repositories.FacultyRepository;


@Component
public class FacultyInitializer 
{
	@Autowired
	private FacultyRepository repo;
	
	
	@PostConstruct
	public void init()
	{
		if (repo.count()==0)
		{
			// happy
            Faculty f = makeFaculty("John");
            repo.save(f);

            f = makeFaculty("Alma");
            repo.save(f);
            
            f = makeFaculty("Victor");
            repo.save(f);
            
            

		}
	}
	
	private Faculty makeFaculty(String name)
	{
		Faculty f = new Faculty();
		f.setName(name);
		
		return f;
	}
}