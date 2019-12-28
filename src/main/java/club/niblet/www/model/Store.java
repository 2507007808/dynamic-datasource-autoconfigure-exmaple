package club.niblet.www.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * 库存
 * @author niblet
 */
@Data
@Table(name = "t_store")
@Accessors(chain = true)
public class Store implements Serializable {

    private Long id;

    private String productId;

    private Integer quantity;

}
