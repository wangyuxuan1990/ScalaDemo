package com.wangyuxuan.scala.caseDemo

/**
 * @author wangyuxuan
 * @date 2020/1/8 11:25
 * @description 偏函数
 */
object TestPartialFunction {
  // func1是一个输入参数为Int类型，返回值为String类型的偏函数
  val func1: PartialFunction[Int, String] = {
    case 1 => "一"
    case 2 => "二"
    case 3 => "三"
    case _ => "其他"
  }

  def main(args: Array[String]): Unit = {
    println(func1(1))

    val list = List(1, 2, 3, 4, 5)

    // 使用偏函数操作
    val result = list.filter {
      case x if x > 3 => true
      case _ => false
    }
    println(result)
  }
}
