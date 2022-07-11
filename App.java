import Concessionaria.Concessionaria;
import Concessionaria.HondaBuilder;
import Concessionaria.YamahaBuiler;
import Product.MotoProduct;

public class App {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria(new HondaBuilder());

        concessionaria.construirMoto();
        MotoProduct moto = concessionaria.getMoto(); 
        System.out.println("Modelo|Moto: "+moto.modelo);
        System.out.println("Descrição: "+moto.dscModelo);
        System.out.println("Preço: "+moto.preco);
        System.out.println("Ano de Fabricação: "+moto.anoDeFabricacao);
        System.out.println("Montadora: "+moto.montadora);
        System.out.println("CC: "+moto.qtdCC);

        System.out.println("========================================================================================================");

        concessionaria = new Concessionaria(new YamahaBuiler()); {

            concessionaria.construirMoto();
            MotoProduct moto2 = concessionaria.getMoto(); 
            System.out.println("Modelo|Moto: "+moto2.modelo);
            System.out.println("Descrição: "+moto2.dscModelo);
            System.out.println("Preço: "+moto2.preco);
            System.out.println("Ano de Fabricação: "+moto2.anoDeFabricacao);
            System.out.println("Montadora: "+moto2.montadora);
            System.out.println("CC: "+moto2.qtdCC);

            System.out.println("");
        }
        
    }

    
}
