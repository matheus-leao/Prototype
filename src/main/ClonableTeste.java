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
        
        Processador processadorBase = new Processador();        
        Processador processadorIntel = processadorBase.clone();
        processadorIntel.setDescricao("Processador intel core i7");
        processadorIntel.setMarca("Intel");
        processadorIntel.setModelo("core i7");
        
        Processador processadorAMD = processadorBase.clone();
        processadorAMD.setDescricao("Processador amd fx 8320");
        processadorAMD.setMarca("AMD");
        processadorAMD.setModelo("fx 8320");
        
        
        MemoriaRam memoriaBase = new MemoriaRam();
        MemoriaRam memoria4gb = memoriaBase.clone();
        memoria4gb.setDescricao("Kingston 4gb");
        memoria4gb.setMarca("Kingston");
        memoria4gb.setModelo("4gb");
        
        MemoriaRam memoria8gb = memoriaBase.clone();
        memoria8gb.setDescricao("Kingston 8gb");
        memoria8gb.setMarca("Kingston");
        memoria8gb.setModelo("8gb");
        
        
        
        PlacaVideo placaVideoBase = new PlacaVideo();
        PlacaVideo placaNvidia = placaVideoBase.clone();
        placaNvidia.setDescricao("Nvidia Titan X");
        placaNvidia.setMarca("Nvidia");
        placaNvidia.setModelo("Titan X");
        
        PlacaVideo placaRadeon = placaVideoBase.clone();
        placaRadeon.setDescricao("Radeon rx 580");
        placaRadeon.setMarca("Radeon");
        placaRadeon.setModelo("rx 580");
  
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
                System.out.println("Qual marca de processador voce deseja?");
                PecasPrototype processadorEscolhido = escolherPeca("o processador", processadorIntel, processadorAMD);
                if (processadorEscolhido != null) {
                    carrinho.add(processadorEscolhido);
                }
                break;
                
            case 2 : 
                System.out.println("Qual modelo de memoria voce deseja?");
                PecasPrototype memoriaEscolhida = escolherPeca("a memoria", memoria4gb, memoria8gb);
                if (memoriaEscolhida != null) {
                    carrinho.add(memoriaEscolhida);
                }
                break;
                
                
            case 3 : 
                System.out.println("Qual modelo de placa de video voce deseja?");
                PecasPrototype placaEscolhida = escolherPeca("a placa de video", placaNvidia, placaRadeon);
                if (placaEscolhida != null) {
                    carrinho.add(placaEscolhida);
                }
                break;
                
            default: System.out.println("Opcao invalida!!!!!");
                     break;
        }
        
        }while(opcao != 4);
        
        
        for (int i = 0; i < carrinho.size(); i++) {
            System.out.println("Pecas compradas");
            System.out.println(carrinho.get(i).getDescricao());
        }
        
    }
   
    
    public static PecasPrototype escolherPeca(String opcao, PecasPrototype opcao1, PecasPrototype opcao2){
        Scanner scanner = new Scanner(System.in);
        int opcaoPeca;
        System.out.println("Escolha " + opcao + " desejado");

        System.out.println("1 -" + opcao1.getDescricao());
        
        System.out.println("2 - " + opcao2.getDescricao());
        opcaoPeca = scanner.nextInt();
        switch(opcaoPeca){
        case 1 : return opcao1;
        case 2 : return opcao2;
        
        default: System.out.println("Opcao invalida!!!!!");
                  return null;
        }   
    }
    
}


    
