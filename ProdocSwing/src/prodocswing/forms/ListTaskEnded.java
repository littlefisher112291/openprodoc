/*
 * OpenProdoc
 * 
 * See the help doc files distributed with
 * this work for additional information regarding copyright ownership.
 * Joaquin Hierro licenses this file to You under:
 * 
 * License GNU GPL v3 http://www.gnu.org/licenses/gpl.html
 * 
 * you may not use this file except in compliance with the License.  
 * Unless agreed to in writing, software is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * author: Joaquin Hierro      2011
 * 
 */

/*
 * ListObjects.java
 *
 * Created on 12-feb-2010, 20:39:16
 */

package prodocswing.forms;

import java.awt.Frame;
import java.util.Date;
import javax.swing.*;
import prodoc.*;
import prodocswing.PDTableModel;

/**
 *
 * @author jhierrot
 */
public class ListTaskEnded extends javax.swing.JDialog
{
protected ObjPD PDObject;
protected PDTableModel UserList1 = new PDTableModel();
protected Frame Fparent;

/**
 * 
 */
protected JDialog MantForm;

/** Creates new form ListObjects
 * @param parent 
 * @param modal
 * @param pPDObject 
 */
public ListTaskEnded(java.awt.Frame parent, boolean modal, ObjPD pPDObject)
{
super(parent, modal);
Fparent=parent;
initComponents();
ObjectsTable.setAutoCreateRowSorter(true);
ObjectsTable.setAutoCreateColumnsFromModel(true);
PDObject = pPDObject;
Date d2=new Date();
TimeStampFilter2.setValue(d2);
Date d1=new Date(d2.getTime()-60000);
TimeStampFilter1.setValue(d1);
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        CategoryLabel = new javax.swing.JLabel();
        CategoryFilter = new javax.swing.JTextField();
        DateLabel1 = new javax.swing.JLabel();
        TimeStampFilter1 = new javax.swing.JFormattedTextField();
        DateLabel2 = new javax.swing.JLabel();
        TimeStampFilter2 = new javax.swing.JFormattedTextField();
        ButtonFilter = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        ReviewButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ObjectsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        CategoryLabel.setFont(MainWin.getFontDialog());
        CategoryLabel.setText(MainWin.TT("Category"));

        CategoryFilter.setFont(MainWin.getFontDialog());
        CategoryFilter.setToolTipText("Introducir nombre completo o parcial del usuario");
        CategoryFilter.setName("CategoryFilter"); // NOI18N

        DateLabel1.setFont(MainWin.getFontDialog());
        DateLabel1.setText(MainWin.TT("Timestamp_from"));

        TimeStampFilter1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"))));

        DateLabel2.setFont(MainWin.getFontDialog());
        DateLabel2.setText(MainWin.TT("Timestamp_to"));

        TimeStampFilter2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"))));

        ButtonFilter.setFont(MainWin.getFontDialog());
        ButtonFilter.setText(MainWin.TT("Ok"));
        ButtonFilter.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonFilterActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        ReviewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit.png"))); // NOI18N
        ReviewButton.setToolTipText("");
        ReviewButton.setFocusable(false);
        ReviewButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ReviewButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ReviewButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ReviewButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ReviewButton);

