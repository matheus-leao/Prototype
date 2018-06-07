/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Hashtable;
import model.MemoriaRam;
import model.PecasPrototype;
import model.PlacaVideo;
import model.Processador;

/**
 *
 * @author Luiz myguel
 */
public class PecasCache {
   private static Hashtable<String, PecasPrototype> pecasMap  = new Hashtable<String, PecasPrototype>();

   public static PecasPrototype buscarPecaEmCache(String pecasTipo) {
      PecasPrototype pecaSalvaEmCache = pecasMap.get(pecasTipo);
      return pecaSalvaEmCache.clone();
   }
   public static void criarCachePecas() {
      
     
       
      Processador processadorIntel = new Processador();
      processadorIntel.setMarca("Intel");
      pecasMap.put(processadorIntel.getTipoPeca(),processadorIntel);

      MemoriaRam memoriaKingston = new MemoriaRam();
      memoriaKingston.setMarca("Kingston");
      pecasMap.put(memoriaKingston.getTipoPeca(), memoriaKingston);

      PlacaVideo placaNvidia = new PlacaVideo();
      placaNvidia.setMarca("Nvidia");
      pecasMap.put(placaNvidia.getTipoPeca(), placaNvidia);
   }
}
