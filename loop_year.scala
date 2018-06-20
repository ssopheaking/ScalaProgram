object loop_year
{
 def main(args: Array[String])
 {
 	 println("Input the year: ");
  var age:Int = 19;
  println("Your year is: " + age);
  for(num <- 0 to age )
  {
    if(num % 4 != 0)
    {
      println(num);
    }
  }
 }
}

