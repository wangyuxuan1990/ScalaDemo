package com.wangyuxuan.scala.genericDemo

/**
 * @author wangyuxuan
 * @date 2020/1/8 13:39
 * @description 泛型类
 */
// 类名后面的方括号，就表示这个类可以使用两个类型、分别是T和S
// 这个名字可以任意取
class Pair[T, S](val first: T, val second: S)

case class Person(var name: String, val age: Int)

object Pair {
  def main(args: Array[String]): Unit = {
    val p1 = new Pair[String, Int]("张三", 10)
    val p2 = new Pair[String, String]("张三", "1988-02-19")
    val p3 = new Pair[Person, Person](Person("张三", 20), Person("李四", 30))
  }
}
