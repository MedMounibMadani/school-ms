package com.schoolapp.schoolsms.models;

import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClassRoom {
    private Integer classId;
    private String className;
    private Integer classCapacity;
    private Integer schoolId;
}
