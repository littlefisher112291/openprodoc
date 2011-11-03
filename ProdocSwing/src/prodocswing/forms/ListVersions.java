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
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JDialog;
import prodoc.Cursor;
import prodoc.DriverGeneric;
import prodoc.PDDocs;
import prodoc.PDException;
import prodoc.Record;
import prodocswing.PDTableModel;

/**
 *
 * @author jhierrot
 */
public final class ListVersions extends javax.swing.JDialog
{
Record DocListed;
PDTableModel VersionsList = new PDTableModel();
Frame Fparent;
/**
 * 
 */
protected JDialog MantForm;

/** Creates new form ListObjects
 * @param parent 
 * @param modal
 * @param pDocListed 
 */
public ListVersions(java.awt.Frame parent, boolean modal, Record pDocListed)
{
super(parent, modal);
Fparent=parent;
initComponents();
ObjectsTable.setAutoCreateRowSorter(true);
ObjectsTable.setAutoCreateColumnsFromModel(true);
DocListed = pDocListed;
RefreshTable();
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ObjectsTable = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        EditButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(MainWin.TT("List_of_Versions"));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        ObjectsTable.setFont(MainWin.getFontList());
        ObjectsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObjectsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ObjectsTable);

        jToolBar1.setRollover(true);

        EditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit.png"))); // NOI18N
        EditButton.setToolTipText("");
        EditButton.setFocusable(false);
        EditButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EditButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(EditButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void EditButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EditButtonActionPerformed
{//GEN-HEADEREND:event_EditButtonActionPerformed
if (getObjectsTable().getSelectedRow()==-1)
    return;

}//GEN-LAST:event_EditButtonActionPerformed

private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
{//GEN-HEADEREND:event_formWindowClosing
}//GEN-LAST:event_formWindowClosing

private void ObjectsTableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_ObjectsTableMouseClicked
{//GEN-HEADEREND:event_ObjectsTableMouseClicked
if (evt.getClickCount()<2)
    return;
if (getObjectsTable().getSelectedRow()==-1)
    return;
try {
PDDocs Doc = new PDDocs(MainWin.getSession());
Doc.assignValues(getPDTableModel().getElement(getObjectsTable().getSelectedRow()));
String FileName=Doc.getFileVer(MainWin.getTmp(), Doc.getVersion());
MainWin.Execute(FileName);
} catch (PDException ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }

}//GEN-LAST:event_ObjectsTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditButton;
    private javax.swing.JTable ObjectsTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

//----------------------------------------------------------------
/**
 * 
 * @param ListName
 * @return
 */
//static public DefaultComboBoxModel getComboModel(String ListName)
//{
//Vector VObjects=new Vector();
//try {
//DriverGeneric Session=MainWin.getSession();
//PDDocs DocVer = new PDDocs(Session);
//Cursor CursorId = DocVer.ListVersions(ListName, ListName);
//Record Res=Session.NextRec(CursorId);
//while (Res!=null)
//    {
//    Attribute Attr=Res.getAttr(PDRoles.fNAME);
//    VObjects.add(Attr.getValue());
//    Res=Session.NextRec(CursorId);
//    }
//} catch (PDException ex)
//    {
//    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
//    }
//return(new DefaultComboBoxModel(VObjects));
//}
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
return (getObjectsTable().getSelectedRow());
}
//--------------------------------------------------------------------
/**
 * 
 * @return
 */
protected JButton getEditButton()
{ return EditButton; }
//--------------------------------------------------------------------
/**
* @return the ObjectsTable
*/
protected javax.swing.JTable getObjectsTable()
{
return ObjectsTable;
}
//--------------------------------------------------------------------
/**
 * 
 */
protected void RefreshTable()
{
try {
PDTableModel ObjectsList2 = new PDTableModel();
ObjectsList2.setDrv(MainWin.getSession());
Vector VObjects=new Vector();
DriverGeneric Session=MainWin.getSession();
String Id=(String)DocListed.getAttr(PDDocs.fPDID).getValue();
String Type=(String)DocListed.getAttr(PDDocs.fDOCTYPE).getValue();
PDDocs DocVer = new PDDocs(Session, Type);
Cursor CursorId = DocVer.ListVersions(Type, Id);
Record Rec=DocVer.getRecSum();
ObjectsList2.setListFields(Rec);
ObjectsList2.setCursor(CursorId);
getObjectsTable().setModel(ObjectsList2);
} catch (PDException ex)
    {
    MainWin.Message(MainWin.TT("Error_assigning_columns_to_table")+":"+MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}
//--------------------------------------------------------------------

}