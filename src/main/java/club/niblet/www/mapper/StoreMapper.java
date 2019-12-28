package club.niblet.www.mapper;

import club.niblet.www.model.Store;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * 库存Mapper
 * @author niblet
 */
@Mapper
public interface StoreMapper extends BaseMapper<Store> {

}
