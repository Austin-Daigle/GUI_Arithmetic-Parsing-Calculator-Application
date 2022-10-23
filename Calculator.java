import java.awt.Color;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

/**
 * @author Austin
 * @Date 10/22/2022
 * @Version 1.0 */
@SuppressWarnings("serial")
public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();
    }


    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        calculatorRightClickMenu = new javax.swing.JPopupMenu();
        copyRightClickMenuButton = new javax.swing.JMenuItem();
        calculatorLabel = new javax.swing.JLabel();
        calculatorScroll = new javax.swing.JScrollPane();
        calculatorTextArea = new javax.swing.JTextArea();
        number0Button = new javax.swing.JButton();
        number1Button = new javax.swing.JButton();
        number2Button = new javax.swing.JButton();
        number3Button = new javax.swing.JButton();
        number4Button = new javax.swing.JButton();
        number5Button = new javax.swing.JButton();
        number6Button = new javax.swing.JButton();
        number7Button = new javax.swing.JButton();
        number9Button = new javax.swing.JButton();
        number8Button = new javax.swing.JButton();
        decimalPointButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        additionButton = new javax.swing.JButton();
        exponentButton = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();
        leftParenthesesButton = new javax.swing.JButton();
        rightParenthesesButton = new javax.swing.JButton();
        backSpaceButton = new javax.swing.JButton();
        squareNumberButton = new javax.swing.JButton();
        clearEntryButton = new javax.swing.JButton();
        trigModeButton = new javax.swing.JButton();
        cosButton = new javax.swing.JButton();
        sinButton = new javax.swing.JButton();
        tanButton = new javax.swing.JButton();
        sqrtButton = new javax.swing.JButton();
        historyScrollPlane = new javax.swing.JScrollPane();
        historyTextArea = new javax.swing.JTextArea();
        clearHistoryButton = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        copyRightClickMenuButton.setText("Copy");
        copyRightClickMenuButton.setToolTipText("");
        copyRightClickMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyRightClickMenuButtonActionPerformed(evt);
            }
        });
        calculatorRightClickMenu.add(copyRightClickMenuButton);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        calculatorLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        calculatorLabel.setText("JCalculator v1.0");

        calculatorScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        calculatorScroll.setHorizontalScrollBar(null);

        calculatorTextArea.setEditable(false);
        calculatorTextArea.setColumns(10);
        calculatorTextArea.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        calculatorTextArea.setLineWrap(true);
        calculatorTextArea.setRows(1);
        calculatorTextArea.setWrapStyleWord(true);
        calculatorTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                calculatorTextAreaMouseReleased(evt);
            }
        });
        calculatorTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calculatorTextAreaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calculatorTextAreaKeyReleased(evt);
            }
        });
        calculatorScroll.setViewportView(calculatorTextArea);

        number0Button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        number0Button.setText("0");
        number0Button.setFocusable(false);
        number0Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ButtonActionPerformed(evt);
            }
        });

        number1Button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        number1Button.setText("1");
        number1Button.setToolTipText("");
        number1Button.setFocusable(false);
        number1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ButtonActionPerformed(evt);
            }
        });

        number2Button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        number2Button.setText("2");
        number2Button.setFocusable(false);
        number2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ButtonActionPerformed(evt);
            }
        });

        number3Button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        number3Button.setText("3");
        number3Button.setFocusable(false);
        number3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ButtonActionPerformed(evt);
            }
        });

        number4Button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        number4Button.setText("4");
        number4Button.setFocusable(false);
        number4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ButtonActionPerformed(evt);
            }
        });

        number5Button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        number5Button.setText("5");
        number5Button.setFocusable(false);
        number5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ButtonActionPerformed(evt);
            }
        });

        number6Button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        number6Button.setText("6");
        number6Button.setFocusable(false);
        number6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ButtonActionPerformed(evt);
            }
        });

        number7Button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        number7Button.setText("7");
        number7Button.setFocusable(false);
        number7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ButtonActionPerformed(evt);
            }
        });

        number9Button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        number9Button.setText("9");
        number9Button.setFocusable(false);
        number9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ButtonActionPerformed(evt);
            }
        });

        number8Button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        number8Button.setText("8");
        number8Button.setToolTipText("");
        number8Button.setFocusable(false);
        number8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ButtonActionPerformed(evt);
            }
        });

        decimalPointButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        decimalPointButton.setText(".");
        decimalPointButton.setFocusable(false);
        decimalPointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalPointButtonActionPerformed(evt);
            }
        });

        divideButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        divideButton.setText("÷");
        divideButton.setFocusable(false);
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        subtractButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        subtractButton.setText("-");
        subtractButton.setFocusable(false);
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        multiplyButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        multiplyButton.setText("*");
        multiplyButton.setFocusable(false);
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        additionButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        additionButton.setText("+");
        additionButton.setFocusable(false);
        additionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionButtonActionPerformed(evt);
            }
        });

        exponentButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exponentButton.setText("x^y");
        exponentButton.setFocusable(false);
        exponentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponentButtonActionPerformed(evt);
            }
        });

        enterButton.setBackground(new java.awt.Color(204, 255, 204));
        enterButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        enterButton.setText("=");
        enterButton.setFocusable(false);
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });
        enterButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterButtonKeyPressed(evt);
            }
        });

        leftParenthesesButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        leftParenthesesButton.setText("(");
        leftParenthesesButton.setFocusable(false);
        leftParenthesesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftParenthesesButtonActionPerformed(evt);
            }
        });

        rightParenthesesButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rightParenthesesButton.setText(")");
        rightParenthesesButton.setFocusable(false);
        rightParenthesesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightParenthesesButtonActionPerformed(evt);
            }
        });

        backSpaceButton.setBackground(new java.awt.Color(255, 204, 204));
        backSpaceButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backSpaceButton.setText("Backspace");
        backSpaceButton.setFocusable(false);
        backSpaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSpaceButtonActionPerformed(evt);
            }
        });

        squareNumberButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        squareNumberButton.setText("x^2");
        squareNumberButton.setFocusable(false);
        squareNumberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareNumberButtonActionPerformed(evt);
            }
        });

        clearEntryButton.setBackground(new java.awt.Color(255, 102, 102));
        clearEntryButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        clearEntryButton.setText("CE");
        clearEntryButton.setFocusable(false);
        clearEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearEntryButtonActionPerformed(evt);
            }
        });

        trigModeButton.setBackground(new java.awt.Color(204, 204, 204));
        trigModeButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        trigModeButton.setText("Deg");
        trigModeButton.setFocusable(false);
        trigModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trigModeButtonActionPerformed(evt);
            }
        });

        cosButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cosButton.setText("Cos()");
        cosButton.setToolTipText("Remember to close the statement with a )");
        cosButton.setFocusable(false);
        cosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosButtonActionPerformed(evt);
            }
        });

        sinButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sinButton.setText("Sin()");
        sinButton.setToolTipText("Remember to close the statement with a )");
        sinButton.setFocusable(false);
        sinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinButtonActionPerformed(evt);
            }
        });

        tanButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tanButton.setText("Tan()");
        tanButton.setToolTipText("Remember to close the statement with a )");
        tanButton.setFocusable(false);
        tanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanButtonActionPerformed(evt);
            }
        });

        sqrtButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sqrtButton.setText("Sqrt()");
        sqrtButton.setToolTipText("Remember to close the statement with a )");
        sqrtButton.setFocusable(false);
        sqrtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtButtonActionPerformed(evt);
            }
        });

        historyScrollPlane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        historyScrollPlane.setToolTipText("");

        historyTextArea.setEditable(false);
        historyTextArea.setColumns(20);
        historyTextArea.setRows(5);
        historyScrollPlane.setViewportView(historyTextArea);

        clearHistoryButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        clearHistoryButton.setText("Clear History");
        clearHistoryButton.setToolTipText("Remember to close the statement with a )");
        clearHistoryButton.setEnabled(false);
        clearHistoryButton.setFocusable(false);
        clearHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearHistoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calculatorScroll)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(decimalPointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(number0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(calculatorLabel)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(number7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(number8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(number9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(number4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(number5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(number6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(number1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(number2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(number3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(enterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(additionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(squareNumberButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(exponentButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(subtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(leftParenthesesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rightParenthesesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backSpaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearEntryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sinButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trigModeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sqrtButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(historyScrollPlane, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(clearHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(calculatorLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calculatorScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearEntryButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(leftParenthesesButton)
                                .addComponent(rightParenthesesButton)
                                .addComponent(backSpaceButton)
                                .addComponent(trigModeButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number7Button)
                            .addComponent(number8Button)
                            .addComponent(number9Button)
                            .addComponent(subtractButton)
                            .addComponent(multiplyButton)
                            .addComponent(sinButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number4Button)
                            .addComponent(number5Button)
                            .addComponent(number6Button)
                            .addComponent(divideButton)
                            .addComponent(exponentButton)
                            .addComponent(cosButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number1Button)
                            .addComponent(number2Button)
                            .addComponent(number3Button)
                            .addComponent(squareNumberButton)
                            .addComponent(additionButton)
                            .addComponent(tanButton)))
                    .addComponent(historyScrollPlane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(number0Button)
                        .addComponent(decimalPointButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sqrtButton)
                        .addComponent(clearHistoryButton)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void enterButtonKeyPressed(java.awt.event.KeyEvent evt) {                                       

    }                                      

    //update the button color UI and perform the alteration/operation
    private void calculatorTextAreaKeyPressed(java.awt.event.KeyEvent evt) {                                              
        //clear the calculator has an answer then clear the calcualor screen
        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }

        if(evt.getKeyChar() == '0') {
            number0Button.setForeground(Color.LIGHT_GRAY);
            calculatorTextArea.setText(calculatorTextArea.getText()+"0");
        }
        if(evt.getKeyChar() == '1') {
            number1Button.setForeground(Color.LIGHT_GRAY);
            calculatorTextArea.setText(calculatorTextArea.getText()+"1");            
        }
        if(evt.getKeyChar() == '2') {
            number2Button.setForeground(Color.LIGHT_GRAY);
            calculatorTextArea.setText(calculatorTextArea.getText()+"2");
        }
        if(evt.getKeyChar() == '3') {
            number3Button.setForeground(Color.LIGHT_GRAY);            
            calculatorTextArea.setText(calculatorTextArea.getText()+"3");
        }
        if(evt.getKeyChar() == '4') {
            number4Button.setForeground(Color.LIGHT_GRAY);
            calculatorTextArea.setText(calculatorTextArea.getText()+"4");
        }
        if(evt.getKeyChar() == '5') {
            number5Button.setForeground(Color.LIGHT_GRAY);            
            calculatorTextArea.setText(calculatorTextArea.getText()+"5");
        }
        if(evt.getKeyChar() == '6') {
            number6Button.setForeground(Color.LIGHT_GRAY);            
            calculatorTextArea.setText(calculatorTextArea.getText()+"6");
        }
        if(evt.getKeyChar() == '7') {
            number7Button.setForeground(Color.LIGHT_GRAY);            
            calculatorTextArea.setText(calculatorTextArea.getText()+"7");
        }
        if(evt.getKeyChar() == '8') {
            number8Button.setForeground(Color.LIGHT_GRAY);            
            calculatorTextArea.setText(calculatorTextArea.getText()+"8");
        }
        if(evt.getKeyChar() == '9') {
            number9Button.setForeground(Color.LIGHT_GRAY);            
            calculatorTextArea.setText(calculatorTextArea.getText()+"9");
        }
        if(evt.getKeyChar() == '+') {
            additionButton.setForeground(Color.LIGHT_GRAY);
            calculatorTextArea.setText(calculatorTextArea.getText()+"+");
        }
        if(evt.getKeyChar() == '-') {
            subtractButton.setForeground(Color.LIGHT_GRAY);
            calculatorTextArea.setText(calculatorTextArea.getText()+"-");
        }
        if(evt.getKeyChar() == '*') {
            multiplyButton.setForeground(Color.LIGHT_GRAY);
            calculatorTextArea.setText(calculatorTextArea.getText()+"*");
        }
        if(evt.getKeyChar() == '/') {
            divideButton.setForeground(Color.LIGHT_GRAY);         
            calculatorTextArea.setText(calculatorTextArea.getText()+"/");
        }
        if(evt.getKeyChar() == '(') {
            leftParenthesesButton.setForeground(Color.LIGHT_GRAY);
            calculatorTextArea.setText(calculatorTextArea.getText()+"(");
        }
        if(evt.getKeyChar() == ')') {
            rightParenthesesButton.setForeground(Color.LIGHT_GRAY);
            calculatorTextArea.setText(calculatorTextArea.getText()+")");
        }
        if(evt.getKeyChar() == '.') {
            decimalPointButton.setForeground(Color.LIGHT_GRAY);
            calculatorTextArea.setText(calculatorTextArea.getText()+".");
        }
        if(evt.getKeyChar() == '^') {
            exponentButton.setForeground(Color.LIGHT_GRAY);
            calculatorTextArea.setText(calculatorTextArea.getText()+"^");
        }

        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            enterButton.setForeground(Color.LIGHT_GRAY);

        }
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE
                || evt.getKeyCode() == java.awt.event.KeyEvent.VK_DELETE) {
            backSpaceButton.setForeground(Color.LIGHT_GRAY);
            if(!calculatorTextArea.getText().isBlank()) {
                calculatorTextArea.setText(calculatorTextArea.getText().substring(0, 
                    calculatorTextArea.getText().length()-1));
            }
        }
    }                                             
    
    
    //reset the button icon color once the button has been released.
    private void calculatorTextAreaKeyReleased(java.awt.event.KeyEvent evt) {                                               

        //zero input 
        if(evt.getKeyChar() == '0') {
            number0Button.setForeground(Color.BLACK);
        }
        //one input
        if(evt.getKeyChar() == '1') {
            number1Button.setForeground(Color.BLACK);            
        }
        //two input
        if(evt.getKeyChar() == '2') {
            number2Button.setForeground(Color.BLACK);            
        }
        //three input
        if(evt.getKeyChar() == '3') {
            number3Button.setForeground(Color.BLACK);            
        }
        //four input
        if(evt.getKeyChar() == '4') {
            number4Button.setForeground(Color.BLACK);            
        }
        //five input
        if(evt.getKeyChar() == '5') {
            number5Button.setForeground(Color.BLACK);            
        }
        //six input
        if(evt.getKeyChar() == '6') {
            number6Button.setForeground(Color.BLACK);            
        }
        //seven input
        if(evt.getKeyChar() == '7') {
            number7Button.setForeground(Color.BLACK);            
        }
        //eight input
        if(evt.getKeyChar() == '8') {
            number8Button.setForeground(Color.BLACK);            
        }
        //nine input
        if(evt.getKeyChar() == '9') {
            number9Button.setForeground(Color.BLACK);            
        }
        //plus input
        if(evt.getKeyChar() == '+') {
            additionButton.setForeground(Color.BLACK);
        }
        //minus input
        if(evt.getKeyChar() == '-') {
            subtractButton.setForeground(Color.BLACK);
        }
        //multiplication input
        if(evt.getKeyChar() == '*') {
            multiplyButton.setForeground(Color.BLACK);
        }
        //division input
        if(evt.getKeyChar() == '/') {
            divideButton.setForeground(Color.BLACK);         
        }
        //left parentheses input
        if(evt.getKeyChar() == '(') {
            leftParenthesesButton.setForeground(Color.BLACK);
        }
        //right parentheses input
        if(evt.getKeyChar() == ')') {
            rightParenthesesButton.setForeground(Color.BLACK);
        }
        //decimal parenthesis input
        if(evt.getKeyChar() == '.') {
            decimalPointButton.setForeground(Color.BLACK);
        }
        //exponent input
        if(evt.getKeyChar() == '^') {
            exponentButton.setForeground(Color.BLACK);
        }
        //enter action processing
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            //update the appearance
            enterButton.setForeground(Color.BLACK);
            //update the calculator text taking into consideration if it is blank or not.
            if(!calculatorTextArea.getText().isBlank()) {
                //create a boolean variable for the trig mode
                boolean calculateInDegrees = trigModeButton.getText().equalsIgnoreCase("deg");
                //update the history with respect to if it is blank or not
                if(historyTextArea.getText().isEmpty()) {
                    historyTextArea.setText(historyTextArea.getText()+calculatorTextArea.getText());
                }
                else {
                    historyTextArea.setText(historyTextArea.getText()+"\n"+calculatorTextArea.getText());    
                }
                //t
                try {
                    double answer = calculateArithmeticStatement(calculatorTextArea.getText(),calculateInDegrees);
                    //update the has answer variable
                    doesCalculatorHaveAnAnswer = true;
                    //update the answer text area
                    calculatorTextArea.setText(answer+"");
                    historyTextArea.setText(historyTextArea.getText()+"\n"+answer);  
                    clearHistoryButton.setEnabled(true);
                }
                catch(Exception e) {
                    //update the has answer variable
                    doesCalculatorHaveAnAnswer = true;
                    calculatorTextArea.setText("Error");
                    historyTextArea.setText(historyTextArea.getText()+"\n Error"); 
                    clearHistoryButton.setEnabled(true);
                }

            }        
        }
            
        //backspace action processing
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE
                || evt.getKeyCode() == java.awt.event.KeyEvent.VK_DELETE) {
            backSpaceButton.setForeground(Color.BLACK);
        }
    }                                              
    /*
     * Each of the number button action listeners
     * each function has a fucntion to clear the 
     * calculator screen if there is already an
     * answer on it. 
     */
    private void number0ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
        calculatorTextArea.setText(calculatorTextArea.getText()+"0");        
    }                                             

    private void number1ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
        calculatorTextArea.setText(calculatorTextArea.getText()+"1");        
    }                                             

    private void number2ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
        calculatorTextArea.setText(calculatorTextArea.getText()+"2");
    }                                             

    private void number3ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
        calculatorTextArea.setText(calculatorTextArea.getText()+"3");
    }                                             

    private void number4ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
        calculatorTextArea.setText(calculatorTextArea.getText()+"4");
    }                                             

    private void number5ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
        calculatorTextArea.setText(calculatorTextArea.getText()+"5");
    }                                             

    private void number6ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
        calculatorTextArea.setText(calculatorTextArea.getText()+"6");
    }                                             

    private void number7ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
        calculatorTextArea.setText(calculatorTextArea.getText()+"7");
    }                                             

    private void number8ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
        calculatorTextArea.setText(calculatorTextArea.getText()+"8");
    }                                             

    private void number9ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
        calculatorTextArea.setText(calculatorTextArea.getText()+"9");
    }                                             

    private void decimalPointButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   

        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
        calculatorTextArea.setText(calculatorTextArea.getText()+".");
    }                                                  

    private void leftParenthesesButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      

        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
        calculatorTextArea.setText(calculatorTextArea.getText()+"(");
    }                                                     

    private void rightParenthesesButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                       

        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
        calculatorTextArea.setText(calculatorTextArea.getText()+")");
    }                                                      

    private void backSpaceButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        //if the calculator text area is NOT blank then perform the calculator text
        if(!calculatorTextArea.getText().isBlank()) {
            calculatorTextArea.setText(calculatorTextArea.getText().substring(0, 
                calculatorTextArea.getText().length()-1));
        }
        //if the calculator has an answer then clear the text area.
        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
    }                                               

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        calculatorTextArea.setText(calculatorTextArea.getText()+"*");
        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
    }                                              

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        calculatorTextArea.setText(calculatorTextArea.getText()+"/");
        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
    }                                            

    private void additionButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        calculatorTextArea.setText(calculatorTextArea.getText()+"+");
        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
    }                                              

    private void squareNumberButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        calculatorTextArea.setText(calculatorTextArea.getText()+"^2");
        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
    }                                                  

    private void exponentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        calculatorTextArea.setText(calculatorTextArea.getText()+"^");
        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
    }                                              

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        calculatorTextArea.setText(calculatorTextArea.getText()+"-");
        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
    }                                              

    private void clearEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        calculatorTextArea.setText("");
        doesCalculatorHaveAnAnswer = false;
    }                                                

    private void trigModeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        //if the current setting for the trig function button is in degrees then switch the text to radians
        if(trigModeButton.getText().equals("Deg")) {
            trigModeButton.setText("Rad");
        }
        else {
            trigModeButton.setText("Deg");
        }
    }                                              

    private void cosButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        calculatorTextArea.setText(calculatorTextArea.getText()+"cos(");
        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
    }                                         

    private void sinButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        calculatorTextArea.setText(calculatorTextArea.getText()+"sin(");
        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
    }                                         

    private void tanButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        calculatorTextArea.setText(calculatorTextArea.getText()+"tan(");
        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
    }                                         

    private void sqrtButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        calculatorTextArea.setText(calculatorTextArea.getText()+"sqrt(");
        if(doesCalculatorHaveAnAnswer) {
            //clear the calculator screen 
            calculatorTextArea.setText("");
            //update the variable
            doesCalculatorHaveAnAnswer = false;
        }
    }                                          

    //This is the handling code for when an equation is being processed
    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //if the history text area is not blank
        if(!calculatorTextArea.getText().isBlank()) {      
            //boolean variable to store if the calculator is in degree mode
            boolean calculateInDegrees = trigModeButton.getText().equalsIgnoreCase("deg");
            //update the history with respect to if the text area is blank or not.
            if(historyTextArea.getText().isEmpty()) {
                historyTextArea.setText(historyTextArea.getText()+calculatorTextArea.getText());
            }
            else {
                historyTextArea.setText(historyTextArea.getText()+"\n"+calculatorTextArea.getText());    
            }
            try {
                //calculate the answer from the input from the calculator input area.
                double answer = calculateArithmeticStatement(calculatorTextArea.getText(),calculateInDegrees);
                //update the has answer variable
                doesCalculatorHaveAnAnswer = true;
                //update the answer text area
                calculatorTextArea.setText(answer+"");
                //update the history log with newlines with respect to if the history tab is empty
                //update the calculator history
                historyTextArea.setText(historyTextArea.getText()+"\n"+answer);                    
                //enable the clear history button since it has history to clear
                clearHistoryButton.setEnabled(true);
            }
            //if there is a parsing error then throw an error message
            catch(Exception e) 
            {
                //update the has answer variable
                doesCalculatorHaveAnAnswer = true;
                //update the calculator text area
                calculatorTextArea.setText("Error");
                //update the history
                historyTextArea.setText(historyTextArea.getText()+"\n Error");
                //enable the clear history button since it has history to clear
                clearHistoryButton.setEnabled(true);
            }
        }
    }                                           

    private void copyRightClickMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                         
       //if the calculator text area is not blank then copy the contents to clipboard
        if(!calculatorTextArea.getText().isBlank()) {
            String stringToClipboard = calculatorTextArea.getText();
            StringSelection stringSelection = new StringSelection(stringToClipboard);
            Clipboard clipboardData = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboardData.setContents(stringSelection, null);
        }
    }                                                        

    private void calculatorTextAreaMouseReleased(java.awt.event.MouseEvent evt) {                                                 
        //if a right click occurs create the popup options menu
        if(evt.isPopupTrigger()) {
            calculatorRightClickMenu.show(evt.getComponent(), evt.getX(),evt.getY());
        }
    }                                                

    private void clearHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        //clear the calculator history log
        historyTextArea.setText("");  
        clearHistoryButton.setEnabled(false);
    }                                                  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windwos OS  */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    
     /*
     * This is a recursive descent algorithm for solving for 
     * mathematical parsing operations.
     */
    public static double calculateArithmeticStatement(final String arithmeticStatement,
    	boolean inDegrees) {
        //return an object for the answer for this function analysis
    	//This allows for exceptions to pass though
    	return new Object() {
            //crconsumeChare the integer variables for parsing and iteration purposes
    		int charPosition = -1;
            int character;

            //return the next character for the descent
            void nextCharacter() {
            	character = (++charPosition < arithmeticStatement.length()) 
            		? arithmeticStatement.charAt(charPosition) : -1;
            }

            //process the parsing grammar rules with respect to position and exceptions
            double parse() {
            	//recursively call to push the process forward
            	nextCharacter();
                double x = expressionParse();
                //throw an exception error
                if(charPosition < arithmeticStatement.length()) { 
                	throw new RuntimeException
                	("Unexpected/Incorrect Input: " + (char) character);
                }
                return x;
                
            }
            
            //parse the term with respect to the multiplication and division operations
            double parseGivenTerm() {
                //call the parseFactor
            	double x = parseGivenFactor();
                //for the length of the parsing order
            	for(;;) {
            		//multiplication function
                    if(consumeChar('*')) {
                    	x = x * parseGivenFactor();
                    }
                    //division function
                    else if(consumeChar('/')) {
                    	x = x / parseGivenFactor();
                    }
                    else return x;
                }
            }
            
          //parse the term with respect to the addition and subtraction operations
            double expressionParse() {
                double x = parseGivenTerm();
                //for the length of the parsing order
                for(;;) {
                	//addition
                    if(consumeChar('+')) {
                    	x = x + parseGivenTerm();
                    }
                    //subtraction
                    else if(consumeChar('-')) {
                    	x = x - parseGivenTerm();
                    }
                    else return x;
                }
            }
            
            //consume the token in the process
            boolean consumeChar(int charToconsumeChar) {
            	//while the character is a space
                while (character == ' ') {
                	//update the character forward
                	nextCharacter();
                }
                if (character == charToconsumeChar) {
                	//recursively call to push the process forward
                	nextCharacter();
                    return true;
                }
                return false;
            }

            /*
             * perform the mathematical parsing operation 
             * on the characters and respective operators with
             * the operator grammars.
             */
            double parseGivenFactor() {
                //unary plus
            	if(consumeChar('+')) {
                	return + parseGivenFactor();
                }
            	// unary minus
                if(consumeChar('-')) {
                	return - parseGivenFactor(); 
                }
                //crconsumeChare variables for processing
                double x;
                int startcharPosition = this.charPosition;
                //process parentheses
                if(consumeChar('(')) { 
                    x = expressionParse();
                    if(!consumeChar(')')) {
                    	throw new RuntimeException("Missing ')'");
                    }
                }
                //process numbers
                else if((character >= '0' && character <= '9') || character == '.') {
                    while ((character >= '0' && character <= '9') || character == '.') {
                    	nextCharacter();
                    }
                    x = Double.parseDouble(arithmeticStatement.substring(startcharPosition, this.charPosition));
                } 
                //process trig/general math function
                else if(character >= 'a' && character <= 'z') { 
                    while (character >= 'a' && character <= 'z') {
                    	nextCharacter();
                    }
                    //crconsumeChare a string to process the grammar substring
                    String functionString = arithmeticStatement.substring(startcharPosition, this.charPosition);
                    if(consumeChar('(')) {
                        x = expressionParse();
                        //process missing closing parenthesis and throw exceptions
                        if(!consumeChar(')')) {
                        	throw new RuntimeException("Missing ')' after argument to " + functionString);
                        }
                    }
                    //process the result
                    else {
                        x = parseGivenFactor();
                    }
                    //process the result for square root
                    if(functionString.equals("sqrt")) {
                    	x = Math.sqrt(x);
                    }
                    //process the result for sine 
                    else if(functionString.equals("sin")) {
                    	//if the calculator is set to degrees and NOT radians 
                    	if(inDegrees) {
                    		x = Math.sin(Math.toRadians(x));
                    	}
                    	//if set to radians 
                    	else {
                    		x = Math.sin(x);
                    	}
                    }
                    //process the result for cosine 
                    else if(functionString.equals("cos")) {
                    	//if the calculator is set to degrees and NOT radians 
                    	if(inDegrees) {
                    		x = Math.cos(Math.toRadians(x));
                    	}
                    	//if set to radians 
                    	else {
                    		x = Math.cos(x);
                    	}
                    }
                    //process the result for tangent 
                    else if(functionString.equals("tan")) {
                    	//if the calculator is set to degrees and NOT radians 
                    	if(inDegrees) {
                    		x = Math.tan(Math.toRadians(x));
                    	}
                    	//if set to radians
                    	else {
                    		x = Math.tan(x);
                    	}
                    }
                    //if the functionString is not recognized
                    else throw new RuntimeException("functiontiontiontion is Unknown: " + functionString);
                }
                //throw an exception if the char is not excepted
                else {
                    throw new RuntimeException("Unexpected: " + (char) character);
                }
                //compute exponents
                if(consumeChar('^')) {
                	x = Math.pow(x, parseGivenFactor());
                }
                //return the final result
                return x;
            }
        //parse final result and return
        }.parse();
    }
    
    /*This variable has been added to make the calculator more responsive 
    *by a autoclear the answer screen when a new input is given
    *
    */
    private boolean doesCalculatorHaveAnAnswer = false;

    // Variables declaration - do not modify                     
    private javax.swing.JButton additionButton;
    private javax.swing.JButton backSpaceButton;
    private javax.swing.JLabel calculatorLabel;
    private javax.swing.JPopupMenu calculatorRightClickMenu;
    private javax.swing.JScrollPane calculatorScroll;
    private javax.swing.JTextArea calculatorTextArea;
    private javax.swing.JButton clearEntryButton;
    private javax.swing.JButton clearHistoryButton;
    private javax.swing.JMenuItem copyRightClickMenuButton;
    private javax.swing.JButton cosButton;
    private javax.swing.JButton decimalPointButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton exponentButton;
    private javax.swing.JScrollPane historyScrollPlane;
    private javax.swing.JTextArea historyTextArea;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton leftParenthesesButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton number0Button;
    private javax.swing.JButton number1Button;
    private javax.swing.JButton number2Button;
    private javax.swing.JButton number3Button;
    private javax.swing.JButton number4Button;
    private javax.swing.JButton number5Button;
    private javax.swing.JButton number6Button;
    private javax.swing.JButton number7Button;
    private javax.swing.JButton number8Button;
    private javax.swing.JButton number9Button;
    private javax.swing.JButton rightParenthesesButton;
    private javax.swing.JButton sinButton;
    private javax.swing.JButton sqrtButton;
    private javax.swing.JButton squareNumberButton;
    private javax.swing.JButton subtractButton;
    private javax.swing.JButton tanButton;
    private javax.swing.JButton trigModeButton;
    // End of variables declaration                   
}
