package nhom6.buoi8.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Data
public class UserRoleId implements Serializable {
    @Column(name="user_id")
    private Integer user;

    @Column(name="role_id")
    private Integer role;
}
