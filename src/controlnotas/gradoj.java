package controlnotas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class gradoj extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField codigoText;
    private JTextField nombreText;
    private JTextField gradoText;
    private JTextField seccionText;
    private JTextField profesorText;
    private JTextField materiaText;
    private JTextField anioText;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    gradoj frame = new gradoj();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public gradoj() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1050, 690);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel codigoLabel = new JLabel("Código de Estudiante");
        codigoLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        codigoLabel.setBounds(52, 66, 254, 33);
        contentPane.add(codigoLabel);

        codigoText = new JTextField();
        codigoText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        codigoText.setColumns(10);
        codigoText.setBounds(333, 66, 189, 32);
        contentPane.add(codigoText);

        JLabel nombreLabel = new JLabel("Nombre de Estudiante");
        nombreLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        nombreLabel.setBounds(52, 129, 254, 33);
        contentPane.add(nombreLabel);

        nombreText = new JTextField();
        nombreText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        nombreText.setColumns(10);
        nombreText.setBounds(333, 130, 189, 32);
        contentPane.add(nombreText);

        JLabel gradoLabel_1 = new JLabel("Grado de Estudiante");
        gradoLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        gradoLabel_1.setBounds(52, 194, 254, 33);
        contentPane.add(gradoLabel_1);

        gradoText = new JTextField();
        gradoText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gradoText.setColumns(10);
        gradoText.setBounds(333, 194, 189, 32);
        contentPane.add(gradoText);

        JLabel seccionLabel = new JLabel("Sección de Estudiante");
        seccionLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        seccionLabel.setBounds(52, 253, 254, 33);
        contentPane.add(seccionLabel);

        seccionText = new JTextField();
        seccionText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        seccionText.setColumns(10);
        seccionText.setBounds(333, 256, 189, 32);
        contentPane.add(seccionText);

        JLabel profesorLabel = new JLabel("Profesor de Estudiante");
        profesorLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        profesorLabel.setBounds(52, 359, 254, 33);
        contentPane.add(profesorLabel);

        profesorText = new JTextField();
        profesorText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        profesorText.setColumns(10);
        profesorText.setBounds(333, 362, 189, 32);
        contentPane.add(profesorText);

        JLabel materiaLabel = new JLabel("Materia de Estudiante");
        materiaLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        materiaLabel.setBounds(52, 402, 254, 33);
        contentPane.add(materiaLabel);

        materiaText = new JTextField();
        materiaText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        materiaText.setColumns(10);
        materiaText.setBounds(333, 405, 189, 32);
        contentPane.add(materiaText);

        JLabel anioLabel = new JLabel("Año Escolar");
        anioLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        anioLabel.setBounds(52, 445, 254, 33);
        contentPane.add(anioLabel);

        anioText = new JTextField();
        anioText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        anioText.setColumns(10);
        anioText.setBounds(333, 448, 189, 32);
        contentPane.add(anioText);

        JButton buscarBtn = new JButton("Buscar");
        buscarBtn.setFont(new Font("Tahoma", Font.PLAIN, 24));
        buscarBtn.setBounds(52, 535, 161, 39);
        contentPane.add(buscarBtn);

        buscarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buscarEstudiante();
            }
        });

        JButton guardarBtn = new JButton("Guardar");
        guardarBtn.setFont(new Font("Tahoma", Font.PLAIN, 24));
        guardarBtn.setBounds(250, 535, 161, 39);
        contentPane.add(guardarBtn);
        
        JLabel tituloLabel = new JLabel("Llenar los Campos");
        tituloLabel.setForeground(Color.RED);
        tituloLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        tituloLabel.setBounds(170, 316, 254, 33);
        contentPane.add(tituloLabel);
        
        JButton limpiarBtn = new JButton("Limpiar Pantalla");
        limpiarBtn.setFont(new Font("Tahoma", Font.PLAIN, 24));
        limpiarBtn.setBounds(470, 535, 238, 39);
        contentPane.add(limpiarBtn);

        guardarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarDatos();
            }
        });
        
        limpiarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });
    }

    private void buscarEstudiante() {
        String codigo = codigoText.getText();

        if (codigo.isEmpty()) {
            nombreText.setText("");
            gradoText.setText("");
            seccionText.setText("");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("estudiantes.txt"))) {
            String line;
            boolean encontrado = false;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Código: " + codigo)) {
                    encontrado = true;

                    String nombreLine = reader.readLine();
                    String gradoLine = reader.readLine();
                    String seccionLine = reader.readLine();

                    nombreText.setText(parseLine(nombreLine));
                    gradoText.setText(parseLine(gradoLine));
                    seccionText.setText(parseLine(seccionLine));

                    break;
                }
            }

            if (!encontrado) {
                nombreText.setText("No encontrado");
                gradoText.setText("No encontrado");
                seccionText.setText("No encontrado");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al buscar el estudiante: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String parseLine(String line) {
        if (line == null || !line.contains(": ")) {
            return "No disponible";
        }
        String[] parts = line.split(": ");
        if (parts.length < 2) {
            return "No disponible";
        }
        return parts[1].trim();
    }

    private void guardarDatos() {
        String codigo = codigoText.getText();
        String nombre = nombreText.getText();
        String grado = gradoText.getText();
        String seccion = seccionText.getText();
        String profesor = profesorText.getText();
        String materia = materiaText.getText();
        String anio = anioText.getText();

        // Validar campos vacíos
        if (codigo.isEmpty() || nombre.isEmpty() || grado.isEmpty() || seccion.isEmpty() || profesor.isEmpty() || materia.isEmpty() || anio.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Verificar si el código ya existe
        if (codigoYaRegistrado(codigo)) {
            JOptionPane.showMessageDialog(this, "El código ya está registrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("grado.txt", true))) {
            writer.write("Código: " + codigo);
            writer.newLine();
            writer.write("Nombre: " + nombre);
            writer.newLine();
            writer.write("Grado: " + grado);
            writer.newLine();
            writer.write("Sección: " + seccion);
            writer.newLine();
            writer.write("Profesor: " + profesor);
            writer.newLine();
            writer.write("Materia: " + materia);
            writer.newLine();
            writer.write("Año: " + anio);
            writer.newLine();
            writer.write("----------------------------");
            writer.newLine();

            JOptionPane.showMessageDialog(this, "Datos guardados exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean codigoYaRegistrado(String codigo) {
        try (BufferedReader reader = new BufferedReader(new FileReader("grado.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Código: " + codigo)) {
                    return true;
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
        gradoText.setText("");
        seccionText.setText("");
        profesorText.setText("");
        materiaText.setText("");
        anioText.setText("");
    }
}
