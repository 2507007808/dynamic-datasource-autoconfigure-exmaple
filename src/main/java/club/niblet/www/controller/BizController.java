package club.niblet.www.controller;

import club.niblet.www.model.Order;
import club.niblet.www.model.User;
import club.niblet.www.service.BizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 业务Controller
 * @author niblet
 */
@RestController
public class BizController {

    @Autowired
    private BizService bizService;

    @RequestMapping("/buy")
    public void buy() {
        User user = new User();
        user.setName("jack");
        user.setAge(20);
        user.setMobile("1303123016");
        bizService.addUser(user);
        double d = 1/0;
        Order order = new Order();
        order.setUserId(4);
        order.setQuantity(9);
        order.setOrderNo("NO900");
        bizService.addOrder(order);
    }

}
