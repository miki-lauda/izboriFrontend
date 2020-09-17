package security;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/glasac/dodajGlasaca").allowedOrigins("https://tender-ride-cfdf82.netlify.app").allowedMethods("POST");
	}
}
