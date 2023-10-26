package Utilidades;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Utilidades {

    public static void addPlaceHolder(final JTextField textField, final String placeholder) {
        textField.setForeground(Color.GRAY);//las letras se hacen grises
        textField.setText(placeholder);//setea el mensaje que pasamos por parametro

        textField.addFocusListener(new FocusListener() {
            // Sobrescribe el comportamiento cuando apretas un click en el TextField
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);//cuando escribimos el texto, se cambia a negro
                }
            }
            // Sobrescribe el comportamiento cuando salis del TextField
            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholder);//si no escribimos nada en el textField vuelve el texto y se pone gris
                }
            }
        });
    }

    /*[a-zA-ZáéíóúÁÉÍÓÚ] coincide con letras mayúsculas y minúsculas sin acentos y con vocales acentuadas.
    üÜ son las letras con diéresis en minúsculas y mayúsculas.
    ñÑ son las letras con virgulilla en minúsculas y mayúsculas.
    (espacio en blanco) permite espacios en blanco.
    Esta expresión regular permitirá letras (con o sin acentos, con o sin diéresis y con o sin virgulilla), 
    espacios en blanco y nada más. */
    
    public static boolean contieneSoloLetras(String texto) {
        Pattern pattern = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ]+( +[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ]+)*$");// Valida que solo sean letras (expresiones regulares)
        Matcher matcher = pattern.matcher(texto); // Compara el texto con lo que le pasamos de patron.

        return matcher.matches(); // retorna verdadero si el patron que le pasamos arriba se cumple con el texto.
    }
    
    public static boolean contieneSoloNumeros(JTextField texto) {
        Pattern pattern = Pattern.compile("[0-9]+");// Valida que solo sean numeros (expresiones regulares)
        Matcher matcher = pattern.matcher(texto.getText()); // Compara el texto con lo que le pasamos de patron.

        return matcher.matches(); // retorna verdadero si el patron que le pasamos arriba se cumple con el texto.
    }
    

}
