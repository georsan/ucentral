package com.edu.ucentral.repository;

import com.edu.ucentral.modelo.ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ticketrepository extends JpaRepository<ticket, Long> {




}

