package com.example.myfirstapp

data class Student(var name : String, var course : Int = 1) {
    override fun toString(): String {
        return "Меня зовут $name и я учусь на $course${endingOfCourseNum(course)} курсе"
    }
}

fun endingOfCourseNum(num : Int) : String { //он лежит здесь, потому что так в котлине реализована статика, лол
    if (num in 1..2 || num in 4..6) {
        return "-ом"
    }
    if (num == 3) {
        return "-ем"
    } else {
        throw Exception("Некорректные данные") // не дает выбросить эксепшн в начале, пока хз почему
    }
}