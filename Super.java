import java.util.Scanner;

//---------------employee section start--------
class Employee {
	
	String[] name = {"Amirul", "Mizan", "Shadin", "arafat", "Sagor", "Mizan", "Hasan", "Ashek", "Bisso", "bingal"};
	int[] code = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
	String[] Designation = {"Programmer", "Developer", "Manager ", "Designer", "Designer", "Ux Develop", "Shopkeeper",  "Shopkeeper", "Shopkeeper", "Shopkeeper"};
	int[] leave = {1, 4, 2, 4, 6, 3, 1, 0, 1, 3};
	int[] sal = {70000, 60000, 50000, 30000, 40000, 34000, 15000, 15000, 18000, 18000};
	int[] employeeSalary = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	
	
		public void headerEmployee(){
		System.out.print("\t|***********************************************************************************************************************|\n");
		System.out.print("\n\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.print("\n\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.print("\n\t|\t\t\t\t\t\tOrnet Super Shop\t\t\t\t\t\t\t\t|");
		System.out.print("\n\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.print("\n\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.print("\n\t|***********************************************************************************************************************|\n");
		
 
	}

	 public void DisplayAllEm(){
		 
			for(int i=0; i<name.length; i++){
				employeeSalary[i] = sal[i]-(leave[i]*2000);
			}
			for( int j =0; j<50; j++){
				 System.out.println("\n");
			}
			
		headerEmployee();
 		System.out.print("\n\n\t\t\t\t\t|------------------------Employee Details-------------------------------|\n");
		System.out.print("\t\t\t\t\t| Name \tCode\tDesignation\tleave \tSalary\t Total Salary  |\n");
		System.out.print("\t\t\t\t\t|----------------------------------------------------------------|\n");
 			for(int i=0; i<name.length; i++){
				System.out.print("\n\t\t\t\t\t|"+name[i]+"\t"+code[i]+"\t"+Designation[i]+"\t"+leave[i]+"\t"+sal[i]+"\t"+employeeSalary[i]+ "\t  |");
			}
			System.out.print("\n\t\t\t\t\t*******************************************************************");
	 }	
}

//............employee section End.............

//--------------product start------------------------
class Product {
	final int index = 10;
	public int[] code = new int[index];
	public String[] ProducName=new String[index];
	public  int[] UnitPrice= new int[index];
	public  int[] ToatalQuentity= new int[index];
	public  int[] Toatalamount= new int[index];
	public int[] sellTotal = new int[index];
	
	Scanner sc = new Scanner(System.in);
	Scanner s = new Scanner(System.in);
	
	
	
	public void space(){
		for( int j =0; j<50; j++){
			System.out.print("\n");	
		}
		header();
	}
	
	public void header(){
		System.out.print("\t|***********************************************************************************************************************|\n");
		System.out.print("\n\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.print("\n\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.print("\n\t|\t\t\t\t\t\tOrnet Super Shop\t\t\t\t\t\t\t\t|");
		System.out.print("\n\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.print("\n\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.print("\n\t|***********************************************************************************************************************|\n");
		
 
	}
	
	public void mainOption(){
		
		System.out.println("\n\n\t|***********************************************************************************************************************|");
		System.out.println("\t|-----------------------------------------------------------------------------------------------------------------------|");
		System.out.println("\t|  Press 1:Stock\tPress 2:Selling\tPress 3:Adding Item 4:Profit/loss\tPress 5:Employee \t Press 0: Exit  |");
		System.out.println("\t|-----------------------------------------------------------------------------------------------------------------------|");
		System.out.println("\t|***********************************************************************************************************************|");	
	}
	public void passingProduct(int[] co, String  pName[],int  pPrice[],int pQuentity[]){
		code = co;
		ProducName = pName;
		UnitPrice = pPrice;
		ToatalQuentity =pQuentity;
	}
 
	
  public void dispAllProduct(){
		for(int i = 0; i<ProducName.length ; i++){
			System.out.print("\n\t\t\t\t\t\t"+code[i]+" :\t"+ProducName[i]+"\t"+UnitPrice[i]+"\t"+ToatalQuentity[i]+"\t"+UnitPrice[i]*ToatalQuentity[i]);		
		}
  }
  
    public int seldetails(int v){
		int p=0;
		for(int i = 0; i<ProducName.length ; i++){
			if(v == code[i]){
				 p = i;
				p++;
			//System.out.print("\n\t"+code[i]+" :\t"+ProducName[i]+"\t"+UnitPrice[i]+"\t"+ToatalQuentity[i]+"\t"+UnitPrice[i]*ToatalQuentity[i]);		
			selling(i);
			}
		}
		return p;
  }
  
  public void aproducterAdding(int i){ 
			space();
			System.out.println("\n\t\t\t\t\tSuccessfully Adding: "+ProducName[i]); 
			System.out.println("\n\t\t\t\t\tAfter Adding Product Qyt:"+ToatalQuentity[i]);  
  }
  
  //----------------edit product start-----------------------

  
  //-----------------------add qyt start---------------------
  public void addQyt(){
	  int productCode;
	  int c=0;
	  System.out.print("\n\t\t\t\t\tEnter Product Code");
	  productCode= sc.nextInt();
	  
	  int sum=0; 
		for(int i = 0; i<ProducName.length ; i++){
			if(code[i]==productCode && ToatalQuentity[i] <100){
			 System.out.print("\t\t\t\t\tEnter Qyt of Product: "+ProducName[i]+"\n\t\t\t\t\t");
			 productCode= sc.nextInt();
				ToatalQuentity[i] = ToatalQuentity[i]+ productCode;
				aproducterAdding(i);
				}
		}
	 

	  
  }
   public  void AddingCheck(){
			int sum=0; 
		for(int i = 0; i<ProducName.length ; i++){
			if(ToatalQuentity[i]<100){
			 
			System.out.print("\n\t\t\t\t\t"+code[i]+" :\t"+ProducName[i]+"\t\t\t"+ToatalQuentity[i]+"\t\t"+(100-ToatalQuentity[i]));			
		}
	}	 
}
  //....................add qyt end...................
  //------------------sellect start------------
  public void sellQyt(int pID, int qyt){
	  int tem = ToatalQuentity[pID];
	  tem = tem-qyt;
	  ToatalQuentity[pID] = tem;	
		 
	
  }
  
//.................sellect end.................
 public int profit(){
			int sum=0; 
		for(int i = 0; i<ProducName.length ; i++){
			if(ToatalQuentity[i]<100){
			 
			System.out.print("\n\t"+code[i]+" :\t"+ProducName[i]+"\t\t"+100+"\t\t"+ToatalQuentity[i]+"\t\t"+(100-ToatalQuentity[i])+"\t\t"+UnitPrice[i]+"\t\t"+((100-ToatalQuentity[i])*UnitPrice[i])+"\t\t"+(100-ToatalQuentity[i])+" Add to Click");		
		sum =sum+ ((100-ToatalQuentity[i])*UnitPrice[i]);	
		}
		 
		//System.out.print("Sum of "+sum);
		}
		return sum; 
	 
} 
 
  //---------------------selling product------------------------------
  public void selling(int productId){
		int i;
		int sellingContinue=0;
		 System.out.print("\n\t\t\t\t\t You Select Product Name :"+ProducName[productId]);
		 System.out.print("\n\t\t\t\t\t You have product Qyt :"+ToatalQuentity[productId]); 
		 System.out.print("\n\t\t\t\t\t Enter Qyt:");
		 i = sc.nextInt();	
		 do{
		 if(ToatalQuentity[productId]<=i){
			 System.out.print("\n\t\t\t\t\t sorry \n");
			 System.out.print("\n\t\t\t\t\t You have product Qyt :"+ToatalQuentity[productId]); 
			 System.out.print("\n\t\t\t\t\t Selling?  \n Enter Qyt(Bellow OF "+ToatalQuentity[productId]+" ): \n\t\t\t\t\t" );
			 i = sc.nextInt();
				if(ToatalQuentity[productId]>=i){
					System.out.print("\n\t\t\t\t\t Successfully Selling :"+ProducName[productId]);
				sellQyt(productId,i); 
				}
				else{
					System.out.print("\n\t\t\t\t\t sorry \n");
					break;
				}
		 }else{
			sellQyt(productId,i); 
			sellingContinue=2; 
		 }
		 
		 }while(sellingContinue==1); 
  }
//..........................selling end.................

public int profitDetails(){
	int value=0;

		for(int i = 0; i<ProducName.length ; i++){
			if(ToatalQuentity[i] <100){
			value =value + UnitPrice[i]*(100-ToatalQuentity[i]);
			System.out.print("\n\t\t\t\t\t"+code[i]+" :\t"+ProducName[i]+"\t\t"+UnitPrice[i]+"\t\t"+(100-ToatalQuentity[i])+"\t"+UnitPrice[i]*(100-ToatalQuentity[i]));		
			System.out.print("\n\t\t\t\t\t-------------------------------------------------------------\n\t");
			}
		}
	//System.out.print("\n\t**************************************************************\n ");	
	//System.out.print("\t\t\t\t\t\t\t"+value);
	return value;
	
	}
}


//............Product End............................
 
 
//--------------Main Super Shop Class------------

 class SuperShop {

	public static void main(String[] args) {
	 
		int productId;
		int checkvaildoption=1;
		int mainloopcheck=2;
		double profitAllf=0;
		double profitAlls=0;
		double profitAllc=0;
		double profitAll=0;
		
		double sellingAcf=0;
		double sellingAcs=0;
		double sellingAcc=0;
		
		int optionmain;
		int searchCode;
		int foodSportsComseSelection;
		int productSelectOption;
		int menu = 1;
		Product product = new Product();
		Product sports = new Product();
		Product cosmetice = new Product();
		
		Employee em = new Employee();
		Scanner sc = new Scanner(System.in);
		int[] codee = new int[10];
		int incre=0;
		// About Product Section start here
		
		int[] fcode = {101,102,103,104,105,106,107,108,109,110};
		String[] fName={"Banana","Cake","Bread","Gelly","rochi","Paddis","Paddis","Biscuit","tea","coffee"};
		int fUnitPrice[] = {10,12,13,10,25,12,32,14,31,5};
		int fQuentity[] = {100,100,40,100,100,100,100,100,100,100};
		// End Product section
				 
		//sports section start
		int[] scode = {201,202,203,204,205};
		String sName[] = {"Ball","Bat","Stamps","Bails","Gloves"};	 
		int sUnitPrice[] = {320,150,310,520,150};		 
		int sQuentity[] = {100,10,100,100,100};	 
		//sports section End 
	
	   //cosmetics section start
		int[] ccode = {301,302,303,304,305};
		String cName[] = {"Brash","Pest","Loson","powder","snow"};	 
		int cUnitPrice[] = {50,150,310,520,560};		 
		int cQuentity[] = {100,20,100,100,100};	 
		//cosmetics section End 
	
		
		//Product calling here
		product.passingProduct(fcode,fName,fUnitPrice,fQuentity);
		sports.passingProduct(scode, sName, sUnitPrice, sQuentity);
		cosmetice.passingProduct(ccode, cName, cUnitPrice, cQuentity);
		product.header();
		
		//System.out.print("\n--------------------------------------------------");
do{

	product.mainOption();
		if(checkvaildoption==6){
		System.out.print("\n\t\t\t\t\tInvalid/ please: ");
	}
	System.out.print("\n\t\t\t\t\tSelect Option: ");
	optionmain = sc.nextInt();
	if(optionmain== 1){
			System.out.print("\n\t\t\t\t\tStock Details: \n\t\t\t\t\tPress 1: for Details & Press  0: Exit Stock \n\t\t\t\t\t");
			
			productSelectOption = sc.nextInt();
			if(productSelectOption == 1){
			for( int j =0; j<50; j++){
				 System.out.println("\n");
			}
				System.out.print("\n\t\t\t\t\tFood Details:\n");
				System.out.print("\n\t\t\t\t\tProductID\tName\tPrice\tQyt\tTotal Amount");
				System.out.print("\n\t\t\t\t\t--------------------------------------------------\n");
				product.dispAllProduct();
				System.out.print("\n\n\n\t\t\t\t\tSports Details:\n");
				sports.dispAllProduct();
				System.out.print("\n\n\n\t\t\t\t\tCosmetice Details:\n");
				cosmetice.dispAllProduct();
			}
			else{
				 product.space();
			}
			
		 
		}
		else if(optionmain== 2){
			
		do{
			System.out.print("\n\t\t\t\t\tSelling Product Code:\n\n\t\t\t\t\t1: food\t\t2:Sports\t3:Cometics\n\t\t\t\t\t");
			foodSportsComseSelection = 0;
			productId = sc.nextInt();
			if(productId == 1){
				System.out.print("\n\t\t\t\t\t Enter Food (101-110)ID :");
				searchCode = sc.nextInt();
				int q =  product.seldetails(searchCode);
				//System.out.print("\n\t Enter Food ID :"+q);
				//product.aproducterAdding(q);			
			}
			else if(productId == 2){
				System.out.print("\n\t\t\t\t\t Enter Sports(201-205) ID :");
				searchCode = sc.nextInt();
				int q =  sports.seldetails(searchCode);
				//sports.selling_details(q);
				 
				//sports.aproducterAdding(q);
			}
			else if(productId == 3){
				System.out.print("\n\t\t\t\t\t Enter Cosmetics(301-305) ID :");
				searchCode = sc.nextInt();
				int q =  cosmetice.seldetails(searchCode);
				//System.out.print("\n\t Enter Cosmetics ID :"+q);
				//cosmetice.aproducterAdding(q);
				//cosmetice.selling(productId);
			}
			else{
				product.space(); // clear and show  header 
				 
				System.out.print("\n\t\t\t\t\t Invalid Key\n "); 
				
			}
			System.out.print("\n\t\t\t\t\tPress  1: contine to sell Press5: Memo 0: exit\n\t\t\t\t\t"); 
			foodSportsComseSelection = sc.nextInt();	
		}while(foodSportsComseSelection==1);
		
			if(foodSportsComseSelection==5){
			product.space(); // clear and show  header 
			System.out.println("\n\n\t\t\t\t\t*************************MEMo*************************************");
			System.out.println("\t\t\t\t\t* Code \t Product name \tUnit Price \t Qyt\t  Amount \t:");
			System.out.println("\t\t\t\t\t**************************************************************");	
			sellingAcf = product.profitDetails();
			sellingAcs = sports.profitDetails();
			sellingAcc = cosmetice.profitDetails();
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t Total="+(sellingAcf+sellingAcs+sellingAcc));
			
			
			checkvaildoption=5;
			}
			else if(foodSportsComseSelection !=5 || foodSportsComseSelection != 1 || foodSportsComseSelection != 0){
				product.space(); // clear and show  header 
				System.out.println("\t\t\t\t\t*You Hava Pressed Wrong Key*");
				 mainloopcheck=2;
			}
			else{
				 mainloopcheck=2;
			}
		}
		else if(optionmain== 3){
				int productCode;
				System.out.print("\n\t\t\t\t\tPlease Adding This Product:\n\n\n");
				System.out.println("\t\t\t\t\t* Code \t Product name \tHava Qyt \t Adding Qyt");
				System.out.println("\t\t\t\t\t**************************************************************");					 
				product.AddingCheck();
				sports.AddingCheck();
				cosmetice.AddingCheck();
				System.out.print("\n\t\t\t\t\tAdding Product Code:\n\n\t\t\t\t\t1: food[101-110]\t\t2:Sports[201-205]\t3:Cometics[301-305]\n\t\t\t\t\t");
				productCode= sc.nextInt();
				
				if(productCode == 1){
					product.addQyt();
				}
				else if(productCode == 2){
						sports.addQyt();
				}
				else if(productCode == 3){
						cosmetice.addQyt();
				}
				else{
	 
					System.out.print("\n\t\t\t\t\t Worng Kye");
				}
			 
			checkvaildoption=1;
		}
		
		else if(optionmain== 4){
			product.space(); // clear and show  header 
			System.out.println("\n\n\t***********************************************Profit/Loss**********************************************************");
			System.out.println("\t* Code\tProductName\tStock Qyt\tPresentQyt\tSold Qyt\tUnitPrice\tProfit/loss\tRequireToAdd|");
			System.out.println("\t----------------------------------------------------------------------------------------------------------------------");	
			profitAllf = product.profit();
			profitAlls =sports.profit();
			profitAllc =cosmetice.profit();
			profitAll = profitAllf + profitAlls + profitAllc;
			System.out.println("\n\t----------------------------------------------------------------------------------------------------------------------");	
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t Total "+profitAll);
			
			checkvaildoption=1;
			 
		}
		
		else if(optionmain== 5){
			System.out.print(" Employee:");
			em.DisplayAllEm();
		 
		}else{
			for( int j =0; j<50; j++){
				 System.out.println("\n\t\t\t\t\t\n");
			}
			if(optionmain>=1 && optionmain<6){// checking option 
			checkvaildoption=1;
			}else{
			checkvaildoption=6;	
			}
		}
	}while(mainloopcheck>1);
				 
	}

}

//............Main Super Shop Class end............
