/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author mati
 */
public class Coche {
    
            private String modelo, color, matricula, tipo, seguro;
            private boolean metalizado;
            private int ano;
            
            //contructor 
            public Coche(){
                modelo="x";
                color="verde";
                matricula="v-6666-hg";
                tipo="mini";
                seguro="todo riesgo";
                metalizado=false;
                ano=1999;                    
            }
            
            public void setcoche(String modelo, String color, String matricula, String tipo, String seguro, boolean metalizado, int ano){
                this.modelo=modelo;
                this.color=color;
                this.matricula=matricula;
                this.seguro=seguro;
                this.tipo=tipo;
                this.ano=ano;
                this.metalizado=metalizado;
                
            }
            public void setmodelo (String a) {
                 modelo =a;
        }
            public void setcolor (String a) {
                color =a;
        }
            public void settipocoche (String a) {
                 tipo =a;
        }
            public void setmodalidadseguro (String a) {
                 seguro =a;
        }
            public void setmatricula (String a) {
                 matricula =a;
        }
            public void setesmetalizado (boolean a) {
                metalizado =a;
        }
            public void setano (int a) {
                 int ano= a;
        }
    
    
        public String  getmodelo (){
            return modelo;
        }
        public String  getcolor (){
            return color;
        }
        public String  gettipocoche (){
            return tipo;
         }
        public String  getmodalidadseguro (){
            return seguro;
        }
        public String  getmatricula (){
            return matricula;
         }
        public boolean  getesmetalizado (){
            return metalizado;
        }
        public int getano (){
         return ano;
        }
        
       
}

