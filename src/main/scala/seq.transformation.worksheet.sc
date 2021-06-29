def validate(number: String) = {
    val sum = number
        .map(_.asDigit)
        .reverse
        .zipWithIndex
        .map { case (digit, index) => if (index % 2 == 0) digit else digit * 2}
        .flatMap(number => List(number / 10, number % 10))
        .sum

    sum % 10 == 0
}

validate("49927398716")

validate("79927398711")