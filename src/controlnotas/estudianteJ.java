package controlnotas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class estudianteJ extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField codigoText;
    private JTextField nombreText;
    private JTextField generoText;
    private JTextField edadText;
    private JTextField gradoText;
    private JTextField seccionText;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    estudianteJ frame = new estudianteJ();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public estudianteJ() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 762, 525);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel codigoLabel = new JLabel("Código de Estudiante");
        codigoLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        codigoLabel.setBounds(38, 29, 254, 33);
        contentPane.add(codigoLabel);

        codigoText = new JTextField();
        codigoText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        codigoText.setBounds(360, 29, 189, 32);
        contentPane.add(codigoText);
        codigoText.setColumns(10);

        JLabel nombreLabel = new JLabel("Nombre del Estudiante");
        nombreLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        nombreLabel.setBounds(38, 95, 254, 33);
        contentPane.add(nombreLabel);

        nombreText = new JTextField();
        nombreText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        nombreText.setColumns(10);
        nombreText.setBounds(360, 96, 189, 32);
        contentPane.add(nombreText);

        JLabel generoLabel = new JLabel("Género del Estudiante");
        generoLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        generoLabel.setBounds(38, 157, 254, 33);
        contentPane.add(generoLabel);

        generoText = new JTextField();
        generoText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        generoText.setColumns(10);
        generoText.setBounds(360, 158, 189, 32);
        contentPane.add(generoText);

        JLabel edadLabel = new JLabel("Edad del Estudiante");
        edadLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        edadLabel.setBounds(38, 224, 254, 33);
        contentPane.add(edadLabel);

        edadText = new JTextField();
        edadText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        edadText.setColumns(10);
        edadText.setBounds(360, 225, 189, 32);
        contentPane.add(edadText);

        JLabel gradoLabel = new JLabel("Grado del Estudiante");
        gradoLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        gradoLabel.setBounds(38, 284, 254, 33);
        contentPane.add(gradoLabel);

        gradoText = new JTextField();
        gradoText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gradoText.setColumns(10);
        gradoText.setBounds(360, 287, 189, 32);
        contentPane.add(gradoText);

        JLabel seccionLabel = new JLabel("Sección del Estudiante");
        seccionLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        seccionLabel.setBounds(38, 348, 254, 33);
        contentPane.add(seccionLabel);

        seccionText = new JTextField();
        seccionText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        seccionText.setColumns(10);
        seccionText.setBounds(360, 351, 189, 32);
        contentPane.add(seccionText);

        JButton guardarBtn = new JButton("Guardar Datos");
        guardarBtn.setFont(new Font("Tahoma", Font.PLAIN, 24));
        guardarBtn.setBounds(38, 445, 194, 33);
        contentPane.add(guardarBtn);

        JButton limpiarBtn = new JButton("Limpiar Pantalla");
        limpiarBtn.setFont(new Font("Tahoma", Font.PLAIN, 24));
        limpiarBtn.setBounds(250, 445, 194, 33);
        contentPane.add(limpiarBtn);

        guardarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                validarYCrearEstudiante();
            }
        });

        limpiarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });
    }

    private void validarYCrearEstudiante() {
        String codigo = codigoText.getText();
        String nombre = nombreText.getText();
        String grado = gradoText.getText();
        String seccion = seccionText.getText();
        String edadStr = edadText.getText();
        String genero = generoText.getText();

        if (codigo.isEmpty() || nombre.isEmpty() || grado.isEmpty() || seccion.isEmpty() || edadStr.isEmpty() || genero.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (codigoDuplicado(codigo)) {
            JOptionPane.showMessageDialog(this, "El código del estudiante ya existe. Por favor, ingrese un código diferente.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int edad = Integer.parseInt(edadStr);

            // Crear el objeto Estudiante
            Estudiante nuevoEstudiante = new Estudiante(codigo, nombre, grado, seccion, edad, genero);

            // Guardar los datos del estudiante en un archivo .txt
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("estudiantes.txt", true))) {
                writer.write("Código: " + nuevoEstudiante.getCodigo());
                writer.newLine();
                writer.write("Nombre: " + nuevoEstudiante.getNombre());
                writer.newLine();
                writer.write("Grado: " + nuevoEstudiante.getGrado());
                writer.newLine();
                writer.write("Sección: " + nuevoEstudiante.getSeccion());
                writer.newLine();
                writer.write("Edad: " + nuevoEstudiante.getEdad());
                writer.newLine();
                writer.write("Género: " + nuevoEstudiante.getGenero());
                writer.newLine();
                writer.write("----------------------");
                writer.newLine();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar los datos en el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }

            JOptionPane.showMessageDialog(this, "Estudiante creado y guardado exitosamente.");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una edad válida (número).", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean codigoDuplicado(String codigo) {
        try (BufferedReader reader = new BufferedReader(new FileReader("estudiantes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Código: ")) {
                    String existingCodigo = line.substring(8).trim();
                    if (existingCodigo.equals(codigo)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void limpiarCampos() {
        codigoText.setText("");
        nombreText.setText("");
        generoText.setText("");
        edadText.setText("");
        gradoText.setText("");
        seccionText.setText("");
    }
}
