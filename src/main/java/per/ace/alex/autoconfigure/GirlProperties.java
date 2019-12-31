package per.ace.alex.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: girl-spring-boot-starter
 * @description:
 * @author: ace
 * @Date: 2019-12-31 20:58
 **/
@ConfigurationProperties(prefix="per.ace.girl")
public class GirlProperties {
    private String name;
    private String length;
    private String face;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

}
