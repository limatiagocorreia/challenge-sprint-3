package br.com.fiap.challengesprint3.repository;

import br.com.fiap.challengesprint3.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> { }
