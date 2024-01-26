///Scrivere un programma che contenga una classe
// che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
//Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Auto.
//In questo caso la nota importante è rendere le proprietà della classe auto
// accessibili solo attraverso i metodi.
public class Main {
    public static void main(String[] args) {
        Auto macchina1 = new Auto();
        macchina1.setCilindrata(750);
        macchina1.setTarga("BS9339A");
        macchina1.setMarca("Opel");
        macchina1.setModello("Astra");

        System.out.println("Dati macchina 1");
        System.out.println(macchina1.getMarca());
        System.out.println(macchina1.getModello());
        System.out.println(macchina1.getCilindrata());
        System.out.println(macchina1.getTarga());
    }
}