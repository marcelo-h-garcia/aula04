
package aula04;
public class Aula04 {
    public static void main(String[] args) {
      Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);
      Caneta c2 = new Caneta("KKK", "Laranja",1.5f);
      //c1.setModelo("BIC");
      //c1.modelo = "BIC"; //aceita direto pq é publico
      //c1.setPonta(0.5f);
      //c1.ponta = 0.5f; não aceita acesso direto pq é privado
     
      c1.status();
      c2.status();
       // System.out.println("Tenho uma caneta " + c1.getModelo() 
               // + " \nDe Ponta " + c1.getPonta());
    }
    
}
