package HapExam.core.order.mapper;

import com.hand.hap.mybatis.common.Mapper;

import HapExam.core.order.dto.Item;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
public interface ItemMapper extends Mapper<Item> {

    List<Item> selectByItem(Item item);
    
   /* int insertFruit(Fruit fruit);
    
    int updateFruit(Fruit fruit);

    int deleteFruit(Fruit fruit);*/
}
