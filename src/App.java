import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
		
		String opcao ;
		do {
		
		System.out.println("Escolha uma opção de aula de 1 a 5: ");
		System.out.println("Digite opção 6 - para sair do programa :");
		opcao = sc.next();
		if(opcao.equals("1")) {
			 System.out.println("Você escolheu opção 1- aula de Inglês");
			 System.out.println("É Bons Estudos!");
			 break;
		}else if (opcao.equals("2")){
		     System.out.println("Você escolheu opção 2 - aula de Portugues");
		     System.out.println("É Bons Estudos!");
		     break;
		 
       }else if  (opcao.equals("3")) {
    	     System.out.println("Você escolheu opção 3 - aula de Matematica");
    	     System.out.println("É Bons Estudos!");
    	     break;
    	     
       }else if (opcao.equals("4")) {
    	      System.out.println("Você escolheu opção 4 - aula de Historia");
    	      System.out.println("É Bons Estudos!");
    	      break;
    	      
       }else if (opcao.equals("5")) {
    	     System.out.println("Você escolheu opção 5 - aula de Informatica");
    	     System.out.println("É Bons Estudos!");
    	     break;
       }else if (opcao.equals("6")) {
    	    System.out.println("Obrigada pela visita!");
    	    break;
    	     
       }else {
    	     System.out.println("Resposta inválida.Escolha uma aula.");
       }
    	   
       }while(!opcao.equals("1-aula de Inglês")&& !opcao.equals("2-aula de portugues")&&
    		  ! opcao.equals("3- aula de matematica")&& !opcao.equals("4- aula de Historia")&&
    		   !opcao.equals("5- aula de informatica"));	
	 sc.close(); 
    }
}
