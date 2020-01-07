package com.wangyuxuan.scala.objecDemo

/**
 * @author wangyuxuan
 * @date 2020/1/6 17:43
 * @description 通过伴生对象的apply方法来快速地创建一个伴生类的对象。
 */
class Person(var name: String, var age: Int) {

  override def toString: String = s"Person($name, $age)"
}

object Person {

  // 实现apply方法
  // 返回的是伴生类的对象
  def apply(name: String, age: Int): Person = new Person(name, age)

  // apply方法支持重载
  def apply(name: String): Person = new Person(name, 20)

  def apply(age: Int): Person = new Person("某某某", age)

  def apply(): Person = new Person("某某某", 20)

}

object Main2 {
  def main(args: Array[String]): Unit = {
    val p1 = Person("张三", 20)
    val p2 = Person("李四")
    val p3 = Person(100)
    val p4 = Person()

    println(p1)
    println(p2)
    println(p3)
    println(p4)
  }
}
