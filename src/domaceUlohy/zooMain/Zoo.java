/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaceUlohy.zooMain;
import domaceUlohy.AktivityZoo.Reklama;
import domaceUlohy.AktivityZoo.Vzdelavanie;
import domaceUlohy.Zamestnanci.Osetrovatel;
import domaceUlohy.Zviera.Cicavce.Medved;
import domaceUlohy.Zviera.Vtaky.Orol;



/**
 *
 * @author Einstein
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orol Jakub = new Orol();
        Jakub.pohybujeSa();
        Osetrovatel Ondrej = new Osetrovatel();
        Ondrej.pracuje();
        Vzdelavanie a = new Vzdelavanie();
        a.cinnosti();
       
    }
    
}
