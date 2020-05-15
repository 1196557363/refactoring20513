package com.wpj.controller;

import ch.qos.logback.core.joran.action.ParamAction;
import com.wpj.dao.IPrivilegeApplyDao;
import com.wpj.entity.TableInfo;
import com.wpj.result.ResultEntity;
import com.wpj.service.IMetaDataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WuPeiJie
 * @version 1.0
 *     元数据控制器
**/
@Controller
public class MetaDataController {

    @Resource
    private IMetaDataService metaDataService;

    @GetMapping(value = "/table")
    @ResponseBody
    public ResultEntity<Object> getTable(@RequestParam(required = false) Integer from,
                                         @RequestParam(required = false) Integer to,
                                         @RequestParam(required = false) Integer currentPage,
                                         @RequestParam(required = false) Integer pageSize,
                                         @RequestParam String tableName,
                                         @RequestParam String columnsName,
                                         @RequestParam Integer sort,
                                         @RequestParam Long userId){

        // TODO 初始化 currentPage & pageSize 参数为数字
        // TODO 初始化 from & to 参数为数字
        // TODO TableName [ enName=tableName, zhName=columnsName ]

        return ResultEntity.success(metaDataService.getTable(from, to, currentPage, pageSize, tableName, columnsName, sort, userId));
    }


}
