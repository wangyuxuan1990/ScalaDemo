package com.wangyuxuan.scala.exceptionDemo

/**
 * @author wangyuxuan
 * @date 2020/1/8 11:37
 * @description 异常处理
 */
object TestException {
  def main(args: Array[String]): Unit = {
    try {
      val i = 10 / 0
      println("你好!")
    } catch {
      case ex: Exception => println(ex.getMessage)
    } finally {
      println("我始终都会执行!")
    }
  }
}
