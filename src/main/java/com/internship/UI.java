package com.internship;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class UI extends JFrame {
    private Problems problemas;

    public UI() {
        problemas = new Problems();

        setTitle("Resolución de Problemas");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 2));

        // Estilo del JFrame
        JPanel panelSumaDeDigitos = new JPanel(new BorderLayout());
        JLabel LabelSumaDeDigitos = new JLabel("Suma de Dígitos");
        estilizarLabel(LabelSumaDeDigitos, Color.BLACK, 25, true);
        panelSumaDeDigitos.setPreferredSize(new Dimension(100, 100));
        panelSumaDeDigitos.setBackground(Color.LIGHT_GRAY);
        panelSumaDeDigitos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panelSumaDeDigitos.add(LabelSumaDeDigitos, BorderLayout.CENTER);

        // creacion del JFrame de Suma de Digitos
        panelSumaDeDigitos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame sumaDeDigitos = new JFrame("Suma de digitos");
                sumaDeDigitos.setDefaultCloseOperation(sumaDeDigitos.EXIT_ON_CLOSE);
                sumaDeDigitos.setSize(700, 700);
                sumaDeDigitos.setLocationRelativeTo(null);
                sumaDeDigitos.setVisible(true);

                JPanel panelSumaDeDigitos = new JPanel();
                panelSumaDeDigitos.setLayout(new BoxLayout(panelSumaDeDigitos, BoxLayout.Y_AXIS));
                panelSumaDeDigitos.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

                JLabel lblTitulo = new JLabel("Ingresa un número:");
                lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

                JTextField txtNumero = new JTextField();
                txtNumero.setMaximumSize(new Dimension(200, 30));
                txtNumero.setAlignmentX(Component.CENTER_ALIGNMENT);

                JLabel lblResultado = new JLabel("Resultado: ");
                lblResultado.setAlignmentX(Component.CENTER_ALIGNMENT);

                JButton btnCalcular = new JButton("Calcular Suma de Dígitos");
                btnCalcular.setAlignmentX(Component.CENTER_ALIGNMENT);

                panelSumaDeDigitos.add(lblTitulo);
                panelSumaDeDigitos.add(Box.createRigidArea(new Dimension(0, 10)));
                panelSumaDeDigitos.add(txtNumero);
                panelSumaDeDigitos.add(Box.createRigidArea(new Dimension(0, 10)));
                panelSumaDeDigitos.add(btnCalcular);
                panelSumaDeDigitos.add(Box.createRigidArea(new Dimension(0, 10)));
                panelSumaDeDigitos.add(lblResultado);

                sumaDeDigitos.add(panelSumaDeDigitos);
                dispose();

                btnCalcular.addActionListener(evt -> {
                    try {
                        String texto = txtNumero.getText().trim();
                        int[] digitos = new int[texto.length()];

                        for (int i = 0; i < texto.length(); i++) {
                            char c = texto.charAt(i);

                            if (!Character.isDigit(c)) {
                                throw new NumberFormatException();
                            }

                            digitos[i] = Character.getNumericValue(c);
                        }

                        int sumar = problemas.sumaDeDigitos(digitos);

                        lblResultado.setText("Resultado: " + sumar);

                    } catch (NumberFormatException ex) {
                        lblResultado.setText("Por favor, ingresa solo números.");
                    }
                });
            }
        });

        JPanel panelPalindromo = new JPanel(new BorderLayout());
        JLabel labelPalindromo = new JLabel("Palindromo");
        estilizarLabel(labelPalindromo, Color.BLACK, 25, true);
        panelPalindromo.setPreferredSize(new Dimension(100, 100));
        panelPalindromo.setBackground(Color.LIGHT_GRAY);
        panelPalindromo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panelPalindromo.add(labelPalindromo, BorderLayout.CENTER);

        panelPalindromo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame palindromo = new JFrame("Palíndromo");
                palindromo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                palindromo.setSize(700, 700);
                palindromo.setLocationRelativeTo(null);

                JPanel panelPalindromo = new JPanel();
                panelPalindromo.setLayout(new BoxLayout(panelPalindromo, BoxLayout.Y_AXIS));
                panelPalindromo.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

                JLabel lblTitulo = new JLabel("Ingresa una palabra:");
                lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

                JTextField txtPalin = new JTextField();
                txtPalin.setMaximumSize(new Dimension(200, 30));
                txtPalin.setAlignmentX(Component.CENTER_ALIGNMENT);

                JLabel resultadoLabel = new JLabel("Resultado:");
                resultadoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

                JButton btnVerificar = new JButton("Verificar Palíndromo");
                btnVerificar.setAlignmentX(Component.CENTER_ALIGNMENT);

                btnVerificar.addActionListener(event -> {
                    String texto = txtPalin.getText();
                    boolean resultado = problemas.palindromo(texto);
                    resultadoLabel.setText("¿Es palíndromo? " + resultado);
                });

                panelPalindromo.add(lblTitulo);
                panelPalindromo.add(Box.createRigidArea(new Dimension(0, 10)));
                panelPalindromo.add(txtPalin);
                panelPalindromo.add(Box.createRigidArea(new Dimension(0, 10)));
                panelPalindromo.add(btnVerificar);
                panelPalindromo.add(Box.createRigidArea(new Dimension(0, 10)));
                panelPalindromo.add(resultadoLabel);

                palindromo.add(panelPalindromo);
                palindromo.setVisible(true);

                dispose();

            }
        });

        JPanel panelOrdenamiento = new JPanel(new BorderLayout());
        JLabel labelOrdenamiento = new JLabel("Ordenamiento");
        estilizarLabel(labelOrdenamiento, Color.BLACK, 25, true);
        panelOrdenamiento.setPreferredSize(new Dimension(100, 100));
        panelOrdenamiento.setBackground(Color.LIGHT_GRAY);
        panelOrdenamiento.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panelOrdenamiento.add(labelOrdenamiento, BorderLayout.CENTER);

        panelOrdenamiento.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame ordenamiento = new JFrame("Ordenamiento");
                ordenamiento.setSize(700, 700);
                ordenamiento.setLocationRelativeTo(null);

                JPanel panelOrdenamientoInterno = new JPanel();
                panelOrdenamientoInterno.setLayout(new BoxLayout(panelOrdenamientoInterno, BoxLayout.Y_AXIS));
                panelOrdenamientoInterno.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

                JLabel lblTitulo = new JLabel("Ingresa un número para ordenar sus dígitos:");
                lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

                JTextField txtPalin = new JTextField();
                txtPalin.setMaximumSize(new Dimension(200, 30));
                txtPalin.setAlignmentX(Component.CENTER_ALIGNMENT);

                JLabel resultadoLabel = new JLabel("Resultado:");
                resultadoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

                JButton btnVerificar = new JButton("Calcular Ordenamiento");
                btnVerificar.setAlignmentX(Component.CENTER_ALIGNMENT);

                btnVerificar.addActionListener(ev -> {
                    try {
                        String texto = txtPalin.getText().trim();
                        int[] digitos = new int[texto.length()];

                        for (int i = 0; i < texto.length(); i++) {
                            char c = texto.charAt(i);
                            if (!Character.isDigit(c)) {
                                throw new NumberFormatException();
                            }
                            digitos[i] = Character.getNumericValue(c);
                        }

                        int[] resultado = problemas.ordenamiento(digitos);
                        String resultadoS = Arrays.toString(resultado); 
                        resultadoLabel.setText("Resultado: " + resultadoS);

                    } catch (NumberFormatException ex) {
                        resultadoLabel.setText("Por favor, ingresa solo números.");
                    }
                });

                panelOrdenamientoInterno.add(lblTitulo);
                panelOrdenamientoInterno.add(Box.createRigidArea(new Dimension(0, 10)));
                panelOrdenamientoInterno.add(txtPalin);
                panelOrdenamientoInterno.add(Box.createRigidArea(new Dimension(0, 10)));
                panelOrdenamientoInterno.add(btnVerificar);
                panelOrdenamientoInterno.add(Box.createRigidArea(new Dimension(0, 10)));
                panelOrdenamientoInterno.add(resultadoLabel);

                ordenamiento.add(panelOrdenamientoInterno);
                ordenamiento.setVisible(true);

                dispose();
            }
        });

        JPanel panelProx = new JPanel(new BorderLayout());
        JLabel labelProx = new JLabel("Próximamente");
        estilizarLabel(labelProx, Color.BLACK, 25, true);
        panelProx.setPreferredSize(new Dimension(100, 100));
        panelProx.setBackground(Color.LIGHT_GRAY);
        panelProx.add(labelProx, BorderLayout.CENTER);

        add(panelSumaDeDigitos);
        add(panelPalindromo);
        add(panelOrdenamiento);
        add(panelProx);
    }

    private void estilizarLabel(JLabel label, Color colorTexto, int tamaño, boolean negrita) {
        label.setForeground(colorTexto);
        label.setFont(new Font("Arial", negrita ? Font.BOLD : Font.PLAIN, tamaño));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
    }
}
