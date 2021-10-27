package com.wsousa.demoRestAssured


import spock.lang.*

/**
 * The expected order of interactions can now be specified by using multiple
 * then-blocks. Interactions in a later then-block must take place after
 * interactions in an earlier then-block. The order of interactions within
 * the same then-block is unspecified.
 *
 * @since 0.4
 */
class OrderedInteractionsSpec extends Specification {
    def "collaborators must be invoked in order"() {
        def coll1 = Mock(Collaborator)
        def coll2 = Mock(Collaborator)

        when:
        // try to reverse the order of these invocations and see what happens
        coll1.collaborate()
        coll2.collaborate()

        then:
        1 * coll1.collaborate()

        then:
        1 * coll2.collaborate()
    }
}

interface Collaborator {
    def collaborate()
}