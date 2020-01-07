package com.wangyuxuan.scala.extendDemo

/**
 * @author wangyuxuan
 * @date 2020/1/7 17:40
 * @description 单例对象实现继承
 */
class Person2 {
  var name = "super"

  def getName = this.name
}

object Student2 extends Person2

object Main2 {
  def main(args: Array[String]): Unit = {
    println(Student2.getName)
  }
}
