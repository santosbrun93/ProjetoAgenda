import com.projeto.Agenda.DAO.ClienteDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainGUI {
    private JButton cadastrar;
    private JPanel mainPanel;
    private JButton agendarButton;
    private JButton atualizarAgendaButton;
    private JTabbedPane tabbedPane1;
    private JTextField guiNome;
    private JTextField guiRG;
    private JTextField guiCPF;
    private JTextField guiDataNascimento;
    private JTextField guiEmail;
    private JTextField guiCidade;
    private JTextField guiRua;
    private JTextField ruiNumero;
    private JTextField guiComplemento;
    private JTextField guiCep;
    private JTextField guiBairro;
    private JTextField guiEstado;
    private JTextField guiPais;
    private JComboBox guiPesquisaCliente;
    private JComboBox guiPesquisaProcedimento;
    private JComboBox guiPesquisaProfissional;
    private JComboBox guiPesquisaEspaco;
    private JTable guiAgenda;


    public mainGUI(){
        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = guiNome.getText();
                String email = guiEmail.getText();
                String CPF = guiCPF.getText();
                String RG = guiRG.getText();
                //Date dataNascimento = guiDataNascimento.getText();

                ClienteDAO cliente = new ClienteDAO();
                //cliente.save();

            }
        }
        );
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Projeto Agenda");
        frame.setContentPane(new mainGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(650, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}