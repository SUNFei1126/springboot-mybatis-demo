## springboot+mybatis
添加了自动生成pojo和dao mapping的工具 generator
Democontroller中有测试的例子
可以连接数据库进行查询  
在generator的配置文件中修改mysql-connector jar的文件位置 和要生成的表 再配置maven run 进行生成

在run/debug Configurations的配置中 添加maven Command line那里填写 mybatis-generator:generate -e 即可