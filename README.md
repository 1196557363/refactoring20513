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