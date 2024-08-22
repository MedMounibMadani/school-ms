package com.schoolapp.schoolsms.controller;

import com.schoolapp.schoolsms.models.School;
import com.schoolapp.schoolsms.models.SchoolResponse;
import com.schoolapp.schoolsms.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/schools")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @GetMapping
    public List<School> fetchAll(){
        return schoolService.getAll();
    }

    @PostMapping
    public School save(
            @RequestBody
            School school
    ){
        return schoolService.save(school);
    }

    @GetMapping("/details/{schoolId}")
    public SchoolResponse fetchSchoolWithClassRooms(
            @PathVariable("schoolId") Integer schoolId
    ){
        return schoolService.getSchoolWithClassRooms(schoolId);
    }

}
