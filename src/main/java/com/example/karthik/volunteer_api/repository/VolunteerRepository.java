package com.example.karthik.volunteer_api.repository;

import com.example.karthik.volunteer_api.model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
    List<Volunteer> findBySection(String section);
}
