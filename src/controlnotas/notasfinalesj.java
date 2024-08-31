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

public class notasfinalesj extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField codigoText;
    private JTextField nombreText;
    private JTextField gradoText;
    private JTextField seccionText;
    private JTextField materiaText;
    private JTextField bimestre1Text;
    private JTextField bimestre2Text;
    private JTextField bimestre3Text;
    private JTextField bimestre4Text;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    notasfinalesj frame = new notasfinalesj();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public notasfinalesj() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 857, 717);
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

        JLabel nombreLabel = new JLabel("Nombre");
        nombreLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        nombreLabel.setBounds(52, 129, 254, 33);
        contentPane.add(nombreLabel);

        nombreText = new JTextField();
        nombreText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        nombreText.setColumns(10);
        nombreText.setBounds(333, 129, 189, 32);
        nombreText.setEditable(false);
        contentPane.add(nombreText);

        JLabel gradoLabel = new JLabel("Grado");
        gradoLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        gradoLabel.setBounds(52, 194, 254, 33);
        contentPane.add(gradoLabel);

        gradoText = new JTextField();
        gradoText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gradoText.setColumns(10);
        gradoText.setBounds(333, 194, 189, 32);
        gradoText.setEditable(false);
        contentPane.add(gradoText);

        JLabel seccionLabel = new JLabel("Sección");
        seccionLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        seccionLabel.setBounds(52, 253, 254, 33);
        contentPane.add(seccionLabel);

        seccionText = new JTextField();
        seccionText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        seccionText.setColumns(10);
        seccionText.setBounds(333, 253, 189, 32);
        seccionText.setEditable(false);
        contentPane.add(seccionText);

        JLabel materiaLabel = new JLabel("Materia");
        materiaLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        materiaLabel.setBounds(52, 313, 254, 33);
        contentPane.add(materiaLabel);

        materiaText = new JTextField();
        materiaText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        materiaText.setColumns(10);
        materiaText.setBounds(333, 313, 189, 32);
        materiaText.setEditable(false);
        contentPane.add(materiaText);

        JLabel bimestre1Label = new JLabel("Nota Bimestre 1");
        bimestre1Label.setFont(new Font("Tahoma", Font.PLAIN, 24));
        bimestre1Label.setBounds(52, 373, 254, 33);
        contentPane.add(bimestre1Label);

        bimestre1Text = new JTextField();
        bimestre1Text.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bimestre1Text.setColumns(10);
        bimestre1Text.setBounds(333, 373, 189, 32);
        contentPane.add(bimestre1Text);

        JLabel bimestre2Label = new JLabel("Nota Bimestre 2");
        bimestre2Label.setFont(new Font("Tahoma", Font.PLAIN, 24));
        bimestre2Label.setBounds(52, 413, 254, 33);
        contentPane.add(bimestre2Label);

        bimestre2Text = new JTextField();
        bimestre2Text.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bimestre2Text.setColumns(10);
        bimestre2Text.setBounds(333, 413, 189, 32);
        contentPane.add(bimestre2Text);

        JLabel bimestre3Label = new JLabel("Nota Bimestre 3");
        bimestre3Label.setFont(new Font("Tahoma", Font.PLAIN, 24));
        bimestre3Label.setBounds(52, 453, 254, 33);
        contentPane.add(bimestre3Label);

        bimestre3Text = new JTextField();
        bimestre3Text.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bimestre3Text.setColumns(10);
        bimestre3Text.setBounds(333, 453, 189, 32);
        contentPane.add(bimestre3Text);

        JLabel bimestre4Label = new JLabel("Nota Bimestre 4");
        bimestre4Label.setFont(new Font("Tahoma", Font.PLAIN, 24));
        bimestre4Label.setBounds(52, 493, 254, 33);
        contentPane.add(bimestre4Label);

        bimestre4Text = new JTextField();
        bimestre4Text.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bimestre4Text.setColumns(10);
        bimestre4Text.setBounds(333, 493, 189, 32);
        contentPane.add(bimestre4Text);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarNotas();
            }
        });
        btnGuardar.setBounds(333, 550, 189, 48);
        contentPane.add(btnGuardar);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buscarEstudiante();
            }
        });
        btnBuscar.setBounds(550, 66, 189, 48);
        contentPane.add(btnBuscar);
    }

    private void limpiarCampos() {
        codigoText.setText("");
        nombreText.setText("");
        gradoText.setText("");
        seccionText.setText("");
        materiaText.setText("");
        bimestre1Text.setText("");
        bimestre2Text.setText("");
        bimestre3Text.setText("");
        bimestre4Text.setText("");
    }

    private void buscarEstudiante() {
        String codigo = codigoText.getText();
        try (BufferedReader reader = new BufferedReader(new FileReader("grado.txt"))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Código: " + codigo)) {
                    nombreText.setText(parseLine(reader.readLine()));
                    gradoText.setText(parseLine(reader.readLine()));
                    seccionText.setText(parseLine(reader.readLine()));
                    reader.readLine();
                    materiaText.setText(parseLine(reader.readLine()));
                    found = true;
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "Estudiante no encontrado.");
                nombreText.setText("No encontrado");
                gradoText.setText("No encontrado");
                seccionText.setText("No encontrado");
                materiaText.setText("No encontrado");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String parseLine(String line) {
        if (line != null) {
            String[] parts = line.split(": ");
            if (parts.length == 2) {
                return parts[1].trim();
            }
        }
        return "";
    }

    private void guardarNotas() {
        String codigo = codigoText.getText();
        String nombre = nombreText.getText();
        String grado = gradoText.getText();
        String seccion = seccionText.getText();
        String materia = materiaText.getText();
        double bimestre1 = Double.parseDouble(bimestre1Text.getText());
        double bimestre2 = Double.parseDouble(bimestre2Text.getText());
        double bimestre3 = Double.parseDouble(bimestre3Text.getText());
        double bimestre4 = Double.parseDouble(bimestre4Text.getText());

        NotasFinales notas = new NotasFinales(codigo, nombre, grado, seccion, materia, bimestre1, bimestre2, bimestre3, bimestre4);

        // Validar notas
        if (bimestre1 < 0 || bimestre1 > 100 || 
            bimestre2 < 0 || bimestre2 > 100 || 
            bimestre3 < 0 || bimestre3 > 100 || 
            bimestre4 < 0 || bimestre4 > 100) {
            JOptionPane.showMessageDialog(this, "Las notas deben estar entre 0 y 100 puntos.");
            return;
        }

        // Validar si el código ya existe
        if (codigoExiste(codigo)) {
            JOptionPane.showMessageDialog(this, "El código de estudiante ya existe. Por favor, ingrese un código diferente.");
            return;
        }

        double promedio = notas.calcularPromedio();
        String resultado = notas.obtenerResultado();

        // Guardar en archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("notas.txt", true))) {
            writer.write("Código: " + notas.getCodigo());
            writer.newLine();
            writer.write("Nombre: " + notas.getNombre());
            writer.newLine();
            writer.write("Grado: " + notas.getGrado());
            writer.newLine();
            writer.write("Sección: " + notas.getSeccion());
            writer.newLine();
            writer.write("Materia: " + notas.getMateria());
            writer.newLine();
            writer.write("Nota Bimestre 1: " + notas.getBimestre1());
            writer.newLine();
            writer.write("Nota Bimestre 2: " + notas.getBimestre2());
            writer.newLine();
            writer.write("Nota Bimestre 3: " + notas.getBimestre3());
            writer.newLine();
            writer.write("Nota Bimestre 4: " + notas.getBimestre4());
            writer.newLine();
            writer.write("Promedio Final: " + promedio);
            writer.newLine();
            writer.write("Resultado: " + resultado);
            writer.newLine();
            writer.write("===========================================");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(this, "Notas guardadas.\nPromedio Final: " + promedio + "\nResultado: " + resultado);
    }

    // Método para verificar si el código ya existe en el archivo
    private boolean codigoExiste(String codigo) {
        try (BufferedReader reader = new BufferedReader(new FileReader("notas.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Código: " + codigo)) {
                    return true; // Código encontrado, retorna true
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Código no encontrado, retorna false
    }
}

