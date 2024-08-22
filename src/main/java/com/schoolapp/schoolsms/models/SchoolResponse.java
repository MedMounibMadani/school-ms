package com.schoolapp.schoolsms.models;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SchoolResponse {
    private Integer SchoolId;
    private String SchoolName;
    private String SchoolType;
    private List<ClassRoom> classrooms;
}
