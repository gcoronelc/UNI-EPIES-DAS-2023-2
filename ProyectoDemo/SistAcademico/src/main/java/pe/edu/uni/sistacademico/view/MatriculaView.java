package pe.edu.uni.sistacademico.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import pe.edu.uni.sistacademico.controller.AcademicoController;
import pe.edu.uni.sistacademico.controller.ComboController;
import pe.edu.uni.sistacademico.dto.AlumnoDto;
import pe.edu.uni.sistacademico.dto.ComboDto;
import pe.edu.uni.sistacademico.dto.DetalleDto;
import pe.edu.uni.sistacademico.dto.MatriculaDto;
import pe.edu.uni.ventapasajes.util.Session;

public class MatriculaView extends javax.swing.JInternalFrame {

	private ComboController comboController;
	private AcademicoController academicoController;
	private String ciclo;
	private AlumnoDto usuario;
	private List<DetalleDto> listaDetalle;

	public MatriculaView() {
		initComponents();
		try {
			this.setMaximum(true);
		} catch (Exception e) {
		}
		listaDetalle = new ArrayList<>();
		comboController = new ComboController();
		academicoController = new AcademicoController();
		initForm();
		cargarComboCursos();
	}

	private void initForm(){
		ciclo = academicoController.getCicloActual();
		usuario = (AlumnoDto) Session.get("USUARIO");
		String titulo = "REGISTRAR MATRICULA - CICLO " + ciclo + " (" + usuario.getNombre() + (")");
		this.setTitle(titulo);
	}
	private void cargarComboCursos() {
		cboHorario.removeAllItems();
		List<ComboDto> cursos = comboController.getCursos(ciclo, usuario.getId());
		UtilView.llenarCombo(cboCurso, cursos);
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      cboCurso = new javax.swing.JComboBox<>();
      jLabel2 = new javax.swing.JLabel();
      cboHorario = new javax.swing.JComboBox<>();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      jPanel2 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      tblDetalle = new javax.swing.JTable();

      setClosable(true);
      setIconifiable(true);
      setMaximizable(true);
      setTitle("MATRICULA");

      jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTROL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 102, 255))); // NOI18N

      jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      jLabel1.setText("Curso");

      cboCurso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      cboCurso.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cboCursoActionPerformed(evt);
         }
      });

      jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      jLabel2.setText("Horario");

      cboHorario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

      jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
      jButton1.setToolTipText("Agregar curso");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });

      jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tacho.png"))); // NOI18N
      jButton2.setToolTipText("Eliminar curso");

      jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grabar.png"))); // NOI18N
      jButton3.setText("Procesar");
      jButton3.setToolTipText("Procesar matricula");
      jButton3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(cboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(cboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(20, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(cboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(cboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGap(1, 1, 1)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTROL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 102, 255))); // NOI18N

      tblDetalle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "CODIGO", "CURSO", "HORARIO", "PROFESOR", "CREDITOS"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
         };
         boolean[] canEdit = new boolean [] {
            false, false, false, false, false
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }

         public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
         }
      });
      tblDetalle.setRowHeight(35);
      tblDetalle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
      jScrollPane1.setViewportView(tblDetalle);
      if (tblDetalle.getColumnModel().getColumnCount() > 0) {
         tblDetalle.getColumnModel().getColumn(0).setResizable(false);
         tblDetalle.getColumnModel().getColumn(1).setResizable(false);
         tblDetalle.getColumnModel().getColumn(2).setResizable(false);
         tblDetalle.getColumnModel().getColumn(3).setResizable(false);
         tblDetalle.getColumnModel().getColumn(4).setResizable(false);
      }

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1)
            .addContainerGap())
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void cboCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCursoActionPerformed
      cboHorario.removeAllItems();
		if(cboCurso.getSelectedIndex()==-1){
			return;
		}
		ComboDto op = (ComboDto) cboCurso.getSelectedItem();
		List<ComboDto> horarios = comboController.getHorario(ciclo, op.getId());
		UtilView.llenarCombo(cboHorario, horarios);
   }//GEN-LAST:event_cboCursoActionPerformed

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // Validacion
		if(cboCurso.getSelectedIndex() == -1){
			Mensaje.error(this, "Falta seleccionar el curso.");
			return;
		}
		if(cboHorario.getSelectedIndex() == -1){
			Mensaje.error(this, "Falta seleccionar el horario.");
			return;
		}
		// Preparar los datos
		ComboDto curso = (ComboDto) cboCurso.getSelectedItem();
		ComboDto horario = (ComboDto) cboHorario.getSelectedItem();
		DetalleDto detalle = new DetalleDto();
		detalle.setIdCurso(curso.getId());
		detalle.setCurso(curso.getEtiqueta());
		detalle.setIdProg(horario.getId());
		detalle.setHorario(horario.getEtiqueta());
		listaDetalle.add(detalle);
		// Mostrar lista detalle
		DefaultTableModel tabla = (DefaultTableModel) tblDetalle.getModel();
		tabla.setRowCount(0);
		for(DetalleDto rec: listaDetalle){
			Object[] rowData={
				rec.getIdCurso(), rec.getCurso(), rec.getHorario(), null, null
			};
			tabla.addRow(rowData);
		}
   }//GEN-LAST:event_jButton1ActionPerformed

   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     // Validar
	  if(listaDetalle.isEmpty()){
		  Mensaje.error(this, "Falta seleccionar los cursos.");
		  return;
	  }
	  // Proceso
		try {
			// Preparar datos
			Integer[] cursos = new Integer[listaDetalle.size()];
			for(int i=0; i<listaDetalle.size();i++){
				cursos[i] = listaDetalle.get(i).getIdProg();
			}
			// Proceso
			MatriculaDto dto = new MatriculaDto();
			dto.setCiclo(ciclo);
			dto.setCursos(cursos);
			dto.setIdAlumno(usuario.getId());
			academicoController.matricular(dto);
			// Reporte
			Mensaje.info(this, "Proceso ok, id de matricula = " + dto.getIdMatricula() + ".");
			this.dispose();
		} catch (Exception e) {
			Mensaje.error(this, e.getMessage());
		}
   }//GEN-LAST:event_jButton3ActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JComboBox<ComboDto> cboCurso;
   private javax.swing.JComboBox<ComboDto> cboHorario;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable tblDetalle;
   // End of variables declaration//GEN-END:variables
}
