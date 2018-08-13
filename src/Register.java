//Loren Garcia - 1693212

import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    
    public static void listing(ArrayList<String> list) {
        
        if(list.isEmpty()) {
            System.out.println("-------------------");
            System.out.println("Lista Vazia!");
            System.out.println("-------------------");
        } else {
            System.out.println("\nListagem de Nomes");
            System.out.println("-------------------");
            for(int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println("-------------------");
        }
    }
    
    public static void registering(ArrayList<String> list) {
        
        Scanner read = new Scanner(System.in);
        System.out.println("\nDigite o nome:");
        list.add(read.nextLine());
    }
    
    public static void main(String[] args) {        
        
        ArrayList<String> list = new ArrayList();
        Scanner read = new Scanner(System.in);
        int option;
        
        while(true) {
            
            System.out.println("\nCadastro de nomes");
            System.out.println("(1) Inserir nome");
            System.out.println("(2) Listar nomes");
            System.out.println("(3) Sair");
            System.out.println("Digite a opção desejada:");
            option = read.nextInt();
            
            if(option == 1) {
                registering(list);
            }else if (option == 2) {
                listing(list);
            }else if (option == 3) {
                break;
            }else {
                System.out.println("Opção inválida!\n");
            }
        }
    }    
}
