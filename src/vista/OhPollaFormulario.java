package vista;

import javax.swing.*;

import java.awt.*;

/**
 * 
 * @author Oh! Enterprises
 * OhPollaFormulario: Crea el marcador de la polla en el programa.
 *
 */
public class OhPollaFormulario extends JPanel
{
	/**
	 * @param OhPollaFormulario extends JPanel: Crea el marcador con extension al JPanel.
	 * serialVersionUID = 1L: Serial por defecto.
	 * JLabel idFactura, idCliente, labelvs, labelMarcador, labelSeparadorMarcador: Implementa las etiquetas de factura, cliente, VS, Marcador y los separadores.
	 * JTextField txFactura, txidCliente, txEquipoA, txEquipoB, tx MarcadorA, txMarcadorB: Implementa los campos de texto de factura, IDCliente, Equipo A y B, Marcador A y B.
	 */
	private static final long serialVersionUID = 1L;
	private JLabel idFactura, idCliente, labelEquipoA, labelEquipoB;
	private JTextField txFactura, txidCliente, txMarcadorA, txMarcadorB;
	private JComboBox <String> listEquipoA, listEquipoB;
	
	public OhPollaFormulario()
	{
		setLayout(new GridLayout(5, 2));
		String[] listEquipos = {"SELECCIONA UN EQUIPO", "�guilas Doradas", "Alianza Petrolera", "Am�rica de Cali", "Atl�tico Bucaramanga", "Atl�tico Huila", "Atl�tico Junior", "Atl�tico Nacional", "Boyac� Chic�", "Deportes Tolima", "Deportivo Cali", "Deportivo Pasto", "Envigado FC", "Independiente Medell�n", "Independiente Santa Fe", "Jaguares de C�rdoba", "La Equidad", "Leones FC", "Millonarios", "Once Caldas", "Patriotas FC", "Atl�tico FC", "Barranquilla FC", "Bogot� FC", "Cortulu�", "C�cuta Deportivo", "Deportes Quind�o", "Deportivo Pereira", "Fortaleza FC", "Llaneros FC", "Orsomarso SC", "Real Cartagena", "Real Santander", "Tigres FC", "Uni�n Magdalena", "Universitario Popay�n", "Valledupar FC"};
		idFactura = new JLabel("ID Factura N.");
		/**
		 * @param OhPollaFormulario: Implementacion grafica del mercador de la polla.
		 * idFactura = new JLabel("ID Factura Nº"): Crea la etiqueta del numero de factura.
		 * txFactura = new JTextField("0000"): Crea el campo de texto de la factura con "0000" de base.
		 * txFactura.setEditable(false): El campo de texto no se puede editar.
		 * txFactura.setForeground(Color.RED): El color de la fuente es ROJO.
		 * txFactura.setBackground(Color.WHITE): El color del fondo del campo de texto es BLANCO.
		 * Font fuenteFactura = new Font("Monospaced", Font.PLAIN,12): Determina la fuente del campo de texto asignado al numero de la factura.
		 * txFactura.setFont(fuenteFactura): Asigna el tipo de fuente al campo de texto.
		 * add(idFactura): Agrega el idFactura a la interfaz.
		 * add(txFactura): Agrega el campo de texto de la factura a la interfaz.
		 */
		idFactura = new JLabel("ID Factura N.");
		txFactura = new JTextField("0000");
		txFactura.setEditable(false);
		txFactura.setForeground(Color.RED);
		txFactura.setBackground(Color.WHITE);
		Font fuenteFactura = new Font("Monospaced", Font.PLAIN,12);
		txFactura.setFont(fuenteFactura);
		add(idFactura);
		add(txFactura);
		
		idCliente = new JLabel("Cedula");
		txidCliente = new JTextField();
		add(idCliente);
		add(txidCliente);
		
		labelEquipoA = new JLabel("Equipo A");
		listEquipoA = new JComboBox<String>(listEquipos);
		labelEquipoB = new JLabel("Equipo B");
		listEquipoB = new JComboBox<String>(listEquipos);
		txMarcadorA = new JTextField("ej 3");
		txMarcadorB = new JTextField("ej 2");
		
		add(labelEquipoA);
		add(labelEquipoB);
		
		add(listEquipoA);
		add(listEquipoB);
		
		add(txMarcadorA);
		add(txMarcadorB);
	}

	public JLabel getIdFactura() {
		return idFactura;
	}

	public JLabel getIdCliente() {
		return idCliente;
	}

	public JLabel getLabelEquipoA() {
		return labelEquipoA;
	}

	public JLabel getLabelEquipoB() {
		return labelEquipoB;
	}

	public JTextField getTxFactura() {
		return txFactura;
	}

	public JTextField getTxidCliente() {
		return txidCliente;
	}

	public JTextField getTxMarcadorA() {
		return txMarcadorA;
	}

	public JTextField getTxMarcadorB() {
		return txMarcadorB;
	}

	public JComboBox<String> getListEquipoA() {
		return listEquipoA;
	}

	public JComboBox<String> getListEquipoB() {
		return listEquipoB;
	}
	
	

}
