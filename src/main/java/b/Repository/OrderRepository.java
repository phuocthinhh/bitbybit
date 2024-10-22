package b.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import b.Model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
