package in.sushmita.repo;

import in.sushmita.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddrRepo extends JpaRepository<Address,Integer> {
}
