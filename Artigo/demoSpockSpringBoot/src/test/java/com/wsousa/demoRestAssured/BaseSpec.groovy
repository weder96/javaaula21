package com.wsousa.demoRestAssured


import spock.lang.*

abstract class BaseSpec extends Specification {
    def x = { println 'base field initializer' }()

    def setupSpec() { println 'base setupSpec()' }
    def cleanupSpec() { println 'base cleanupSpec()' }

    def setup() { println 'base setup()' }
    def cleanup() { println 'base cleanup()' }

    def baseSpecMethod() { setup: println 'base spec method' }
}

class DerivedSpec extends BaseSpec {
    def y = { println 'derived field initializer' }()

    def setupSpec() { println 'derived setupSpec()' }
    def cleanupSpec() { println 'derived cleanupSpec()' }

    def setup() { println 'derived setup()' }
    def cleanup() { println 'derived cleanup()' }

    def derivedSpecMethod() { setup: println 'derived spec method' }
}