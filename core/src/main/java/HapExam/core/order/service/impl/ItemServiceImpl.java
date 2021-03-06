package HapExam.core.order.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import HapExam.core.order.dto.Item;
import HapExam.core.order.mapper.ItemMapper;
import HapExam.core.order.service.IItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
@Service
public class ItemServiceImpl extends BaseServiceImpl<Item> implements IItemService {

    @Autowired
    private ItemMapper itemMapper;

	@Override
	public List<Item> selectByItem(IRequest requestContext, Item item, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return itemMapper.selectByItem(item);
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
