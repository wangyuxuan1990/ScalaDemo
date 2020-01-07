package com.wangyuxuan.scala.extendDemo

/**
 * @author wangyuxuan
 * @date 2020/1/7 17:51
 * @description class继承class
 */
class Person3 {
  val name = "super"

  def getName = name
}

class Student3 extends Person3 {
  // 重写val字段
  override val name: String = "child"

  // 重写getName方法
  override def getName: String = "hello, " + super.getName
}

object Main3 {
  def main(args: Array[String]): Unit = {
    println(new Student3().getName)
  }
}
