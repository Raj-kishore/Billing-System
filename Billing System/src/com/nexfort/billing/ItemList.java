package com.nexfort.billing;

public class ItemList{
	String catg;
	String type;
	String item;
	int no;
	public  static final int balance = 50000;
	
	public  static final int jeans = 900;
    public  static final  int t_shirt= 400;
    public  static final int ladies_jeans = 1100;
    public  static final int boho= 2300;
    
	public static final String[]  Men = new String[]{"jeans","t_shirt"};
	public static final String[]  Women = new String[]{"ladies jeans","boho"};
	
	public static final String[] Clothing = new String[]{"Men","Women"};
	
	  public  static final int Hyundai= 5000;
	  public  static final int Onida= 4300;
	  public  static final int iPhone= 56000;
	  public  static final int Samsung= 12000;
	  
	public static final String[] TV = new String[]{"Hyundai","Onida"};	
	public static final String[] SmartPhones = new String[]{"iPhone","Samsung"};	
	
	public static final String[] Electronics = new String[]{"TV","SmartPhones"};
	
	//Price 
	  public  static final int MRF= 1200;
	  public  static final int Rocky= 880;
	  public  static final int Ralley= 2500;
	  public  static final int Darryls= 2800;

 
	public static final String[] Bat = new String[]{"MRF","Rocky"};	
	public static final String[] Helmet = new String[]{"Ralley","Darryls"};	
	
	public static final String[] Sports= new String[]{"Bat","Helmet"};


	public static final String[] category = new String[]{"Clothing","Electronics","Sports"};
	
	
	
	public ItemList(String catg, String type, String item, int no) {
		this.catg = catg;
		this.type = type;
    	this.item =  item;
	    this.no = no;
	}
	public ItemList(String catg) {
		this.catg = catg;
	}
	public ItemList(String t, String type) {
		this.type = type;
	}
	
	public String amount() throws notFoundException{
		int pricing = 0;
		String sss ="";
		if(item.equals("jeans")){
		pricing =  jeans;
		}else if(item.equals("t_shirt")){
			pricing =  t_shirt;
			}else if(item.equals("ladies_jeans")){
				pricing = ladies_jeans;
				}else if(item.equals("boho")){
					pricing =  boho;
				}else if(item.equals("Hyundai")){
					pricing =  Hyundai;
				}else if(item.equals("Onida")){
					pricing =  Onida;
				}else if(item.equals("iPhone")){
					pricing = iPhone;
				}else if(item.equals("Samsung")){
					pricing =  Samsung;
				}else if(item.equals("MRF")){
					pricing =  MRF;
				}else if(item.equals("Rocky")){
					pricing =  Rocky;
				}else if(item.equals("Darryls")){
					pricing =  Darryls;
				}else if(item.equals("Ralley")){
					pricing =  Ralley;
				}else{
						throw new notFoundException("Item not found");	
		
				}
		
		Integer ss= pricing*no;
		sss = ss.toString();
		return sss;
	}
	
	
	public String showTypes() throws notFoundException{
		String catg_s = "";
		
		if(catg.equals("Clothing")){
			for(String y : Clothing){				
				catg_s  += y +" ,  ";
				}
		}else if(catg.equals("Electronics")){
			for(String y : Electronics){				
				catg_s  += y +" ,  ";
				}
		}else if(catg.equals("Sports")){
			for(String y : Sports){				
				catg_s  += y +" ,  ";
				}
		}else{
			throw new notFoundException("Category not found");
		}
		
		
		return "Choose type  =>"+catg_s;		
	}
	public String showItems() throws notFoundException{
		String item_s = "";
		
		if(type.equals("Men")){
			for(String y : Men){				
				item_s  += y +" ,  ";
				}
		}else if(type.equals("Women")){
			for(String y : Women){				
				item_s  += y +" ,  ";
				}
		}else if(type.equals("TV")){
			for(String y :TV){				
				item_s  += y +" ,  ";
				}
		}else if(type.equals("SmartPhones")){
			for(String y : SmartPhones){				
				item_s  += y +" ,  ";
				}
		}else if(type.equals("Bat")){
			for(String y : Bat){				
				item_s  += y +" ,  ";
				}
		}else if(type.equals("Helmet")){
			for(String y : Helmet){				
				item_s  += y +" ,  ";
				}
		}else{
			throw new notFoundException("Type not found");
		}
		return "Choose type:"+item_s;		
	}	
}