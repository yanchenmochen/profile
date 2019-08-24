import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

/**
 * 启动类
 *
 * @Owner: SongQuanHeng
 * @Time: 2019/6/11-14:24
 * @Version:
 * @Change:
 */
@SpringBootApplication
@ComponentScan(value = {"com.example.profile"})
public class App extends SpringBootServletInitializer  {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("程序启动成功");
    }

    @Profile(value = {"war"})
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(App.class);
    }
}
