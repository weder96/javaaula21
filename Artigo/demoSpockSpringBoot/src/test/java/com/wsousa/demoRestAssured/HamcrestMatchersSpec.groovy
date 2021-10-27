package com.wsousa.demoRestAssured


import spock.lang.Specification

import static spock.util.matcher.HamcrestMatchers.closeTo

/**
 * Hamcrest matchers are deeply integrated with Spock's condition mechanism.
 * The syntax for using a matcher in a condition is simple:
 * {@code <expected-value> <matcher>}. If the condition fails, both the usual
 * condition output and the matcher's output will be shown.
 *
 * @author Peter Niederwiser
 * @since 0.5
 */
class HamcrestMatchersSpec extends Specification {
    def "comparing two decimal numbers"() {
        def myPi = 3.14

        expect:
        myPi closeTo(Math.PI, 0.01)
    }
}