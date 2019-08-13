
// look up "modern money mechanics"
// Biased video: https://www.youtube.com/watch?v=P-5xDzTvW6E

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

sealed class Account {
	abstract val amount: Double
}

class Loan(val interestRate: Double, val principal: Double): Account() {
	override var amount = principal
}

class Deposit(val interestRate: Double,
			  override val amount: Double): Account()