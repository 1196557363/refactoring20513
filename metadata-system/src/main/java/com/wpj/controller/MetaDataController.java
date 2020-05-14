package com.wpj.controller;

import com.wpj.service.IMetaDataService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author WuPeiJie
 * @version 1.0
 *     元数据控制器
**/
@Controller
public class MetaDataController {

    @Resource
    private IMetaDataService metaDataService;




}
