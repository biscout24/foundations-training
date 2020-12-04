package exercises.action

import java.time.Instant

import exercises.action.IOExercises._
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must.Matchers.{be, noException}
import org.scalatest.verbs.ShouldVerb
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

import scala.collection.mutable.ListBuffer

class IOExercisesTest extends AnyFunSuite with ScalaCheckDrivenPropertyChecks with ShouldVerb {

  import org.scalatest.words._
  import org.scalatest.matchers._

  /////////////////////////
  // 1. Smart constructors
  /////////////////////////

  ignore("succeed") {
    assert(IO.succeed(4).unsafeRun() == 4)

    forAll { (x: Int) =>
      assert(IO.succeed(x).unsafeRun() == x)
    }
  }

  test("fail") {
    // TODO
  }

  test("effect") {
    // TODO
    noException should be thrownBy (IO.effect(???))
  }

  /////////////////////
  // 2. IO API
  /////////////////////

  test("map") {
    // TODO
  }

  test("map") {
    // TODO
  }

  ////////////////////////
  // 4. Testing
  ////////////////////////

  ignore("read user from Console") {
    val now                     = Instant.now()
    val in: ListBuffer[String]  = ListBuffer("John", "24")
    val out: ListBuffer[String] = ListBuffer.empty[String]
    val console                 = testConsole(in, out)
    val clock                   = testClock(now)

    assert(userConsoleProgram2(console, clock).unsafeRun() == User("John", 24, now))
  }

  ////////////////////////
  // 5. Advanced API
  ////////////////////////

  test("deleteTwoOrders") {}

  test("deleteAllUserOrders") {}

}
