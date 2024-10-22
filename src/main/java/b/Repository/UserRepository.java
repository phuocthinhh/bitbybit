package b.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import b.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
