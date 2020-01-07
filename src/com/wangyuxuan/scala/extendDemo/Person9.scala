package com.wangyuxuan.scala.extendDemo

/**
 * @author wangyuxuan
 * @date 2020/1/7 9:48 下午
 * @description 抽象类
 */
abstract class Person9(var name: String) {
  // 抽象方法
  def sayHello: String

  def sayBye: String

  // 抽象字段
  val address: String
}

class Student9(name: String) extends Person9(name) {
  //重写抽象方法或字段，def前不必加override关键字
  def sayHello: String = "Hello," + name

  def sayBye: String = "Bye," + name

  //重写抽象字段
  val address: String = "beijing "
}

object Main9 {
  def main(args: Array[String]): Unit = {
    val s = new Student9("tom")
    println(s.sayHello)
    println(s.sayBye)
    println(s.address)
  }
}
