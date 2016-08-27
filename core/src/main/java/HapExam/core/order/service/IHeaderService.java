package HapExam.core.order.service;


import com.hand.hap.system.service.IBaseService;

import HapExam.core.order.dto.Header;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;

import java.util.List;

import com.hand.hap.core.IRequest;


/**
 * Created by hailor on 16/6/2.
 */
public interface IHeaderService extends IBaseService<Header>, ProxySelf<IHeaderService> {

    List<Header> selectByHeader(IRequest requestContext, Header header, int page, int pagesize);
    
/*    List<Fruit> batchUpdate(IRequest requestContext, @StdWho List<Fruit> fruits);
*/    
    
}
