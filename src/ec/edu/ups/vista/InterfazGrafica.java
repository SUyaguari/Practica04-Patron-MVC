package ec.edu.ups.vista;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import javax.swing.JTextField;

/**
 *
 * @author Estudiantes
 */
public class InterfazGrafica extends Frame{
    
    public InterfazGrafica(){
        this.setTitle("Interfaz Telefonos");
        this.setSize(1000, 800);
        GridLayout matriz = new GridLayout(3, 2);
        GridLayout matrizComponentes = new GridLayout(4, 2);
        GridLayout matrizComponentes2 = new GridLayout(4, 2);
        GridLayout matrizComponentes3 = new GridLayout(1, 2);
        GridLayout matrizComponentes4 = new GridLayout(1, 2);
        GridLayout matrizComponentes5 = new GridLayout(4, 2);
        GridLayout matrizComponentes6 = new GridLayout(1, 3);
        BorderLayout ordenar = new BorderLayout();
        BorderLayout ordenar2 = new BorderLayout();
        BorderLayout ordenar3 = new BorderLayout();
        BorderLayout ordenar4 = new BorderLayout();
        BorderLayout ordenar5 = new BorderLayout();
        BorderLayout ordenarrr = new BorderLayout();
        
        Panel panel = new Panel(ordenarrr);
        Panel panel1 = new Panel(matriz);
        Panel ordenador = new Panel(ordenar);
        Panel ordenador2 = new Panel(ordenar2);
        Panel ordenador3 = new Panel(ordenar3);
        Panel ordenador4 = new Panel(ordenar4);
        Panel ordenador5 = new Panel(ordenar5);
        Panel ordenador6 = new Panel(matrizComponentes6);
        
        Panel registro = new Panel(matrizComponentes);
        Panel modificar = new Panel(matrizComponentes2);
        Panel eliminar = new Panel(matrizComponentes3);
        Panel buscar = new Panel(matrizComponentes4);
        Panel modificarUsuario = new Panel(matrizComponentes5);
        
        
        Label labelCodigo = new Label("Codigo:");
        Label labelNumero = new Label("Numero:");
        Label labelTipo = new Label("Tipo:");
        Label labelOperadora = new Label("Operadora:");
        
        Label labelCodigo1 = new Label("Codigo:");
        Label labelNumero1 = new Label("Numero:");
        Label labelTipo1 = new Label("Tipo:");
        Label labelOperadora1 = new Label("Operadora:");
        
        Label labelCodigo2 = new Label("Codigo:");
        
        Label labelCodigoBuscar = new Label("Codigo:");
        
        Label labelNombre = new Label("Nombre:");
        Label labelApellido = new Label("Apellido:");
        Label labelCorreo = new Label("Correo:");
        Label labelContraseña = new Label("Contraseña:");
        
        Label labelRegistrar = new Label("Registrar");
        Label labelModificar = new Label("Modificar");
        Label labelEliminar = new Label("Eliminar");
        Label labelBuscar = new Label("Buscar");
        Label labelModificarUsuario = new Label("Modificar Usuario");
        
        
        JTextField textoCodigo = new JTextField(10);
        JTextField textoNumero = new JTextField(10);
        JTextField textoTipo = new JTextField(10);
        JTextField textoOperadora = new JTextField(10);
        
        JTextField textoCodigo1 = new JTextField(10);
        JTextField textoNumero1 = new JTextField(10);
        JTextField textoTipo1 = new JTextField(10);
        JTextField textoOperadora1 = new JTextField(10);
        
        JTextField textoCodigo2 = new JTextField(10);
        
        JTextField textoCodigoBuscar = new JTextField(10);
        
        JTextField textoNombre = new JTextField(10);
        JTextField textoApellido = new JTextField(10);
        JTextField textoCorreo = new JTextField(10);
        JTextField textoContraseña = new JTextField(10);
        
        Button boton = new Button("Aceptar");
        Button boton1 = new Button("Aceptar");
        Button boton2 = new Button("Aceptar");
        Button botonBuscar = new Button("Aceptar");
        Button boton4 = new Button("Aceptar");
        Button boton5 = new Button("Eliminar Usuario");
        Button boton6 = new Button("Cerrar Sesion");
        Button botonListar = new Button("Listar Telefonos");
        
        registro.add(labelCodigo);
        registro.add(textoCodigo);
        registro.add(labelNumero);
        registro.add(textoNumero);
        registro.add(labelOperadora);
        registro.add(textoOperadora);
        registro.add(labelTipo);
        registro.add(textoTipo);
        
        ordenador.add(registro, BorderLayout.CENTER);
        ordenador.add(boton, BorderLayout.SOUTH);
        ordenador.add(labelRegistrar, BorderLayout.NORTH);
        
        panel1.add(ordenador);
        
        modificar.add(labelCodigo1);
        modificar.add(textoCodigo1);
        modificar.add(labelNumero1);
        modificar.add(textoNumero1);
        modificar.add(labelOperadora1);
        modificar.add(textoOperadora1);
        modificar.add(labelTipo1);
        modificar.add(textoTipo1);
        
        ordenador2.add(modificar, BorderLayout.CENTER);
        ordenador2.add(boton1, BorderLayout.SOUTH);
        ordenador2.add(labelModificar, BorderLayout.NORTH);
        
        panel1.add(ordenador2);
        
        eliminar.add(labelCodigo2);
        eliminar.add(textoCodigo2);
        
        ordenador3.add(eliminar, BorderLayout.CENTER);
        ordenador3.add(boton2, BorderLayout.SOUTH);
        ordenador3.add(labelEliminar, BorderLayout.NORTH);
        
        panel1.add(ordenador3);
        
        buscar.add(labelCodigoBuscar);
        buscar.add(textoCodigoBuscar);
        
        ordenador4.add(buscar, BorderLayout.CENTER);
        ordenador4.add(botonBuscar, BorderLayout.SOUTH);
        ordenador4.add(labelBuscar, BorderLayout.NORTH);
        
        panel1.add(ordenador4);
        
        modificarUsuario.add(labelNombre);
        modificarUsuario.add(textoNombre);
        modificarUsuario.add(labelApellido);
        modificarUsuario.add(textoApellido);
        modificarUsuario.add(labelCorreo);
        modificarUsuario.add(textoCorreo);
        modificarUsuario.add(labelContraseña);
        modificarUsuario.add(textoContraseña);
        
        ordenador5.add(modificarUsuario, BorderLayout.CENTER);
        ordenador5.add(boton4, BorderLayout.SOUTH);
        ordenador5.add(labelModificarUsuario, BorderLayout.NORTH);
        
        panel1.add(ordenador5);
        
        
        ordenador6.add(botonListar);
        ordenador6.add(boton6);
        ordenador6.add(boton5);
        
        panel1.add(ordenador6);
        
        TextArea mostrarTexto = new TextArea();
        mostrarTexto.setEditable(false);
        
        panel.add(panel1, BorderLayout.NORTH);
        panel.add(mostrarTexto, BorderLayout.CENTER);
        this.add(panel);
    }
}
