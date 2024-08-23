package ya.lms.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ya.lms.job.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
