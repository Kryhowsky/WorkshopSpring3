package com.skni.workshopspring3.repository;

import com.skni.workshopspring3.model.CourseTypeEnum;
import com.skni.workshopspring3.model.GenderEnum;
import com.skni.workshopspring3.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllByLastName(String lastName);
    Student findStudentByGenderAndCourse_CourseType(GenderEnum gender, CourseTypeEnum courseType);
}
