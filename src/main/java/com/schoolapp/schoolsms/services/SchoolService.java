package com.schoolapp.schoolsms.services;

import com.schoolapp.schoolsms.client.ClassRoomClient;
import com.schoolapp.schoolsms.models.School;
import com.schoolapp.schoolsms.models.SchoolResponse;
import com.schoolapp.schoolsms.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;
    @Autowired
    private ClassRoomClient classRoomClient;
    public School save(School school){
        return schoolRepository.save(school);
    }
    public List<School> getAll(){
        return schoolRepository.findAll();
    }

    public SchoolResponse getSchoolWithClassRooms(Integer schoolId) {
        var school = schoolRepository.findById(schoolId)
                .orElse(
                        School.builder()
                                .SchoolName("Not found")
                                .SchoolType("Not found")
                                .build()
                );
        var classrooms = classRoomClient.fetchAllBySchoolId(schoolId);
        return SchoolResponse.builder()
                .SchoolId(schoolId)
                .SchoolName(school.getSchoolName())
                .SchoolType(school.getSchoolType())
                .classrooms(classrooms)
                .build();
    }
}
