package com.javaproject.LearningNavigator.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Exam{

    @Id
    private String examId;
    private String subjectName;
    private List<Student> students;
}
