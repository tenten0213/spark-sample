package sample;

import com.jayway.restassured.RestAssured;
import org.junit.Test;
import org.junit.BeforeClass;
import static com.jayway.restassured.RestAssured.get;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class HelloWorldTest {

    @BeforeClass
    public static void setUp() {
        RestAssured.port = 4567;
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.init();
    }

    @Test
    public void testHello() throws Exception {
        String body = get("/hello").andReturn().body().asString();
        assertThat(body, is("Hello World!"));
    }
}