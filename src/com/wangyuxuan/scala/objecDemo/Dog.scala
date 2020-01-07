package com.wangyuxuan.scala.objecDemo

/**
 * @author wangyuxuan
 * @date 2020/1/6 17:20
 * @description scala伴生对象
 */
class Dog {

  val id = 1

  private var name = "scala"

  def printName() = {
    // 在Dog类中可以访问伴生对象Dog的私有属性
    println(Dog.CONSTANT + name)
  }
}

object Dog {

  // 伴生对象中的私有属性
  private val CONSTANT = "汪汪汪"

  def main(args: Array[String]): Unit = {
    val dog = new Dog
    // 访问私有的字段name
    dog.name = "123"
    dog.printName()
  }
}