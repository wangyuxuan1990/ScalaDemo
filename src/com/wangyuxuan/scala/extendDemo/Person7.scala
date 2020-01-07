package com.wangyuxuan.scala.extendDemo

/**
 * @author wangyuxuan
 * @date 2020/1/7 9:21 下午
 * @description **protected[this]修饰符**
 */
class Person7 {
  // 只有在当前类以及继承该类的当前对象中能够访问
  protected[this] var name = "super"

  // 正确！
  def getName = this.name

  def sayHelloTo1(p: Person7) = {
    // 编译错误！无法访问
    //    println("hello" + p.name)
  }
}

object Person7 {
  def sayHelloTo3(p: Person7) = {
    // 编译错误！无法访问
    //    println("hello" + p.name)
  }
}

class Student7 extends Person7 {
  // 正确！
  def showName = this.name

  def sayHelloTo2(p: Person7) = {
    // 编译错误！无法访问
    //    println("hello" + p.name)
  }
}
