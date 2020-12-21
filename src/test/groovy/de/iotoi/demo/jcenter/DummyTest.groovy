package de.iotoi.demo.jcenter;

/**
 * Dummy test.
 *
 * @author Gudao Luo
 * @since 21.12.2020
 */
class DummyTest extends AbstractTest {

    def "Check something important"() {

        when: "do something"
        Integer checkAssignment = 1
        then: "check result"
        checkAssignment == 1
    }
}
