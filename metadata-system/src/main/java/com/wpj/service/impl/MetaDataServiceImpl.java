package com.wpj.service.impl;

import com.wpj.dao.IMetaDataDao;
import com.wpj.service.IMetaDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author WuPeiJie
 * @version 1.0
 *     元数据服务实现类
**/
@Service
public class MetaDataServiceImpl implements IMetaDataService {

    @Resource
    private IMetaDataDao metaDataDao;

}
