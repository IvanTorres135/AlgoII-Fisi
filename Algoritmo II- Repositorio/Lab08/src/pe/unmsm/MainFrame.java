package pe.unmsm;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame{
    private static final long serialVersionUID = 1L;
    private JTextArea textArea;
    private JButton btn,btn2;
    private int cont=0;
    
    public MainFrame() {
	super("Welcome to the Future!");	
	setLayout(new BorderLayout());
		
	btn = new JButton("Boton 1");
        btn2 = new JButton("Boton 2");
        textArea = new JTextArea();
		
        // listen to button clicks; remember Android?
	// can be done also implementing it in the class
	btn.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
            if(cont%2==0){
                cont=cont+1;
                textArea.append(cont+"\n");
            }else{
                cont=cont+2;
                textArea.append(cont+"\n");
            }
	}
	});
                
        btn2.addActionListener(new ActionListener() {
        @Override
	public void actionPerformed(ActionEvent e) {
            if(cont%2==0){
                cont=cont+2;
                textArea.append(cont+"\n");
            }else{
                cont=cont+1;
                textArea.append(cont+"\n");
            }    
	}
	});
		
	add(textArea, BorderLayout.CENTER);
	add(btn2, BorderLayout.SOUTH);
        add(btn, BorderLayout.NORTH);
		
	setSize(300, 200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	}
}
