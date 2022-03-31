package builders.new

enum class Drink {
				WATER,
				COFFEE,
				TEA
}

abstract class Meal {
				data class Breakfast(
								val eggs: Int,
								val bacon: Boolean,
								val drink: Drink,
								val tittle: String
				) : Meal()
}

class BreakfastBuilder {
				var eggs = 0
				var bacon = false
				var title = ""
				var drink = Drink.WATER


				fun build() = Meal.Breakfast(eggs, bacon, drink, title)
}

fun breakfast(block: BreakfastBuilder.() -> Unit): Meal.Breakfast {

				return BreakfastBuilder().apply(block).build()
}

fun main() {
				val myBreakfast = breakfast {
								eggs = 3
								bacon = true
								title = "Symple"
								drink = Drink.COFFEE
				}

				println(myBreakfast)
}

