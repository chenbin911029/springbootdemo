package spring.boot.core.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Spring Boot MessageConfiguration 测试 -
 * {@link MessageConfiguration}
 * @author chenbin at 2018/3/16 15:08
 */
public class MessageConfigurationTest {
    @Test
    public void testGetMessageBean() throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MessageConfigurationTest.class);
        assertEquals("message configuration",ctx.getBean("message"));
    }

    @Test
    public void testScanPackages() throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("spring.boot.core");
        ctx.refresh();
        assertEquals("message configuration",ctx.getBean("message"));
    }
}
