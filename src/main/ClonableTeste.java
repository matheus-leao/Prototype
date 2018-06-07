/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import model.MemoriaRam;
import model.PecasPrototype;
import model.PlacaVideo;
import model.Processador;

/**
 *
 * @author Math
 */
public class ClonableTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<PecasPrototype> carrinho = new ArrayList<PecasPrototype>();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{
        System.out.println("********************************************************************************");
        System.out.println("Escolha o tipo de peça q deseja comprar?");
        
        System.out.println("1 - Processador");
        
        System.out.println("2 - Memoria Ram");
            
        System.out.println("3 - Placa de Video ");
        
        System.out.println("4 - Sair");
        
         System.out.println("********************************************************************************");     
        opcao = scanner.nextInt();
        
        switch(opcao){
            case 1 :         
                escolherProcessador(carrinho);                
                break;               
            case 2 : 
                escolherMemoria(carrinho);                
                break;            
            case 3 : 
                escolherPlaca(carrinho);                
                break;
            case 4 : break;
            default: System.out.println("Opcao invalida!!!!!");
                     break;
        }
        
        }while(opcao != 4);
        
        System.out.println("Pecas compradas");
        for (int i = 0; i < carrinho.size(); i++) {
            System.out.println(carrinho.get(i).getDescricao());
        }
        
    } 
       
    public static void escolherProcessador(ArrayList<PecasPrototype> carrinho){
        Scanner scanner = new Scanner(System.in);
        int opcaoPeca;
        PecasCache.criarCachePecas();
        
        Processador processadorEscolhido = (Processador) PecasCache.buscarPecaEmCache("processador");
        System.out.println("Escolha o modelo desejado");

        System.out.println("1 - intel core i7");
        
        System.out.println("2 - intel core i5");
        opcaoPeca = scanner.nextInt();
        switch(opcaoPeca){
        case 1 : processadorEscolhido.setModelo("core i7");
                 carrinho.add(processadorEscolhido.clone());
                 break;
                  
        case 2 : processadorEscolhido.setModelo("core i5");
                 carrinho.add(processadorEscolhido.clone());
                 break;
        
        default: System.out.println("Opcao invalida!!!!!");
                  break;
        }   
    }
    
    public static void escolherPlaca(ArrayList<PecasPrototype> carrinho){
        Scanner scanner = new Scanner(System.in);
        int opcaoPeca;
        PecasCache.criarCachePecas();
        
        PlacaVideo placaEscolhido = (PlacaVideo) PecasCache.buscarPecaEmCache("processador");
        System.out.println("Escolha o modelo desejado");

        System.out.println("1 - nvidia Titan X");
        
        System.out.println("2 - nvidia Titan XXX");
        opcaoPeca = scanner.nextInt();
        switch(opcaoPeca){
        case 1 : placaEscolhido.setModelo("Titan X");
                 carrinho.add(placaEscolhido.clone());
                 break;
                  
        case 2 : placaEscolhido.setModelo("Titan XXX");
                 carrinho.add(placaEscolhido.clone());
                 break;
        
        default: System.out.println("Opcao invalida!!!!!");
                  break;
        }   
    }
    
    public static void escolherMemoria(ArrayList<PecasPrototype> carrinho){
        Scanner scanner = new Scanner(System.in);
        int opcaoPeca;
        PecasCache.criarCachePecas();
        
        MemoriaRam memoriaEscolhida = (MemoriaRam) PecasCache.buscarPecaEmCache("memoria ram");
        System.out.println("Escolha o modelo desejado");

        System.out.println("1 - kingston 4gb");
        
        System.out.println("2 - kingston 8gb");
        opcaoPeca = scanner.nextInt();
        switch(opcaoPeca){
        case 1 : memoriaEscolhida.setModelo("4gb");
                 carrinho.add(memoriaEscolhida.clone());
                 break;
                  
        case 2 : memoriaEscolhida.setModelo("8gb");
                 carrinho.add(memoriaEscolhida.clone());
                 break;
        
        default: System.out.println("Opcao invalida!!!!!");
                  break;
        }   
    }
    
}
