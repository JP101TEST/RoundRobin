/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rr;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JP
 */
public class GUIRR extends javax.swing.JFrame {

	static boolean runRR = false;
	static Controller controller = new Controller();
	static int ioUsbTextErrorCount = 0;

	/**
	 * Creates new form GUIRR
	 */
	public GUIRR() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		START_Button1 = new javax.swing.JButton();
		ADD_Button1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		clockLabel = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		START_Button2 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		terminate_Button = new javax.swing.JButton();
		QueTable = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jobQueTable = new javax.swing.JTable();
		jobQueLabel = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		terminateQueTable = new javax.swing.JTable();
		terTableLabel = new javax.swing.JLabel();
		jScrollPane4 = new javax.swing.JScrollPane();
		readyQueTable = new javax.swing.JTable();
		terTableLabel2 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jobQueLabel1 = new javax.swing.JLabel();
		jScrollPane3 = new javax.swing.JScrollPane();
		ioUsbQueTable = new javax.swing.JTable();
		addIoUsb = new javax.swing.JButton();
		endIoUsb = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jobQueLabel2 = new javax.swing.JLabel();
		jScrollPane5 = new javax.swing.JScrollPane();
		ioCdQueTable = new javax.swing.JTable();
		addIoCd = new javax.swing.JButton();
		endIoCd = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Round Robin ");

		jPanel1.setBackground(new java.awt.Color(153, 153, 255));

