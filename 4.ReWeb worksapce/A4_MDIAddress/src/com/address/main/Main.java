package com.address.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;

import com.address.function.AddressDelete;
import com.address.function.AddressInsert;
import com.address.function.AddressSearch;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu menu;
	private JDesktopPane desktopPane;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("MDI 주소록");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 889);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getDesktopPane());
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
			menuBar.add(getMenu());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("File");
			mnNewMenu.add(getMntmNewMenuItem());
		}
		return mnNewMenu;
	}
	private JMenu getMenu() {
		if (menu == null) {
			menu = new JMenu("주소록");
			menu.add(getMntmNewMenuItem_1());
			menu.add(getMntmNewMenuItem_2());
			menu.add(getMntmNewMenuItem_3());
		}
		return menu;
	}
	private JDesktopPane getDesktopPane() {
		if (desktopPane == null) {
			desktopPane = new JDesktopPane();
			desktopPane.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					
				}
			});
			desktopPane.setBounds(17, 15, 818, 614);
		}
		return desktopPane;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("종료");
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("입력");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					OpenAddressInsert();
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("검색");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					OpenAddressSearch();
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("수정 및 삭제");
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					OpenAddressDelete();
				}
			});
		}
		return mntmNewMenuItem_3;
	}
	
	///==========================================================
	
	private void OpenAddressInsert() {
	      AddressInsert addressinsert = new AddressInsert(); 
	      desktopPane.add(addressinsert);
	      addressinsert.setVisible(true);
	   }
	
	private void OpenAddressSearch() {
		 AddressSearch addresssearch = new AddressSearch(); 
	      desktopPane.add(addresssearch);
	      addresssearch.setVisible(true);
	}
	
	private void OpenAddressDelete() {
		AddressDelete addressdelete = new AddressDelete(); 
	      desktopPane.add(addressdelete);
	      addressdelete.setVisible(true);

	}
	
	
	
	//-------------------------------------------------------
}
