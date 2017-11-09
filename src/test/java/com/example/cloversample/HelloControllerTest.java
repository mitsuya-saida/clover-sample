package com.example.cloversample;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class HelloControllerTest {

    @Test
    public void testHelloNotNull() {
        HelloController helloController = new HelloController();
        HelloRequest request = new HelloRequest();
        request.setName("mitsuya");
        assertThat(helloController.hello(request), is("hello mitsuya"));
    }
}
