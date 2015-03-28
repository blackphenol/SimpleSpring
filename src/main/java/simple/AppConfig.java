package simple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;

@Configuration
@ComponentScan("simple.practice")
public class AppConfig {

	@Bean
	public SyncTaskExecutor syncTaskExecutor(){
		SyncTaskExecutor executor = new SyncTaskExecutor();
		return executor;
	}
	
	@Bean
	public SimpleAsyncTaskExecutor simpleAsyncTaskExecutor(){
		SimpleAsyncTaskExecutor executor = new SimpleAsyncTaskExecutor();
		return executor;
	}
}
