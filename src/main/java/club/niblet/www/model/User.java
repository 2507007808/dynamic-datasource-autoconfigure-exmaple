package club.niblet.www.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * 用户
 * @author niblet
 */
@Data
@Table(name = "t_user")
@Accessors(chain = true)
public class User implements Serializable {

    private Long id;

    private String name;

    private String mobile;

    private Integer age;

}
