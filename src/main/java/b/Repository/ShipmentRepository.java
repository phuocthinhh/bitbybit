package b.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import b.Model.Shipment;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long>{
	
}
