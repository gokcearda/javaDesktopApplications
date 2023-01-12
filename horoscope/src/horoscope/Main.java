package horoscope;

import javax.swing.*;
import java.awt.*;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// JFrame oluştur
	    JFrame frame = new JFrame("Burç Hesaplayıcı");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    // ZodiacSignCalculator nesnesini JFrame'e ekle
	    frame.add(new ZodiacSignCalculator());
	    
	    // JFrame'i göster
	    frame.pack();
	    frame.setVisible(true);

	}

	public static class ZodiacSignCalculator extends JPanel {
		  public ZodiacSignCalculator() {
		    // Giriş formunu oluştur
		    JLabel monthLabel = new JLabel("Doğum ayınızı girin: ");
		    JTextField monthField = new JTextField(2);
		    JLabel dayLabel = new JLabel("Doğum gününüzü girin: ");
		    JTextField dayField = new JTextField(2);
		    JButton calculateButton = new JButton("Hesapla");
		    
		    // Giriş formunu panel'e ekle
		    add(monthLabel);
		    add(monthField);
		    add(dayLabel);
		    add(dayField);
		    add(calculateButton);
		    
		    // Hesapla düğmesine tıklandığında burç hesaplamasını yap
		    calculateButton.addActionListener(event -> {
		      // Giriş verilerini al
		      int month = Integer.parseInt(monthField.getText());
		      int day = Integer.parseInt(dayField.getText());
		    
		      String zodiacSign = "";
		if (month==1) {
			if (day>=1 && day<=31) {
				if (day<22) {
					JOptionPane.showMessageDialog(this, "Oğlak burcusunuz.");
				}else {
					JOptionPane.showMessageDialog(this, "Kova burcusunuz.");
				}
				
			}
		}
		if( month == 2) {
            if (day >= 1 && day <= 28) {
                if (day <= 20){
                	JOptionPane.showMessageDialog(this, "Kova burcusunuz.");
                }else{
                	JOptionPane.showMessageDialog(this, "Balık burcusunuz.");
                }
            }
        }
        if (month == 3){
            if (day >=1 && day <= 31){
                if ( day < 21){
                	JOptionPane.showMessageDialog(this, "Balık burcusunuz.");
                }else{
                    JOptionPane.showMessageDialog(this, "Koç Burcusunuz.");
                }
            }
        }
        if (month == 4){
            if (day >=1 && day <= 30){
                if ( day < 21){
                	JOptionPane.showMessageDialog(this, "Koç Burcusunuz.");
                }else{
                	JOptionPane.showMessageDialog(this, "Boğa burcusunuz.");
                }
            }
        }
        if (month == 5){
            if (day >=1 && day <= 31){
                if ( day < 22){
                	JOptionPane.showMessageDialog(this, "Boğa burcusunuz.");
                }else{
                	JOptionPane.showMessageDialog(this, "İkizler burcusunuz.");
                }
            }
        }
        if (month == 6){
            if (day >=1 && day <= 30){
                if ( day < 23){
                	JOptionPane.showMessageDialog(this, "İkizler burcusunuz.");
                }else{
                	JOptionPane.showMessageDialog(this, "Yengeç burcusunuz.!");
                }
            }
        }
        if (month == 7){
            if (day >=1 && day <= 31){
                if ( day < 23){
                	JOptionPane.showMessageDialog(this, "Yengeç burcusunuz.");
                }else{
                	JOptionPane.showMessageDialog(this, "Aslan burcusunuz.");
                }
            }
        }
        if (month == 8){
            if (day >=1 && day <= 31){
                if ( day < 23){
                	JOptionPane.showMessageDialog(this, "Aslan burcusunuz.");
                }else{
                	JOptionPane.showMessageDialog(this, "Başak burcusunuz.");
                }
            }
        }
        if (month == 9){
            if (day >=1 && day <= 30){
                if ( day < 23){
                	JOptionPane.showMessageDialog(this, "Başak burcusunuz.");
                }else{
                	JOptionPane.showMessageDialog(this, "Terazi burcusunuz.");
                }
            }
        }
        if (month == 10){
            if (day >=1 && day <= 31){
                if ( day < 23){
                	JOptionPane.showMessageDialog(this, "Terazi burcusunuz.");
                }else{
                	JOptionPane.showMessageDialog(this, "Akrep burcusunuz.");
                }
            }
        }
        if (month == 11){
            if (day >=1 && day <= 30){
                if ( day < 22){
                	JOptionPane.showMessageDialog(this, "Akrep burcusunuz.");
                }else{
                	JOptionPane.showMessageDialog(this, "Yay burcusunuz.");
                }
            }
        }
        if (month == 12){
            if (day >=1 && day <= 31){
                if ( day < 22){
                	JOptionPane.showMessageDialog(this, "Yay burcusunuz.");
                }else{
                	JOptionPane.showMessageDialog(this, "Oğlak burcusunuz.");
                }
            }
        }
        if (month<1 || month>12) {
			if (day<1 || day>32) {
				JOptionPane.showMessageDialog(this, "Error: Takvimde olmayan gün ya da ay girdiniz!");
			}
		}
    
		    });}
	}}
        
		




