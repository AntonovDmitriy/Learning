

object Timer {

  def main(args: Array[String]) {

    //передаем в метод другой метод
    oncePerSecond(timeFiles)

    //можно написать метод сразу, если его имя не особо нужно
    oncePerSecond { () => println("А вот и я") }

  }

  def timeFiles() {
    println("Время летит очень быстро")
  }

  //()=> Unit тип аргумента функция без аргументов без возвр значения
  // callbacs идентификатор
  def oncePerSecond(callbacs: () => Unit) {
    while (true) {
      callbacs()
      Thread.sleep(1000)
    }
  }
}