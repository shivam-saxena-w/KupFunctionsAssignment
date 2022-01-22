import org.scalatest.funsuite.AnyFunSuite

class FunctionTesting extends AnyFunSuite {
  // Creating object
  val functionObj = new FunctionImplementations()

  test("testing add function expansion"){
    assert(2 == functionObj.add(1, 1))
  }

  test("testing sumOfList function expansion"){
    val listInput = List(1,2,3)
    assert(6 == functionObj.sumOfList(listInput))
  }

  test("testing  function expansion"){
    val listInput = List(1,2,3)
    assert(25 == functionObj.higherOrderFunction(functionObj.squareIt, 5))
  }
}
