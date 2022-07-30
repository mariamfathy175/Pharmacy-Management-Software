package pharmacy;
import java.util.ArrayList;
import java.util.Scanner;
public class Pharmacy {
    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      person p = new person ("remon","2018","xt","012","Remon");
      staff s = new staff("mariam","123","helo","07775000","mariam",1,20,3);
      ArrayList<order> os = new ArrayList<>();      
      ArrayList<product> ez = new ArrayList<>();
      pharmacist phh = new pharmacist(44,2000,"Mohamed44","d1444","015","18th street","ahmed alaa");     
      patient pp = new patient(1,"diabaties",ez,"7amada","2018","xa","012","7amood");     
      product pr=new product("comtrex","h20+co2","cr",20,20,31);     
      product prr=new product("cataflam","gg","cf",20,20,31);     
      product p1= new product("panadol","b32","777",50,2,29/11/2020);
      product p2= new product("profen","bh32","997",30,2,9/10/2020);   
      product p3=new product("comtrex","h20+co2","cr",20,10,31);    
      order oo=new order();      
      paymentmethod ppp=new paymentmethod();

if(login(p)==true)
{
    
System.out.println("login successfully");
  phh.addproduct(p1);
      phh.addproduct(p2);
      phh.addproduct(p3);
      phh.addproduct(pr);
      phh.addproduct(prr);
     phh.getproducts();

    pp.addproducttoorder(p3);
pp.addproducttoorder(p1);
 ppp.pay(pp.totalprice());
oo.deccrementProduct(p3,1);
oo.deccrementProduct(p1,1);
 phh.getproducts();

order o1 = null ; 
order o2 = null ;

if(ppp.checkcard()==true){
 
if(phh.thereisproduct())
{
   
    o1 = order.getInstance();
    System.out.println(o1);
    o1.order_finished(o1);
    o2 = order.getInstance();
    os.add(o1);
    os.add(o2);
    System.out.println(o2); 
    
 }

}
     phh.getproducts();
        product p5=new product("comtrex","h20+co2","cr",20,5,31);

  if(phh.searchproduct(p5))
  {
      System.out.println("Product Was Found");
    phh.incrementproduct(p5);
    System.out.println("quantity is ="+p5.quantity+"\t"+"product was Incremented Successfully");

  } 
  else 
  {
//    phh.addproduct(pr);
    System.out.println("Product Not Found");
  }
    
  if(phh.deleteproduct(prr))
  {
    System.out.println("Product deleted successfully") ;
  }
  else 
  {
    System.out.println("Product wasnt deleted ") ;
  }
  
  if(phh.addpatientdata(pp))
  {
    System.out.println("Patient added successfully");
  }
  else
  {
    System.out.println("Patient is already exist");
  }
  
//   o1.addOrdertopatient(pp);
   System.out.println("enter needed report");
   String na =sc.nextLine();
   adminstrator a = new adminstrator("mariam123", "1234", "011","heliopolis","maraim",na,10,200,30,40,50,60);
   a.view_report(na);
   System.out.println(a.add_staff_data(s));
  

     
ReportData r=new ReportData(a);
observerReport sal=new sales();
observerReport sala=new salary();
observerReport prof=new profit();
r.addobserver(sal);
r.addobserver(sala);
r.addobserver(prof);
r.setRData("sales", 100,1000, 65, 6, 15, 30);

a.view_alert();

}
    else{
System.out.println("login failed");

}
    }
     
     
public static boolean login(person p){
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the username ");
String x=sc.nextLine();
System.out.println("Please enter the password ");
String y=sc.nextLine();
if(p.getUsername().equals(x) && p.getPassword().equals(y)){
return true;
}
else{
    return false;
}
}

   

    }

