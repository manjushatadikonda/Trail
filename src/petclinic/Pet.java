package petclinic;

public class Pet {
private String Name;
private int Age;
private int Weight;
private String Type;
private String Breed;
public Pet() {
	// TODO Auto-generated constructor stub
}
public Pet(String Name,int Age, int Weight, String Type, 
        String Breed)
{
this.Name = Name;
this.Age = Age;
this.Weight = Weight;
this.Type=Type;
this.Breed=Breed;
}

public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public int getWeight() {
	return Weight;
}
public void setWeight(int weight) {
	Weight = weight;
}
public String getType() {
	return Type;
}
public void setType(String type) {
	Type = type;
}
public String getBreed() {
	return Breed;
}
public void setBreed(String breed) {
	Breed = breed;
}
public String toString(){//overriding the toString() method  
	  return Name+" "+Age+" "+Weight+" "+Type+" "+Breed;  
	 }
}
