package com.wangyuxuan.scala.caseDemo

/**
 * @author wangyuxuan
 * @date 2020/1/8 11:13
 * @description Option类型
 */
object TestOption {
  def main(args: Array[String]): Unit = {
    val map = Map("a" -> 1, "b" -> 2)
    val value: Option[Int] = map.get("b")
    val v1 = value match {
      case Some(i) => i
      case None => 0
    }
    println(v1)
    // 更好的方式
    val v2 = map.getOrElse("c", 0)
    println(v2)
  }
}
