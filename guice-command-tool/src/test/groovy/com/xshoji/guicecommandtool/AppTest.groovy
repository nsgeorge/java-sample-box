package com.xshoji.guicecommandtool

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Unit test for simple App.
 */
class AppTest extends Specification {
  @Unroll
  def "unit test sample"() {
    setup:
    def app = new App()

    expect:
    is_bool == result

    where:
    is_bool || result
    true    || true
    false   || false
  }

}
