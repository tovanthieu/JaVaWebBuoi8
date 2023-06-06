package nhom6.buoi8.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer roleId;
    @Column
    private String name;
}
