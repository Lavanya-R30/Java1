class Mall{
	String mallName;
	String mallLocation;
	String owner;
	double constructionCost;
	int areaInSqft;
	int mallCapacity;
	String colorOfMall;
	
	Mall()
	{
		super();
		System.out.println("Invoking no-arg constructor of Mall");
	}
	Mall(String mallName){
		this();
		this.mallName=mallName;
		System.out.println("Invoking string constructor of Mall");	
	}
	Mall(String mallName,String mallLocation,String owner){
		this(mallName);
		this.mallLocation=mallLocation;
		this.owner=owner;
		System.out.println("Invoking string,string,string constructor of Mall");
	}
	Mall(String mallName,String mallLocation,String owner,double constructionCost){
		this(mallName,mallLocation,owner);
		this.constructionCost=constructionCost;
		System.out.println("Invoking string,string,String,Double constructor of Mall");
	}
	Mall(String mallName,String mallLocation,String owner,double constructionCost, int areaInSqft){
		this(mallName,mallLocation,owner, constructionCost);
		this.areaInSqft=areaInSqft;
		System.out.println("Invoking string,String,string,Double,int constructor of Mall");
	}
	Mall(String mallName,String mallLocation,String owner,double constructionCost, int areaInSqft,int mallCapacity){
		this(mallName,mallLocation,owner, constructionCost,areaInSqft);
		this.mallCapacity=mallCapacity;
		System.out.println("Invoking string,String,string,String,int,int constructor of Mall");
	}
	Mall(String mallName,String mallLocation,String owner,double constructionCost, int areaInSqft,int mallCapacity, String colorOfMall){
		this(mallName,mallLocation,owner, constructionCost,areaInSqft,mallCapacity);
		this.colorOfMall=colorOfMall;
		System.out.println("Invoking string,String,string,double,int,int, String constructor of Mall");
	}
}