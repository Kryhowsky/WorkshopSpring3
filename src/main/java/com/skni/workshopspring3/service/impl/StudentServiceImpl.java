package com.skni.workshopspring3.service.impl;

import com.skni.workshopspring3.model.Course;
import com.skni.workshopspring3.model.CourseTypeEnum;
import com.skni.workshopspring3.model.GenderEnum;
import com.skni.workshopspring3.model.Student;
import com.skni.workshopspring3.repository.StudentRepository;
import com.skni.workshopspring3.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Student addStudent(String firstName, String lastName, LocalDate birthDate, GenderEnum gender, Course course) {
        return null;
    }

    @Override
    public List<Student> findAllByLastName(String lastName) {
        return null;
    }

    @Override
    public Student getStudentByGenderAndByCourseType(GenderEnum gender, CourseTypeEnum courseType) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public boolean deleteStudentById(Long id) {
        return false;
    }
}
