package top.kylewang.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.kylewang.cloud.entity.User;

/**
 * @author Kyle.Wang
 * 2017/12/18 0018 15:44
 */
public interface UserRepository extends JpaRepository<User,Long> {

}
