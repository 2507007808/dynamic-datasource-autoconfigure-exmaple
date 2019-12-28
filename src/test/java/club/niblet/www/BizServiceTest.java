package club.niblet.www;

import club.niblet.www.model.Order;
import club.niblet.www.model.Store;
import club.niblet.www.model.User;
import club.niblet.www.service.BizService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BizServiceTest {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private BizService bizService;

    @Test
    public void addUser() {
        User user = new User();
        user.setName("tom");
        user.setAge(20);
        user.setMobile("1303123016");
        bizService.addUser(user);
    }

    @Test
    public void findUserByName() {
        String name = "韩晓宇";
        List<User> users = bizService.findUserByName(name);
        System.out.println(users);
    }

    @Test
    public void findOrderById() {
        Integer userId = 2;
        List<Order> orders = bizService.findOrderById(userId);
        System.out.println(orders);
    }

    @Test
    public void addOrder() {
        Order order = new Order();
        order.setUserId(4);
        order.setQuantity(9);
        order.setOrderNo("NO999");
        bizService.addOrder(order);
    }

    @Test
    public void addStore() {
        Store store = new Store();
        store.setProductId("10");
        store.setQuantity(100);
        bizService.addStore(store);
    }

}
