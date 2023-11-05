package server.app.insurance.conduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.app.insurance.conduct.entity.ContractManagementPolicy;

@Repository
public interface ContractManagementPolicyRepository extends JpaRepository<ContractManagementPolicy,Integer> {
}