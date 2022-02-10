package com.example.myfirstapp

data class Student(var name : String, var course : Int = 1) {
    override fun toString(): String {
        return "Меня зовут $name и я учусь на $course${endingOfCourseNum(course)} курсе"
    }

    private fun endingOfCourseNum(num : Int) : String {
        if (num in 1..6) {
            if (num != 3) {
                return "-ом"
            }
            else if (num == 3) {
                return "-ем"
            }
        }
        throw Exception("Некорректные данные")
    }
}