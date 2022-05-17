import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Stack

object sumLists extends App {

  val first = List(7,1,6)
  val second = List(5,9,2)
  var string = ""

  def sumFunc(list1: List[Int], list2: List[Int]): Unit = {

    var string1 = ""
    var string2 = ""
    var sum = 0
    var newList = ListBuffer[Int]()
    var newStack = Stack[Int]()

    // Creates a string using each element in reverse order from list1
    for(x <- list1.reverse) {

      string1 = string1.concat(x.toString)

    }

    // Creates a string using each element in reverse order from list2
    for(x <- list2.reverse) {

      string2 = string2.concat(x.toString)

    }

    // Finds sum of both integers created from lists
    sum = string1.toInt + string2.toInt

    // Some conversions to make operations easier
    var stringer = sum.toString
    var stringerr = stringer.toInt


    // Using % 10 to add each digit from the sum to a stack
    while(stringerr > 0) {

      newStack.push(stringerr % 10)
      stringerr = stringerr / 10

    }

    // Pops each element off of the stack into a final list
    while(!newStack.isEmpty) {
      newList.append(newStack.pop())

    }

    println(newList)

  }

  sumFunc(first, second)

}
