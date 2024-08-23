package ya.lms.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ya.lms.job.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
