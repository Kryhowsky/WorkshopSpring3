package com.skni.workshopspring3.service;

import com.skni.workshopspring3.model.Course;
import com.skni.workshopspring3.model.CourseTypeEnum;
import com.skni.workshopspring3.model.GenderEnum;
import com.skni.workshopspring3.model.Student;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {
    Student addStudent(String firstName, String lastName, LocalDate birthDate, GenderEnum gender, Course course);
    List<Student> findAllByLastName(String lastName);
    Student getStudentByGenderAndByCourseType(GenderEnum gender, CourseTypeEnum courseType);
    List<Student> getAllStudents();
    boolean deleteStudentById(Long id);

    List<Student> findByYearOfBirthAndGender(Integer yearOfBirth, GenderEnum gender);

}
