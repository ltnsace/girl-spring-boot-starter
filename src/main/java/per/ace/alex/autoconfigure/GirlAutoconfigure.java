package per.ace.alex.autoconfigure;

import org.example.girl.GirlDemo;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: girl-spring-boot-starter
 * @description: GirlAutoconfigure
 * @author: ace
 * @Date: 2019-12-31 21:07
 **/
@Configuration
@EnableConfigurationProperties(GirlProperties.class)
public class GirlAutoconfigure {

    @Bean
    public GirlDemo getGirl(GirlProperties properties){
        GirlDemo g = new GirlDemo();
        g.setName(properties.getName());
        g.setLength(properties.getLength());
        g.setFace(properties.getFace());
        return g;
    }
}
