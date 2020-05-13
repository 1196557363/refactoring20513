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