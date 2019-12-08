package tbi.practice.sbpracticetbi.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class HelloWorldApiTest {

    @Autowired
    private HelloWorldApi api;

    @Test
    public void apiAssert() {
        assertEquals(api.getHello(),"Hello World");
    }

}
