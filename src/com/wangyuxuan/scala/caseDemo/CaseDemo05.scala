package com.wangyuxuan.scala.caseDemo

/**
 * @author wangyuxuan
 * @date 2020/1/8 10:22
 * @description 匹配元组
 */
object CaseDemo05 extends App {
  val tuple = (1, 3, 5)
  tuple match {
    case (1, x, y) => println(s"1,$x,$y")
    case (2, x, y) => println(s"$x,$y")
    case _ => println("others...")
  }
}
