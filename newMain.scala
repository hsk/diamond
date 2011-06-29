/*
 * test comment
 */

object newMain {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    println(calc(1,"+",(2,"*",3)))
  }

  def calc(a:Any):Int = {
    a match {
    case a:Int => a
    case (a,"+",b) => calc(a)+calc(b)
    case (a,"-",b) => calc(a)-calc(b)
    case (a,"*",b) => calc(a)*calc(b)
    case (a,"/",b) => calc(a)/calc(b)
    case (a, b, c) => throw new Exception ("unknown operator '"+b+"'" )
    case a => throw new Exception("unexpected"+a)
    }
  }

}
