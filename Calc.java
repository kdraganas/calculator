import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;
import java.awt.*;

class Calc extends JFrame implements ActionListener{
    private String a, b;
    private int operator = 0;
    private JPanel cal;
    private JTextArea t;
    private BigDecimal hundred = new BigDecimal("100");
    private BigDecimal first, sec, result, negative, num;
    boolean mflag = false, firstflag = false, secflag = false;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, bdec, beq, bdel, bpn, bmod, space;

    public Calc(){
        cal =  new JPanel(new GridLayout(5,4,0,0));
        t=new JTextArea();
        b1=new JButton("1");
        b1.setFont(new Font("Century Gothic", Font.BOLD, 11));
        b1.setBackground(new Color(253, 245, 230));

        b2=new JButton("2");
        b2.setFont(new Font("Century Gothic", Font.BOLD, 11));
        b2.setBackground(new Color(253, 245, 230));

        b3=new JButton("3");
        b3.setFont(new Font("Century Gothic", Font.BOLD, 11));
        b3.setBackground(new Color(253, 245, 230));

        b4=new JButton("4");
        b4.setFont(new Font("Century Gothic", Font.BOLD, 11));
        b4.setBackground(new Color(253, 245, 230));

        b5=new JButton("5");
        b5.setFont(new Font("Century Gothic", Font.BOLD, 11));
        b5.setBackground(new Color(253, 245, 230));

        b6=new JButton("6");
        b6.setFont(new Font("Century Gothic", Font.BOLD, 11));
        b6.setBackground(new Color(253, 245, 230));

        b7=new JButton("7");
        b7.setFont(new Font("Century Gothic", Font.BOLD, 11));
        b7.setBackground(new Color(253, 245, 230));

        b8=new JButton("8");
        b8.setFont(new Font("Century Gothic", Font.BOLD, 11));
        b8.setBackground(new Color(253, 245, 230));

        b9=new JButton("9");
        b9.setFont(new Font("Century Gothic", Font.BOLD, 11));
        b9.setBackground(new Color(253, 245, 230));

        b0=new JButton("0");
        b0.setFont(new Font("Century Gothic", Font.BOLD, 11));
        b0.setBackground(new Color(253, 245, 230));

        bdiv=new JButton("/");
        bdiv.setFont(new Font("Century Gothic", Font.BOLD, 15));
        bdiv.setBackground(new Color(255, 222, 173));

        bmul=new JButton("x");
        bmul.setFont(new Font("Century Gothic", Font.BOLD, 15));
        bmul.setBackground(new Color(255, 222, 173));

        bsub=new JButton("-");
        bsub.setFont(new Font("Century Gothic", Font.BOLD, 15));
        bsub.setBackground(new Color(255, 222, 173));

        badd=new JButton("+");
        badd.setFont(new Font("Century Gothic", Font.BOLD, 15));
        badd.setBackground(new Color(255, 222, 173));

        bdec=new JButton(".");
        bdec.setFont(new Font("Century Gothic", Font.BOLD, 15));
        bdec.setBackground(new Color(253, 245, 230));

        beq=new JButton("=");
        beq.setFont(new Font("Century Gothic", Font.BOLD, 15));
        beq.setBackground(new Color(255, 222, 173));

        bdel=new JButton("AC");
        bdel.setFont(new Font("Century Gothic", Font.BOLD, 15));
        bdel.setBackground(new Color(255, 222, 173));

        bpn=new JButton("+/-");
        bpn.setFont(new Font("Century Gothic", Font.BOLD, 15));
        bpn.setBackground(new Color(253, 245, 230));

        bmod=new JButton("%");
        bmod.setFont(new Font("Century Gothic", Font.BOLD, 15));
        bmod.setBackground(new Color(253, 245, 230));

        space=new JButton("");
        space.setFont(new Font("Century Gothic", Font.BOLD, 12));
        space.setBackground(new Color(253, 245, 230));

        t.setPreferredSize(new Dimension(300,50));
        t.setFont(new Font("Century Gothic", Font.BOLD, 18));
        add(t, BorderLayout.NORTH);

        cal.add(bdel);  cal.add(bpn);   cal.add(bmod);  cal.add(bdiv);
        cal.add(b7);    cal.add(b8);    cal.add(b9);    cal.add(bmul);
        cal.add(b4);    cal.add(b5);    cal.add(b6);    cal.add(bsub);
        cal.add(b1);    cal.add(b2);    cal.add(b3);    cal.add(badd);
        cal.add(b0);    cal.add(space); cal.add(bdec);  cal.add(beq);

        setVisible(true);
        setTitle("CALCULATOR");
        setSize(250,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(cal, BorderLayout.CENTER);

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
        bpn.addActionListener(this);
        bmod.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));
        if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));
        if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));
        if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));
        if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));
        if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));
        if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));
        if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));
        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));
        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));
        if(e.getSource()==bdec)
            t.setText(t.getText().concat("."));
        if(e.getSource()==badd){
            setFirst();
            operator = 1;
        }
        if(e.getSource()==bsub){
            setFirst();
            operator = 2;
        }
        if(e.getSource()==bmul){
            setFirst();
            operator = 3;
        }
        if(e.getSource()==bdiv){
            setFirst();
            operator = 4;
        }
        if(e.getSource()==bmod && firstflag==false){
            a=t.getText();
            mflag = true;
        }
        if(e.getSource()==bmod && firstflag){
            setSec();
            sec = sec.divide(hundred);
            secflag = true;
        }
        if(e.getSource()==bpn){
            getPosNeg();
        }
        if(e.getSource()==beq){
            if(!secflag){
                setSec();
            }
            switch(operator){
                case 1: result = first.add(sec);
                    break;

                case 2: result = first.subtract(sec);
                    break;

                case 3: result = first.multiply(sec);
                    break;

                case 4: result = first.divide(sec);
                    break;

                default: result = new BigDecimal("0");
            }
            t.setText(""+result);
            mflag = false;
            firstflag = false;
            secflag = false;
        }
        if(e.getSource()==bdel)
            t.setText("");
    }

    public void getPosNeg(){
        negative = BigDecimal.valueOf(-1);
        try{
            num = new BigDecimal(t.getText());
            num = num.multiply(negative);
            t.setText(""+num);
        }
        catch(NumberFormatException err){}
    }

    public void setFirst(){
        a = t.getText();
        first = new BigDecimal(a);
        if(mflag){
            first = new BigDecimal(a);
            first = first.divide(hundred);
        }
        firstflag=true;
        t.setText("");
    }

    public void setSec(){
        b = t.getText();
        sec = new BigDecimal(b);
    }

    public static void main(String[] args){
        new Calc();
    }
}