// ejercicio modulo 5-5.16

package Buildings

open class BaseBuildingMaterial(val numberNeeded: Int = 1)
class Wood : BaseBuildingMaterial(4)
class Brick : BaseBuildingMaterial(8)

class Building<T : BaseBuildingMaterial>(val material: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * material.numberNeeded
}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("Small building")
    } else {
        println("Large building")
    }
}

fun main() {
    val woodBuilding = Building(Wood())
    print("Wood Building (400 units): ")
    isSmallBuilding(woodBuilding)

    val brickBuilding = Building(Brick())
    print("Brick Building (800 units): ")
    isSmallBuilding(brickBuilding)
}