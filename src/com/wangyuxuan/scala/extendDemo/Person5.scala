package com.wangyuxuan.scala.extendDemo

/**
 * @author wangyuxuan
 * @date 2020/1/7 8:51 下午
 * @description getClass和classOf
 */
class Person5

class Student5 extends Person5

object Main5 {
  def main(args: Array[String]): Unit = {
    val p: Person5 = new Student5
    // 判断p是否为Person5类的实例 true
    println(p.isInstanceOf[Person5])
    // 判断p的类型是否为Person5类 false
    println(p.getClass == classOf[Person5])
    // 判断p的类型是否为Student5类 true
    println(p.getClass == classOf[Student5])
  }
}