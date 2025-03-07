package in.sp.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
	List<Transaction> findByAccountId(Long accountId);

}
