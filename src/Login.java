
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gio Moreno
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearUsu = new javax.swing.JButton();
        IniSes = new javax.swing.JButton();
        Usu = new javax.swing.JTextField();
        Contra = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CrearUsu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CrearUsu.setText("Crear Usuario");

        IniSes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IniSes.setText("Iniciar Sesion");
        IniSes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniSesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CrearUsu)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Usu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(IniSes)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Usu, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(IniSes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(CrearUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniSesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniSesActionPerformed

        try {
            String Usuario, Contraseña;
            File f = new File("usuarios.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            boolean x, encontro = false;
            Usuario = Usu.getText();
            Contraseña = Contra.getText();
            int cont = 0,Cont;
            int repe;
            repe = ContarLineas(f);
            while (cont != repe && encontro == false) {
                //System.out.println(cont);
                //System.out.println(repe);
                Cont=cont;
                x = BuscarUsuario(br, Usuario, Contraseña, Cont);
                //System.out.println("Entre al while " + cont + " veces");
                if (x == true) {
                    encontro = true;
                 JOptionPane.showMessageDialog(null," Login correcto ");
                } 
                cont= cont+1;
            }
            if (encontro == false) {
                JOptionPane.showMessageDialog(null, "Nel mijo bai");
            }
            br.close();
            fr.close();
        } catch (IOException e) {

        }
    }//GEN-LAST:event_IniSesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public int ContarLineas(File f) throws IOException {
        int repe = 0;
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String aux = "0";
        aux = br.readLine();
        while (aux != null) {
            aux = br.readLine();
            repe++;
            //System.out.println(repe);
        }
        //f.close();
        return repe;
    }

    public boolean BuscarUsuario(BufferedReader br, String Usu, String Contra, int rep) throws IOException {
        boolean x = false;
        //System.out.println("la vez" +rep);
        //System.out.println(Usu+Contra+"?");

        String UsuAnali = Usu, ContraAnali = Contra, cond1, cond2;

        //System.out.println("x"+UsuAnali+ContraAnali+"...");
        cond1 = SepararUsu(br, UsuAnali, ContraAnali, rep);
        //System.out.println(cond1+ " <>");
        cond2 = SepararContra(br, UsuAnali, ContraAnali, rep);
        //System.out.println(cond2);
        //System.out.println("1   holi" + UsuAnali + ContraAnali);
        //System.out.println(cond1 + cond2);

        //System.out.println("Valor conque estoy buscando en el archivo "+UsuAnali+"   "+ContraAnali);
        //System.out.println("Con lo que me bota el buscar  "+Usu+"   "+Contra);
        if (cond1.compareTo(Usu) == 0 && cond2.compareTo(Contra) == 0) {
            x = true;
            System.out.println("Funciono papu");
        } else {
            System.out.println("No pasa nada");
        }
        return x;
    }

    public String SepararUsu(BufferedReader f, String Usua, String Contras, int rep) throws FileNotFoundException, IOException {
        String Linea = "0";
        f = AbrirArchivo();
        System.out.println("Entra a sepUsu");
        Linea = f.readLine();
        //System.out.println(rep+" a---a");
        for (int i = 0; i < rep; i++) {
            Linea = f.readLine();
            System.out.println(Linea+" a ver si hay cambio ");
        }
        int tam = Linea.length();
        for (int i = 0; i < tam; i++) {
            if (Linea.substring(i, i + 1).equals(";")) {
                Usua = Linea.substring(0, i);
                Contras = Linea.substring(i + 1, tam);
            }
        }
        f.close();
        System.out.println("Estoy retornando "+Usua);
        return Usua;
    }

    public String SepararContra(BufferedReader f, String Usua, String Contras, int rep) throws FileNotFoundException, IOException {
        String Linea = "0";
        f = AbrirArchivo();
        //System.out.println(rep);
        System.out.println("Entra a sepContra");
        //System.out.println("   1" +Linea+ " naahhhh");
        Linea = f.readLine();
        //System.out.println("La linea es "+Linea+" "+rep);
        //System.out.println(Linea+"xxxxxx");
        //System.out.println(rep);
        for (int i = 0; i < rep; i++) {
            Linea = f.readLine();
            System.out.println(Linea+" a ver si cambia");
        }
        int tam = Linea.length();
        for (int i = 0; i < tam; i++) {
            if (Linea.substring(i, i + 1).equals(";")) {
                Contras = Linea.substring(i + 1, tam);
            }
        }
        f.close();
        System.out.println("Estoy retornando la contraseña"+Contras);
        return Contras;   
    }
public BufferedReader AbrirArchivo () throws FileNotFoundException{
    File f = new File("usuarios.txt");
    FileReader fr = new FileReader (f);
    BufferedReader br = new BufferedReader(fr);
    return br;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contra;
    private javax.swing.JButton CrearUsu;
    private javax.swing.JButton IniSes;
    private javax.swing.JTextField Usu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}