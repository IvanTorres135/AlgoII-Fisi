package pe.unmsm.agenda.controller;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import pe.unmsm.agenda.model.Contrato;

public class ControleSalvar extends KeyAdapter {
    private final JList<Contrato> listaContatos;
    private final JTextField campoNome;
    private final JTextField campoTelefone;
    private final JTextArea campoDetalhes;
    
    public ControleSalvar (JList<Contrato> listaContatos, JTextField campoNome, JTextField campoTelefone, JTextArea campoDetalhes) {
        this.listaContatos = listaContatos;
        this.campoNome = campoNome;
        this.campoTelefone = campoTelefone;
        this.campoDetalhes = campoDetalhes;
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        Contrato contatoSelecionado = listaContatos.getSelectedValue();
        if (contatoSelecionado != null) {
            contatoSelecionado.setNome(campoNome.getText());
            contatoSelecionado.setTelefono(campoTelefone.getText());
            contatoSelecionado.setDetalles(campoDetalhes.getText());
        }
        listaContatos.repaint();        
    }    
}
