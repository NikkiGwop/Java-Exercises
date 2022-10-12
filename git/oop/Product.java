package oop;


public class Product {



	
		int id;
		String name;
		float price;
		String category;
		byte rating;
		float discountPercentage;
		boolean isAvailable;
		float discountPrice;
		
		static final String Seller_Name = "Distibutor";
		static final long Seller_Contact = 795432434L;
		static final String Seller_Email = "bejproduct@gmail";
		
		//No Constructor
		
		Product(){
			id= 25;
			name= "pr1";
			price= 40.0f;
			category= "Toys";
			rating= 5;
			discountPercentage= 12.5f;
			isAvailable= true;
			
		}
			
		//constructor
			
			public Product(int id, String name, float price, String category,
			byte rating, float discountPercentage, boolean isAvailable) {
				
			System.out.println("product(...) arg constructor is invoked...");
			this.id = id;
			this.name = name;
			this.price = price;
			this.category = category;
			this.rating = rating;
			this.discountPercentage = discountPercentage;
			this.isAvailable = isAvailable;
			this.discountPrice = discountPrice;
		
			}
			
			void displayPrInfo() {
				System.out.println("Id : " + id);
				System.out.println("Name : " + name);
				System.out.println("Price : " + price);
				System.out.println("Category : " + category);
				System.out.println("Rating : " + rating);
				System.out.println("DiscountPercentage : " + discountPercentage);
				System.out.println("IsAvailable :" + isAvailable);
			}

			/*
			 * method to calculate the incremented salary
			 */
			float displayPrice() {
				return (price * displayPrice() / 100 );
			
			}	
			
			 static void sellerContactDetails() {
			    	System.out.println("Seller Name : " + Seller_Name);
			    	System.out.println("Seller Contact Number : " + Seller_Contact);
			    	System.out.println("Seller Contact Email : " + Seller_Email);
			
			}
				
				
				
			}
		
				
		
	


