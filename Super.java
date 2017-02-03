import java.util.Scanner;

//---------------employee section start--------
class Employee {
	
	String[] name = {"Amirul", "Mizan", "Shadin", "Ispahan", "Sagor", "Mizan", "Hasan", "Ashek", "Bisso", "bingal"};
	int[] code = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
	String[] Designation = {"Programmer", "Developer", "Manager ", "Designer", "Designer", "Ux Develop", "Shopkeeper",  "Shopkeeper", "Shopkeeper", "Shopkeeper"};
	int[] leave = {1, 4, 2, 4, 6, 3, 1, 0, 1, 3};
	int[] sal = {70000, 60000, 50000, 30000, 40000, 34000, 15000, 15000, 18000, 18000};
	int[] employeeSalary = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	
	

	 public void DisplayAllEm(){
		 
			for(int i=0; i<name.length; i++){
				employeeSalary[i] = sal[i]-(leave[i]*2000);
			}
			for( int j =0; j<50; j++){
				 System.out.println("\n");
			}
			
			System.out.println("\n\n\t     *****************************************");
			System.out.println("\t     *                                       *");
			System.out.println("\t     *           Ornet Super Shop            *");
			System.out.println("\t     *                                       *");
			System.out.println("\t     *****************************************");
			System.out.println("\t     *           Employee Details            *");
			System.out.println("\n*******************************************************************");
			System.out.println("*                                                                 *");
			System.out.println("*  Name   \tCode\tDesignation\tLeave\tSallery\t Salary    *");
			System.out.println("*                                                                 *");
			System.out.println("*******************************************************************");
			for(int i=0; i<name.length; i++){
				System.out.println("|  "+name[i]+"\t"+code[i]+"\t"+Designation[i]+"\t"+leave[i]+"\t"+sal[i]+"\t"+employeeSalary[i]+ "\t  |");
			}
			System.out.println("*******************************************************************");
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
		System.out.println("\n\n\t     *****************************************");
		System.out.println("\t     *                                       *");
		System.out.println("\t     *           Ornet Super Shop            *");
		System.out.println("\t     *                                       *");
		System.out.println("\t     *****************************************");
	}
	
