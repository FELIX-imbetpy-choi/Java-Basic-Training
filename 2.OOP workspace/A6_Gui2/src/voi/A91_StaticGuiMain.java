package voi;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class A91_StaticGuiMain extends JFrame {

   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private JPanel contentPane;
   private JMenuBar menuBar;
   private JLabel lblNewLabel;
   private JPasswordField pfBox;
   private JLabel lblNewLabel_1;
   private JLabel lblName;
   private JLabel lblAddress;
   private JLabel lblHobby;
   private JLabel lblFruits;
   private JTextField tfId;
   private JTextField tfName;
   private JTextField tfAddress;
   private JMenu mnFile;
   private JMenu mnHelp;
   private JMenuItem mntmExit;
   private JButton btnInsert;
   private JCheckBox cbSoccer;
   private JCheckBox cbStudy;
   private JCheckBox cbBaseball;
   private JRadioButton rbApple;
   private JRadioButton rbBanana;
   private JRadioButton rbTomato;
   private JMenuItem menuItem;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               A91_StaticGuiMain frame = new A91_StaticGuiMain();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public A91_StaticGuiMain() {
      setTitle("Information");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 581, 473);
      setJMenuBar(getMenuBar_1());
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      contentPane.add(getLblNewLabel());
      contentPane.add(getPfBox());
      contentPane.add(getLblNewLabel_1());
      contentPane.add(getLblName());
      contentPane.add(getLblAddress());
      contentPane.add(getLblHobby());
      contentPane.add(getLblFruits());
      contentPane.add(getTfId());
      contentPane.add(getTfName());
      contentPane.add(getTfAddress());
      contentPane.add(getBtnInsert());
      contentPane.add(getCbSoccer());
      contentPane.add(getCbStudy());
      contentPane.add(getCbBaseball());
      contentPane.add(getRbApple());
      contentPane.add(getRbBanana());
      contentPane.add(getRbTomato());
   }

   private JMenuBar getMenuBar_1() {
      if (menuBar == null) {
         menuBar = new JMenuBar();
         menuBar.add(getMnFile());
         menuBar.add(getMnHelp());
      }
      return menuBar;
   }
   //----------------------------------------
   //비밀번호 1234
   private JLabel getLblNewLabel() {
      if (lblNewLabel == null) {
         lblNewLabel = new JLabel("Password :");
         lblNewLabel.setBounds(14, 12, 109, 18);
      }
      return lblNewLabel;
   }
   private JPasswordField getPfBox() {
      if (pfBox == null) {
         pfBox = new JPasswordField();
         pfBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               PassId();
               pfBox.setEnabled(false);
            }
         });
         pfBox.setBounds(106, 9, 116, 24);
      }
      return pfBox;
   }
   private JLabel getLblNewLabel_1() {
      if (lblNewLabel_1 == null) {
         lblNewLabel_1 = new JLabel("User ID : ");
         lblNewLabel_1.setBounds(14, 66, 109, 18);
         lblNewLabel_1.setVisible(false);
      }
      return lblNewLabel_1;
   }
   private JLabel getLblName() {
      if (lblName == null) {
         lblName = new JLabel("Name : ");
         lblName.setBounds(14, 119, 109, 18);
         lblName.setVisible(false);
      }
      return lblName;
   }
   private JLabel getLblAddress() {
      if (lblAddress == null) {
         lblAddress = new JLabel("Address : ");
         lblAddress.setBounds(14, 176, 109, 18);
         lblAddress.setVisible(false);
      }
      return lblAddress;
   }
   private JLabel getLblHobby() {
      if (lblHobby == null) {
         lblHobby = new JLabel("Hobby : ");
         lblHobby.setBounds(14, 223, 109, 18);
         lblHobby.setVisible(false);
      }
      return lblHobby;
   }
   private JLabel getLblFruits() {
      if (lblFruits == null) {
         lblFruits = new JLabel("Fruits : ");
         lblFruits.setBounds(14, 277, 109, 18);
         lblFruits.setVisible(false);
      }
      return lblFruits;
   }
   private JTextField getTfId() {
      if (tfId == null) {
         tfId = new JTextField();
         tfId.setEnabled(false);
         tfId.setBounds(106, 63, 116, 24);
         tfId.setColumns(10);
         tfId.setVisible(false);
      }
      return tfId;
   }
   private JTextField getTfName() {
      if (tfName == null) {
         tfName = new JTextField();
         tfName.setColumns(10);
         tfName.setBounds(106, 116, 116, 24);
         tfName.setVisible(false);
      }
      return tfName;
   }
   private JTextField getTfAddress() {
      if (tfAddress == null) {
         tfAddress = new JTextField();
         tfAddress.setColumns(10);
         tfAddress.setBounds(106, 173, 433, 24);
         tfAddress.setVisible(false);
      }
      return tfAddress;
   }
   private JMenu getMnFile() {
      if (mnFile == null) {
         mnFile = new JMenu("File");
         mnFile.add(getMntmExit());
      }
      return mnFile;
   }
   private JMenu getMnHelp() {
      if (mnHelp == null) {
         mnHelp = new JMenu("Help");
         mnHelp.add(getMenuItem());
      }
      return mnHelp;
   }
   private JMenuItem getMntmExit() {
      if (mntmExit == null) {
         mntmExit = new JMenuItem("Exit");
         mntmExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               System.exit(0);
            }
         });
      }
      return mntmExit;
   }
   private JButton getBtnInsert() {
      if (btnInsert == null) {
         btnInsert = new JButton("Insert");
         btnInsert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
               insertAdd();
            }
         });
         btnInsert.setBounds(434, 329, 105, 27);
         btnInsert.setVisible(false);
      }
      return btnInsert;
   }
   private JCheckBox getCbSoccer() {
      if (cbSoccer == null) {
         cbSoccer = new JCheckBox("Soccer");
         buttonGroup.add(cbSoccer);
         cbSoccer.setBounds(91, 219, 131, 27);
         cbSoccer.setVisible(false);
      
      }
      return cbSoccer;
   }
   private JCheckBox getCbStudy() {
      if (cbStudy == null) {
         cbStudy = new JCheckBox("Study");
         buttonGroup.add(cbStudy);
         cbStudy.setBounds(228, 219, 131, 27);
         cbStudy.setVisible(false);
         
      }
      return cbStudy;
   }
   private JCheckBox getCbBaseball() {
      if (cbBaseball == null) {
         cbBaseball = new JCheckBox("Baseball");
         buttonGroup.add(cbBaseball);
         cbBaseball.setBounds(365, 219, 131, 27);
         cbBaseball.setVisible(false);
         
         
      }
      return cbBaseball;
   }
   private JRadioButton getRbApple() {
      if (rbApple == null) {
         rbApple = new JRadioButton("Apple");
         buttonGroup_1.add(rbApple);
         rbApple.setBounds(91, 273, 139, 27);
         rbApple.setVisible(false);
      
      }
      return rbApple;
   }
   private JRadioButton getRbBanana() {
      if (rbBanana == null) {
         rbBanana = new JRadioButton("Banana");
         buttonGroup_1.add(rbBanana);
         rbBanana.setBounds(228, 273, 139, 27);
         rbBanana.setVisible(false);
      
         
      }
      return rbBanana;
   }
   private JRadioButton getRbTomato() {
      if (rbTomato == null) {
         rbTomato = new JRadioButton("Tomato");
         buttonGroup_1.add(rbTomato);
         rbTomato.setBounds(365, 273, 139, 27);
         rbTomato.setVisible(false);
      
      }
      return rbTomato;
   }
   private JMenuItem getMenuItem() {
      if (menuItem == null) {
         menuItem = new JMenuItem("결과");
         menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               A91_StaticDL gui02 = new A91_StaticDL();
               gui02.setVisible(true);
            }
         });
      }
      return menuItem;
   }
   
   //---------------------------------------------------------------
   // 비밀번호 1234
   int i = 1234;
   private final ButtonGroup buttonGroup = new ButtonGroup();
   private final ButtonGroup buttonGroup_1 = new ButtonGroup();
   private void PassId() {
      
      char[] pass = pfBox.getPassword();
      String Password = new String(pass);
      Integer.parseInt(Password);
      
      if(Integer.parseInt(Password) == i) {
         
         tfId.setVisible(true);
         lblNewLabel_1.setVisible(true);
         
         tfName.setVisible(true);
         lblName.setVisible(true);
         
         lblHobby.setVisible(true);
         cbSoccer.setVisible(true);
         cbStudy.setVisible(true);
         cbBaseball.setVisible(true);
         
         tfAddress.setVisible(true);
         lblAddress.setVisible(true);
         
         lblFruits.setVisible(true);
         rbApple.setVisible(true);
         rbBanana.setVisible(true);
         rbTomato.setVisible(true);
         
         
         tfId.setText("");
         tfId.setEnabled(true);
         
         btnInsert.setVisible(true);
         
         lblNewLabel.setVisible(false);
         pfBox.setVisible(false);
         
      }else {
         tfId.setVisible(false);
      }
      
   }//----------if문
   
   private void insertAdd() {
      A91_StaticClass.strUserid = tfId.getText();
      A91_StaticClass.strUsername = tfName.getText();
      A91_StaticClass.strUserAddress = tfAddress.getText();
      
      
      if (cbSoccer.isSelected() == true) {
         A91_StaticClass.Hobby = cbSoccer.getText();
      }
      if (cbStudy.isSelected() == true) {
         A91_StaticClass.Hobby = cbStudy.getText();
      }
      if (cbBaseball.isSelected() == true) {
         A91_StaticClass.Hobby = cbBaseball.getText();
      }
      
      
      if (rbApple.isSelected() == true) {
         A91_StaticClass.Fruits = rbApple.getText();
      }
      if (rbBanana.isSelected() == true) {
         A91_StaticClass.Fruits = rbBanana.getText();
      }
      if (rbTomato.isSelected() == true) {
         A91_StaticClass.Fruits = rbTomato.getText();
      }
      
            
}
   
   
   
   
   
}//--------------------------