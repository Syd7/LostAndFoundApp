package app.components;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class LostItemsComponent {

	// additional ways of schduling
	// https://spring.io/guides/gs/scheduling-tasks
	
	@Scheduled(fixedRate = 1000)
	public void periodicTask()
	{
		System.out.println("Test");
	}
	
}
