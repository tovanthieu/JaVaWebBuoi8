package nhom6.buoi8.repository;

import nhom6.buoi8.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRoleId extends JpaRepository<UserRoleId, Integer> {
}