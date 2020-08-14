val car = new Car with Guarantee with Manual with DryCleaningService;
var engineProblems = Array("Alternator", "Crankshaft");
car.calculateTotalFixingPrice(1998, "Audi", "A4", engineProblems);
car.getWashingPrice("Sedan", "bright");
car.orderDryCleaning("Audi", "A4");

abstract class Car{
	def calculateTotalFixingPrice(years: Int, brand: String, model: String, engineProblems: Array[String]): Double;
	def getWashingPrice(bodyType: String, colour: String): Double;
}

trait Guarantee{
	def calculateTotalFixingPrice(years: Int, brand: String, model: String, engineProblems: Array[String]): Double = {
		var price: Double = 0;
		var total: Double = 0;
		if(engineProblems.length <= 1)
			price = 39.99;
		else if(engineProblems.length <= 3)
			price = 99.99;
		else if(engineProblems.length <= 6)
			price = 299.99;
		else if(engineProblems.length <= 10)
			price = 399.99;
		else
			price = 999.99;
		total = price;
		println(f"$brand%s $model%s guarantee price for work: $price%2.2f");
		if(engineProblems.length <= 1)
			price = 39.99;
		else if(engineProblems.length <= 3)
			price = 69.99;
		else if(engineProblems.length <= 6)
			price = 199.99;
		else if(engineProblems.length <= 10)
			price = 399.99;
		else
			price = 599.99;
		
		if(years < 1970)
			price += 2000;
		else if(years < 1990)
			price += 1000;
		else if(years < 2000)
			price += 600;
		else if(years < 2010)
			price += 300;
		else if(years < 2019)
			price += 100;
		
		println(f"$brand%s $model%s guarantee price for parts: $price%2.2f");
		total += price;
		println(f"Total price for fixing: $total%2.2f");
		return total;
	}
}

trait Regular{
	def calculateTotalFixingPrice(years: Int, brand: String, model: String, engineProblems: Array[String]): Double = {
		var price: Double = 0;
		var total: Double = 0;
		if(engineProblems.length <= 1)
			price = 89.99;
		else if(engineProblems.length <= 3)
			price = 199.99;
		else if(engineProblems.length <= 6)
			price = 599.99;
		else if(engineProblems.length <= 10)
			price = 899.99;
		else
			price = 1999.99;
		total = price;
		println(f"$brand%s $model%s guarantee price for work: $price%2.2f");
		if(engineProblems.length <= 1)
			price = 49.99;
		else if(engineProblems.length <= 3)
			price = 99.99;
		else if(engineProblems.length <= 6)
			price = 299.99;
		else if(engineProblems.length <= 10)
			price = 499.99;
		else
			price = 999.99;
		
		if(years < 1970)
			price += 2000;
		else if(years < 1990)
			price += 500;
		else if(years < 2000)
			price += 100;
		else if(years < 2010)
			price += 500;
		else if(years < 2019)
			price += 1000;		
		println(f"$brand%s $model%s guarantee price for parts: $price%2.2f");
		total += price;
		println(f"Total price for fixing: $total%2.2f");
		return total;
	}
}

trait Manual{
	def getWashingPrice(bodyType: String, colour: String): Double = {
		var price: Double = 0;
		if((colour == "bright")&(bodyType == "Universal"))
			price = 3.99;
		else 
			price = 2.99;
		println(f"Washing in manual:  $price%2.2f");
		return price;
	}
}

trait Premium{
	def getWashingPrice(bodyType: String, colour: String): Double = {
		var price: Double = 0;
		if(colour == "bright") {
			if(bodyType == "Sedan") {
				price = 14.99;
			}
			else if (bodyType == "Universal") {
				price = 19.99;
			}
			else
				price = 24.99;
		}
		else {
			if(bodyType == "Sedan") {
				price = 12.99;
			}
			else if (bodyType == "Universal") {
				price = 16.99;
			}
			else
				price = 19.99;
		}
		println(f"Washing in manual:  $price%2.2f");
		return price;
	}
}

	trait Tunnel{
		def getWashingPrice(bodyType: String, colour: String): Double = {
			var price: Double = 0;
			if(colour == "bright") {
				if(bodyType == "Sedan") {
					price = 9.99;
				}
				else if (bodyType == "Universal") {
					price = 14.99;
				}
				else
					price = 19.99;
			}
			else {
				if(bodyType == "Sedan") {
					price = 6.99;
				}
				else if (bodyType == "Universal") {
					price = 11.99;
				}
				else
					price = 15.99;
			}
			println(f"Washing in manual:  $price%2.2f");
			return price;
		}
	}
	
	trait DryCleaningService{
		def orderDryCleaning(brand: String, model: String): Unit = {
			println(f"Dry cleaning for $brand%s $model%s was ordered.");
		}
	}
		