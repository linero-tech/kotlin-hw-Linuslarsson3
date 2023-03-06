package lms_129

fun task7(a: Int, b: Int): Int {

   var result = 1

    for(number in a..b){
        if( a + b == 0){
 result = 1
        } else {
            result = a*b
        }
    }
    return result
}
fun main (){
    println(task7(a = 4, b = 6))
}