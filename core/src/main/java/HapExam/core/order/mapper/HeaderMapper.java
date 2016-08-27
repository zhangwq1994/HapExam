package HapExam.core.order.mapper;

import com.hand.hap.mybatis.common.Mapper;

import HapExam.core.order.dto.Header;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
public interface HeaderMapper extends Mapper<Header> {

    List<Header> selectByHeader(Header header);
    
   /* int insertFruit(Fruit fruit);
    
    int updateFruit(Fruit fruit);

    int deleteFruit(Fruit fruit);*/
}
