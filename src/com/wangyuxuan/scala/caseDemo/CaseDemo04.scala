package com.wangyuxuan.scala.caseDemo

/**
 * @author wangyuxuan
 * @date 2020/1/8 10:16
 * @description 匹配集合
 */
object CaseDemo04 extends App {
  val list = List(0, 3, 6)
  list match {
    case 0 :: Nil => println("only 0")
    case 0 :: tail => println("0...")
    case x :: y :: z :: Nil => println(s"x:$x y:$y z:$z")
    case _ => println("something else")
  }
}
