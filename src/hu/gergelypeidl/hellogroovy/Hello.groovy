package hu.gergelypeidl.hellogroovy;

public class HelloWorld {
	def name
	HelloWorld(who) {
		name = who[0].toUpperCase() +
				who[1..-1]
	}
	def salute() {
		println "Hello $name!"
	}
}

g = new HelloWorld('world')
g.salute()

