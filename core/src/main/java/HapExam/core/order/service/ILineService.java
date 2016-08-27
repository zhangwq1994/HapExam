package HapExam.core.order.service;


import com.hand.hap.system.service.IBaseService;

import HapExam.core.order.dto.Line;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;

import java.util.List;

import com.hand.hap.core.IRequest;


/**
 * Created by hailor on 16/6/2.
 */
public interface ILineService extends IBaseService<Line>, ProxySelf<ILineService> {

    List<Line> selectByLine(IRequest requestContext, Line line, int page, int pagesize);
    
/*    List<Fruit> batchUpdate(IRequest requestContext, @StdWho List<Fruit> fruits);
*/    
    
}
