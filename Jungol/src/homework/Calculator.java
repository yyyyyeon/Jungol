package homework;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private JTextField t;
	private String num = "";
	private String prev_operation = "";
	private ArrayList<String> equation = new ArrayList<String>();

	public Calculator() {
		setLayout(null);
		t =  new JTextField();
		t.setEditable(false);
		t.setBackground(Color.white);
		t.setHorizontalAlignment(JTextField.RIGHT);
		t.setFont(new Font("Arial",Font.BOLD,50));
		t.setBounds(8,10,270,70);
		
		JPanel bp = new JPanel();
		bp.setLayout(new GridLayout(4,4,10,10));
		bp.setBounds(8,90,270,235);
		
		String bn[]= { "C", "÷", "×", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "0" };
		JButton bts[] = new JButton[bn.length];
		
		for(int i=0; i<bn.length; i++) {
			bts[i]=new JButton(bn[i]);
			bts[i].setFont(new Font("Arial",Font.BOLD,20));
			if(bn[i] == "C")bts[i].setBackground(Color.pink);
			else if((i>=4 && i <= 6) || (i>=8&&i<=10) || (i>=12 && i<=14))bts[i].setBackground(Color.pink);
			else bts[i].setBackground(Color.GRAY);
			bts[i].setForeground(Color.WHITE);
			bts[i].setBorderPainted(false);
			bts[i].addActionListener(new PadActionListener());
			bp.add(bts[i]);
		}
		add(t);
		add(bp);
		setTitle("계산기");
		setVisible(true);
		setSize(300, 370);
		setLocationRelativeTo(null); 
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	class PadActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String operation = e.getActionCommand();
			
			if (operation.equals("C")) {
				t.setText("");
			} else if (operation.equals("=")) {
				String result = Double.toString(calculate(t.getText()));
				t.setText("" + result);
				num = "";
			
			} else if (operation.equals("+") || operation.equals("-") || operation.equals("×") || operation.equals("÷")) {
				if (t.getText().equals("") && operation.equals("-")) {
					t.setText(t.getText() + e.getActionCommand());
					
				} else if (!t.getText().equals("") && !prev_operation.equals("+") && !prev_operation.equals("-") && !prev_operation.equals("×") && !prev_operation.equals("÷")) {
					t.setText(t.getText() + e.getActionCommand());
				}
			}
			else {
				t.setText(t.getText() + e.getActionCommand());
			}
			prev_operation = e.getActionCommand();
		}
	}
	private void fullTextParsing(String inputText) {
		equation.clear();
		
		for (int i = 0; i < inputText.length(); i++) {
			char ch = inputText.charAt(i);
			
			if (ch == '-' || ch == '+' || ch == '×' || ch == '÷') {
				equation.add(num);
				num = "";
				equation.add(ch + "");
			} else {
				num = num + ch;
			}
		}
		equation.add(num);
		equation.remove("");
	}
	
	public double calculate(String inputText) {
		fullTextParsing(inputText);
		
		double prev = 0;
		double current = 0;
		String mode = "";
		
		for (int i = 0; i < equation.size(); i++) {
			String s = equation.get(i);
			
			if (s.equals("+")) {
				mode = "add";
			} else if (s.equals("-")) {
				mode = "sub";
			} else if (s.equals("×")) {
				mode = "mul";
			} else if (s.equals("÷")) {
				mode = "div";
			} else {
				if ((mode.equals("mul") || mode.equals("div")) && !s.equals("+") && !s.equals("-") && !s.equals("×") && !s.equals("÷")) {
					Double one = Double.parseDouble(equation.get(i - 2));
					Double two = Double.parseDouble(equation.get(i));
					Double result = 0.0;
					
					if (mode.equals("mul")) {
						result = one * two;
					} else if (mode.equals("div")) {
						result = one / two;
					}
					equation.add(i + 1, Double.toString(result));
					
					for (int j = 0; j < 3; j++) {
						equation.remove(i - 2);
					}
					
					i -= 2;	
				}
			}
		}	
		
		for (String s : equation) {
			if (s.equals("+")) {
				mode = "add";
			} else if (s.equals("-")) {
				mode = "sub";
			
			}  else {
				current = Double.parseDouble(s);
				
				if (mode.equals("add")) {
					prev += current;
				} else if (mode.equals("sub")) {
					prev -= current;
				} else {
					prev = current;
				}
			}
			prev = Math.round(prev * 100000) / 100000.0;
		}
		return prev;
	}
	
	public static void main(String[] args) {
		new Calculator();

	}

}
