package HapExam.core.order.service;


import com.hand.hap.system.service.IBaseService;

import HapExam.core.order.dto.Company;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;

import java.util.List;

import com.hand.hap.core.IRequest;


/**
 * Created by hailor on 16/6/2.
 */
public interface ICompanyService extends IBaseService<Company>, ProxySelf<ICompanyService> {

    List<Company> selectByCompany(IRequest requestContext, Company company, int page, int pagesize);
    
/*    List<Fruit> batchUpdate(IRequest requestContext, @StdWho List<Fruit> fruits);
*/    
    
}
