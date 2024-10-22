package b.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import b.Model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
