package pets.io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListasOrdem {
    public static void main(String[] args) throws Exception {
        List<Gato> Gatos = new ArrayList<>();

        Gatos.add(new Gato("Jon", 18, "preto"));
        Gatos.add(new Gato("Linx", 6, "Listrado"));
        Gatos.add(new Gato("Kaiser", 2, "Marrom"));

        System.out.println(Gatos);

        System.out.println("Ordem de inserção");
        System.out.println(Gatos);

        //POR ALGUM MOTIVO NÃO BUGOU DESTA VEZ O USO DO COLLECTIONS
        System.out.println("Ordem aleatória");
        Collections.shuffle(Gatos);
        System.out.println(Gatos);

        //NECESSIDADE DE USAR O COMPARETO PARA CONSEGUIR FAZER ESTÁ PARTE
        System.out.println("Ordem natural");
        Collections.sort(Gatos);
        System.out.println(Gatos);

        
        System.out.println("Ordem por idade");
        Collections.sort(Gatos, new ComparatorIdade());
        Gatos.sort(new ComparatorIdade());
        System.out.println(Gatos);

        System.out.println("Ordem por cor");
        Collections.sort(Gatos, new ComparatorCor());
        Gatos.sort(new ComparatorCor());
        System.out.println(Gatos);

        System.out.println("Ordem por Nome");
        Collections.sort(Gatos, new ComparatorNome());
        Gatos.sort(new ComparatorNome());
        System.out.println(Gatos);
    }
}