	public void mainOption(){
		
		System.out.println("\n\n\t**************************************************************");
		System.out.println("\t* Press 1: Stock\t Press 2: Selling\tPress 3: Profit/loss\tPress 4:Employee*");
		System.out.println("\t**************************************************************");	
	}
	public void passingProduct(int[] co, String  pName[],int  pPrice[],int pQuentity[]){
		code = co;
		ProducName = pName;
		UnitPrice = pPrice;
		ToatalQuentity =pQuentity;
	}
 
	
  public void dispAllProduct(){
		for(int i = 0; i<ProducName.length ; i++){
			System.out.print("\n\t"+code[i]+" :\t"+ProducName[i]+"\t"+UnitPrice[i]+"\t"+ToatalQuentity[i]+"\t"+UnitPrice[i]*ToatalQuentity[i]);		
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
	  System.out.println(" Adding :"+i+"\nproduct code: "+code[i-1]);
	  System.out.println(" Adding :"+i+"\nName Oproduct Product: "+ProducName[i-1]);
	  System.out.println("Unit Price:"+UnitPrice[i-1]);
	  System.out.println("Total QYT:"+ToatalQuentity[i-1]);
	  System.out.println("Total Amount:"+ToatalQuentity[i-1]*UnitPrice[i-1]);
	  
  }
  
  //----------------edit product start-----------------------

  
  //-----------------------add qyt start---------------------
  public void addQyt(){
	  
	 System.out.print("\n\tAdding Product QYT: Enter Product ID:  "); 
	 int addqytID = sc.nextInt();
	 System.out.print("\n\t Enter Qyt: ");
	 int addQyt= sc.nextInt();
	  int tem = ToatalQuentity[addqytID-1];
	  tem = tem+addQyt;
	  ToatalQuentity[addqytID-1] = tem;
		aproducterAdding(addqytID);
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
		 System.out.print("\n\t You Select Product Name :"+ProducName[productId]);
		 System.out.print("\n\t You have product Qyt :"+ToatalQuentity[productId]); 
		 System.out.print("\n\t Enter Qyt:");
		 i = sc.nextInt();	
		 do{
		 if(ToatalQuentity[productId]<=i){
			 System.out.print("\n\t sorry \n");
			 System.out.print("\n\t You have product Qyt :"+ToatalQuentity[productId]); 
			 System.out.print("\n\t Selling?  \n Enter Qyt(Bellow OF "+ToatalQuentity[productId]+" ): \n\t\t" );
			 i = sc.nextInt();
				if(ToatalQuentity[productId]>=i){
					System.out.print("\n\t Successfully Selling :"+ProducName[productId]);
				sellQyt(productId,i); 
				}
				else{
					System.out.print("\n\t sorry \n");
					break;
				}
		 }else{
			sellQyt(productId,i); 
			sellingContinue=2; 
		 }
		 
		 }while(sellingContinue==1); 
  }
//..........................selling end.................

public void profitDetails(){
	int value=0;

		for(int i = 0; i<ProducName.length ; i++){
			if(ToatalQuentity[i] <100){
			value =value + UnitPrice[i]*(100-ToatalQuentity[i]);
			System.out.print("\n\t"+code[i]+" :\t"+ProducName[i]+"\t\t"+UnitPrice[i]+"\t\t"+(100-ToatalQuentity[i])+"\t"+UnitPrice[i]*(100-ToatalQuentity[i]));		
			System.out.print("\n\t-------------------------------------------------------------\n\t");
			}
		}
	//System.out.print("\n\t**************************************************************\n ");	
	//System.out.print("\t\t\t\t\t\t\t"+value);	
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
		int fUnitPrice[] = {40,10,30,10,25,12,32,14,31,5};
		int fQuentity[] = {100,100,100,80,100,100,100,100,100,100};
		// End Product section
				 
		//sports section start
		int[] scode = {201,202,203,204,205};
		String sName[] = {"Ball","Bat","Stamps","Bails","Gloves"};	 
		int sUnitPrice[] = {320,150,310,520,150};		 
		int sQuentity[] = {100,100,100,80,100};	 
		//sports section End 
	
	   //cosmetics section start
		int[] ccode = {301,302,303,304,305};
		String cName[] = {"Brash","Pest","Loson","powder","snow"};	 
		int cUnitPrice[] = {50,150,310,520,560};		 
		int cQuentity[] = {100,100,30,100,100};	 
		//cosmetics section End 
	
		
		//Product calling here
		product.passingProduct(fcode,fName,fUnitPrice,fQuentity);
		sports.passingProduct(scode, sName, sUnitPrice, sQuentity);
		cosmetice.passingProduct(ccode, cName, cUnitPrice, cQuentity);
		product.header();
		
		//System.out.print("\n--------------------------------------------------");
do{

	product.mainOption();
		if(checkvaildoption==5){
		System.out.print("\t\t\tInvalid/ please: ");
	}
	System.out.print("\n\t\t\t Select Option: ");
	optionmain = sc.nextInt();
	if(optionmain== 1){
			System.out.print("\t\t\tStock Details: \n\t\t\t Press 1: for Details . Press  0: Exit Stock \n\t\t\t");
			
			productSelectOption = sc.nextInt();
			if(productSelectOption == 1){
			for( int j =0; j<50; j++){
				 System.out.println("\n");
			}
				System.out.print("\n\t\tFood Details:\n");
				System.out.print("ProductID\tName\tPrice\tQyt\tTotal Amount");
				System.out.print("\n--------------------------------------------------\n");
				product.dispAllProduct();
				System.out.print("\n\n\n\t\tSports Details:\n");
				sports.dispAllProduct();
				System.out.print("\n\n\n\t\tCosmetice Details:\n");
				cosmetice.dispAllProduct();
			}
			else{
				System.out.print("\n \n \n"); 
				//checkvaildoption=5;//
			}
			
		 
		}
		else if(optionmain== 2){
			
		do{
			System.out.print("\n\t\t\tSelling Product Code:\n\t\t\t1: food\t2: Sports\t3: Cometics\n\t\t\t");
			foodSportsComseSelection = 0;
			productId = sc.nextInt();
			if(productId == 1){
				System.out.print("\n\t\t\t Enter Food (101-110)ID :");
				searchCode = sc.nextInt();
				int q =  product.seldetails(searchCode);
				//System.out.print("\n\t Enter Food ID :"+q);
				//product.aproducterAdding(q);			
			}
			else if(productId == 2){
				System.out.print("\n\t Enter Sports(201-205) ID :");
				searchCode = sc.nextInt();
				int q =  sports.seldetails(searchCode);
				//sports.selling_details(q);
				 
				//sports.aproducterAdding(q);
			}
			else if(productId == 3){
				System.out.print("\n\t Enter Cosmetics(301-305) ID :");
				searchCode = sc.nextInt();
				int q =  cosmetice.seldetails(searchCode);
				//System.out.print("\n\t Enter Cosmetics ID :"+q);
				//cosmetice.aproducterAdding(q);
				//cosmetice.selling(productId);
			}
			else{
				product.space(); // clear and show  header 
				 
				System.out.print("\n Invalid Key\n "); 
				
			}
			System.out.print("\n 1: contine to sell 5: Memo 0: exit\n\t\t"); 
			foodSportsComseSelection = sc.nextInt();	
		}while(foodSportsComseSelection==1);
		
			if(foodSportsComseSelection==5){
			product.space(); // clear and show  header 
			System.out.println("\n\n\t*************************MEMo*************************************");
			System.out.println("\t* Code \t Product name \tUnit Price \t Qyt\t  Amount \t:");
			System.out.println("\t**************************************************************");	
			product.profitDetails();
			sports.profitDetails();
			cosmetice.profitDetails();
			
			checkvaildoption=5;
			}
			else{
				
				 mainloopcheck=2;
			}
		}
		else if(optionmain== 3){
			
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
		else if(optionmain== 4){
			System.out.print(" Employee:");
			em.DisplayAllEm();
		 
		}else{
			for( int j =0; j<50; j++){
				 System.out.println("\n\t\t\t\t\t\n");
			}
			if(optionmain>=1 && optionmain<5){// checking option 
			checkvaildoption=1;
			}else{
			checkvaildoption=5;	
			}
		}
}while(mainloopcheck>1);
		 
		// System.out.print("\n\t Adding Qyt: ");
		// product.addQyt(); 
		 //selling section....
		// System.out.print("\n\t Selling Product: ");
		//System.out.print("\n\t Selling Product Code:");
		//productId = sc.nextInt();
		//product.selling(productId);
		// product.dispAllProduct();
		 
		 //Product calling end
		 
		 
		//
		//sports.dispAllProduct();
		//sports.addQyt(); 
		//System.out.print("\n\t Selling Product Code:");
		//productId = sc.nextInt();
		//sports.selling(productId);
		//sports.dispAllProduct();
		 

	
		 
		 
 
				 
				 
				 
				 
				 
	}

}

//............Main Super Shop Class end............
