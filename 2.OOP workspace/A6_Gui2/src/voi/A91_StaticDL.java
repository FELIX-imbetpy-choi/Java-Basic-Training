package voi;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class A91_StaticDL extends JDialog {

   private final JPanel contentPanel = new JPanel();
   private JTextField tfUserId;
   private JTextField tfUserName;
   private JTextField tfUserAddress;
   private JTextField tfHobbybox;
   private JTextField tfFruitsbox;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      try {
         A91_StaticDL dialog = new A91_StaticDL();
         dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
         dialog.setVisible(true);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   /**
    * Create the dialog.
    */
   public A91_StaticDL() {
      setBounds(100, 100, 450, 300);
      getContentPane().setLayout(new BorderLayout());
      contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
      getContentPane().add(contentPanel, BorderLayout.CENTER);
      contentPanel.setLayout(null);
      {
         tfUserId = new JTextField();
         tfUserId.setBounds(69, 16, 99, 25);
         contentPanel.add(tfUserId);
         tfUserId.setColumns(10);
         tfUserId.setText(A91_StaticClass.strUserid);
         
      }
      {
         tfUserName = new JTextField();
         tfUserName.setBounds(69, 53, 99, 25);
         tfUserName.setText("");
         tfUserName.setColumns(10);
         contentPanel.add(tfUserName);
         tfUserName.setText(A91_StaticClass.strUsername);
      }
      {
         tfUserAddress = new JTextField();
         tfUserAddress.setBounds(69, 90, 289, 25);
         tfUserAddress.setText("");
         tfUserAddress.setColumns(10);
         contentPanel.add(tfUserAddress);
         tfUserAddress.setText(A91_StaticClass.strUserAddress);
      }
      {
         JLabel lblId = new JLabel("ID : ");
         lblId.setBounds(28, 19, 62, 18);
         contentPanel.add(lblId);
      }
      {
         JLabel label = new JLabel("이름 :");
         label.setBounds(14, 56, 62, 18);
         contentPanel.add(label);
      }
      {
         JLabel label = new JLabel("주소 :");
         label.setBounds(14, 93, 62, 18);
         contentPanel.add(label);
      }
      {
         JLabel label = new JLabel("선택 취미 : ");
         label.setBounds(14, 127, 76, 18);
         contentPanel.add(label);
      }
      {
         JLabel label = new JLabel("선택 과일 :");
         label.setBounds(14, 157, 76, 18);
         contentPanel.add(label);
      }
      {
         tfHobbybox = new JTextField();
         tfHobbybox.setBounds(93, 124, 116, 24);
         contentPanel.add(tfHobbybox);
         tfHobbybox.setColumns(10);
         tfHobbybox.setText(A91_StaticClass.Hobby);
      }
      {
         tfFruitsbox = new JTextField();
         tfFruitsbox.setColumns(10);
         tfFruitsbox.setBounds(93, 154, 116, 24);
         contentPanel.add(tfFruitsbox);
         tfFruitsbox.setText(A91_StaticClass.Fruits);
      }
      {
         JPanel buttonPane = new JPanel();
         buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
         getContentPane().add(buttonPane, BorderLayout.SOUTH);
      }
   }
   
   
   
   

}