import com.example.profile.model.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

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
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("程序启动成功");
    }
}
