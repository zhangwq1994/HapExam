package HapExam.core.order.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import HapExam.core.order.dto.Customer;
import HapExam.core.order.mapper.CompanyMapper;
import HapExam.core.order.mapper.CustomerMapper;
import HapExam.core.order.service.ICompanyService;
import HapExam.core.order.service.ICustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer> implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;

	@Override
	public List<Customer> selectByCustomer(IRequest requestContext, Customer customer, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return customerMapper.selectByCustomer(customer);
	}
	
	/*@Override
	@Transactional(propagation = Propagation.SUPPORTS)
    public List<Fruit> batchUpdate(IRequest requestContext, List<Fruit> fruits) {
        // TODO Auto-generated method stub
        for (Fruit fruit : fruits) {
            if (fruit.get__status() != null) {
                switch (fruit.get__status()) {
                case DTOStatus.ADD:
                	fruitMapper.insertFruit(fruit);
                    break;
                case DTOStatus.UPDATE:
                	fruitMapper.updateFruit(fruit);
                    break;
                case DTOStatus.DELETE:
                	fruitMapper.deleteFruit(fruit);
                    break;
                default:
                    break;
                }
            }
        }
        return fruits;
    }*/
}
