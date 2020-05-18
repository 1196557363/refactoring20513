# refactoring20513
    单机部署代码 2020-5-13
    
# 2020-5-13 单机部署 user-access 
1. 枚举
2. 实体类
3. yml配置
4. 启动类

# 2020-5-13 单机部署 user-admin-organization
1. 获取组织列表
2. 添加组织 : 不知道是传一个对象 还是传多个参数 暂设为对象
3. 删除组织 : 删除操作需要实现事务。 Controller需要验证传过来的id 和 设置状态 ctx.status = 204;

# 2020-5-13 单机部署 user-access-register
1. 对于根据邮件查到用户之后的情况暂且不明
2. 对于基础服务的createMetaBaseUser方法不是很清楚
3. 当前版本的user表中的字段 organization 应该为 organizationId
4. 有些操作需要事务

# 2020-5-13 单机部署 user-admin-account
1. 获取用户列表

# 2020-5-13 单机部署 user-admin-deleteUser
1. 删除用户 : 需要检验参数 和 设置状态 serviceImpl中需要开启事务 删除用户的同时禁用metebase用户

# 2020-5-13 单机部署 user-admin-user
1. 修改用户信息


# 2020-5-13 单机部署 table
1. 控制器
2. Dao
3. 实体类
4. 服务接口和实现类
5. 启动类
6. yml配置

# 2020-5-18 单机部署 table
1. 获取元数据表格列表 TODO 部分功能不明确
2. 获取列详情
3. 获取表详情

# 2020-5-14 privilegeApply 权限管理
1. 新增申请记录  TODO 校验数据，设置状态204，查询tableId和columns的包含关系和需开启事务
2. 查看申请列表  
3. 查看列表详情  TODO 检查是否是本人或者管理员
4. 更改申请 [撤销, 重申] 
5. 扩展申请列表 [管理员和用户公用一个方法 条件不同]  
6. 扩展更改申请 [撤回和重申公用一个方法]
7. 管理员审核申请 
8. 我的权限

# 2020-5-15 单机部署 user-admin-access-merge-plus 
1. 创建元数据库的用户的伪代码