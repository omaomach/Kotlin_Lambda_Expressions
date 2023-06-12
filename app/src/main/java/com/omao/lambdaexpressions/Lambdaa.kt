package com.omao.lambdaexpressions

fun main() {

    // val lambda: (DataType1, DataType2) -> ReturnType = { variable1: DataType1, variable2: DataType2 -> methodBody }

    // 1. with parameters and with return type
//    val add1 : (Int, Int) -> Int = {a: Int, b: Int -> a + b}
//    println(add1(10,30))

    // 2. with parameters and no return value
//    val add2: (Int, Int) -> Unit = {a, b -> println(a+b) }  // the Unit keyword also means void i.e no return type
//    add2(14, 10)

    // 3. no parameters but with return value
//    val add3: () -> String = {"Joash is awesome"}
//    println(add3())

    // 4. no parameters and no return types
//    val add4: () -> Unit = { println("Marion loves Joash Omao") }
//    add4.invoke()

    // we don't always have to use a variable, we can directly use lambda expressions
//    println({a: Int, b: Int -> a * b}(4,5))

    ////Anonymous Functions - this refers to a function without a name
    // val variableName: (DataType1, DataType2) ->ReturnType = fun(parameter1, parameter2): ReturnType { methodBody }
//    val add: (Int, Int) -> Int = fun(a, b): Int { return a + b }

    // Shorter Syntax of an Anonymous function
    //// val variableName = fun(DataType1, DataType2): Return { methodBody }
//    val add = fun(a: Int, b: Int): Int { return a + b }
//    println(add(2, 3))
    // - If the method body has only one statement, we can omit the return keyword and the braces i.e:
    val add2 = fun(a: Int, b: Int): Int = a + b
    println(add2(2, 3))

}