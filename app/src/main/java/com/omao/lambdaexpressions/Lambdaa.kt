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
//    val add2 = fun(a: Int, b: Int): Int = a + b
//    println(add2(2, 3))

    // Types of Anonymous Functions
    // 1. With Parameters and Return Types
//    val multiply = fun(a: Int, b:Int): Int = a * b
//    println(multiply(3, 8))

    // 2. With Parameters and No Return Types
//    val divide = fun(a: Int, b: Int): Unit { println(a / b) } // notice that we where the println has been used. This is because we are expecting to get no return value. The Unit keyword is also optional
//    divide(8, 3)

    // 3. No Parameters but with return values
//    val name = fun(): String  { return "Joash"}
//    println(name())

    // 4. No Parameters and no return values
//    val msg = fun() { println("You like Joash") }
//    msg.invoke()

//    val add = {a: Int, b: Int -> a + b}
//    hof(add)
//    hof({a: Int, b: Int -> a + b})

    // Cases Where You Can Move The Lambda Out Parentheses
    // 1. When the lambda is the only argument
//    hof { a: Int, b: Int -> a + b }

    //2. When The Lambda is The Last Argument
//    hof2("Joash") { a: Int, b: Int -> a % b }

    // If a lambda expression has only parameter,
    // we can omit the parameter along with ->
    // we can access the parameter using "it" identifier - the "it" keyword is a keyword used to refer to the implicit single parameter of a lambda expression or anonymous function
//    hof3 {
//        println("Hi $it")
//    }

//    val numbers = listOf<Int>(1,2,3,4,5)
//    println( numbers.filter { numbers -> numbers > 3 })

    // Using "it"
//    println( numbers.filter { it > 3 })

//    reverseString("Hello") { it.reversed() }

    // Passing Anonymous Function as a Parameter to HOF
    val subtr = fun(a: Int, b:Int): Int {
        return  a - b
    }
    hof4(subtr)

    // Returning a value from an Anonymous Function inside a HOF
    println(hof5()())

    // Returning a Regular Function From a HOF
    println(hof6()())

    // Passing a Regular Function to HOF
    hof7(::messageFun) // :: - this is the reference operator

}


//fun hof(addition: (Int, Int) -> Int) {
//    var result = addition(4, 5)
//    println(result)
//}

//fun hof2(name: String, remainder: (Int, Int) -> Int) {
//    var result = remainder(10, 3)
//    println("Hello $name: $result")
//}

//fun hof3(name: (String) -> Unit) {
//    name("Joel")
//}

//fun reverseString(str: String, myLambda: (String) -> String) {
//    var result = myLambda(str)
//    println(result)
//}

fun hof4(subtract: (Int, Int) -> Int) {
    val result = subtract(29, 10)
    println(result)
}

fun hof5(): () -> String {  // when you have no parameters include the function method
    val msg = fun() :String {  // here
        return "Higher Order Function With No Parameters (hof5)"
    }
    return msg
}

fun hof6(): () -> String {
    return ::messageFun
}

// Regular Function
fun messageFun(): String {
    return "This message comes from a Regular function"
}

fun hof7(regularFun: () -> String) {
    println(regularFun())
}