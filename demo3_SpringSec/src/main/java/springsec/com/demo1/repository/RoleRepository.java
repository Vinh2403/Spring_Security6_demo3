package springsec.com.demo1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import springsec.com.demo1.entity.Role;

public interface RoleRepository  extends JpaRepository<Role, Long>  {
	 @Query("SELECT u FROM Role u WHERE u.name = :name")
	 public Role getUserByName(@Param("name") String name);
	 Optional<Role> findByName(String name);
}