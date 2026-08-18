package com.scandia.net.rubicon.service;

import com.scandia.net.rubicon.DTO.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class StudentService {
    private final Map<Long, Student> students = new ConcurrentHashMap<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public Student createStudent(Student s) {
        Long id = idCounter.getAndIncrement();
        s.setId(id);
        students.put(id, s);
        return s;
    }

    public Optional<Student> updateStudent(Long id, Student s) {
        Student existing = students.get(id);
        if (existing == null) return Optional.empty();
        // update fields
        existing.setUserName(s.getUserName());
        existing.setFirstName(s.getFirstName());
        existing.setLastName(s.getLastName());
        existing.setAddress(s.getAddress());
        return Optional.of(existing);
    }

    public boolean deleteStudent(Long id) {
        return students.remove(id) != null;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Optional<Student> getStudentById(Long id) {
        return Optional.ofNullable(students.get(id));
    }
}
