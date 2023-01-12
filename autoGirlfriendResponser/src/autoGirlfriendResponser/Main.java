package autoGirlfriendResponser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.channels.SelectableChannel;

public class Main {
	 public static void main(String[] args) {
		    ComplimentGenerator app = new ComplimentGenerator();
		    app.setVisible(true);
		    
		  }

		public static class ComplimentGenerator extends JFrame implements ActionListener {
			  // Metin girdisi alanı
			  private JTextField inputField;
			  
			  // Düğme
			  private JButton submitButton;
			  
			  // Arayüzü oluşturan panel
			  private JPanel panel;
			  
			  public ComplimentGenerator() {
			    // Bileşenleri oluşturalım ve panelin üzerine ekleyelim
			    inputField = new JTextField(20);
			    
			    submitButton = new JButton("Gönder");
			    panel = new JPanel();
			    panel.add(inputField);
			    panel.add(submitButton);
			    
			    // Paneli penceremizin içine ekleyelim
			    add(panel);
			    
			    // Pencereyi ayarlayalım
			    setTitle("İltifat Oluşturucu");
			    setSize(300, 100);
			    setLocationRelativeTo(null);
			    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    
			    // Düğmenin dinleyicisini ekleyelim
			    submitButton.addActionListener(this);
			  }
			  
			  public void actionPerformed(ActionEvent e) {
			    // Kullanıcının girdiği metni alalım
				  
			    String input = inputField.getText();
			    input = input.toUpperCase();
			    // Metni kontrol edelim
			    if (input.contains("SEN ÇOK GÜZELSİN")) {
			      // Eğer uygun bir iltifat bulunduysa, ekrana yazdıralım
			      JOptionPane.showMessageDialog(this, "Teşekkür ederim, sen de çok güzel bir insansın!");
			    }else if(input.contains("MERHABA")) {
			    	JOptionPane.showMessageDialog(this, "Sana da merhaba, güzellik! :))");
			    }else if(input.contains("NASILSIN")) {
			    	JOptionPane.showMessageDialog(this, "Seni gördüm daha iyi oldum. :))");
			  }else {
				  JOptionPane.showMessageDialog(this, "EHE :D :Tanımsız mesaj girdiniz!");
			  }
			    
			  
			 
			}
		}
		
	

}
