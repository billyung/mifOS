/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EmulatorPane.java
 *
 * Created on Mar 1, 2011, 10:37:40 AM
 */

package GUI.EmulatorFrame;

import MachineDataUtilities.MachineDataUtilities;
import rmComponents.Register;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

/**
 *
 * @author Karolis Voicechovskis PS3
 */
public class EmulatorPane extends javax.swing.JPanel {

    /** Creates new form EmulatorPane */
    public EmulatorPane() {
        initCellRenderer();
        initComponents();
        initRegisters();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vmRegistersTitle = new javax.swing.JLabel();
        registerR = new javax.swing.JLabel();
        registerM = new javax.swing.JLabel();
        registerIC = new javax.swing.JLabel();
        registerSF = new javax.swing.JLabel();
        titleChannelRegisters = new javax.swing.JLabel();
        registerCHST1 = new javax.swing.JLabel();
        registerCHST2 = new javax.swing.JLabel();
        registerCHST3 = new javax.swing.JLabel();
        titleRMMemory = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        titleConsole = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        loadProgram = new javax.swing.JButton();
        executeProgram = new javax.swing.JButton();
        executeByStep = new javax.swing.JButton();
        registerRValue = new javax.swing.JLabel();
        registerMValue = new javax.swing.JLabel();
        registerICValue = new javax.swing.JLabel();
        registerSFValue = new javax.swing.JLabel();
        registerCHST1Value = new javax.swing.JLabel();
        registerCHST2Value = new javax.swing.JLabel();
        registerCHST3Value = new javax.swing.JLabel();
        registerS = new javax.swing.JLabel();
        registerSValue = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        memoryTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        registerMODEValue = new javax.swing.JLabel();
        registerPDValue = new javax.swing.JLabel();
        registerPTRValue = new javax.swing.JLabel();
        registerSFValueR = new javax.swing.JLabel();
        registerSValueR = new javax.swing.JLabel();
        registerICValueR = new javax.swing.JLabel();
        registerMValueR = new javax.swing.JLabel();
        registerRValueR = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        registerSFValue_4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        registerSFValue_3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        registerSFValue_2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        registerSFValue_1 = new javax.swing.JLabel();
        showVMMemoryButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        vmRegistersTitle.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        vmRegistersTitle.setText("VM registrai:");

        registerR.setText("R:");

        registerM.setText("M:");

        registerIC.setText("IC:");

        registerSF.setText("SF:");

        titleChannelRegisters.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        titleChannelRegisters.setText("Kanalų registrai:");

        registerCHST1.setText("CHST[1]:");

        registerCHST2.setText("CHST[2]:");

        registerCHST3.setText("CHST[3]:");

        titleRMMemory.setText("RM atmintis:");

        console.setColumns(20);
        console.setEditable(false);
        console.setRows(5);
        jScrollPane2.setViewportView(console);

        titleConsole.setLabelFor(console);
        titleConsole.setText("Konsolė:");

        input.setEditable(false);

        loadProgram.setText("Įkelti programą");

        executeProgram.setText("Vykdyti programą");

        executeByStep.setText("Vykdyti pažingsniui");

        registerRValue.setText("####");

        registerMValue.setText("####");

        registerICValue.setText("##");

        registerSFValue.setText("####");

        registerCHST1Value.setText("#");

        registerCHST2Value.setText("#");

        registerCHST3Value.setText("#");

        registerS.setText("S:");

        registerSValue.setText("####");

        memoryTable.setModel(this.memoryTableModel);
        try
        {
            this.memoryTable.setDefaultRenderer(Class.forName
                ( "java.lang.String" ), this.memoryTableCellRenderer);
        } catch(ClassNotFoundException e)
        {
            System.exit( 0 );
        }

        this.memoryTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int index = 0; index < 2; index++)
        {
            TableColumn tableColumn = memoryTable.getColumnModel().getColumn(index);
            tableColumn.setPreferredWidth(40);
        }

