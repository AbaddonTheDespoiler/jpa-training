package be.itflex.service;

import be.itflex.persistence.entity.StudentEntity;
import be.itflex.persistence.repository.StudentRepository;
import be.itflex.service.dto.StudentDto;
import org.dozer.Mapper;
import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by abaddon on 2/23/16.
 */
@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private Mapper mapper;


    public List<StudentDto> getStudents()  {
        Iterable<StudentEntity> allStudents = studentRepository.findAll();
        return StreamSupport.stream(allStudents.spliterator(), false)
                            .map(studentEntityStudentDtoFunction)
                            .collect(Collectors.toList());
    }

    Function<StudentEntity, StudentDto> studentEntityStudentDtoFunction =
            entity -> mapper.map(entity, StudentDto.class);
}
