package ExercicioCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
//trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
//programa deverá atender as seguintes funcionalidades:
//Armazenar dados da List
//Remover dados da list;
//Atualizar dados da list.
//Apresentar todos os dados da list.
	public class EstoqueLoja {
		public static void main(String[] args) {
			int op;
		        try (Scanner ler = new Scanner(System.in))
		        
		        {
			
		       ArrayList<String> estoque = new ArrayList<String>();
	            
	            System.out.println("\n          *Loja Carol Modas*  "           );
	            
	            do {
	                System.out.println("\n           Digite uma opção: "           );
	                System.out.println("----------------------------------------");
	                System.out.println("(1)Adicionar produtos ao estoque de roupas\n(2)Remover\n(3)Atualizar\n(4)Mostrar todos os produtos do estoque\n(0)Encerrar programa");
	                System.out.println("----------------------------------------");
	                op = ler.nextInt();
	            
	                

	                switch(op)
	                    {
	                        case 1:
	                            ler.nextLine();
	                            System.out.print("Produto a ser adicionado ao estoque de roupas:");
	                            String produto = ler.nextLine();
	                            estoque.add(produto);
	                            break;
	                
	                        case 2:
	                            ler.nextLine();
	                            System.out.println("Produto a ser removido do estoque de roupas:");
	                            String produtor = ler.nextLine();
	                            if(estoque.contains(produtor))
	                            {
	                            estoque.remove(produtor);
	                            }
	                            else
	                            {
	                                System.out.println("Produto não existe");
	                            }
	                            break;
	                            
	                        case 3:
	                            ler.nextLine();
	                            System.out.println("Atualize seu produto do estoque de roupas: ");
	                            String verifica = ler.nextLine();
	                            System.out.println("Digite o nome do produt0o novo"+verifica+":");
	                            String novo = ler.nextLine();
	                            
	                            if(estoque.contains(verifica))
	                            {
	                                estoque.remove(verifica);
	                                estoque.add(novo);
	                            }
	                            else
	                            {
	                                System.out.println("Produto não existe!");
	                            }
	                            System.out.println(estoque);
	                            break;
	                
	                        case 4:
	                            
	                            System.out.println("Produtos  do estoque:");
	                            System.out.println(estoque);
	                            break;
	                            
	                        default:
	                            System.out.println("Obrigada por Compararecer!!!");
	                    
	                        }
	            
	            }while(op !=0);
	        }

	    }
	}