package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame f;
	JTextField t;
	JTextField tHistory;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, bdec, beq, bdel, bclr, bsin, bcos, btg,
			bctg, bsqeq;

	static double a = 0, b = 0, result = 0;
	static int operator = 0;

	Calculator() {
		f = new JFrame("Calculator");
		t = new JTextField();
		tHistory = new JTextField();
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		bdiv = new JButton("/");
		bmul = new JButton("*");
		bsub = new JButton("-");
		badd = new JButton("+");
		bdec = new JButton(".");
		beq = new JButton("=");
		bdel = new JButton("Delete");
		bclr = new JButton("Clear");
		bsin = new JButton("sin");
		bcos = new JButton("cos");
		btg = new JButton("tg");
		bctg = new JButton("ctg");
		bsqeq = new JButton("square equation");

		tHistory.setBounds(30, 40, 280, 30);
		t.setBounds(30, 70, 280, 30);
		b7.setBounds(40, 130, 50, 40);
		b8.setBounds(110, 130, 50, 40);
		b9.setBounds(180, 130, 50, 40);
		bdiv.setBounds(250, 130, 50, 40);
		bsin.setBounds(320, 130, 70, 40);

		b4.setBounds(40, 200, 50, 40);
		b5.setBounds(110, 200, 50, 40);
		b6.setBounds(180, 200, 50, 40);
		bmul.setBounds(250, 200, 50, 40);
		bcos.setBounds(320, 200, 70, 40);

		b1.setBounds(40, 270, 50, 40);
		b2.setBounds(110, 270, 50, 40);
		b3.setBounds(180, 270, 50, 40);
		bsub.setBounds(250, 270, 50, 40);
		btg.setBounds(320, 270, 70, 40);

		bdec.setBounds(40, 340, 50, 40);
		b0.setBounds(110, 340, 50, 40);
		beq.setBounds(180, 340, 50, 40);
		badd.setBounds(250, 340, 50, 40);
		bctg.setBounds(320, 340, 70, 45);

		bdel.setBounds(40, 410, 100, 40);
		bclr.setBounds(160, 410, 100, 40);
		bsqeq.setBounds(280, 410, 100, 40);

		f.add(tHistory);
		f.add(t);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bdiv);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bmul);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(bsub);
		f.add(bdec);
		f.add(b0);
		f.add(beq);
		f.add(badd);
		f.add(bdel);
		f.add(bclr);
		f.add(bsin);
		f.add(bcos);
		f.add(btg);
		f.add(bctg);
		f.add(bsqeq);

		f.setLayout(null);
		f.setVisible(true);
		f.setSize(420, 550);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bdiv.addActionListener(this);
		bmul.addActionListener(this);
		bsub.addActionListener(this);
		bdec.addActionListener(this);
		beq.addActionListener(this);
		bdel.addActionListener(this);
		bclr.addActionListener(this);
		bsin.addActionListener(this);
		bcos.addActionListener(this);
		btg.addActionListener(this);
		bctg.addActionListener(this);
		bsqeq.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1)
			t.setText(t.getText().concat("1"));

		if (e.getSource() == b2)
			t.setText(t.getText().concat("2"));

		if (e.getSource() == b3)
			t.setText(t.getText().concat("3"));

		if (e.getSource() == b4)
			t.setText(t.getText().concat("4"));

		if (e.getSource() == b5)
			t.setText(t.getText().concat("5"));

		if (e.getSource() == b6)
			t.setText(t.getText().concat("6"));

		if (e.getSource() == b7)
			t.setText(t.getText().concat("7"));

		if (e.getSource() == b8)
			t.setText(t.getText().concat("8"));

		if (e.getSource() == b9)
			t.setText(t.getText().concat("9"));

		if (e.getSource() == b0)
			t.setText(t.getText().concat("0"));

		if (e.getSource() == bdec)
			t.setText(t.getText().concat("."));

		if (e.getSource() == badd) {
			a = Double.parseDouble(t.getText());
			operator = 1;
			t.setText("");
		}

		if (e.getSource() == bsub) {
			a = Double.parseDouble(t.getText());
			operator = 2;
			t.setText("");
		}

		if (e.getSource() == bmul) {
			a = Double.parseDouble(t.getText());
			operator = 3;
			t.setText("");
		}

		if (e.getSource() == bdiv) {
			a = Double.parseDouble(t.getText());
			operator = 4;
			t.setText("");
		}

		if (e.getSource() == beq) {
			b = Double.parseDouble(t.getText());

			switch (operator) {
			case 1:
				result = a + b;
				break;

			case 2:
				result = a - b;
				break;

			case 3:
				result = a * b;
				break;

			case 4:
				result = a / b;
				break;

			default:
				result = 0;
			}

			t.setText("" + result);
		}

		if (e.getSource() == bclr)
			t.setText("");

		if (e.getSource() == bdel) {
			String s = t.getText();
			t.setText("");
			for (int i = 0; i < s.length() - 1; i++)
				t.setText(t.getText() + s.charAt(i));
		}
	}

	public static void calculateSin(double a) {
		// Convert degrees to radian
		a = Math.toRadians(a);
		System.out.println("Sin: " + Math.sin(a));

	}

	public static void calculateCos(double a) {
		// Convert degrees to radian
		a = Math.toRadians(a);
		System.out.println("Cos: " + Math.cos(a));

	}

	public static void calculateTn(double a) {
		// Convert degrees to radian
		a = Math.toRadians(a);
		System.out.println("Tng: " + Math.tan(a));

	}

	public static void calculateCtn(double a) {
		// Convert degrees to radian
		a = Math.toRadians(a);
		System.out.println("Ctg: " + 1 / Math.tan(a));

	}

}
