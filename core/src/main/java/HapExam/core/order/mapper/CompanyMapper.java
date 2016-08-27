package HapExam.core.order.mapper;

import com.hand.hap.mybatis.common.Mapper;

import HapExam.core.order.dto.Company;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
public interface CompanyMapper extends Mapper<Company> {

    List<Company> selectByCompany(Company company);
    
   /* int insertFruit(Fruit fruit);
    
    int updateFruit(Fruit fruit);

    int deleteFruit(Fruit fruit);*/
}
