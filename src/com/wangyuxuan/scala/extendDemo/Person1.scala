package com.wangyuxuan.scala.extendDemo

/**
 * @author wangyuxuan
 * @date 2020/1/7 17:30
 * @description 实现简单继承
 */
class Person1 {
  var name = "super"

  def getName = this.name
}

class Student1 extends Person1

object Main1 {
  def main(args: Array[String]): Unit = {
    val person = new Person1()
    val student = new Student1()
    student.name = "张三"
    println(person.getName)
    println(student.getName)
  }
}
