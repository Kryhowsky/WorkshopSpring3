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
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Student addStudent(String firstName, String lastName, LocalDate birthDate, GenderEnum gender, Course course) {
        return studentRepository.save(new Student(firstName, lastName, birthDate, gender, course));
    }

    @Override
    public List<Student> findAllByLastName(String lastName) {
        return studentRepository.findAllByLastName(lastName);
    }

    @Override
    public Student getStudentByGenderAndByCourseType(GenderEnum gender, CourseTypeEnum courseType) {
        return studentRepository.findStudentByGenderAndCourse_CourseType(gender, courseType);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public boolean deleteStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);

        if (student.isEmpty()) {
            return false;
        }

        studentRepository.delete(student.get());
        return true;
    }
}
