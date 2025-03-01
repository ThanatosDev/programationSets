package ui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Nicolas Jacobo Ospina Ortiz (UIB)
 */
public final class WindowConfig
{
    
    // *** [DECLARACIONES] *** //
    
    // DECLARAR EL TÍTULO DE LA VENTANA GENERADA (sin inicializar)
    private static String overTitle;
    
    // DECLARAR EL TAMAÑO POR DEFECTO DE LA VENTANA (sin inicializaf)
    private static int hgSize; // configuración del anchor
    private static int whSize; // configuración de la altura
    
    // DECLARAR LOS COLORES DE FONDO EN SU RESPECTIVO CÓDIGO RGB (sin inicializar)
    private static int redCode; // configuración del color rojo
    private static int greenCode; // configuración del color verde
    private static int blueCode; // configuración del color azul
    
    // INSTANCIACIÓN DE UN OBJETO JFRAME QUE GENERARÁ LA VENTANA
    public static final JFrame window = new JFrame();
    
    // INSTANCIACIÓN DE UN OBJETO CONTENEDOR, QUE NOS FUNCIONARÁ COMO CONTENEDOR
    // PRINCIPAL DE LA VENATANA
    public Container mainContainer = window.getContentPane();
    
    // ***[DECLARACIÓN DE FUENTES BÁSICAS A MAHEJAR] ***//
    
    public final Font slimSimpleFont = new Font("Arial", Font.PLAIN, generalFontSize); // fuente simple
    public final Font boldSimpleFont = new Font("Arial", Font.BOLD, generalFontSize); // fuente negrita
    public final Font italicSimpleFont = new Font("Arial", Font.ITALIC, generalFontSize); // fuente italica
    
    // variable de modificación del tamaño de fuente a imprimir
    private static int generalFontSize = 14;

    // ***[MÉTODO CONSTRUCTOR] *** //
    public WindowConfig()
    { 
        // INICIALIZACIÓN DE UN TÍTULO POR DEFECTO PARA LA VENTANA
        overTitle = "WINDOW DEFAULT TITLE";
        
        // INICIALIZACIÓN DEL TAMAÑO DE LAS VENTANAS
        hgSize = 550; // inicializar el anchor de la ventana en 550 por defecto
        whSize = 250; // inicializar el largo de la ventana en 250 por defecto
        
        // LLAMAR AL MÉTODO SETUP QUE CONTIENE TODAS LAS ESPECIFICACIONES INCIALES
        // DE LA VENTANA.
        setup();
    }
    
    // ***[MÉTODO DE CONFIGURACIONES]*** //
    public void setup()
    {
        // DEFINIR EL TÍTULO DE LA VENTANA
        window.setTitle(overTitle);
        
        // DEFINIR LOS DISTINTOS PARÁMETROS DE VISUALIZACIÓN Y OPERACIÓN BÁSICA
        // DE LA VENTANA
        window.setVisible(true); // declrar la ventana como visible
        window.setSize(hgSize, whSize); // declarar el tamaño de la ventana por defecto
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // declarar la operación de cierre por defecto
        window.setLocationRelativeTo(null); // declrar el posicionamiento de la ventana en un principio 
                                            // en el centro de la pantalla
        
        // DECLARACIÓN E INICIALIZACIÓN DEL CONTENEDOR PRINCIPAL DE LA VENTANA.
        mainContainer.setLayout(new FlowLayout()); // generar un layout en el contenedor principal
        
        mainContainer.setBackground(new Color(redCode, greenCode, blueCode)); // definir el color de fondo del contenedor
                                                                              // principal
                                                                              
        mainContainer.setForeground(new Color(redCode, greenCode, blueCode));
    }

    // ***[SETTERS DE CONFIGURACIÓN]*** //
    
    // hacer un set para modificar el valor del título de la ventana
    public void setOverTitle(String overTitle) 
    {
        WindowConfig.overTitle = overTitle;
    }
    
    // hacer un set para modificar el tamaño de la ventana (respecto al eje x)
    public void setHgSize(int hgSize) 
    {
        WindowConfig.hgSize = hgSize;
    }
    
    // hacer un set para modificar el tamaño de la ventana (respecto al eje y)
    public void setWhSize(int whSize) 
    {
        WindowConfig.whSize = whSize;
    }

    // hacer un set para modificar el color de fondo (respecto al componente rojo)
    public void setRedCode(int redCode) 
    {
        WindowConfig.redCode = redCode;
    }
    
    // hacer un set para modificar el color de fondo (respecto al componente verde)
    public void setGreenCode(int greenCode) 
    {
        WindowConfig.greenCode = greenCode;
    }
    
    // hacer un set para modificar el color de fondo (respecto al componente azul)
    public void setBlueCode(int blueCode) 
    {
        WindowConfig.blueCode = blueCode;
    }
    
    // hacer un set para modificar el tamaño de texto de las letras (tiene problemas)
    public void setGeneralFontSize(int size)
    {
        WindowConfig.generalFontSize = size;
    }
}
