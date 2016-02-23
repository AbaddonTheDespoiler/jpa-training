package be.itflex.service;

import be.itflex.service.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by abaddon on 2/23/16.
 */
public interface StudentService {

    List<StudentDto> getStudents();



}
