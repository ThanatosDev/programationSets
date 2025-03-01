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
    
    // DECLARAR EL T�TULO DE LA VENTANA GENERADA (sin inicializar)
    private static String overTitle;
    
    // DECLARAR EL TAMA�O POR DEFECTO DE LA VENTANA (sin inicializaf)
    private static int hgSize; // configuraci�n del anchor
    private static int whSize; // configuraci�n de la altura
    
    // DECLARAR LOS COLORES DE FONDO EN SU RESPECTIVO C�DIGO RGB (sin inicializar)
    private static int redCode; // configuraci�n del color rojo
    private static int greenCode; // configuraci�n del color verde
    private static int blueCode; // configuraci�n del color azul
    
    // INSTANCIACI�N DE UN OBJETO JFRAME QUE GENERAR� LA VENTANA
    public static final JFrame window = new JFrame();
    
    // INSTANCIACI�N DE UN OBJETO CONTENEDOR, QUE NOS FUNCIONAR� COMO CONTENEDOR
    // PRINCIPAL DE LA VENATANA
    public Container mainContainer = window.getContentPane();
    
    // ***[DECLARACI�N DE FUENTES B�SICAS A MAHEJAR] ***//
    
    public final Font slimSimpleFont = new Font("Arial", Font.PLAIN, generalFontSize); // fuente simple
    public final Font boldSimpleFont = new Font("Arial", Font.BOLD, generalFontSize); // fuente negrita
    public final Font italicSimpleFont = new Font("Arial", Font.ITALIC, generalFontSize); // fuente italica
    
    // variable de modificaci�n del tama�o de fuente a imprimir
    private static int generalFontSize = 14;

    // ***[M�TODO CONSTRUCTOR] *** //
    public WindowConfig()
    { 
        // INICIALIZACI�N DE UN T�TULO POR DEFECTO PARA LA VENTANA
        overTitle = "WINDOW DEFAULT TITLE";
        
        // INICIALIZACI�N DEL TAMA�O DE LAS VENTANAS
        hgSize = 550; // inicializar el anchor de la ventana en 550 por defecto
        whSize = 250; // inicializar el largo de la ventana en 250 por defecto
        
        // LLAMAR AL M�TODO SETUP QUE CONTIENE TODAS LAS ESPECIFICACIONES INCIALES
        // DE LA VENTANA.
        setup();
    }
    
    // ***[M�TODO DE CONFIGURACIONES]*** //
    public void setup()
    {
        // DEFINIR EL T�TULO DE LA VENTANA
        window.setTitle(overTitle);
        
        // DEFINIR LOS DISTINTOS PAR�METROS DE VISUALIZACI�N Y OPERACI�N B�SICA
        // DE LA VENTANA
        window.setVisible(true); // declrar la ventana como visible
        window.setSize(hgSize, whSize); // declarar el tama�o de la ventana por defecto
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // declarar la operaci�n de cierre por defecto
        window.setLocationRelativeTo(null); // declrar el posicionamiento de la ventana en un principio 
                                            // en el centro de la pantalla
        
        // DECLARACI�N E INICIALIZACI�N DEL CONTENEDOR PRINCIPAL DE LA VENTANA.
        mainContainer.setLayout(new FlowLayout()); // generar un layout en el contenedor principal
        
        mainContainer.setBackground(new Color(redCode, greenCode, blueCode)); // definir el color de fondo del contenedor
                                                                              // principal
                                                                              
        mainContainer.setForeground(new Color(redCode, greenCode, blueCode));
    }

    // ***[SETTERS DE CONFIGURACI�N]*** //
    
    // hacer un set para modificar el valor del t�tulo de la ventana
    public void setOverTitle(String overTitle) 
    {
        WindowConfig.overTitle = overTitle;
    }
    
    // hacer un set para modificar el tama�o de la ventana (respecto al eje x)
    public void setHgSize(int hgSize) 
    {
        WindowConfig.hgSize = hgSize;
    }
    
    // hacer un set para modificar el tama�o de la ventana (respecto al eje y)
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
    
    // hacer un set para modificar el tama�o de texto de las letras (tiene problemas)
    public void setGeneralFontSize(int size)
    {
        WindowConfig.generalFontSize = size;
    }
}
