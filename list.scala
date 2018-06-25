

object MainObject
{
	def main(args:Array[String]){  
    //    var list = List("hello",8,5,6,9,58,23,15,4)  
    //     var list2:List[Int] = List(1,8,5,6,9,58,23,15,4)  
  		// var listI = List(1,8,5,6,9,58,23,15,4)  
  		// var listII= List(1,8,5,6,9,58,23,15,4)  
  		// var listok=listI++listII
  		// println(listok.reverse)
  		
    //     // println(list.tail)
    //     // println(list.slice(2,5)) 
    //     //   println(list.slice(list.size-4,list.size)) 
    //     // println(list.head) 
    //     // println(list.splitAt(3)) 
    //     // println(list.last)
    //     // println(list.reverse)
    //     // println(list2)   		
   	// 	for(i<- 0 to listok.size-1)
   	// 	{
   	// 		if(listok(i)%2!=0)
   	// 		println(listok(i))

   	// 	}
   	var list1 = List("hello",8,5,6,9,58,23,15,4)
   	println(list1.slice(0,list1.size-2))
   	var a = List(1,2,3,4,5)
   	var b = List(6,7,8,9,10)
   	var list = List (a,b)
   	println(list)
   	var fruit = List ("apple", "banana", "cherry")
   	var str = fruit.mkString(" ")
   	println(str)
	

    }  
}