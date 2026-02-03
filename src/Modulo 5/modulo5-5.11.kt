// ejercicio modulo 5-5.11

package Buildings

import kotlin.reflect.KClass

open class BaseBuildingMaterial(val numberNeeded: Int = 1)

class Wood : BaseBuildingMaterial(4)
class Brick : BaseBuildingMaterial(8)

class Building<T : BaseBuildingMaterial>(val material: T) {

    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        val materialName = material::class.simpleName
        println("$actualMaterialsNeeded $materialName required")
    }
}

fun main() {
    val woodBuilding = Building(Wood())
    woodBuilding.build()
}