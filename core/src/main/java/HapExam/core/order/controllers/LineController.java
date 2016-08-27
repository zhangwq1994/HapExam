/*
 * #{copyright}#
 */

package HapExam.core.order.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import HapExam.core.order.dto.Company;
import HapExam.core.order.dto.Line;
import HapExam.core.order.service.ICompanyService;
//import hfs.ass.dto.BusinessNode;
//import hfs.ass.service.IBusinessNodeService;
import HapExam.core.order.service.ILineService;

import com.hand.hap.core.exception.BaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.attachment.dto.SysFile;
import com.hand.hap.attachment.service.ISysFileService;
import com.hand.hap.core.IRequest;

/**
 * 水果控制器.
 * 
 * @author taotao.xu@hand-china.com
 */
@Controller
public class LineController extends BaseController {

    @Autowired
    private ILineService lineService;
    
    
    
    /**
     * 任务分配查询.
     * 
     * @param fruit
     *            分配对象
     * @param page
     *            起始页
     * @param pagesize
     *            分页大小
     * @param request
     *            HttpServletRequest
     * @return ResponseData
     */
    @RequestMapping(value = "/ass/line/query")
    @ResponseBody
    public ResponseData getLines(Line line, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(lineService.selectByLine(requestContext, line, page, pagesize));
    }
    
    /**
     * 保存水果.
     * 
     * @param fruits
     *            fruits
     * @param result
     *            BindingResult
     * @param request
     *            HttpServletRequest
     * @return ResponseData ResponseData
     * @throws BaseException
     *             BaseException
     */
    @RequestMapping(value = "/ass/line/submit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData submitLine(@RequestBody List<Line> lines, BindingResult result, HttpServletRequest request)
            throws BaseException {
        getValidator().validate(lines, result);
        if (result.hasErrors()) {
            ResponseData rd = new ResponseData(false);
            rd.setMessage(getErrorMessage(result, request));
            return rd;
        }
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(lineService.batchUpdate(requestContext, lines));
    }
    
    

   /* @RequestMapping(value = "/ass/fruit/delete", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData delete(HttpServletRequest request, @RequestBody List<Fruit> fruits) {
        IRequest iRequest = createRequestContext(request);
        fruitService.batchDelete(fruits);
        return new ResponseData();
    }*/
    
}
