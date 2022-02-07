import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="MEMBER")
public class Member {
    @Id
    @Column(name="ID")
    private String id;

    @Column(name="NAME")
    private String userName;

    private int age;
}
