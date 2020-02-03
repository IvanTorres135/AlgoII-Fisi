package pe.unmsm.agenda.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import pe.unmsm.agenda.model.Contrato;

public class ControleRemover implements ActionListener{
    private final JList<Contrato> listaContatos;
    private final DefaultListModel<Contrato> contatos;
    
    public ControleRemover (JList<Contrato> listaContatos, DefaultListModel<Contrato> contatos) {
        this.listaContatos = listaContatos;
        this.contatos = contatos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Contrato contatoSelecionado = listaContatos.getSelectedValue();
        contatos.removeElement(contatoSelecionado);
    }

}