        ObjectsTable.setFont(MainWin.getFontList());
        jScrollPane1.setViewportView(ObjectsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CategoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CategoryFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(TimeStampFilter1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DateLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(TimeStampFilter2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonFilter)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryLabel)
                    .addComponent(CategoryFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateLabel1)
                    .addComponent(TimeStampFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateLabel2)
                    .addComponent(TimeStampFilter2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonFilter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CategoryFilter, TimeStampFilter1, TimeStampFilter2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonFilterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonFilterActionPerformed
    {//GEN-HEADEREND:event_ButtonFilterActionPerformed
RefreshTable();
int Tot=getObjectsTable().getRowCount();
if (Tot>0)
    {
    getObjectsTable().setRowSelectionInterval(0, 0);
    }
    }//GEN-LAST:event_ButtonFilterActionPerformed

private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
{//GEN-HEADEREND:event_formWindowClosing
}//GEN-LAST:event_formWindowClosing

    private void ReviewButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ReviewButtonActionPerformed
    {//GEN-HEADEREND:event_ReviewButtonActionPerformed
int Pos=getObjectsTable().getSelectedRow();
if (Pos==-1)
    return;
MantForm.setLocationRelativeTo(null);
MantForm.setVisible(true);

int Tot=getObjectsTable().getRowCount();
if (Tot>0)
    {
    int Sel=Math.min(Tot-1, Pos);
    getObjectsTable().setRowSelectionInterval(Sel, Sel);
    }
    }//GEN-LAST:event_ReviewButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonFilter;
    private javax.swing.JTextField CategoryFilter;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JLabel DateLabel1;
    private javax.swing.JLabel DateLabel2;
    private javax.swing.JTable ObjectsTable;
    private javax.swing.JButton ReviewButton;
    private javax.swing.JFormattedTextField TimeStampFilter1;
    private javax.swing.JFormattedTextField TimeStampFilter2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

//----------------------------------------------------------------
/**
 * 
 * @return
 */
protected PDTableModel getPDTableModel()
{
return ((PDTableModel) getObjectsTable().getModel());
}
//----------------------------------------------------------------
/**
 * 
 * @return
 */
protected int getSelectedRow()
{
return (getObjectsTable().convertRowIndexToModel(getObjectsTable().getSelectedRow()));
}
//----------------------------------------------------------------
/**
 * 
 */
protected void RefreshTable()
{
try {
PDTableModel ObjectsList2 = new PDTableModel();
ObjectsList2.setDrv(MainWin.getSession());
ObjectsList2.setListFields(PDObject.getRecord());
Conditions Conds=new Conditions();
if (CategoryFilter.getText().length()!=0)
    {
    Condition C=new Condition(PDTasksDef.fCATEGORY, Condition.cEQUAL, CategoryFilter.getText());    
    Conds.addCondition(C);
    }
if (TimeStampFilter1.getText().length()!=0)
    {
    Conditions Conds1=new Conditions();
    Conds1.setOperatorAnd(false);
    Date d1=(Date)TimeStampFilter1.getValue();
    Condition C1=new Condition(PDTasksExecEnded.fSTARTDATE, Condition.cGET , d1);  
    Conds1.addCondition(C1);
    Condition C2=new Condition(PDTasksExecEnded.fENDDATE, Condition.cGET , d1);  
    Conds1.addCondition(C2);
    Conds.addCondition(Conds1);
    }
if (TimeStampFilter2.getText().length()!=0)
    {
    Conditions Conds1=new Conditions();
    Conds1.setOperatorAnd(false);
    Date d1=(Date)TimeStampFilter2.getValue();
    Condition C1=new Condition(PDTasksExecEnded.fSTARTDATE, Condition.cLET , d1);  
    Conds1.addCondition(C1);
    Condition C2=new Condition(PDTasksExecEnded.fENDDATE, Condition.cLET , d1);  
    Conds1.addCondition(C2);
    Conds.addCondition(Conds1);
    }
if (Conds.NumCond()==0)
    {
    MainWin.Message(MainWin.TT("Empty_conditions"));
    return;
    }
PDTasksExecEnded Task=new PDTasksExecEnded(MainWin.getSession());
Cursor Cur=Task.Search(Conds);
ObjectsList2.setCursor(Cur);
getObjectsTable().setModel(ObjectsList2);
} catch (PDException ex)
    {
    MainWin.Message(MainWin.TT("Error_assigning_columns_to_table")+":"+MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}
//--------------------------------------------------------------------
/**
* @return the ObjectsTable
*/
protected javax.swing.JTable getObjectsTable()
{
return ObjectsTable;
}
//--------------------------------------------------------------------
}
