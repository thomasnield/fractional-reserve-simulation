fun main() {
	println("Hello")
}


sealed class Entity

class Consumer: Entity() {
	val receivedLoans = mutableListOf<Loan>()
}

class Bank: Entity() {
	val sentLoans = mutableListOf<Loan>()
}

class FederalReserve: Entity() {
	val sentLoans = mutableListOf<Loan>()
}

class FederalGovernment: Entity() {
	val receivedLoans = mutableListOf<Loan>()
}

class Loan(val interestRate: Double, val principal: Double) {
	var currentBalance = principal
}