/*import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@Profile("cloud")
public class CloudDatabaseConfig extends AbstractCloudConfig {
	
	String hanaURL = "jdbc:sap://zeus.hana.prod.eu-central-1.whitney.dbaas.ondemand.com:31776/XBERSOY?encrypt=true&amp;validateCertificate=true";
	String hanaUserId = "XBERSOY";
	String hanaPass = "Burak123123123.!";
	
	@Bean
	public DataSource dataSource(@Value(hanaURL)final String url,
			@Value(hanaUserId)final String user,
			@Value(hanaPass)final String password) {
		
		
		return DataSourceBuilder.create()
				.type(HikariDataSource.class)
				.driverClassName(com.sap.db.jdbc.Driver.class.getName())
				.url(hanaURL)
				.username(hanaUserId)
				.password(hanaPass)
				.build();	

	}
}*/