package org.sid.ebankingbackend.repositories;

import org.sid.ebankingbackend.entities.CurrentAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrentAccountRepository extends JpaRepository<CurrentAccount, String> {

}
