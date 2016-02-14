
// спокойно можем использовать классы из java. Можно также наследовать от 
// классов java и имплементировать интерфейсы
import java.util.{Date,Locale}  //Импортируем несколько классов из пакета
import java.text.DateFormat
import java.text.DateFormat._   // Импортируем все статические методы из класса и константы


object FrenchDate {                  //  Object это singleton класс
  
  def main(args: Array[String]): Unit = {
    
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    
    println (df.format(now))   // можно вызывать метод и так
    println (df format now)    // а можно и без точки
    
    // Все является объектом, даже числа, так что 2 + 2 это вызов метода 2.+(2)
  }
}