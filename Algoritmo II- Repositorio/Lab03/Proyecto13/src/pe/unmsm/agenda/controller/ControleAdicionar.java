package pe.unmsm.agenda.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import pe.unmsm.agenda.model.Contrato;

public class ControleAdicionar implements ActionListener{
    private final DefaultListModel<Contrato> contratos;
    
    public ControleAdicionar (DefaultListModel<Contrato> contratos) {
        this.contratos = contratos;
    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        contratos.addElement(new Contrato());
    }
}
