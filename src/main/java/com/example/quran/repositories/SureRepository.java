package com.example.quran.repositories;

import com.example.quran.entities.Sure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SureRepository extends JpaRepository<Sure, Integer> {
}
