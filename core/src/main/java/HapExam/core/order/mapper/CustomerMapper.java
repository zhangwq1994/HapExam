package HapExam.core.order.mapper;

import com.hand.hap.mybatis.common.Mapper;

import HapExam.core.order.dto.Customer;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
public interface CustomerMapper extends Mapper<Customer> {

    List<Customer> selectByCustomer(Customer customer);
    
   /* int insertFruit(Fruit fruit);
    
    int updateFruit(Fruit fruit);

    int deleteFruit(Fruit fruit);*/
}
