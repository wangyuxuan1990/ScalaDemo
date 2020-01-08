package com.wangyuxuan.scala.caseDemo

import scala.util.Random

/**
 * @author wangyuxuan
 * @date 2020/1/8 9:52
 * @description 匹配类型
 */
object CaseDemo02 extends App {
  // 定义一个数组
  val arr = Array("hello", 1, -2.0, CaseDemo02)
  // 随机获取数组中的元素
  val value = arr(Random.nextInt(arr.length))
  println(value)

  value match {
    case x: Int => println("Int=>" + x)
    case y: Double if (y >= 0) => println("Double=>" + y)
    case z: String => println("String=>" + z)
    case _ => throw new Exception("not match exception")
  }
}