        jScrollPane3.setViewportView(memoryTable);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabel1.setText("RM registrai:");

        jLabel2.setText("R:");

        jLabel3.setText("M:");

        jLabel4.setText("IC:");

        jLabel5.setText("S:");

        jLabel6.setText("SF:");

        jLabel7.setText("PTR:");

        jLabel8.setText("PD:");

        jLabel9.setText("MODE:");

        registerMODEValue.setText("#");

        registerPDValue.setText("####");

        registerPTRValue.setText("####");

        registerSFValueR.setText("####");

        registerSValueR.setText("####");

        registerICValueR.setText("####");

        registerMValueR.setText("####");

        registerRValueR.setText("####");

        jLabel11.setText("SF registras:");

        registerSFValue_4.setText("00");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        registerSFValue_3.setText("00");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        registerSFValue_2.setText("00");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        registerSFValue_1.setText("00");

        showVMMemoryButton.setText("VM atmintis");
        showVMMemoryButton.setEnabled(false);

        jLabel10.setText("Atminties ruožai:");

        jLabel12.setText("Geltona - MPD");

        jLabel13.setText("Mėlyna - pertraukimų lentelė");

        jLabel14.setText("Žalia - puslapių lentelė");

        jLabel15.setText("Raudona - VM atmintis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleRMMemory)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleConsole)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(input, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(loadProgram)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(executeByStep)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(executeProgram)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(12, 12, 12)
                                        .addComponent(registerSFValue_4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(registerSFValue_3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(registerSFValue_2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerSFValue_1))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerIC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(registerICValue))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(registerMValue))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(registerRValue))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerSF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerSFValue))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(registerSValue))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerCHST3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerCHST3Value))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerCHST2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerCHST2Value))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerCHST1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerCHST1Value))
                            .addComponent(titleChannelRegisters)
                            .addComponent(jLabel1)
                            .addComponent(vmRegistersTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(22, 22, 22))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registerRValueR)
                                    .addComponent(registerMValueR)
                                    .addComponent(registerICValueR)
                                    .addComponent(registerSValueR)
                                    .addComponent(registerSFValueR)
                                    .addComponent(registerPTRValue)
                                    .addComponent(registerPDValue)
                                    .addComponent(registerMODEValue)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(showVMMemoryButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleChannelRegisters)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerCHST1)
                            .addComponent(registerCHST1Value))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerCHST2)
                            .addComponent(registerCHST2Value))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerCHST3)
                            .addComponent(registerCHST3Value))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(registerRValueR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(registerMValueR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(registerICValueR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(registerSValueR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(registerSFValueR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registerPTRValue)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerPDValue)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerMODEValue)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vmRegistersTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerR)
                            .addComponent(registerRValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerM)
                            .addComponent(registerMValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerIC)
                            .addComponent(registerICValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerS)
                            .addComponent(registerSValue))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerSF)
                            .addComponent(registerSFValue)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleRMMemory)
                            .addComponent(titleConsole))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(loadProgram)
                                    .addComponent(executeByStep)
                                    .addComponent(executeProgram))
                                .addGap(12, 12, 12)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator4)
                                        .addComponent(jSeparator3)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(registerSFValue_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11))
                                        .addComponent(registerSFValue_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(registerSFValue_2))
                                    .addComponent(registerSFValue_1))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showVMMemoryButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void initCellRenderer()
    {
        int[] interuptArea = {-1, -1};
        int[] MPDArea = {-1, -1};
        int[] pageArea = {-1, -1};
        int[] virtualArea = {-257, -257, -257, -257,
                             -257, -257, -257, -257,
                             -257, -257, -257, -257,
                              -257, -257, -257, -257};
        this.memoryTableCellRenderer = 
                             new MemoryTableCellRenderer(MPDArea, interuptArea,
                                                         pageArea, virtualArea);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea console;
    private javax.swing.JButton executeByStep;
    private javax.swing.JButton executeProgram;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton loadProgram;
    private javax.swing.JTable memoryTable;
    private javax.swing.JLabel registerCHST1;
    private javax.swing.JLabel registerCHST1Value;
    private javax.swing.JLabel registerCHST2;
    private javax.swing.JLabel registerCHST2Value;
    private javax.swing.JLabel registerCHST3;
    private javax.swing.JLabel registerCHST3Value;
    private javax.swing.JLabel registerIC;
    private javax.swing.JLabel registerICValue;
    private javax.swing.JLabel registerICValueR;
    private javax.swing.JLabel registerM;
    private javax.swing.JLabel registerMODEValue;
    private javax.swing.JLabel registerMValue;
    private javax.swing.JLabel registerMValueR;
    private javax.swing.JLabel registerPDValue;
    private javax.swing.JLabel registerPTRValue;
    private javax.swing.JLabel registerR;
    private javax.swing.JLabel registerRValue;
    private javax.swing.JLabel registerRValueR;
    private javax.swing.JLabel registerS;
    private javax.swing.JLabel registerSF;
    private javax.swing.JLabel registerSFValue;
    private javax.swing.JLabel registerSFValueR;
    private javax.swing.JLabel registerSFValue_1;
    private javax.swing.JLabel registerSFValue_2;
    private javax.swing.JLabel registerSFValue_3;
    private javax.swing.JLabel registerSFValue_4;
    private javax.swing.JLabel registerSValue;
    private javax.swing.JLabel registerSValueR;
    private javax.swing.JButton showVMMemoryButton;
    private javax.swing.JLabel titleChannelRegisters;
    private javax.swing.JLabel titleConsole;
    private javax.swing.JLabel titleRMMemory;
    private javax.swing.JLabel vmRegistersTitle;
    // End of variables declaration//GEN-END:variables

    private javax.swing.JFileChooser fileChooser = new JFileChooser();

    private MemoryTableModel memoryTableModel = new MemoryTableModel();
    private MemoryTableCellRenderer memoryTableCellRenderer;

    private void initRegisters()
    {
        this.setRegisterValue(Register.R, 0);
        this.setRegisterValue(Register.M, 0);
        this.setRegisterValue(Register.IC, 0);
        this.setRegisterValue(Register.S, 0);
        this.setRegisterValue(Register.SF, 0);
        this.setRegisterValue(Register.PD, 0);
        this.setRegisterValue(Register.PTR, 0);
        this.setRegisterValue(Register.MODE, 0);
        this.setRegisterValue(Register.CHST1, 0);
        this.setRegisterValue(Register.CHST2, 0);
        this.setRegisterValue(Register.CHST3, 0);
    }
    //--------------------------------------------------------------------------
    public JButton getExecuteByStep()
    {
        return executeByStep;
    }

    public JButton getExecuteProgram()
    {
        return executeProgram;
    }

    public JButton getLoadProgram()
    {
        return loadProgram;
    }

    public JButton getShowVMMemoryButton()
    {
        return this.showVMMemoryButton;
    }

    public JFileChooser getFileChooser()
    {
        return fileChooser;
    }

    public JTextField getInput()
    {
        return input;
    }

    public MemoryTableCellRenderer getMemoryTableCellRenderer()
    {
        return memoryTableCellRenderer;
    }
    //--------------------------------------------------------------------------

    public String getInputText()
    {
        return this.input.getText();
    }

    //--------------------------------------------------------------------------

    public void setConsoleText(String text)
    {
        this.console.setText(text);
    }

    public void setInputText(String text)
    {
        this.input.setText(text);
    }

    /*public void setCPUStateValue(String cpuState)
    {
        this.stateCPUValue.setText(cpuState);
    }*/

    public void setRegisterValue(Register register, int value)
    {
        switch (register)
        {
            case R: 
                this.registerRValue.
                             setText(MachineDataUtilities.formatData(value, 8));
                this.registerRValueR.
                             setText(MachineDataUtilities.formatData(value, 8));
                break;

            case M: 
                this.registerMValue.
                             setText(MachineDataUtilities.formatData(value, 8));
                this.registerMValueR.
                             setText(MachineDataUtilities.formatData(value, 8));
                break;

            case IC: 
                this.registerICValue.
                             setText(MachineDataUtilities.formatData(value, 4));
                this.registerICValueR.
                             setText(MachineDataUtilities.formatData(value, 4));
                break;

            case S: 
                this.registerSValue.
                             setText(MachineDataUtilities.formatData(value, 8));
                this.registerSValueR.
                             setText(MachineDataUtilities.formatData(value, 8));
                break;

            case SF: 
                this.registerSFValue.
                             setText(MachineDataUtilities.formatData(value, 8));
                this.registerSFValueR.
                             setText(MachineDataUtilities.formatData(value, 8));
                break;

            case SF_1: 
                this.registerSFValue_1.
                             setText(MachineDataUtilities.formatData(value, 2));
                break;

            case SF_2: 
                this.registerSFValue_2.
                             setText(MachineDataUtilities.formatData(value, 2));
                break;

            case SF_3: 
                this.registerSFValue_3.
                             setText(MachineDataUtilities.formatData(value, 2));
                break;

            case SF_4: 
                this.registerSFValue_4.
                             setText(MachineDataUtilities.formatData(value, 2));
                break;

            case MODE: 
                this.registerMODEValue.
                             setText(MachineDataUtilities.formatData(value, 1));
                break;

            case PD: 
                this.registerPDValue.
                             setText(MachineDataUtilities.formatData(value, 8));
                break;

            case PTR: 
                this.registerPTRValue.
                             setText(MachineDataUtilities.formatData(value, 8));
                break;

            case CHST1: 
                this.registerCHST1Value.
                             setText(MachineDataUtilities.formatData(value, 1));
                break;

            case CHST2: 
                this.registerCHST2Value.
                             setText(MachineDataUtilities.formatData(value, 1));
                break;

            case CHST3: 
                this.registerCHST3Value.
                             setText(MachineDataUtilities.formatData(value, 1));
                break;
        }
    }

    public void setShowVMMemoryButtonState(boolean state)
    {
        this.showVMMemoryButton.setEnabled(state);
    }

    public void setLoadProgramButtonState(boolean state)
    {
        this.loadProgram.setEnabled(state);
    }

    /*public int getRegisterValue(Register register)
    {
        switch(register)
        {
            case R: return Integer.parseInt(this.registerRValue.getText());

            case M: return Integer.parseInt(this.registerMValue.getText());

            case IC: return Integer.parseInt(this.registerICValue.getText());

            case SF: return Integer.parseInt(this.registerSFValue.getText());

            case CHST1: return Integer.parseInt
                                            (this.registerCHST1Value.getText());

            case CHST2: return Integer.parseInt
                                            (this.registerCHST2Value.getText());

            case CHST3: return Integer.parseInt
                                            (this.registerCHST3Value.getText());

            default: return 0;//exception'as
        }
    }*/

    public void setInputEditableStatus(boolean status)
    {
        this.input.setEditable(status);
    }

    /*
     * Skirta realiems, virtualiems adresams, bei atminties reikšmėms surašyti
     */
    public void setMemoryTableModelValue (int aValue, int rowIndex,
                                          int columnIndex, int digitCount)
    {
        this.memoryTableModel.setValueAt
                           (MachineDataUtilities.formatData(aValue, digitCount),
                            rowIndex, columnIndex);
    }

    /*
     *Skirta išparsintom komandom
     */
    public void setMemoryTableModelValue
                                 (String command, int rowIndex, int columnIndex)
    {
        this.memoryTableModel.setValueAt(command, rowIndex, columnIndex);
    }
}
