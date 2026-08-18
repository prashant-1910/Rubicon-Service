package com.scandia.net.rubicon.service;

import com.scandia.net.rubicon.DTO.Student;
import com.scandia.net.rubicon.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student s) {
        s.setId(null);
        return studentRepository.save(s);
    }

    public Optional<Student> updateStudent(Long id, Student s) {
        return studentRepository.findById(id).map(existing -> {
            existing.setUserName(s.getUserName());
            existing.setFirstName(s.getFirstName());
            existing.setLastName(s.getLastName());
            existing.setAddress(s.getAddress());
            return studentRepository.save(existing);
        });
    }

    public boolean deleteStudent(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }
}
