package server.api.insurance.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.api.insurance.customer.dto.CustomerDto;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDto,Long> {
}
