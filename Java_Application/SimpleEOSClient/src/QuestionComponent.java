
import java.awt.Component;
import java.util.ArrayList;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import model.Answer;
import model.Question;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author __ntnc__
 */
public class QuestionComponent extends javax.swing.JPanel {

    /**
     * Creates new form QuestionComponent
     */
    Question q;
    ArrayList<Component> answerComponents = new ArrayList<>();

    public QuestionComponent(Question q) {
        initComponents();
        this.q = q;
        txtQuestionContent.setText(q.getContent());
        ButtonGroup groupRadAnswer = new ButtonGroup();
        for (int i = 0; i < q.getAnswers().size(); i++) {
            Answer a = q.getAnswers().get(i);
            if (q.isMultipleChoice()) {
                JCheckBox cbxAnswer = new JCheckBox(a.getContent());
                answerComponents.add(cbxAnswer);
                panelAnswers.add(cbxAnswer);
            } else {
                JRadioButton radAnswer = new JRadioButton(a.getContent());
                answerComponents.add(radAnswer);
                panelAnswers.add(radAnswer);
                groupRadAnswer.add(radAnswer);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtQuestionContent = new javax.swing.JTextField();
        panelAnswers = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(961, 540));

        panelAnswers.setBackground(new java.awt.Color(255, 255, 255));
        panelAnswers.setToolTipText("");
        panelAnswers.setLayout(new javax.swing.BoxLayout(panelAnswers, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelAnswers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuestionContent, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtQuestionContent, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelAnswers, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelAnswers;
    private javax.swing.JTextField txtQuestionContent;
    // End of variables declaration//GEN-END:variables
}