package b.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import b.Model.Discounts;

@Repository
public interface DiscountsRepository extends JpaRepository<Discounts, Long>{
	
}
