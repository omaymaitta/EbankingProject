package org.sid.ebankingbackend.repositories;

import org.sid.ebankingbackend.entities.SavingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingAccountRepository extends JpaRepository<SavingAccount, String> {

}
