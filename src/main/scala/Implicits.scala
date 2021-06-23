case class Currency(code: String, amount: Double, toUSD: Double)

object Implicits {
    implicit def stringToCurrency(money: String) = {
        val Array(code: String, value: String) = money.split("\\s")
        val ammountAsDouble = value.toDouble
        code match {
            case "USD" => Currency("USD", ammountAsDouble, ammountAsDouble)
            case "NZD" => Currency("USD", ammountAsDouble, (ammountAsDouble * (1/1.5)))
            case "CAD" => Currency("USD", ammountAsDouble, (ammountAsDouble * (1/1.3)))
        }
    }

    println(stringToCurrency("USD 100"))
    println(stringToCurrency("NZD 100"))
    println(stringToCurrency("CAD 100"))

    val cad: Currency = "CAD 100"
    println(cad)
}
