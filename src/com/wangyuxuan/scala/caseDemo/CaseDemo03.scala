package com.wangyuxuan.scala.caseDemo

/**
 * @author wangyuxuan
 * @date 2020/1/8 10:11
 * @description 匹配数组
 */
object CaseDemo03 extends App {
  // 定义一个数组
  val arr = Array(1, 3, 5)
  arr match {
    case Array(1, x, y) => println(x + "---" + y)
    case Array(1, _*) => println("1...")
    case Array(0) => println("only 0")
    case _ => println("something else")
  }
}
