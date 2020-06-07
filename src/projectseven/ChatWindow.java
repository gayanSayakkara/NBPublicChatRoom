package projectseven;

public class ChatWindow extends javax.swing.JFrame implements ChatObserver{
    private ChatObservable chatObservable;
    
    public ChatWindow(String title, ChatObservable chatObservable) {
        initComponents();
        this.chatObservable=chatObservable;
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle(title);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chatTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        meaasgeTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        chatTextField.setBackground(new java.awt.Color(255, 204, 204));
        chatTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        chatTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chatTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatTextFieldActionPerformed(evt);
            }
        });

        meaasgeTextArea.setEditable(false);
        meaasgeTextArea.setBackground(new java.awt.Color(204, 255, 204));
        meaasgeTextArea.setColumns(20);
        meaasgeTextArea.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        meaasgeTextArea.setRows(5);
        meaasgeTextArea.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane1.setViewportView(meaasgeTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                    .addComponent(chatTextField))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chatTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatTextFieldActionPerformed
        String message = getTitle()+" : "+chatTextField.getText();
        chatObservable.notifyAllPerson(message);
        chatTextField.setText("");
    }//GEN-LAST:event_chatTextFieldActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       chatObservable.removePerson(this);
    }//GEN-LAST:event_formWindowClosing

    @Override
    public void updateChat(String message) {
        meaasgeTextArea.append(message+"\n");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chatTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea meaasgeTextArea;
    // End of variables declaration//GEN-END:variables
}
