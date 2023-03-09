package lms_129

fun task1(a: Int, b: Int): Int {

    var result = 0
    for (i in a..b){

        if (a >= b){
            result = 0
        }else{
            result += i
        }

    }
    return result
}
fun main (){
    println(task1(a = 3, b = 3))
}
