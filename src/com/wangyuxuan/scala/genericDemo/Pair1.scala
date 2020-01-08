package com.wangyuxuan.scala.genericDemo

/**
 * @author wangyuxuan
 * @date 2020/1/8 13:55
 * @description 上下界
 */
class Pair1[T <: Person, S <: Person](val first: T, val second: S) {
  def chat(msg: String) = println(s"${first.name}对${second.name}说: $msg")
}

class Person(var name: String, val age: Int)

object Pair1 {
  def main(args: Array[String]): Unit = {
    val p3 = new Pair1[Person, Person](new Person("张三", 20), new Person("李四", 30))
    p3.chat("你好啊!")
  }
}
