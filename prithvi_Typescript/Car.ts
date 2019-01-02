class Car { 
   
   engine:string; 
 
    
   constructor(engine:string) { 
      this.engine = engine 
   }  

  
   disp():void { 
      console.log("Engine is  :   "+this.engine) 
   } 

   
}
var car1 = new Car("Audi A5");

   car1.disp();