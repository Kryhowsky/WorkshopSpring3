package com.skni.workshopspring3.service;

import com.skni.workshopspring3.model.Course;
import com.skni.workshopspring3.model.CourseTypeEnum;

public interface CourseService {
    Course addCourse(String title, Integer year, String university, CourseTypeEnum courseType);
}
