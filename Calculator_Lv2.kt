fun main(){
    println("계산기를 실행합니다.")

    println("첫번째 숫자를 입력해 주세요")
    var num1 = readLine()!!.toDouble()

    println("두번째 숫자를 입력해 주세요")
    var num2 = readLine()!!.toDouble()

    println("1:더하기, 2:빼기, 3:곱하기, 4:나누기, 5:나머지 입니다. 선택해 주세요.")
    var operator = readLine()!!.toInt()

    var result = calculator(num1, num2, operator)

    println("${num1}과 ${num2}의 계산 결과는 ${result}입니다.")
}

fun calculator(num1: Double, num2: Double, operator: Int): Number {
    return when (operator) {
        1 -> num1 + num2
        2 -> num1 - num2
        3 -> num1 * num2
        4 -> num1 / num2
        5 -> num1 % num2
        else -> 0
    }
}