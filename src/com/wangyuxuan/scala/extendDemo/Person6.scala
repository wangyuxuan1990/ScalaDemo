package com.wangyuxuan.scala.extendDemo

/**
 * @author wangyuxuan
 * @date 2020/1/7 9:05 下午
 * @description **private[this]修饰符**
 */
class Person6 {
  // 只有在当前对象中能够访问
  private[this] var name = "super"

  // 正确！
  def getName = this.name

  // 报错!无法访问
  def sayHelloTo(p: Person6) = {
    //    println("hello" + p.name)
  }
}

object Person6 {
  // 报错!无法访问
  def showName(p: Person6) = {
    //    println("hello" + p.name)
  }
}
