package b.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import b.Model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{
	
}
