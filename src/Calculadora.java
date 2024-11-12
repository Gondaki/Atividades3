import javax.swing.*;

public class Calculadora {
    private JButton Button7;
    private JButton Button8;
    private JButton Button9;
    private JButton Button4;
    private JButton Button5;
    private JButton Button6;
    private JButton ButtonClear;
    private JButton Button1;
    private JButton Button2;
    private JButton Button3;
    private JButton Button0;
    private JButton ButtonDiv;
    private JButton ButtonMult;
    private JButton ButtonSoma;
    private JButton ButtonSub;
    private JButton ButtonResult;
    private JPanel painel;
    private JPanel painelMain;
    private JTextField txtValor;

    public Calculadora() {
      Button0.addActionListener(e -> appendNumber("0"));
      Button1.addActionListener(e -> appendNumber("1"));
      Button2.addActionListener(e -> appendNumber("2"));
      Button3.addActionListener(e -> appendNumber("3"));
      Button4.addActionListener(e -> appendNumber("4"));
      Button5.addActionListener(e -> appendNumber("5"));
      Button6.addActionListener(e -> appendNumber("6"));
      Button7.addActionListener(e -> appendNumber("7"));
      Button8.addActionListener(e -> appendNumber("8"));
      Button9.addActionListener(e -> appendNumber("9"));

  }
  private void appendNumber(String valor) {
txtValor.setText(txtValor.getText() + valor);
  }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().painelMain);
        frame.pack();
        frame.setVisible(true);

    }

}
