package com.wangyuxuan.scala.extendDemo

/**
 * @author wangyuxuan
 * @date 2020/1/7 18:01
 * @description isInstanceOf和asInstanceOf
 */
class Person4

class Student4 extends Person4

object Main4 {
  def main(args: Array[String]): Unit = {
    val s1: Person4 = new Student4
    // 判断s1是否为Student4类型
    if (s1.isInstanceOf[Student4]) {
      // 将s1转换为Person4类型
      val s2 = s1.asInstanceOf[Student4]
      println(s2)
    }
  }
}