		START_Button1.setBackground(new java.awt.Color(153, 255, 102));
		START_Button1.setText("START");
		START_Button1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		START_Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		START_Button1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				START_Button1ActionPerformed(evt);
			}
		});

		ADD_Button1.setBackground(new java.awt.Color(153, 255, 102));
		ADD_Button1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		ADD_Button1.setText("ADD");
		ADD_Button1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		ADD_Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ADD_Button1.setEnabled(false);
		ADD_Button1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ADD_Button1ActionPerformed(evt);
			}
		});

		jLabel1.setBackground(new java.awt.Color(204, 204, 0));
		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Round Robin ");

		jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		jLabel2.setText("Process:");

		jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		jLabel3.setText("Clock               :");

		clockLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		clockLabel.setText("0");

		jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		jLabel5.setText("Time Quantum:");

		START_Button2.setBackground(new java.awt.Color(255, 102, 102));
		START_Button2.setText("EXIT");
		START_Button2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		START_Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		START_Button2.setEnabled(false);
		START_Button2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				START_Button2ActionPerformed(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		jLabel6.setText("CPU Process ID :");

		jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		jLabel7.setText("0");

		jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		jLabel8.setText("0");

		jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		jLabel9.setText("AVG Waiting Time :");

		jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		jLabel10.setText("");

		terminate_Button.setBackground(new java.awt.Color(255, 153, 153));
		terminate_Button.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		terminate_Button.setText("Terminate");
		terminate_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		terminate_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		terminate_Button.setEnabled(false);
		terminate_Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				terminate_ButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addGap(74, 74, 74)
						.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
						.addGap(69, 69, 69)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(START_Button2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(START_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(33, 33, 33)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel6).addComponent(jLabel9).addComponent(jLabel2))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(ADD_Button1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 129,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(39, 39, 39)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGroup(
										jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel5).addComponent(jLabel3))
										.addGap(35, 35, 35)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(clockLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 167,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addComponent(terminate_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 126,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(148, 148, 148)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
												.createSequentialGroup()
												.addComponent(START_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18).addComponent(START_Button2,
														javax.swing.GroupLayout.PREFERRED_SIZE, 53,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2).addComponent(ADD_Button1))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6).addComponent(jLabel7))
												.addGap(17, 17, 17)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel9).addComponent(jLabel8)
														.addComponent(terminate_Button)))
										.addComponent(jLabel10)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel5)
												.addGap(18, 18, 18)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3).addComponent(clockLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE, 25,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		QueTable.setBackground(new java.awt.Color(153, 153, 255));

		jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 400));

		jobQueTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		jobQueTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Process Name", "Arrival Time", "Burst Time", "Waitting Time", "Status Process" }));
		jobQueTable.setEnabled(false);
		jobQueTable.setRowHeight(35);
		jScrollPane1.setViewportView(jobQueTable);

		jobQueLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jobQueLabel.setText("Job Queue");

		jScrollPane2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		jScrollPane2.setPreferredSize(new java.awt.Dimension(452, 400));

		terminateQueTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		terminateQueTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Process Name", "Status Process" }));
		terminateQueTable.setEnabled(false);
		terminateQueTable.setRowHeight(35);
		jScrollPane2.setViewportView(terminateQueTable);

		terTableLabel.setBackground(new java.awt.Color(255, 255, 255));
		terTableLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		terTableLabel.setText("Terminate");

		jScrollPane4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		jScrollPane4.setPreferredSize(new java.awt.Dimension(452, 400));

		readyQueTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		readyQueTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Process Name", "Status Process" }));
		readyQueTable.setEnabled(false);
		readyQueTable.setRowHeight(35);
		jScrollPane4.setViewportView(readyQueTable);

		terTableLabel2.setBackground(new java.awt.Color(255, 255, 255));
		terTableLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		terTableLabel2.setText("Ready Queue");

		jPanel2.setBackground(new java.awt.Color(255, 204, 153));

		jobQueLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jobQueLabel1.setText("I/O USB");

		jScrollPane3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		jScrollPane3.setPreferredSize(new java.awt.Dimension(452, 400));

		ioUsbQueTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		ioUsbQueTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Process Name", "Waitting Time", "Status Process" }));
		ioUsbQueTable.setEnabled(false);
		ioUsbQueTable.setRowHeight(35);
		jScrollPane3.setViewportView(ioUsbQueTable);

		addIoUsb.setText("ADD");
		addIoUsb.setEnabled(false);
		addIoUsb.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addIoUsbActionPerformed(evt);
			}
		});

		endIoUsb.setText("END");
		endIoUsb.setEnabled(false);
		endIoUsb.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				endIoUsbActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 409,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(addIoUsb, javax.swing.GroupLayout.DEFAULT_SIZE, 183,
												Short.MAX_VALUE)
										.addComponent(endIoUsb, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(jobQueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jobQueLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(addIoUsb)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(endIoUsb).addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));

		jPanel3.setBackground(new java.awt.Color(153, 204, 255));

		jobQueLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jobQueLabel2.setText("I/O CD");

		jScrollPane5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		jScrollPane5.setPreferredSize(new java.awt.Dimension(452, 400));

		ioCdQueTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		ioCdQueTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Process Name", "Waitting Time", "Status Process" }));
		ioCdQueTable.setEnabled(false);
		ioCdQueTable.setRowHeight(35);
		jScrollPane5.setViewportView(ioCdQueTable);

		addIoCd.setText("ADD");
		addIoCd.setEnabled(false);
		addIoCd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addIoCdActionPerformed(evt);
			}
		});

		endIoCd.setText("END");
		endIoCd.setEnabled(false);
		endIoCd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				endIoCdActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 409,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(addIoCd, javax.swing.GroupLayout.DEFAULT_SIZE, 195,
												Short.MAX_VALUE)
										.addComponent(endIoCd, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addComponent(jobQueLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jobQueLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(addIoCd)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(endIoCd).addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));

		javax.swing.GroupLayout QueTableLayout = new javax.swing.GroupLayout(QueTable);
		QueTable.setLayout(QueTableLayout);
		QueTableLayout.setHorizontalGroup(QueTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(QueTableLayout.createSequentialGroup().addContainerGap().addGroup(QueTableLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(QueTableLayout.createSequentialGroup().addGroup(QueTableLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(QueTableLayout.createSequentialGroup()
										.addComponent(terTableLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
								.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(QueTableLayout.createSequentialGroup()
								.addComponent(jobQueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(QueTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(terTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		QueTableLayout.setVerticalGroup(QueTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(QueTableLayout.createSequentialGroup().addContainerGap()
						.addGroup(QueTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jobQueLabel).addComponent(terTableLabel))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(QueTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addGroup(QueTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(QueTableLayout.createSequentialGroup().addComponent(terTableLabel2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
												Short.MAX_VALUE))
								.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(14, 14, 14)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(QueTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(QueTable, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}// </editor-fold>

	// ปุ่มหยุดการทำงาน
	private void START_Button2ActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	// ปุ่มสร้างProcess
	private void ADD_Button1ActionPerformed(java.awt.event.ActionEvent evt) {
		// เรียกใช้ table jobQueTable
		DefaultTableModel model = (DefaultTableModel) jobQueTable.getModel();
		// สร้างProcess
		// เรียกใช้ creatProcess จาก controller.class
		controller.creatProcess();
		/*
		 * แปลง Process ล่าสุดที่สร้างเพื่อใช้งานกับ Table jobQueTable
		 * โดยดึงค่าล่าสุดจาก Joblist
		 */
		Model rowModel = controller.getJoblistLast();
		Object[] rowData = { rowModel.getProcessName(), rowModel.getArrivalTime(), rowModel.getBurstTime(),
				rowModel.getWaittingTime(), rowModel.getStatusProcess() };
		// เอา Process ใส่ลงไปใน table
		model.addRow(rowData);
	}

	// ปุ่มสั่งทำงาน
	private void START_Button1ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel10.setText(controller.getRunTimeJobMax());
		runRR = true;
		START_Button1.setEnabled(false);
		ADD_Button1.setEnabled(true);
		START_Button2.setEnabled(true);
		terminate_Button.setEnabled(true);
		addIoUsb.setEnabled(true);
		endIoUsb.setEnabled(true);
		addIoCd.setEnabled(true);
		endIoCd.setEnabled(true);
	}

	// ปุ่มterminate
	private void terminate_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// เรียกใช้ terminate จาก controller.class
		controller.terminateProcess();
		// เรียกใช้ table jobQueTable กับ terminateQueTable
		DefaultTableModel modelJ = (DefaultTableModel) jobQueTable.getModel();
		DefaultTableModel modelT = (DefaultTableModel) terminateQueTable.getModel();
		// ล้างตาราง
		while (modelJ.getRowCount() > 0) {
			modelJ.removeRow(0);
		}
		while (modelT.getRowCount() > 0) {
			modelT.removeRow(0);
		}
		// เอา list ที่เก็บ Process ใน joblist กับ terminatelist ใส่กลับไปใน table หลัง
		// terminate เสร็จแล้ว
		for (int i = 0; i < controller.joblistSize(); i++) {
			Object[] rowData = { controller.joblistRow(i).getProcessName(), controller.joblistRow(i).getArrivalTime(),
					controller.joblistRow(i).getBurstTime(), controller.joblistRow(i).getWaittingTime(),
					controller.joblistRow(i).getStatusProcess() };
			// เอา Process ใส่ลงไปใน table
			modelJ.addRow(rowData);
		}
		for (int i = 0; i < controller.terminatelistSize(); i++) {
			Object[] rowData = { controller.terminatelistRow(i).getProcessName(),
					controller.terminatelistRow(i).getStatusProcess() };
			// เอา Process ใส่ลงไปใน table
			modelT.addRow(rowData);
		}
		jLabel8.setText(controller.getAvgT());
	}

	private void endIoUsbActionPerformed(java.awt.event.ActionEvent evt) {
		if (controller.joblistSize() > 0) {// เช็คว่ามี Process
			controller.endIoUsbProcess();// ทำการลบ Process IoUsb
			// เรียกใช้ตาราง
			DefaultTableModel modelJ = (DefaultTableModel) jobQueTable.getModel();
			DefaultTableModel model = (DefaultTableModel) ioUsbQueTable.getModel();
			// ล้างค่าเก่าในตาราง
			while (modelJ.getRowCount() > 0) {
				modelJ.removeRow(0);
			}
			while (model.getRowCount() > 0) {
				model.removeRow(0);
			}
			// เอาค่าที่ได้ใหม่กลับเข้าไปในตารางใหม่
			for (int i = 0; i < controller.joblistSize(); i++) {
				Object[] rowData = { controller.joblistRow(i).getProcessName(),
						controller.joblistRow(i).getArrivalTime(), controller.joblistRow(i).getBurstTime(),
						controller.joblistRow(i).getWaittingTime(), controller.joblistRow(i).getStatusProcess() };
				modelJ.addRow(rowData);
			}
			for (int i = 0; i < controller.ioUsblistSize(); i++) {
				Object[] rowData = { controller.ioUsblistRow(i).getProcessName(),
						controller.ioUsblistRow(i).getWaittingTime(), controller.ioUsblistRow(i).getStatusProcess() };
				model.addRow(rowData);
			}
		}
	}

	private void endIoCdActionPerformed(java.awt.event.ActionEvent evt) {
		if (controller.joblistSize() > 0) {// เช็คว่ามี Process
			controller.endIoCdProcess();// ทำการลบ Process IoCd
			// เรียกใช้ตาราง
			DefaultTableModel modelJ = (DefaultTableModel) jobQueTable.getModel();
			DefaultTableModel model = (DefaultTableModel) ioCdQueTable.getModel();
			// ล้างค่าเก่าในตาราง
			while (modelJ.getRowCount() > 0) {
				modelJ.removeRow(0);
			}
			while (model.getRowCount() > 0) {
				model.removeRow(0);
			}
			// เอาค่าที่ได้ใหม่กลับเข้าไปในตารางใหม่
			for (int i = 0; i < controller.joblistSize(); i++) {
				Object[] rowData = { controller.joblistRow(i).getProcessName(),
						controller.joblistRow(i).getArrivalTime(), controller.joblistRow(i).getBurstTime(),
						controller.joblistRow(i).getWaittingTime(), controller.joblistRow(i).getStatusProcess() };
				modelJ.addRow(rowData);
			}
			for (int i = 0; i < controller.ioCdlistSize(); i++) {
				Object[] rowData = { controller.ioCdlistRow(i).getProcessName(),
						controller.ioCdlistRow(i).getWaittingTime(), controller.ioCdlistRow(i).getStatusProcess() };
				model.addRow(rowData);
			}
		}
	}

	private void addIoUsbActionPerformed(java.awt.event.ActionEvent evt) {
		if (controller.joblistSize() > 0) {// เช็คว่ามี Process
			controller.addIoUsbProcess();
			// เรียกใช้ตาราง
			DefaultTableModel modelJ = (DefaultTableModel) jobQueTable.getModel();
			DefaultTableModel model = (DefaultTableModel) ioUsbQueTable.getModel();
			// ล้างค่าเก่าในตาราง
			while (modelJ.getRowCount() > 0) {
				modelJ.removeRow(0);
			}
			while (model.getRowCount() > 0) {
				model.removeRow(0);
			}
			// เอาค่าที่ได้ใหม่กลับเข้าไปในตารางใหม่
			for (int i = 0; i < controller.joblistSize(); i++) {
				Object[] rowData = { controller.joblistRow(i).getProcessName(),
						controller.joblistRow(i).getArrivalTime(), controller.joblistRow(i).getBurstTime(),
						controller.joblistRow(i).getWaittingTime(), controller.joblistRow(i).getStatusProcess() };
				modelJ.addRow(rowData);
			}
			for (int i = 0; i < controller.ioUsblistSize(); i++) {
				Object[] rowData = { controller.ioUsblistRow(i).getProcessName(),
						controller.ioUsblistRow(i).getWaittingTime(), controller.ioUsblistRow(i).getStatusProcess() };
				model.addRow(rowData);
			}
		}
	}

	private void addIoCdActionPerformed(java.awt.event.ActionEvent evt) {
		if (controller.joblistSize() > 0) {// เช็คว่ามี Process
			controller.addIoCdProcess();
			// เรียกใช้ตาราง
			DefaultTableModel modelJ = (DefaultTableModel) jobQueTable.getModel();
			DefaultTableModel model = (DefaultTableModel) ioCdQueTable.getModel();
			// ล้างค่าเก่าในตาราง
			while (modelJ.getRowCount() > 0) {
				modelJ.removeRow(0);
			}
			while (model.getRowCount() > 0) {
				model.removeRow(0);
			}
			// เอาค่าที่ได้ใหม่กลับเข้าไปในตารางใหม่
			for (int i = 0; i < controller.joblistSize(); i++) {
				Object[] rowData = { controller.joblistRow(i).getProcessName(),
						controller.joblistRow(i).getArrivalTime(), controller.joblistRow(i).getBurstTime(),
						controller.joblistRow(i).getWaittingTime(), controller.joblistRow(i).getStatusProcess() };
				modelJ.addRow(rowData);
			}
			for (int i = 0; i < controller.ioCdlistSize(); i++) {
				Object[] rowData = { controller.ioCdlistRow(i).getProcessName(),
						controller.ioCdlistRow(i).getWaittingTime(), controller.ioCdlistRow(i).getStatusProcess() };
				model.addRow(rowData);
			}
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GUIRR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUIRR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUIRR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUIRR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUIRR().setVisible(true);
			}
		});

		// 1 วินาทีสั่งทำงาน
		Timer timer = new Timer();// สร้าง Timer ใหม่
		TimerTask task = new TimerTask() {// สร้าง TimerTask ใหม่ และเขียนฟังก์ชัน run()
			@Override
			public void run() {// ช่วงสั่งทำงาน
				// เขียนคำสั่งที่ต้องการให้ทำงานเมื่อ task ถูกประมวลผล
				if (runRR == true) {
					// เรียกใช้คำสั่ง CountClock จาก controller.class เพื่อนับเวลา
					controller.CountClock();
					// เปลี่ยนเวลาที่ show ใน gui
					clockLabel.setText(Integer.toString(controller.getCountClock()));
					// เรียกใช้ Table
					DefaultTableModel modelJ = (DefaultTableModel) jobQueTable.getModel();
					DefaultTableModel modelT = (DefaultTableModel) terminateQueTable.getModel();
					DefaultTableModel modelRe = (DefaultTableModel) readyQueTable.getModel();
					DefaultTableModel modelIU = (DefaultTableModel) ioUsbQueTable.getModel();
					DefaultTableModel modelIC = (DefaultTableModel) ioCdQueTable.getModel();

					// เรียกใช้คำสั่ง joblistSNewToSReady จาก controller.class เพื่อเปลี่ยนสถานะ
					// Process จาก new เป็น ready
					controller.joblistSNewToSReady();
					// เรียกใช้คำสั่ง runProcess จาก controller.class เพื่อเพิ่ม BurstTime กับเลือก
					// Process ที่จะเปลี่ยนเป็น run
					controller.runProcess();
					// เรียกใช้คำสั่ง waitingCount จาก controller.class เพื่อเพิ่ม waitingTime ของ
					// Process
					controller.waitingCount();
					controller.waitingCountUsb();
					controller.waitingCountCd();
					// บอกว่ากำลังทำงานใน Process ตัวไหน
					if (controller.joblistSize() > 0) {
						jLabel7.setText(String.valueOf(controller.joblistRow(controller.getRunJob()).getProcessName()));
					} else {
						jLabel7.setText("no process");
					}

					// ล้าง Table
					while (modelJ.getRowCount() > 0) {
						modelJ.removeRow(0);
					}
					while (modelT.getRowCount() > 0) {
						modelT.removeRow(0);
					}
					while (modelRe.getRowCount() > 0) {
						modelRe.removeRow(0);
					}
					while (modelIU.getRowCount() > 0) {
						modelIU.removeRow(0);
					}
					while (modelIC.getRowCount() > 0) {
						modelIC.removeRow(0);
					}

					// เอาค่าที่ได้ใหม่กลับเข้าไปใน Table
					for (int i = 0; i < controller.joblistSize(); i++) {
						Object[] rowData = { controller.joblistRow(i).getProcessName(),
								controller.joblistRow(i).getArrivalTime(), controller.joblistRow(i).getBurstTime(),
								controller.joblistRow(i).getWaittingTime(),
								controller.joblistRow(i).getStatusProcess() };
						modelJ.addRow(rowData);
						// Table ready จะมีการตรวจสอบว่าสถานะ Process ที่อยู่ใน joblist นั้นเป็น ready
						// ไหมถ้าเป็นจริงจะเอาไปใส่ใน Table ready
						if (controller.joblistRow(i).getStatusProcess().equals(controller.getStatusProcess(1))) {
							Object[] rowDataRe = { controller.joblistRow(i).getProcessName(),
									controller.joblistRow(i).getStatusProcess() };
							modelRe.addRow(rowDataRe);
						}
						//
					}
					for (int i = 0; i < controller.terminatelistSize(); i++) {
						Object[] rowData = { controller.terminatelistRow(i).getProcessName(),
								controller.terminatelistRow(i).getStatusProcess() };
						modelT.addRow(rowData);
					}

					for (int i = 0; i < controller.ioUsblistSize(); i++) {
						Object[] rowData = { controller.ioUsblistRow(i).getProcessName(),
								controller.ioUsblistRow(i).getWaittingTime(),
								controller.ioUsblistRow(i).getStatusProcess() };
						modelIU.addRow(rowData);
					}
					for (int i = 0; i < controller.ioCdlistSize(); i++) {
						Object[] rowData = { controller.ioCdlistRow(i).getProcessName(),
								controller.ioCdlistRow(i).getWaittingTime(),
								controller.ioCdlistRow(i).getStatusProcess() };
						modelIC.addRow(rowData);
					}
				}
			}
		};

		// ตั้งเวลาให้ task ประมวลผลทุก 1000 มิลลิวินาที เริ่มตั้งแต่เวลา 0
		timer.scheduleAtFixedRate(task, 0, 1000);
	}

	// Variables declaration - do not modify
	private javax.swing.JButton ADD_Button1;
	private javax.swing.JPanel QueTable;
	private javax.swing.JButton START_Button1;
	private javax.swing.JButton START_Button2;
	private javax.swing.JButton addIoCd;
	private javax.swing.JButton addIoUsb;
	private static javax.swing.JLabel clockLabel;
	private javax.swing.JButton endIoCd;
	private javax.swing.JButton endIoUsb;
	private static javax.swing.JTable ioCdQueTable;
	private static javax.swing.JTable ioUsbQueTable;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private static javax.swing.JLabel jLabel7;
	private static javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private static javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JLabel jobQueLabel;
	private javax.swing.JLabel jobQueLabel1;
	private javax.swing.JLabel jobQueLabel2;
	private static javax.swing.JTable jobQueTable;
	private static javax.swing.JTable readyQueTable;
	private javax.swing.JLabel terTableLabel;
	private javax.swing.JLabel terTableLabel2;
	private static javax.swing.JTable terminateQueTable;
	private javax.swing.JButton terminate_Button;
	// End of variables declaration
}
