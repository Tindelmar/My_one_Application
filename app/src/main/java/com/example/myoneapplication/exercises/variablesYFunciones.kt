package com.example.myoneapplication.exercises

fun main() {
    println("hola mundo")
    var num: Int = 23
    var num1: Long = 33333333
    var dec: Float = 2.2f
    var cara: Char = 'd'
    var palabra: String = "hola555"
    saludoNombre("marcelo")
    edad(87)
    var es:Boolean = ver(false)
    println(es)
}
fun ver(falver :Boolean =true) =  falver


fun edad(anios:Int =99){
    println(anios)
}

fun saludoNombre(nom: String) {
    println("mi nombre es $nom")
}