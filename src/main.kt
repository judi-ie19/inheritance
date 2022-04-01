fun main() {
    var car = Car("nissan", "benz", "black", 20)
    car.color
    car.carry(20)
    var g=car.calculateParkingFees(12)
    println(g)



}

 open class Car(  var make:String,var model:String, var color:String,var capacity:Int){
     fun carry(people: Int) {
         var x=people-capacity
         if(x<=capacity) {
             println("carry $people passengers")
         }
         else {
         println("over capacity by $people")


         }
     }

     fun identity(color:String, make: String, model:String) {
         println("I am $color, $make,$model")
     }

     fun calculateParkingFees(hours:Int):Int{
         var y=hours *20
         return y

     }

class Bus (make: String,model: String,color: String,capacity: Int):Car(make,model,color,capacity)
    fun calculatemaxTripFare(fare:Double):Double{
        var n = fare
        return fare

    }


}