public class Cenario {
    private static Cenario cenario=null;
    
    private Cenario(){}
  
    public static Cenario getCenario(){
        if(cenario==null)
          cenario=new Cenario();
        
        return cenario;
    }  

    public static Cenario config(){
      return cenario;
    }

  }
  