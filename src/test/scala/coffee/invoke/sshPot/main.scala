package coffee.invoke.sshPot

import org.scalatest._
import coffee.invoke.sshPot._
import org.scalatest.Assertions.assert

class MainSpec extends UnitSpec {

  "hello" should "return hello world" in {
    val sut = new coffee.invoke.sshPot.Hello
    assert(sut.hello() === "Hello, World!")

  }

}

