package sample;

import com.jayway.restassured.RestAssured;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.get;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.BeforeClass;


public class HelloWorldTest {

    @BeforeClass
    public static void setUp() {
        HelloWorld.main();
    }

    @Test
    public void testHello() throws Exception {
        RestAssured.port = 4567;
        String body = get("/hello").andReturn().body().asString();
        assertThat(body, is("Hello World!"));
    }
}