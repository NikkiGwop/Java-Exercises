package oop;




public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Product pr1;
		pr1= new Product();
		System.out.println(pr1.id);
		
		pr1.id= 3;
		pr1.name= "pr1";
		pr1.price= 25.50f;
		pr1.category= "Toy";
		pr1.rating= 5;
		pr1.discountPercentage= 12.5f;
		pr1.isAvailable= true;
		
		System.out.println("Id: " + pr1.id);
		System.out.println("Name " + pr1.name);
		System.out.println("Category" + pr1.category);
		System.out.println("Rating" + pr1.rating);
		System.out.println("discountPercentage" + pr1.discountPercentage);
		System.out.println("isAvailable" + pr1.isAvailable);
		
	
		
		Product pr2;
		pr2= new Product();
		System.out.println(pr2.name);
		
		pr2.id= 46;
		pr2.name= "pr2";
		pr2.price= 50f;
		pr2.category= "Sports";
		pr2.rating= 4;
		pr2.discountPercentage= 10f;
		pr2.isAvailable = true;
		
		System.out.println("Id: " + pr2.id);
		System.out.println("Name " + pr2.name);
		System.out.println("Category" + pr2.category);
		System.out.println("Rating" + pr2.rating);
		System.out.println("discountPercentage" + pr2.discountPercentage);
		System.out.println("isAvailable" + pr2.isAvailable);
		
		Product pr3;
		pr3 = new Product();
		
		
		pr3.id= 46;
		pr3.name= "pr3";
		pr3.price= 25f;
		pr2.category= "Cosmetics";
		pr2.rating= 5;
		pr2.discountPercentage= 5f;
		pr2.isAvailable = true;		
		
		System.out.println("Id: " + pr3.id);
		System.out.println("Name " + pr3.name);
		System.out.println("Category" + pr3.category);
		System.out.println("Rating" + pr3.rating);
		System.out.println("discountPercentage" + pr3.discountPercentage);
		System.out.println("isAvailable" + pr3.isAvailable);
		
	
		

	}

}
