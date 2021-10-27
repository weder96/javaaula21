package com.wsousa.demoRestAssured

import com.wsousa.demoSpock.DemoSpockApplication
import com.wsousa.demoSpock.controller.WebController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = DemoSpockApplication.class)
class LoadContextTest extends Specification {

    @Autowired(required = false)
    private WebController webController

    def "when context is loaded then all expected beans are created"() {
        expect: "the WebController is created"
        webController
    }
}