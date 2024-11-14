package com.mwdb.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mwdb.dslist.entities.Belonging;
import com.mwdb.dslist.entities.pk.BelongingPK;

public interface BelongingRepository extends JpaRepository<Belonging, BelongingPK> {
}
