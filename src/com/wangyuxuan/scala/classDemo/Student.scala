package com.wangyuxuan.scala.classDemo

/**
 * @author wangyuxuan
 * @date 2020/1/6 16:44
 * @description 构造器
 */
class Student(val name: String, val age: Int) {

  val address: String = "beijing"

  // 定义一个参数的辅助构造器
  def this(name: String) {
    // 第一行必须调用主构造器、其他辅助构造器或者super父类的构造器
    this(name, 20)
  }

  def this(age: Int) {
    this("某某某", age)
  }
}
