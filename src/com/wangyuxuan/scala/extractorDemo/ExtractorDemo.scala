package com.wangyuxuan.scala.extractorDemo

/**
 * @author wangyuxuan
 * @date 2020/1/8 12:00
 * @description 提取器
 */
class Student {
  // 姓名
  var name: String = _
  // 年龄
  var age: Int = _

  // 实现一个辅助构造器
  def this(name: String, age: Int) = {
    this()
    this.name = name
    this.age = age
  }
}

object Student {
  def apply(name: String, age: Int): Student = new Student(name, age)

  // 实现一个解构器
  def unapply(arg: Student): Option[(String, Int)] = Some(arg.name, arg.age)
}

object ExtractorDemo {
  def main(args: Array[String]): Unit = {
    val zhangsan = Student("张三", 20)
    zhangsan match {
      case Student(name, age) => println(s"姓名: $name 年龄: $age")
      case _ => println("未匹配")
    }
  }
}
