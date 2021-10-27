package com.wsousa.demoRestAssured


import org.junit.Rule
import org.junit.rules.TestName
import spock.lang.Specification

class UsingJUnitRulesSpec extends Specification {
    @Rule TestName name

    def "retrieve test name at runtime"() {
        println "entering '$name.methodName'"
        expect: 1 + 1 == 2
        println "leaving '$name.methodName'"
    }
}