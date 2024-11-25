package com.dicoding.exam.exam1

// TODO 1
fun isEvenNumber(number: Int): Boolean {


    val isEven = number % 2 == 0

    return isEven




//
//    return false

}







// TODO 2
fun moreThanFive(number: Int): Boolean {

    if (number > 5) {
        println("Angka $number lebih besar dari 5")
        return true
    } else {
        println("Angka $number tidak lebih besar dari 5")
        return false
    }

}

// TODO 3
fun result(number: Int): Int {


    val result = number * (number + 10)
    println(result)

    return 0
}