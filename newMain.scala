/*
 * test comment
 */

object newMain {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    println("Hello, world 2 "+exp(1,"+",(2,"*",3)))
  }

  def exp(a:Any):Int = {
    a match {
    case a:Int => a
    case (a,"+",b) => exp(a)+exp(b)
    case (a,"-",b) => exp(a)-exp(b)
    case (a,"*",b) => exp(a)*exp(b)
    case (a,"/",b) => exp(a)/exp(b)
    case _ => throw new Exception("error")
    }
  }

}
