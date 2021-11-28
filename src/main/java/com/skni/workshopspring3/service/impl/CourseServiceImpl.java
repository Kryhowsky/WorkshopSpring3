package com.skni.workshopspring3.service.impl;

import com.skni.workshopspring3.model.Course;
import com.skni.workshopspring3.model.CourseTypeEnum;
import com.skni.workshopspring3.repository.CourseRepository;
import com.skni.workshopspring3.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public Course addCourse(String title, Integer year, String university, CourseTypeEnum courseType) {
        return null;
    }
}
