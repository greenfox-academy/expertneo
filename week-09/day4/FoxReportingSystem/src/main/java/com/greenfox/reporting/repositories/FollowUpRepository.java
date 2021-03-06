package com.greenfox.reporting.repositories;

import com.greenfox.reporting.models.entities.FollowUp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowUpRepository extends CrudRepository<FollowUp, Integer> {
}
