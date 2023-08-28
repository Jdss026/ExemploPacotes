package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiadora() {
        System.out.println("COPIANDO VIA MULTI");
    }

    @Override
    public void imprimindo() {
        System.out.println("IMPRIMINDO VIA MULTI");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA MULTI");
    }
}
