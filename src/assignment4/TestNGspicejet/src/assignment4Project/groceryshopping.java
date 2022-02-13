package assignment4.TestNGspicejet.src.assignment4Project;

public class groceryshopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Grocery Items List
      Item it1=new Item("apple",20.0,0.5);
      Item it2=new Item("banana",5,0.2);
      Item it3=new Item("Orange",10,0.4);
    //first customer not preferred
      Employee e=new Employee("Manju");
     grocerybill bill=new discountbill(e,true);
      bill.add(it2);
      bill.add(it1);
      bill.add(it3);
      bill.printReceipt();
      //second customer is not preferred
      Employee e1=new Employee("Deepu");
      grocerybill bill1=new discountbill(e1,false);
      bill1.add(it3);
      bill1.add(it2);
      bill1.add(it1);
	  bill1.printReceipt();
	  
	}

}
