package lms_129

fun task1(a: Int, b: Int): Int {

    var result = 0
    for (i in a..b){
        result = i
        if (a >= b){
            result = 0
        }
    }
    return result
}
fun main (){
    println(task1(a = 1, b = 5))
}
