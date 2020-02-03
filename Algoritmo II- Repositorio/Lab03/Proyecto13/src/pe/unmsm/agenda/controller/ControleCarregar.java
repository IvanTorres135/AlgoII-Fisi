package pe.unmsm.agenda.controller;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import pe.unmsm.agenda.model.Contrato;

public class ControleCarregar implements ListSelectionListener {
    private final JList<Contrato> listaContatos;
    private final JTextField campoNome;
    private final JTextField campoTelefone;
    private final JTextArea campoDetalhes;
    
    public ControleCarregar (JList<Contrato> listaContatos, JTextField campoNome, JTextField campoTelefone, JTextArea campoDetalhes) {
        this.listaContatos = listaContatos;
        this.campoNome = campoNome;
        this.campoTelefone = campoTelefone;
        this.campoDetalhes = campoDetalhes;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        Contrato contatoSelecionado = listaContatos.getSelectedValue();
        
        if (contatoSelecionado != null) {
            campoNome.setText(contatoSelecionado.getNome());
            campoTelefone.setText(contatoSelecionado.getTelefono());
            campoDetalhes.setText(contatoSelecionado.getDetalles());
        } else {
            campoNome.setText("");
            campoTelefone.setText("");
            campoDetalhes.setText("");
        }

        campoNome.setEnabled(contatoSelecionado != null);
        campoTelefone.setEnabled(contatoSelecionado != null);
        campoDetalhes.setEnabled(contatoSelecionado != null);

        listaContatos.repaint();        
    }

}
