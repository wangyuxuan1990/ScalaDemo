package com.wangyuxuan.scala.extendDemo

/**
 * @author wangyuxuan
 * @date 2020/1/7 9:36 下午
 * @description 调用父类的constructor
 */
class Person8(var name: String) {
  println("name:" + name)
}

// 直接在子类的类名后面调用父类构造器
class Student8(name: String, var clazz: String) extends Person8(name)

object Main8 {
  def main(args: Array[String]): Unit = {
    val s1 = new Student8("张三", "三年二班")
    println(s"${s1.name} - ${s1.clazz}")
  }
}