class Employee {
	def name , salary
}

def paidMore(amount) {
	return { Employee e -> e.salary > amount}
}

isHighPaid = paidMore(10000)

def sales = new Employee(name:"liusibo" , salary: 12000)

println isHighPaid(sales)
