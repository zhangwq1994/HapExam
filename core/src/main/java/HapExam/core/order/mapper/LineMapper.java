package HapExam.core.order.mapper;

import com.hand.hap.mybatis.common.Mapper;

import HapExam.core.order.dto.Line;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
public interface LineMapper extends Mapper<Line> {

    List<Line> selectByLine(Line line);
    
   /* int insertFruit(Fruit fruit);
    
    int updateFruit(Fruit fruit);

    int deleteFruit(Fruit fruit);*/
}
