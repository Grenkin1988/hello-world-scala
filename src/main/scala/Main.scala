object Main {
  val supportedCurrencies =
    Set("CAD", "NZD", "USD")

  def main(args: Array[String]): Unit = {
    val input = args(0)
    val Array(code: String, value: String) = input.split("\\s")
    val ammountAsDouble = value.toDouble
    if(!supportedCurrencies.contains(code)) {
      println("Unsupported currency provided.")
      sys.exit()
    }

    val rate = Utils.getRateFrom(code)
    
    println(input + " = USD " + (rate * ammountAsDouble))
  }
}

object Utils {
  private val cadToUsd = 1/1.30
  private val nzdToUsd = 1/1.50

  def getRateFrom(code: String) = code match {
    case "USD" => 1
    case "NZD" => nzdToUsd
    case "CAD" => cadToUsd
  }
}