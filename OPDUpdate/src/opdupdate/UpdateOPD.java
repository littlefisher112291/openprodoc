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
 * ConfigConection.java
 *
 * Created on 22-nov-2010, 19:46:32
 */

package opdupdate;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JProgressBar;
import prodoc.DriverGeneric;
import prodoc.PDException;
import prodoc.ProdocFW;

/**
 *
 * @author jhierrot
 */
public class UpdateOPD extends javax.swing.JFrame
{
private static HashMap TransList=new HashMap();
private static String AppLang=null;
Vector Trace=new Vector();
DefaultListModel LM=null;
ActThread Act;

/** Creates new form ConfigConection */
public UpdateOPD()
{
initComponents();
setLocationRelativeTo(null);
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

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        AttrTab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        UpMetadataCB = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        UpProgramCB = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        EvolTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jProgressBar1 = new javax.swing.JProgressBar();
        AcceptButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(TT("OpenProdoc_Update"));
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(TT("Prodoc_Metadata_Creation"));

        AttrTab.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText(TT("Update_Metadata_Structure"));

        UpMetadataCB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        UpMetadataCB.setToolTipText("Boolean value, when checked, the documents in the repository will be encrypted");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText(TT("Update_Program"));

        UpProgramCB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        UpProgramCB.setToolTipText("Boolean value, when checked, the documents in the repository will be encrypted");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("- Before any update VERIFY that your BACKUPS are CORRECT and  UPDATED.\n- Any previous inconsistence or error during update can produce UNRECOVERABLE DATA LOST.\n-All the USERS MUST BE DISCONNECTED during update.\n\n- Antes de actualizar VERIFIQUE que sus COPIAS de SEGURIDAD están ACTUALIZADAS y son CORRECTAS.\n\n- Cualquier inconsistencia previa o error durante la actualización podría producir PERDIDA IRRECUPERABLE de DATOS.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout AttrTabLayout = new javax.swing.GroupLayout(AttrTab);
        AttrTab.setLayout(AttrTabLayout);
        AttrTabLayout.setHorizontalGroup(
            AttrTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttrTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AttrTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AttrTabLayout.createSequentialGroup()
                        .addGroup(AttrTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AttrTabLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(UpProgramCB))
                            .addGroup(AttrTabLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(UpMetadataCB)))
                        .addGap(0, 270, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        AttrTabLayout.setVerticalGroup(
            AttrTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttrTabLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(AttrTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(UpMetadataCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AttrTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(UpProgramCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(TT("Parameters_config"), AttrTab);

        EvolTab.setEnabled(false);
        EvolTab.setFocusable(false);
        EvolTab.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jList1.setModel(getListModel());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout EvolTabLayout = new javax.swing.GroupLayout(EvolTab);
        EvolTab.setLayout(EvolTabLayout);
        EvolTabLayout.setHorizontalGroup(
            EvolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvolTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EvolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                .addContainerGap())
        );
        EvolTabLayout.setVerticalGroup(
            EvolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EvolTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(TT("Update_Process"), EvolTab);

        AcceptButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AcceptButton.setText(TT("Ok"));
        AcceptButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AcceptButtonActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CancelButton.setText(TT("Cancel"));
        CancelButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AcceptButton)
                        .addGap(9, 9, 9)
                        .addComponent(CancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AcceptButton)
                    .addComponent(CancelButton))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CancelButtonActionPerformed
    {//GEN-HEADEREND:event_CancelButtonActionPerformed
dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void AcceptButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AcceptButtonActionPerformed
    {//GEN-HEADEREND:event_AcceptButtonActionPerformed
try {
CreateMetadataStructure();
} catch(Exception ex)
    {
    Message(ex.getLocalizedMessage());
    AcceptButton.setEnabled(true);
    CancelButton.setEnabled(true);
    return;
    }
System.exit(0);
    }//GEN-LAST:event_AcceptButtonActionPerformed

/**
* @param args the command line arguments
*/
public static void main(String args[])
{
if (args.length>0)
    AppLang=args[0];
java.awt.EventQueue.invokeLater(new Runnable()
    {
    public void run()
    {
    new UpdateOPD().setVisible(true);
    }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptButton;
    private javax.swing.JPanel AttrTab;
    private javax.swing.JButton CancelButton;
    private javax.swing.JPanel EvolTab;
    private javax.swing.JCheckBox UpMetadataCB;
    private javax.swing.JCheckBox UpProgramCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

//----------------------------------------------------------
static protected String TT(String Text)
{
String Lang=getLang();
if (Lang.equals("EN"))
    return(Text.replace("_", " "));
Properties Trans=getProperties(Lang);
if (Trans==null)
    return(Text.replace("_", " "));
String Translation=Trans.getProperty(Text);
if (Translation==null)
    return(Text.replace("_", " "));
else
    return(Translation);
}
//----------------------------------------------------------
static private String getLang()
{
if (AppLang==null)
    {
    Locale locale = Locale.getDefault();
    AppLang=locale.getLanguage().toUpperCase();
    }
return(AppLang);
}
//----------------------------------------------------------
static private Properties getProperties(String Lang)
{
Properties Trans=(Properties)TransList.get(Lang);
if (Trans!=null)
    return(Trans);
InputStream f=null;
try {
f= UpdateOPD.class.getResourceAsStream("lang/Text_"+Lang+".properties");
Trans=new Properties();
Trans.load(f);
f.close();
} catch (Exception ex)
    {
    if (f!=null)
        {
        try {
            f.close();
        } catch (IOException ex1)
            {
            ex1.printStackTrace();
            }
        }
    return(null);
    }
TransList.put(Lang, Trans);
return(Trans);
}
//---------------------------------------------------------------------
/**
 * 
 * @param pMessage
 */
static public void Message(String pMessage)
{
DialogInfo DI=new DialogInfo(null, true);
DI.SetMessage(pMessage);
DI.setLocationRelativeTo(null);
DI.setVisible(true);
}
//---------------------------------------------------------------------
private void CreateMetadataStructure() throws PDException
{
Vector Trace=new Vector();
EvolTab.setEnabled(true);
EvolTab.setFocusable(true);
jTabbedPane1.setSelectedComponent(EvolTab);
jProgressBar1.setMaximum(35);
AcceptButton.setEnabled(false);
CancelButton.setEnabled(false);
repaint();
boolean UpProgram=UpProgramCB.isSelected();
boolean UpMetadata=UpMetadataCB.isSelected();
Act=new ActThread();
Act.SetParam(Trace, getListModel(), jProgressBar1, jList1);
Act.start();
ActInst ActI=new ActInst();
ActI.SetParam(UpMetadata, UpProgram, Trace, this);
ActI.start();
}
//--------------------------------------------------------------
private DefaultListModel getListModel()
{
if (LM==null)
    LM=new DefaultListModel();
return LM;
}
//--------------------------------------------------------------
/** internal class to update evolution
 * 
 */
public class ActInst extends Thread
{
boolean UpMetadata;
boolean UpProgram;
Vector Trace;
UpdateOPD Form;
public void SetParam(boolean pUpMetadata, boolean pUpProgram, Vector pTrace, UpdateOPD pForm)
{
UpMetadata=pUpMetadata;
UpProgram=pUpProgram;
Trace=pTrace;
Form=pForm;
}
//------------------------------------
public void run()
{
DriverGeneric Sesion=null;
try {
if (UpMetadata)
    {
    ProdocFW.InitProdoc("PD", "Prodoc.properties");
    Sesion=ProdocFW.getSession("PD", "Install", "Install");
    Sesion.Update( Trace);
    ProdocFW.freeSesion("PD", Sesion);
    ProdocFW.ShutdownProdoc("PD");
    }
if (UpProgram)
    {
    File F=new File("Prodoc.sh");
    if (F.exists())
        F.renameTo(new File("Prodoc.sh."+(new Random()).nextInt()+".del"));
    F=new File("Prodoc.bat");
    if (F.exists())
        F.renameTo(new File("Prodoc.bat."+(new Random()).nextInt()+".del"));
    F=new File("Prodoc0.8.sh");
    F.renameTo(new File("Prodoc.sh"));
    F.setExecutable(true);
    F=new File("Prodoc0.8.bat");
    F.renameTo(new File("Prodoc.bat"));
    F=new File("ProdocSwing.jar");
    F.renameTo(new File("ProdocSwing.jar."+(new Random()).nextInt()+".del"));    
    F=new File("lib/Prodoc.jar");
    F.renameTo(new File("Prodoc.jar."+(new Random()).nextInt()+".del"));    
    F=new File("ProdocSwing0.8.jar");
    F.renameTo(new File("ProdocSwing.jar"));
    F.setExecutable(true);
    F=new File("Prodoc0.8.jar");
    F.renameTo(new File("lib/Prodoc.jar"));
    // TODO Delete .del temporary files
    }
sleep(60);
Act.setFinished(true);
Message(TT("OpenProdoc_Server_Updated_correctly"));
dispose();
Act.interrupt();
} catch (Exception e)
    {
    e.printStackTrace();
    Act.setFinished(true);
    Message(TT("Error_updating_metadata_structure")+":"+e.getLocalizedMessage());
    AcceptButton.setEnabled(true);
    CancelButton.setEnabled(true);
    if (Sesion!=null)
        {
        try {
        ProdocFW.freeSesion("PD", Sesion);
        ProdocFW.ShutdownProdoc("PD");
        } catch (PDException ex)
            {
            ex.printStackTrace();
            }
        }
    }
}
//------------------------------------
    }

//--------------------------------------------------------------
/** internal class to update evolution
 * 
 */
public class ActThread extends Thread
{
Vector Tr;
JProgressBar PB;
JList LT;
DefaultListModel LM;
int Position=0;
private boolean Finished=false;
//------------------------------------
public void SetParam(Vector pTr, DefaultListModel pLM, JProgressBar pPB, JList pLT)
{
Tr=pTr;
LM=pLM;
PB=pPB;
LT=pLT;
}
//------------------------------------
 @Override
public void run()
{
while (!Finished)
    {
    PB.setValue(Position);
    for (; Position<Tr.size(); Position++)
        {
        LM.addElement((String)Tr.elementAt(Position));
        }
    LT.setSelectedIndex(Position-1);
    LT.ensureIndexIsVisible(Position-1);
    repaint();
    try {
        sleep(10);
    } catch (InterruptedException ex)
        {
        }
    }
}
//------------------------------------
/**
 * @param pFinished the Finished to set
 */
public void setFinished(boolean pFinished)
{
Finished = pFinished;
}
//------------------------------------
}

//---------------------------------------------------------------------
}