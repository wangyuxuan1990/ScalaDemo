package com.wangyuxuan.scala.classDemo

import java.util.Date

/**
 * @author wangyuxuan
 * @date 2020/1/6 16:26
 * @description scala类
 */
class Customer {

  var name: String = _

  var sex: String = _

  val registerDate: Date = new Date

  def sayHi(msg: String) = {
    println(msg)
  }
}

object Main {

  def main(args: Array[String]): Unit = {
    val customer = new Customer
    // 给对象的成员变量赋值
    customer.name = "张三"
    customer.sex = "男"
    println(s"姓名:${customer.name}，性别:${customer.sex}，注册时间:${customer.registerDate}")
    // 对象调用方法
    customer.sayHi("你好！")
  }
}