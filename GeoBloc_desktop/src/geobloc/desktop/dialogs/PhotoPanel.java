/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PhotoPanel.java
 *
 * Created on 19-jul-2010, 16:05:37
 */

package geobloc.desktop.dialogs;

import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class PhotoPanel extends JPanel {

    /** Creates new form PhotoPanel */
    public PhotoPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();

    setName("Form"); // NOI18N

    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(geobloc.desktop.FormDesignerApp.class).getContext().getResourceMap(PhotoPanel.class);
    jLabel1.setIcon(resourceMap.getIcon("jLabel1.icon")); // NOI18N
    jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
    jLabel1.setEnabled(false);
    jLabel1.setName("jLabel1"); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
    );
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  // End of variables declaration//GEN-END:variables

}
