package groovyLearning

class GroovyTest {

	static void main(def args){
		
		// Язык с динамической типизацией. Ключевое слово def. Тип можно менять
		def x = 4
		println x.getClass()
		x = "Hello world"  
		println x.getClass()  // Можно не писать скобки
		
		
		println "another $x"    // Конкатинация с переменной
		
		//Строчка на разных строчках 
		def v = """большая строчка 
на разных
строчках"""
		println v
		
		// Любой объект может быть приведен к boolean и проверен на if. Массивы строки объект
		// если не пустые или не null то true.
		
		if(45){
			println "tadam"
		}
		
		
		
	}
}
