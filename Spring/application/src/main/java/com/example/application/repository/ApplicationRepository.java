package com.example.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.application.entity.Apply;

public interface ApplicationRepository extends JpaRepository<Apply, Integer> {

}
