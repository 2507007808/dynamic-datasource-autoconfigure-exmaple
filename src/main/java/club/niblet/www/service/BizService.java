package club.niblet.www.service;

import club.niblet.www.model.Order;
import club.niblet.www.model.Store;
import club.niblet.www.model.User;

import java.util.List;

/**
 * 业务接口类
 * @author niblet
 */
public interface BizService {

    /**
     * 新增用户
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 删除用户
     * @param id 用户id
     * @return
     */
    boolean deleteUser(Long id);

    /**
     * 根据姓名查询用户
     * @param name 姓名
     * @return 用户列表
     */
    List<User> findUserByName(String name);

    /**
     * 新增订单
     * @param order
     * @return
     */
    boolean addOrder(Order order);

    /**
     * 通过用户查询订单
     * @param userId 用户id
     * @return 订单列表
     */
    List<Order> findOrderById(Integer userId);

    /**
     * 增加库存
     * @param store
     * @return
     */
    boolean addStore(Store store);

}
