package club.niblet.www.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * 订单
 * @author niblet
 */
@Data
@Table(name = "t_order")
@Accessors(chain = true)
public class Order implements Serializable {

    private Long id;

    private String orderNo;

    private Integer quantity;

    private Integer userId;

}
