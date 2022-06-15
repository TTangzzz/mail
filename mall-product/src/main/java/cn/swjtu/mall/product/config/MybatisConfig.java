package cn.swjtu.mall.product.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement//开启事务
@MapperScan("cn.swjtu.mall.product.dao")
public class MybatisConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //设置请求的页面大于最大页后的操作，true调回首页，false继续请求，默认false
        paginationInterceptor.setOverflow(true);

        //设置最大页限制数量 默认500 ，-1不受限制
        paginationInterceptor.setLimit(1000);

        return paginationInterceptor;
    }
}
