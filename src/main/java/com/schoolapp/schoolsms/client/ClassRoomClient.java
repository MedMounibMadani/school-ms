package com.schoolapp.schoolsms.client;

import com.schoolapp.schoolsms.models.ClassRoom;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "classroom-service", url = "${application.config.classroom-ms-url}")
public interface ClassRoomClient {
    @GetMapping("/school/{schoolId}")
    List<ClassRoom> fetchAllBySchoolId(
            @PathVariable("schoolId") Integer schoolId
    );
}
