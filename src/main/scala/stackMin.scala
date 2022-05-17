import scala.collection.mutable.Stack

object stackMin extends App {

  var stack = Stack[Int](6,2,3)

  def findMin(stack: Stack[Int]): Int = {

    return stack.min

  }

  def pushStack(): Unit = {

    var pushed = 0

    do {

      println("Enter a number to add to the stack")
      pushed = scala.io.StdIn.readInt()


      if(pushed != 0) {
        stack.push(pushed)
      }

    } while(pushed > 0)


  }

  pushStack()

  println(findMin(stack))

}
