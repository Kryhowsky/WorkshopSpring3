package com.skni.workshopspring3.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String title;

    @NonNull
    private Integer year;

    @NonNull
    private String university;

    @NonNull
    @Enumerated(EnumType.STRING)
    private CourseTypeEnum courseType;
}
