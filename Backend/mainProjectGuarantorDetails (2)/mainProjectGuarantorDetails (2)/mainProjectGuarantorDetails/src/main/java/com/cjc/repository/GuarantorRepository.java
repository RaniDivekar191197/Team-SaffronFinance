package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.GuarantorDetails;

@Repository
public interface GuarantorRepository extends JpaRepository<GuarantorDetails, Integer>
{

}
