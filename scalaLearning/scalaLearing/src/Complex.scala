

// Классы могут содержать аргументы. В данном случае замена конструктору.
// Вызываем просто new Complex(2.0,2.0)
class Complex(real: Double, imaginary: Double) {

  // Методам в этом случае не нужно писать тип возвр. значения так как можно
  // вычислить автоматически. 
  def re() = real
  def im() = imaginary

  // чтобы не писать скобок в методах без аргументов можно писать и так
  def re2 = real
  def im2 = imaginary

  // Переопрееление метода, ключевое слово
  override def toString = "tadam"
  
  
  
}