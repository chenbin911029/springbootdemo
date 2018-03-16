package spring.boot.core.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chenbin at 2018/3/16 14:05
 */

public interface UserRepository extends JpaRepository<User,Long> {

}
