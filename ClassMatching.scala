package matching

object ClassMatching {
  
  abstract class Animal
  
  case class Monkey(jungleName: String) extends Animal
  
  case class Fish(lakeName: String) extends Animal
  
  case class Dog(dogBreed: String) extends Animal
  
  
  /**
   * Running this object will allow Scala to identify both what sub-class 'animal'
   * is of the abstract class 'Animal' as well as what it's constructor parameters
   * are
   */
  def main(args: Array[String]) {
    
    var animal: Animal = Dog("Doberman");
    animal match {
      case Monkey(jungleName) => println("Monkey lives in " + jungleName)
      
      case Fish(lakeName) => println("Fish lives in lake " + lakeName)
      
      case Dog(dogBreed) => println("Dog is a " + dogBreed)
      
    }
  }
  
}