package org.example.fizzbuzz_if

fun fizzBuzz(i: Int): String {
    return if (i % 15 == 0) {
        "FizzBuzz"
    } else if (i % 3 == 0) {
        "Fizz"
    } else if (i % 5 == 0) {
        "Buzz"
    } else {
        "$i"
    }
}


fun main(args: Array<String>) {
    val n = 20
    for (i in 1..n) {
        println(fizzBuzz(i))
    }
}
//fun fizzBuzz2(i: Int): String {
//    val result = if (i % 15 == 0) {
//        "Fizz"
//    } else if (i % 5 == 0) {
//        "Buzz"
//    } else {
//        "$i"
//    }
//    return result
//}
//
//fun fizzBuzz3(i: Int): String {
//    return if (i % 15 == 0) {
//        "Fizz"
//    } else if (i % 5 == 0) {
//        "Buzz"
//    } else {
//        "$i"
//    }
//}
//
//fun main(args: Array<String>) {
//    println(fizzBuzz1(15))
//    println(fizzBuzz1(5))
//    println(fizzBuzz1(3))
//    println(fizzBuzz1(1))
//}