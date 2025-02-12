package in.sushmita.repo;

import in.sushmita.entities.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Emp,Integer> {
}
