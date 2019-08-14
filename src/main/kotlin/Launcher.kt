
// look up "modern money mechanics"
// Biased video: https://www.youtube.com/watch?v=P-5xDzTvW6E


fun main() {


}

// Parties
sealed class Party

object FederalReserve: Party() {
	val sentLoans = mutableListOf<Loan>()

	fun loanToFed(amount: Double) {
		val loan = Loan(amount, 0.0)
	}
}

object FederalGovernment: Party() {
	val receivedLoans = mutableListOf<Loan>()
}

class Consumer: Party() {
	val receivedLoans = mutableListOf<Loan>()
}

class Bank: Party() {
	val sentLoans = mutableListOf<Loan>()


	fun createAccount(consumer: Consumer) {

	}
}

// Accounts

sealed class Account {
	abstract val amount: Double
}

class CheckingAccount: Account() {
	override var amount = 0.0
}

class Loan(val interestRate: Double, val principal: Double): Account() {
	override var amount = principal
}

class Deposit(val interestRate: Double,
			  override val amount: Double): Account()