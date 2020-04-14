/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultPackage;

/**
 *
 * @author kamaj
 */
public class Jono {

    private ListItem huippu;
    private int size;

    // muodosta uusi lista-alkio ja vie se pinon huipulle
    public void push(String aData) {
        ListItem item = new ListItem();
        item.setData(aData);
        if (huippu != null) {
            ListItem temp = huippu;
            huippu = item;
            huippu.setNext(temp);
        } else {
            huippu = item;
        }
        size ++;
    }
    // poista ja palauta alkio pinon huipulta,
    // jos pino tyhjä palauta null
    public ListItem pop(){
        if (huippu != null) {
            ListItem temp;
            temp = huippu;
            huippu = huippu.getNext();
            size--;
            return temp;
        }
        return null;
    }
    // tulosta pinon sisältö muuttamatta pinoa
    public void printItems() {
        ListItem temp = huippu;
        while( temp != null) {
            System.out.print(temp.getData()+ ", ");
            temp = temp.getNext();
        }
    }
    public int getSize() {
        return size;
    }

}
