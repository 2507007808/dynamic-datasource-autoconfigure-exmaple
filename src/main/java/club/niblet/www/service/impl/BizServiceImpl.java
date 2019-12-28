package club.niblet.www.service.impl;

import club.niblet.www.annotation.DataSource;
import club.niblet.www.mapper.OrderMapper;
import club.niblet.www.mapper.StoreMapper;
import club.niblet.www.mapper.UserMapper;
import club.niblet.www.model.Order;
import club.niblet.www.model.Store;
import club.niblet.www.model.User;
import club.niblet.www.service.BizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务服务实现类
 * @author niblet
 */
@Service
@Transactional(rollbackFor = Exception.class, timeout = 36000)
public class BizServiceImpl implements BizService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public boolean addUser(User user) {
        return userMapper.insert(user) > 0 ? true : false;
    }

    @Override
    public boolean deleteUser(Long id) {
        return userMapper.deleteByPrimaryKey(id) > 0 ? true : false;
    }

    @Override
    public List<User> findUserByName(String name) {
        return userMapper.findUserByName(name);
    }

    @Override
    @DataSource("order")
    public boolean addOrder(Order order) {
        return orderMapper.insert(order) > 0 ? true : false;
    }

    @Override
    @DataSource("order")
    public List<Order> findOrderById(Integer userId) {
        return orderMapper.findOrderById(userId);
    }

    @Override
    @DataSource("store")
    public boolean addStore(Store store) {
        return storeMapper.insert(store) > 0 ? true : false;
    }

}
