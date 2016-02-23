package be.itflex.persistence.repository;

import be.itflex.persistence.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by abaddon on 2/23/16.
 */
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
