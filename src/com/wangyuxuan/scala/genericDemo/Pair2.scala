package com.wangyuxuan.scala.genericDemo

/**
 * @author wangyuxuan
 * @date 2020/1/8 14:02
 * @description 上下界
 */
// 要控制Person只能和Person、Policeman聊天，但是不能和Superman聊天。此时，还需要给泛型添加一个下界。
// 上下界 S的上界是Person，下界是Policeman
class Pair2[T <: Person, S >: Policeman <: Person](val first: T, val second: S) {
  def chat(msg: String) = println(s"${first.name}对${second.name}说: $msg")
}

class Person(var name: String, val age: Int)

class Policeman(name: String, age: Int) extends Person(name, age)

class Superman(name: String) extends Policeman(name, -1)

object Pair2 {
  def main(args: Array[String]): Unit = {
    // 编译错误：第二个类型参数必须是Person的子类（包括本身）、Policeman的父类（包括本身）
    //    val p3 = new Pair2[Person, Superman](new Person("张三", 20), new Superman("李四"))
    //    p3.chat("你好啊!")
  }
}
