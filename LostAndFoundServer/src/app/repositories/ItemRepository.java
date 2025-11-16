package app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import app.entity.Item;

@Repository
public interface ItemRepository
	extends JpaRepository<Item, Long>
{
	 //public Item findById(Long id);
	 public List<Item> findAllByColor(String Color);
	 public List<Item> findAllByName(String Name);
	 public List<Item> findAllByDescription(String Description);
	 public List<Item> findAllByQuantity(int Quantity);
	 

}
