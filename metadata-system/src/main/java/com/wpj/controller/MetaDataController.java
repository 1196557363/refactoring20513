package com.wpj.controller;

import ch.qos.logback.core.joran.action.ParamAction;
import com.wpj.dao.IPrivilegeApplyDao;
import com.wpj.entity.PrivilegeApply;
import com.wpj.entity.TableInfo;
import com.wpj.result.ResultEntity;
import com.wpj.service.IMetaDataService;
import com.wpj.service.ITableInfoService;
import com.wpj.service.ITableRelationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Resource
    private ITableInfoService tableInfoService;

    @Resource
    private ITableRelationService tableRelationService;

    @GetMapping(value = "/table")
    @ResponseBody
    public ResultEntity<Object> getTable(@RequestParam(required = false) Integer from,
                                         @RequestParam(required = false) Integer to,
                                         @RequestParam(required = false) Integer currentPage,
                                         @RequestParam(required = false) Integer pageSize,
                                         @RequestParam String tableName,
                                         @RequestParam(required = false) String columnsName,
                                         @RequestParam(required = false) Integer sort,
                                         @RequestParam(required = false) Long userId){

        // TODO 初始化 currentPage & pageSize 参数为数字
        // TODO 初始化 from & to 参数为数字
        // TODO TableName [ enName=tableName, zhName=columnsName ]

        return ResultEntity.success(metaDataService.getTable(from, to, currentPage, pageSize, tableName, columnsName, sort, userId));
    }


    @GetMapping(value = "/table/{tableId}/columns")
    @ResponseBody
    public ResultEntity<Object> getTableColumns(@PathVariable String tableId){
        return ResultEntity.success(tableInfoService.getTableColumns(tableId));
    }

    @GetMapping(value = "/table/{tableId}/info")
    @ResponseBody
    public ResultEntity<Object> getTableInfo(@PathVariable String tableId){
        return ResultEntity.success(tableInfoService.getTableInfo(tableId));
    }


    @GetMapping(value = "/table/{tableId}/consanguinity")
    @ResponseBody
    public ResultEntity<Object> getTableConsanguinity(@PathVariable String tableId){
        return ResultEntity.success(tableRelationService.getTableConsanguinity(tableId));
    }

}
