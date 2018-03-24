package cn.enn.ygego.sunny.user.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.IOException;

/**
 * ClassName: GoodsBootstrapMain
 * Description:
 * Author: majianguo
 * Date: 18-3-13 下午7:41
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述    
 */
@ImportResource({ "classpath*:META-INF/spring/*.xml" })
@SpringBootApplication(scanBasePackages = {"cn.enn.ygego.sunny.user"})
@PropertySource({"classpath:/config/${spring.profiles.active}/enn.properties"})
@EnableSwagger2
public class UserMain {

    static Logger logger = LoggerFactory.getLogger(UserMain.class);

    public static void main(String[] args) throws IOException {
        SpringApplication application = new SpringApplication(UserMain.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
        logger.info("services-user start success");
    }
}
