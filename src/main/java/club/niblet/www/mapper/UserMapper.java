package club.niblet.www.mapper;

import club.niblet.www.model.User;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * 用户Mapper
 * @author niblet
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据姓名查询用户
     * @param name 姓名
     * @return 用户列表
     */
    List<User> findUserByName(String name);

}
