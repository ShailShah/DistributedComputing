package controlmodule;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.UIManager;

public class MainGUI extends javax.swing.JFrame {

    private ControlModule controlModule;
    private boolean selectProgram;
    private boolean selectData;

    public MainGUI() {
        initComponents();
    }

    private void afterConstructor() {
        controlModule = new ControlModule(this);
        setDefaultValues();
    }

    public void setDefaultValues() {
        SendPortSpinner.setValue(controlModule.getSendPort());
        ReceivePortSpinner.setValue(controlModule.getReceivePort());
        TimeOutSpinner.setValue(controlModule.getTimeOut());
        SlaveRadioButton.setSelected(!controlModule.isIsMaster());
        MasterRadioButton.setSelected(controlModule.isIsMaster());
        ProgramTextField.setText(controlModule.getProgramPath());
        MergeTextField.setText(controlModule.getMergePath());
        DataTextField.setText(controlModule.getDataPath());
        TimeOutSpinner.setEnabled(false);
        ProgramBrowseButton.setEnabled(false);
        MergeBrowseButton.setEnabled(false);
        DataBrowseButton.setEnabled(false);
        OrderComboBox.setEnabled(false);
        PowerBaseTextField.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MasterSlaveButtonGroup = new javax.swing.ButtonGroup();
        FileChooser = new javax.swing.JFileChooser();
        AlgoButtonGroup = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        PortPanel = new javax.swing.JPanel();
        SendLabel = new javax.swing.JLabel();
        SendPortSpinner = new javax.swing.JSpinner();
        ReceiveLabel = new javax.swing.JLabel();
        ReceivePortSpinner = new javax.swing.JSpinner();
        ClassicRadioButton = new javax.swing.JRadioButton();
        AlgoRadioButton = new javax.swing.JRadioButton();
        TimeOutLabel = new javax.swing.JLabel();
        TimeOutSpinner = new javax.swing.JSpinner();
        MasterSlavePanel = new javax.swing.JPanel();
        MasterRadioButton = new javax.swing.JRadioButton();
        SlaveRadioButton = new javax.swing.JRadioButton();
        DataPanel = new javax.swing.JPanel();
        ProgramLabel = new javax.swing.JLabel();
        ProgramTextField = new javax.swing.JTextField();
        ProgramBrowseButton = new javax.swing.JButton();
        MergeLabel = new javax.swing.JLabel();
        MergeTextField = new javax.swing.JTextField();
        MergeBrowseButton = new javax.swing.JButton();
        DataLabel = new javax.swing.JLabel();
        DataTextField = new javax.swing.JTextField();
        DataBrowseButton = new javax.swing.JButton();
        OrderPanel = new javax.swing.JPanel();
        OrderLabel = new javax.swing.JLabel();
        OrderComboBox = new javax.swing.JComboBox();
        PowerBaseLabel = new javax.swing.JLabel();
        PowerBaseTextField = new javax.swing.JTextField();
        StatusPanel = new javax.swing.JPanel();
        StatusLabel = new javax.swing.JLabel();
        StatusProgressBar = new javax.swing.JProgressBar();
        StartCancelPanel = new javax.swing.JPanel();
        StartButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Distributed Computing System");
        setName("MainGUI"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        MainPanel.setLayout(new javax.swing.BoxLayout(MainPanel, javax.swing.BoxLayout.Y_AXIS));

        PortPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ports", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        PortPanel.setLayout(new java.awt.GridLayout(2, 4, 10, 10));

        SendLabel.setText("Send Port:");
        PortPanel.add(SendLabel);

        SendPortSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SendPortSpinnerStateChanged(evt);
            }
        });
        PortPanel.add(SendPortSpinner);

        ReceiveLabel.setText("Receive Port:");
        PortPanel.add(ReceiveLabel);

        ReceivePortSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ReceivePortSpinnerStateChanged(evt);
            }
        });
        PortPanel.add(ReceivePortSpinner);

        AlgoButtonGroup.add(ClassicRadioButton);
        ClassicRadioButton.setText("Classic");
        PortPanel.add(ClassicRadioButton);

        AlgoButtonGroup.add(AlgoRadioButton);
        AlgoRadioButton.setSelected(true);
        AlgoRadioButton.setText("Algo");
        PortPanel.add(AlgoRadioButton);

        TimeOutLabel.setText("TimeOut:");
        PortPanel.add(TimeOutLabel);

        TimeOutSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TimeOutSpinnerStateChanged(evt);
            }
        });
        PortPanel.add(TimeOutSpinner);

        MainPanel.add(PortPanel);

        MasterSlavePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Master/Slave", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        MasterSlavePanel.setLayout(new java.awt.GridLayout(1, 2));

        MasterSlaveButtonGroup.add(MasterRadioButton);
        MasterRadioButton.setText("Master");
        MasterRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasterRadioButtonActionPerformed(evt);
            }
        });
        MasterSlavePanel.add(MasterRadioButton);

        MasterSlaveButtonGroup.add(SlaveRadioButton);
        SlaveRadioButton.setSelected(true);
        SlaveRadioButton.setText("Slave");
        SlaveRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlaveRadioButtonActionPerformed(evt);
            }
        });
        MasterSlavePanel.add(SlaveRadioButton);

        MainPanel.add(MasterSlavePanel);

        DataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Program Details"));
        DataPanel.setLayout(new java.awt.GridLayout(3, 3, 10, 10));

        ProgramLabel.setText("Program:");
        DataPanel.add(ProgramLabel);

        ProgramTextField.setEditable(false);
        ProgramTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgramTextFieldActionPerformed(evt);
            }
        });
        DataPanel.add(ProgramTextField);

        ProgramBrowseButton.setText("Browse");
        ProgramBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgramBrowseButtonActionPerformed(evt);
            }
        });
        DataPanel.add(ProgramBrowseButton);

        MergeLabel.setText("Merge:");
        DataPanel.add(MergeLabel);

        MergeTextField.setEditable(false);
        DataPanel.add(MergeTextField);

        MergeBrowseButton.setText("Browse");
        MergeBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MergeBrowseButtonActionPerformed(evt);
            }
        });
        DataPanel.add(MergeBrowseButton);

        DataLabel.setText("Data:");
        DataPanel.add(DataLabel);

        DataTextField.setEditable(false);
        DataPanel.add(DataTextField);

        DataBrowseButton.setText("Browse");
        DataBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataBrowseButtonActionPerformed(evt);
            }
        });
        DataPanel.add(DataBrowseButton);

        MainPanel.add(DataPanel);

        OrderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Order Details"));
        OrderPanel.setLayout(new java.awt.GridLayout(1, 4, 5, 0));

        OrderLabel.setText("Order:");
        OrderPanel.add(OrderLabel);

        OrderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Polynomial" }));
        OrderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderComboBoxActionPerformed(evt);
            }
        });
        OrderPanel.add(OrderComboBox);

        PowerBaseLabel.setText("Power/Base:");
        OrderPanel.add(PowerBaseLabel);

        PowerBaseTextField.setText("2");
        PowerBaseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerBaseTextFieldActionPerformed(evt);
            }
        });
        OrderPanel.add(PowerBaseTextField);

        MainPanel.add(OrderPanel);

        StatusPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));
        StatusPanel.setLayout(new java.awt.GridLayout(1, 3));

        StatusLabel.setText("Not Started");
        StatusPanel.add(StatusLabel);
        StatusPanel.add(StatusProgressBar);

        MainPanel.add(StatusPanel);

        StartCancelPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Start/Cancel"));
        StartCancelPanel.setLayout(new java.awt.GridLayout(1, 2, 5, 0));

        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        StartCancelPanel.add(StartButton);

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        StartCancelPanel.add(CancelButton);

        MainPanel.add(StartCancelPanel);

        getContentPane().add(MainPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SlaveRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlaveRadioButtonActionPerformed
        controlModule.setIsMaster(false);
        controlModule.setSendPort(6000);
        controlModule.setReceivePort(5000);
        SendPortSpinner.setValue(controlModule.getSendPort());
        ReceivePortSpinner.setValue(controlModule.getReceivePort());
        TimeOutSpinner.setEnabled(false);
        ProgramBrowseButton.setEnabled(false);
        MergeBrowseButton.setEnabled(false);
        DataBrowseButton.setEnabled(false);
        OrderComboBox.setEnabled(false);
        PowerBaseTextField.setEnabled(false);
        StartButton.setEnabled(true);
    }//GEN-LAST:event_SlaveRadioButtonActionPerformed

    private void ProgramBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgramBrowseButtonActionPerformed
        int returnVal = FileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = FileChooser.getSelectedFile();
            ProgramTextField.setText(file.getAbsolutePath());
            controlModule.setProgramPath(ProgramTextField.getText());
            selectProgram = true;
            if (selectData) {
                StartButton.setEnabled(true);
            }

        }
    }//GEN-LAST:event_ProgramBrowseButtonActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        getAllVals();
        new Thread(controlModule).start();
    }//GEN-LAST:event_StartButtonActionPerformed

    public void disableStartButton() {
        StartButton.setEnabled(false);
    }

    public void enableStartButton() {
        StartButton.setEnabled(true);
    }

    private void MergeBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MergeBrowseButtonActionPerformed
        int returnVal = FileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = FileChooser.getSelectedFile();
            MergeTextField.setText(file.getAbsolutePath());
            controlModule.setMergePath(MergeTextField.getText());
        }
    }//GEN-LAST:event_MergeBrowseButtonActionPerformed

    private void DataBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataBrowseButtonActionPerformed
        int returnVal = FileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = FileChooser.getSelectedFile();
            DataTextField.setText(file.getAbsolutePath());
            controlModule.setDataPath(DataTextField.getText());
            selectData = true;
            if (selectProgram) {
                StartButton.setEnabled(true);
            }
        }
    }//GEN-LAST:event_DataBrowseButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        controlModule.fileCleanup();
        System.exit(0);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void MasterRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasterRadioButtonActionPerformed
        controlModule.setIsMaster(true);
        controlModule.setSendPort(5000);
        controlModule.setReceivePort(6000);
        SendPortSpinner.setValue(controlModule.getSendPort());
        ReceivePortSpinner.setValue(controlModule.getReceivePort());
        TimeOutSpinner.setEnabled(true);
        ProgramBrowseButton.setEnabled(true);
        MergeBrowseButton.setEnabled(true);
        DataBrowseButton.setEnabled(true);
        OrderComboBox.setEnabled(true);
        PowerBaseTextField.setEnabled(true);
        StartButton.setEnabled(false);
    }//GEN-LAST:event_MasterRadioButtonActionPerformed

    private void SendPortSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SendPortSpinnerStateChanged
        controlModule.setSendPort((int) SendPortSpinner.getValue());
    }//GEN-LAST:event_SendPortSpinnerStateChanged

    private void ReceivePortSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ReceivePortSpinnerStateChanged
        controlModule.setReceivePort((int) ReceivePortSpinner.getValue());
    }//GEN-LAST:event_ReceivePortSpinnerStateChanged

    private void TimeOutSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TimeOutSpinnerStateChanged
        controlModule.setTimeOut((int) TimeOutSpinner.getValue());
    }//GEN-LAST:event_TimeOutSpinnerStateChanged

    private void OrderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderComboBoxActionPerformed

    private void PowerBaseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerBaseTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PowerBaseTextFieldActionPerformed

    private void ProgramTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgramTextFieldActionPerformed
        //TODO
    }//GEN-LAST:event_ProgramTextFieldActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                controlModule.fileCleanup();
            }
        });
    }//GEN-LAST:event_formWindowClosing

    public void getAllVals() {
        controlModule.setSendPort((int) SendPortSpinner.getValue());
        controlModule.setReceivePort((int) ReceivePortSpinner.getValue());
        controlModule.setIsAlgo(AlgoRadioButton.isSelected());
        controlModule.setIsMaster(MasterRadioButton.isSelected());
        controlModule.setPower(Double.parseDouble(PowerBaseTextField.getText()));
        String order = OrderComboBox.getSelectedItem().toString();
        if (order.equals("Polynomial")) {
            controlModule.setOrder(1);
        }
        controlModule.setTimeOut((int) TimeOutSpinner.getValue());
        controlModule.setProgramPath(ProgramTextField.getText());
        controlModule.setMergePath(MergeTextField.getText());
        controlModule.setDataPath(DataTextField.getText());
    }

    public void setStatusLabel(String label) {
        StatusLabel.setText(label);
    }

    public void setProgressBar(int value) {
        StatusProgressBar.setValue(value);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                MainGUI gui = new MainGUI();
                gui.afterConstructor();
                gui.setVisible(true);
            }
        }
        );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlgoButtonGroup;
    private javax.swing.JRadioButton AlgoRadioButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JRadioButton ClassicRadioButton;
    private javax.swing.JButton DataBrowseButton;
    private javax.swing.JLabel DataLabel;
    private javax.swing.JPanel DataPanel;
    private javax.swing.JTextField DataTextField;
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JRadioButton MasterRadioButton;
    private javax.swing.ButtonGroup MasterSlaveButtonGroup;
    private javax.swing.JPanel MasterSlavePanel;
    private javax.swing.JButton MergeBrowseButton;
    private javax.swing.JLabel MergeLabel;
    private javax.swing.JTextField MergeTextField;
    private javax.swing.JComboBox OrderComboBox;
    private javax.swing.JLabel OrderLabel;
    private javax.swing.JPanel OrderPanel;
    private javax.swing.JPanel PortPanel;
    private javax.swing.JLabel PowerBaseLabel;
    private javax.swing.JTextField PowerBaseTextField;
    private javax.swing.JButton ProgramBrowseButton;
    private javax.swing.JLabel ProgramLabel;
    private javax.swing.JTextField ProgramTextField;
    private javax.swing.JLabel ReceiveLabel;
    private javax.swing.JSpinner ReceivePortSpinner;
    private javax.swing.JLabel SendLabel;
    private javax.swing.JSpinner SendPortSpinner;
    private javax.swing.JRadioButton SlaveRadioButton;
    private javax.swing.JButton StartButton;
    private javax.swing.JPanel StartCancelPanel;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JPanel StatusPanel;
    private javax.swing.JProgressBar StatusProgressBar;
    private javax.swing.JLabel TimeOutLabel;
    private javax.swing.JSpinner TimeOutSpinner;
    // End of variables declaration//GEN-END:variables
}
