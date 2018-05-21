import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Song on 2017/2/15.
 * 官方示例工程中的测试代码
 */
//@Controller
//@EnableAutoConfiguration
@SpringBootApplication//@SpringBootApplication 开启了Spring的组件扫描和Spring Boot的自动配置功能。实际上， @SpringBootApplication 将三个有用的注解( @Configuration   @ComponentScan   @EnableAutoConfiguration)组合在了一起。
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Welcome to Spring Boot";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}