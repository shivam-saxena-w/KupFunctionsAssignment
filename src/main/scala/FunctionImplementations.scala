class FunctionImplementations {

   // val add: (Int, Int) => Int = (x: Int, y: Int) => x + y
   val add: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
      override def apply(valueOne: Int, valueTwo: Int): Int = valueOne + valueTwo
   }

   // val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
   val sumOfList: Function1[List[Int], Int] = new Function[List[Int], Int] {
      override def apply(listInput: List[Int]): Int = listInput.sum
   }

   // val higherOrderFunction: (Int => Int, Int) => Int = (f: (Int => Int), num : Int) => f(num)
   val higherOrderFunction: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int] {
      override def apply(functionInput: Int => Int, argument: Int): Int = functionInput(argument)
   }

   // A function to pass in higerOrderFunction at the time of testing
   def squareIt(inputValue: Int) : Int = inputValue * inputValue
}