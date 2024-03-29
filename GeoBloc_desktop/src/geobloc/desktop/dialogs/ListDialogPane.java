/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SingleChoiseDialogPane.java
 *
 * Created on 13-ene-2010, 20:54:45
 */

package geobloc.desktop.dialogs;

import java.awt.Dimension;
import java.util.Vector;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author Administrador
 */
public class ListDialogPane extends javax.swing.JPanel {

    private JPanel optionsListPane;
    private int lastSpinnerValue;

    /** Creates new form SingleChoiseDialogPane */
    public ListDialogPane() {
        initComponents();
        optionsListScrollPane.setViewportView(optionsListPane = new JPanel());
        optionsListPane.setLayout(new BoxLayout(optionsListPane,BoxLayout.Y_AXIS));
        lastSpinnerValue = 0;
        addListOption();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTextField = new javax.swing.JTextField();
        optionsNumberSpinner = new javax.swing.JSpinner();
        optionsListScrollPane = new javax.swing.JScrollPane();
        labelLabel = new javax.swing.JLabel();
        optionNumberLabel = new javax.swing.JLabel();
        requiredCheckBox = new javax.swing.JCheckBox();
        optionsLabelLabel = new javax.swing.JLabel();
        optionsValueLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(geobloc.desktop.FormDesignerApp.class).getContext().getResourceMap(ListDialogPane.class);
        labelTextField.setText(resourceMap.getString("labelTextField.text")); // NOI18N
        labelTextField.setName("labelTextField"); // NOI18N

        optionsNumberSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        optionsNumberSpinner.setName("optionsNumberSpinner"); // NOI18N
        optionsNumberSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                optionsNumberSpinnerStateChanged(evt);
            }
        });

        optionsListScrollPane.setBorder(null);
        optionsListScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        optionsListScrollPane.setName("optionsListScrollPane"); // NOI18N

        labelLabel.setText(resourceMap.getString("labelLabel.text")); // NOI18N
        labelLabel.setName("labelLabel"); // NOI18N

        optionNumberLabel.setText(resourceMap.getString("optionNumberLabel.text")); // NOI18N
        optionNumberLabel.setName("optionNumberLabel"); // NOI18N

        requiredCheckBox.setText(resourceMap.getString("requiredCheckBox.text")); // NOI18N
        requiredCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        requiredCheckBox.setName("requiredCheckBox"); // NOI18N

        optionsLabelLabel.setText(resourceMap.getString("optionsLabelLabel.text")); // NOI18N
        optionsLabelLabel.setName("optionsLabelLabel"); // NOI18N

        optionsValueLabel.setText(resourceMap.getString("optionsValueLabel.text")); // NOI18N
        optionsValueLabel.setName("optionsValueLabel"); // NOI18N

        idLabel.setText(resourceMap.getString("idLabel.text")); // NOI18N
        idLabel.setName("idLabel"); // NOI18N

        idTextField.setName("idTextField"); // NOI18N

        descriptionLabel.setText(resourceMap.getString("descriptionLabel.text")); // NOI18N
        descriptionLabel.setName("descriptionLabel"); // NOI18N

        descriptionScrollPane.setName("descriptionScrollPane"); // NOI18N

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(resourceMap.getFont("descriptionTextArea.font")); // NOI18N
        descriptionTextArea.setRows(3);
        descriptionTextArea.setName("descriptionTextArea"); // NOI18N
        descriptionScrollPane.setViewportView(descriptionTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(optionNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionsNumberSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(requiredCheckBox))
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(labelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(descriptionLabel)
                .addContainerGap(185, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(descriptionScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(optionsLabelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(optionsValueLabel))
            .addComponent(optionsListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionsNumberSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionNumberLabel)
                    .addComponent(requiredCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionsValueLabel)
                    .addComponent(optionsLabelLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionsListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /* Public method for retriving the user input data from the dialog
    * params[0] - ID
    * params[1] - Description
    * params[2] - List label
    * params[3] - List type
    * params[4] - Is required
    * params[5,6] - First list option label and value
    * params[7,8] - Second list option label and value
    * ...
    */
    public Vector<String> getResults(String type) {
        Vector<String> results = new Vector<String>();
        // Add the element ID
        results.add(idTextField.getText());
        // Add the description or null if it wasn't written
        if (descriptionTextArea.getText().isEmpty())
            results.add(null);
        else
            results.add(descriptionTextArea.getText());
        // Add the list label
        results.addElement(labelTextField.getText());
        // Add the list type
        results.addElement(type);
        // Add the is required checkbox value
        if (requiredCheckBox.isSelected())
            results.add("true");
        else
            results.add("false");
        // Rest of elements are the options labels and values, in pairs
        for (int i = 0; i < lastSpinnerValue; i++) {
            results.add(((OptionPane)optionsListPane.getComponent(i*2)).getLabelText());
            if (((OptionPane)optionsListPane.getComponent(i*2)).getValueText().isEmpty())
                results.add(((OptionPane)optionsListPane.getComponent(i*2)).getLabelText());
            else
                results.add(((OptionPane)optionsListPane.getComponent(i*2)).getValueText());
        }
        return results;
    }

    // Include a new field to optionsListPane
    public void addListOption(){
        OptionPane optionPane = new OptionPane();
        optionsListPane.add(optionPane);
        // Include a rigid area to separate the option fields
        optionsListPane.add(Box.createRigidArea(new Dimension(0,5)));
        optionsListPane.revalidate();
        optionsListPane.repaint();
        lastSpinnerValue++;
    }

    private void optionsNumberSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_optionsNumberSpinnerStateChanged
        if (Integer.parseInt(optionsNumberSpinner.getValue().toString()) > lastSpinnerValue){
            // Include a new field to optionsListPane
            addListOption();
        } else {
            // Remove the last field and the last rigid area from the optionsListPane
            optionsListPane.remove(optionsListPane.getComponentCount()-1);
            optionsListPane.remove(optionsListPane.getComponentCount()-1);
            optionsListPane.revalidate();
            optionsListPane.repaint();
            lastSpinnerValue--;
        }
    }//GEN-LAST:event_optionsNumberSpinnerStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel labelLabel;
    private javax.swing.JTextField labelTextField;
    private javax.swing.JLabel optionNumberLabel;
    private javax.swing.JLabel optionsLabelLabel;
    private javax.swing.JScrollPane optionsListScrollPane;
    private javax.swing.JSpinner optionsNumberSpinner;
    private javax.swing.JLabel optionsValueLabel;
    private javax.swing.JCheckBox requiredCheckBox;
    // End of variables declaration//GEN-END:variables

}
