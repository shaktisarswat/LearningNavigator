package com.javaproject.LearningNavigator.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private Integer studentId;
    private String studentName;
    private List<Subject> subjectList;
    private List<Exam> examList;

}
