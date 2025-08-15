package com.example.karthik.volunteer_api.controller;

import com.example.karthik.volunteer_api.model.Volunteer;
import com.example.karthik.volunteer_api.repository.VolunteerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/volunteers")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class VolunteerController {

    private final VolunteerRepository repository;

    public VolunteerController(VolunteerRepository repository) {
        this.repository = repository;
    }

    // Volunteer Registration (public)
    @PostMapping("/register")
    public Volunteer registerVolunteer(@RequestBody Volunteer volunteer) {
        return repository.save(volunteer);
    }

    // Total Volunteer Count (admin)
    @GetMapping("/count")
    public long getTotalVolunteers() {
        return repository.count();
    }

    // Get volunteers by section (e.g., Sports)
    @GetMapping("/section/{section}")
    public List<Volunteer> getVolunteersBySection(@PathVariable String section) {
        return repository.findBySection(section);
    }

    // Gender stats for a section
    @GetMapping("/section/{section}/gender-stats")
    public Map<String, Long> getSectionGenderStats(@PathVariable String section) {
        return repository.findBySection(section)
                .stream()
                .collect(Collectors.groupingBy(Volunteer::getGender, Collectors.counting()));
    }

    // Overall Gender Stats (all volunteers)
    @GetMapping("/gender-stats")
    public Map<String, Long> getOverallGenderStats() {
        return repository.findAll()
                .stream()
                .collect(Collectors.groupingBy(Volunteer::getGender, Collectors.counting()));
    }

    // Overall Summary: total volunteers + gender stats
    @GetMapping("/summary")
    public Map<String, Object> getOverallSummary() {
        List<Volunteer> all = repository.findAll();

        long total = all.size();
        Map<String, Long> genderStats = all.stream()
                .collect(Collectors.groupingBy(Volunteer::getGender, Collectors.counting()));

        Map<String, Object> summary = new HashMap<>();
        summary.put("totalVolunteers", total);
        summary.put("genderStats", genderStats);

        return summary;
    }

    // List all volunteers (admin)
    @GetMapping
    public List<Volunteer> getAllVolunteers() {
        return repository.findAll();
    }
}
