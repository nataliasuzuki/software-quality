import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

public class SoftwareQualityClass {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;

	HashMap<String, Integer> cp1;
	HashMap<String, Integer> cp2;
	HashMap<String, Integer> cp3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoftwareQualityClass window = new SoftwareQualityClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SoftwareQualityClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ger\u00EAncia de Projetos");
		lblNewLabel.setBounds(131, 11, 126, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("GPR1");
		lblNewLabel_1.setBounds(21, 43, 36, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setToolTipText("GPR 1 (A partir do n\u00EDvel G) O escopo do trabalho para o projeto \u00E9 estabelecido, mantido atualizado e utilizado.");
		textField.setBounds(95, 42, 179, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("GPR5");
		lblNewLabel_1_1.setBounds(21, 72, 36, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBounds(95, 71, 179, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("GPR6");
		lblNewLabel_1_2.setBounds(21, 101, 36, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(95, 100, 179, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("GPR8");
		lblNewLabel_1_3.setBounds(21, 130, 36, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(95, 129, 179, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("GPR9");
		lblNewLabel_1_4.setBounds(21, 159, 36, 14);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(95, 158, 179, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("GPR11");
		lblNewLabel_1_5.setBounds(21, 188, 50, 14);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(95, 187, 179, 20);
		frame.getContentPane().add(textField_5);
		
		JButton btnNewButton_5 = new JButton("Adicionar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Objeto objAux = null;
				List<Objeto> objetos = new ArrayList<Objeto>();
				
				String gpr1 = (String) textField.getText();
				String gpr1n = textField_10.getText();
				objAux = new Objeto("gpr1", gpr1, gpr1n, 0, "");
				objetos.add(objAux);

				String gpr5 = (String) textField_1.getText();
				String gpr5n = textField_11.getText();
				objAux = new Objeto("gpr5", gpr5, gpr5n, 0, "");
				objetos.add(objAux);

				String gpr6 = (String) textField_2.getText();
				String gpr6n = textField_12.getText();
				objAux = new Objeto("gpr6", gpr6, gpr6n, 0, "");
				objetos.add(objAux);

				String gpr8 = (String) textField_3.getText();
				String gpr8n = textField_13.getText();
				objAux = new Objeto("gpr8", gpr8, gpr8n, 0, "");
				objetos.add(objAux);

				String gpr9 = (String) textField_4.getText();
				String gpr9n = textField_14.getText();
				objAux = new Objeto("gpr9", gpr9, gpr9n, 0, "");
				objetos.add(objAux);

				String gpr11 = (String) textField_5.getText();
				String gpr11n = textField_15.getText();
				objAux = new Objeto("gpr1", gpr11, gpr11n, 0, "");
				objetos.add(objAux);

				String req1 = (String) textField_6.getText();
				String req1n = textField_16.getText();
				objAux = new Objeto("req1", req1, req1n, 0, "");
				objetos.add(objAux);

				String req5 = (String) textField_7.getText();
				String req5n = textField_17.getText();
				objAux = new Objeto("req5", req5, req5n, 0, "");
				objetos.add(objAux);

				String req6 = (String) textField_8.getText();
				String req6n = textField_18.getText();
				objAux = new Objeto("req6", req6, req6n, 0, "");
				objetos.add(objAux);

				String req7 = (String) textField_9.getText();
				String req7n = textField_19.getText();
				objAux = new Objeto("req7", req7, req7n, 0, "");
				objetos.add(objAux);
				
				calculaEvidencia(objetos);
			}
		});
		btnNewButton_5.setBounds(262, 407, 90, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_2 = new JLabel("Engenharia de Requisitos");
		lblNewLabel_2.setBounds(131, 251, 157, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("REQ1");
		lblNewLabel_1_5_1.setBounds(21, 279, 36, 14);
		frame.getContentPane().add(lblNewLabel_1_5_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(95, 278, 179, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("REQ5");
		lblNewLabel_1_5_2.setBounds(21, 314, 36, 14);
		frame.getContentPane().add(lblNewLabel_1_5_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(95, 313, 179, 20);
		frame.getContentPane().add(textField_7);
		
		JLabel lblNewLabel_1_5_3 = new JLabel("REQ6");
		lblNewLabel_1_5_3.setBounds(21, 346, 36, 14);
		frame.getContentPane().add(lblNewLabel_1_5_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(95, 345, 179, 20);
		frame.getContentPane().add(textField_8);
		
		JLabel lblNewLabel_1_5_4 = new JLabel("REQ7");
		lblNewLabel_1_5_4.setBounds(21, 377, 36, 14);
		frame.getContentPane().add(lblNewLabel_1_5_4);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(95, 376, 179, 20);
		frame.getContentPane().add(textField_9);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 228, 403, 2);
		frame.getContentPane().add(separator);
		
		textField_10 = new JTextField();
		textField_10.setBounds(281, 42, 71, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(281, 71, 71, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(281, 100, 71, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(281, 129, 71, 20);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(281, 158, 71, 20);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(281, 187, 71, 20);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(281, 278, 71, 20);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(281, 313, 71, 20);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(281, 345, 71, 20);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(281, 376, 71, 20);
		frame.getContentPane().add(textField_19);
	}
	
	public void calculaEvidencia(List<Objeto> evidencias) 
	{
		Integer somaGpr = 0;
		Integer valor = 0;
		Integer qntdEvidencia = 0;
		Integer mediaGpr = 0;
		
		for(Objeto obj : evidencias)
		{
			String referencia = obj.getReferencia();
			String evidencia = obj.getEvidencia();
			String fatorEvidencia = obj.getFatorEvidencia();
			
			if(evidencia.contains(";"))
			{
				qntdEvidencia = 0;
				String[] gprns = fatorEvidencia.split(";");
				
				for(String stringGprn : gprns)
				{
					valor = Integer.parseInt(stringGprn);
					somaGpr = somaGpr + valor;
					qntdEvidencia++;
				}
				mediaGpr = somaGpr/qntdEvidencia;
				obj.setMediaEvidencia(mediaGpr);
				System.out.println(referencia + ": " + mediaGpr);
			}
			else
			{
				qntdEvidencia = 0;
				if(!fatorEvidencia.isEmpty())
				{
					valor = Integer.parseInt(fatorEvidencia);
					qntdEvidencia++;
					mediaGpr = valor;
					obj.setMediaEvidencia(mediaGpr);
					System.out.println(referencia + ": " + mediaGpr);
				}
				else
				{
					System.out.println(referencia + ": none");
				}
			}
		}
		
		calculaCapacidadeProcesso(evidencias);
	}
	
	public void calculaCapacidadeProcesso(List<Objeto> evidencias)
	{
		Integer somaEvidencia1 = 0;
		Integer mediaEvidencia1 = 0;
		Integer auxiliar1 = 0;
		
		Integer somaEvidencia2 = 0;
		Integer mediaEvidencia2 = 0;
		Integer auxiliar2 = 0;
		
		Integer somaEvidencia3 = 0;
		Integer mediaEvidencia3 = 0;
		Integer auxiliar3 = 0;
		
		for(Objeto obj : evidencias)
		{
			if(obj.getReferencia().equals("gpr11") || obj.getReferencia().equals("gpr6"))
			{
				if(obj.getMediaEvidencia() != 0)
				{
					obj.setRefProcesso("(i)  O processo produz os resultados definidos.");
					somaEvidencia1 = somaEvidencia1 + obj.getMediaEvidencia();
					auxiliar1++;
				}
			}
			
			if(obj.getReferencia().equals("gpr1") || obj.getReferencia().equals("gpr5") ||
					obj.getReferencia().equals("gpr8") || obj.getReferencia().equals("req7"))
			{
				if(obj.getMediaEvidencia() != 0)
				{
					obj.setRefProcesso("(ii) A execução do processo é planejada e monitorada.");
					somaEvidencia2 = somaEvidencia2 + obj.getMediaEvidencia();
					auxiliar2++;
				}
			}
			
			if(obj.getReferencia().equals("gpr6") || obj.getReferencia().equals("gpr9") ||
					obj.getReferencia().equals("req1") || obj.getReferencia().equals("req5"))
			{
				if(obj.getMediaEvidencia() != 0)
				{
					obj.setRefProcesso("(iii) As pessoas estão preparadas para executar suas responsabilidades no processo.");
					somaEvidencia3 = somaEvidencia3 + obj.getMediaEvidencia();
					auxiliar3++;
				}
			}
		}
		
		if(somaEvidencia1 != 0)
		{
			mediaEvidencia1 = somaEvidencia1/auxiliar1;
			System.out.println("m1:" + mediaEvidencia1);
		}
		else
		{
			mediaEvidencia1 = 0;
			System.out.println("m1:" + mediaEvidencia1);
		}
		
		if(somaEvidencia2 != 0)
		{
			mediaEvidencia2 = somaEvidencia2/auxiliar2;
			System.out.println("m2:" + mediaEvidencia2);
		}
		else
		{
			mediaEvidencia2 = 0;
			System.out.println("m1:" + mediaEvidencia2);
		}
		
		if(somaEvidencia3 != 0)
		{
			mediaEvidencia3 = somaEvidencia3/auxiliar3;
			System.out.println("m3:" + mediaEvidencia3);
		}
		else
		{
			mediaEvidencia3 = 0;
			System.out.println("m1:" + mediaEvidencia3);
		}
		
		geraRelatorio(evidencias, mediaEvidencia1, mediaEvidencia2, mediaEvidencia3);
	}
	
	public String geraRelatorio(List<Objeto> evidencias, Integer mediaEvidencia1, Integer mediaEvidencia2, Integer mediaEvidencia3) 
	{
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet abaManual = workbook.createSheet("Relatorio Geral");
		
		HSSFFont fsTitle = workbook.createFont();
		fsTitle.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		fsTitle.setColor(HSSFColor.WHITE.index);
		
		HSSFCellStyle sTitle = workbook.createCellStyle();
		sTitle.setFont(fsTitle);
		sTitle.setBorderBottom((short) 1);
		sTitle.setBorderLeft((short) 1);
		sTitle.setBorderRight((short) 1);
		sTitle.setBorderTop((short) 1);
		sTitle.setFillForegroundColor(HSSFColor.GREY_40_PERCENT.index);
		sTitle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		
		HSSFCellStyle sLinha1 = workbook.createCellStyle();
		sLinha1.setBorderBottom((short) 1);
		sLinha1.setBorderLeft((short) 1);
		sLinha1.setBorderRight((short) 1);
		sLinha1.setBorderTop((short) 1);
		sLinha1.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
		sLinha1.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

		HSSFCellStyle sLinha2 = workbook.createCellStyle();
		sLinha2.setBorderBottom((short) 1);
		sLinha2.setBorderLeft((short) 1);
		sLinha2.setBorderRight((short) 1);
		sLinha2.setBorderTop((short) 1);

		try	
		{
			HSSFRow row = abaManual.createRow(0);
			HSSFCell cell0Title = row.createCell(0);
			cell0Title.setCellValue("Indicador");
			cell0Title.setCellStyle(sTitle);

			HSSFCell cell1Title = row.createCell(1);
			cell1Title.setCellValue("Evidencia");
			cell1Title.setCellStyle(sTitle);

			HSSFCell cell2Title = row.createCell(2);
			cell2Title.setCellValue("Fonte da Evidencia");
			cell2Title.setCellStyle(sTitle);

			HSSFCell cell3Title = row.createCell(3);
			cell3Title.setCellValue("Media");
			cell3Title.setCellStyle(sTitle);
			
			HSSFCell cell4Title = row.createCell(4);
			cell4Title.setCellValue("Capacidade de Processo");
			cell4Title.setCellStyle(sTitle);
			
			int i = 1;
			
			for(Objeto obj : evidencias)
			{
				Object ref = obj.getReferencia();
				Object regiao = obj.getEvidencia();	
				Object trimestre = obj.getFatorEvidencia();
				Object cota = obj.getMediaEvidencia();
				Object refprocesso = obj.getRefProcesso();

				row = abaManual.createRow(i);
				popularLinhas(sLinha1, sLinha2, i, row, ref, regiao, trimestre, cota, refprocesso);
				i++;
			}

			File currDir = new File(".");
			String path = currDir.getAbsolutePath();
			
			GregorianCalendar data = new GregorianCalendar();
			SimpleDateFormat form = new SimpleDateFormat("ddMMMyyyy HHmmss");
			form.setCalendar(data);
			String dataForm = form.format(data.getTime());
			
			String fileLocation = path.substring(0, path.length() - 1) + "relatorio-geral-" + dataForm + ".xls";
			FileOutputStream outputStream = new FileOutputStream(fileLocation);
			workbook.write(outputStream);
			outputStream.close();
			
			return "Relatorio gerado com sucesso em: " + fileLocation; 
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
			return "Erro ao gerar relatório.";
		}
	}
	
	private void popularLinhas(HSSFCellStyle sLinha1, HSSFCellStyle sLinha2, int i, HSSFRow row, Object funcionario, Object regiao, Object trimestre, Object cota, Object refprocesso) 
	{

		//Funcionario
		HSSFCell cell0 = row.createCell(0);
		if (funcionario != null){
				cell0.setCellValue(funcionario.toString());
		} else {
				cell0.setCellValue("");
		}

		//Regiao
		HSSFCell cell1 = row.createCell(1);
		if (regiao != null){
				cell1.setCellValue(regiao.toString());
		} else {
				cell1.setCellValue("");
		}	

		//Trimestre
		HSSFCell cell2 = row.createCell(2);
		if (trimestre != null){
				cell2.setCellValue(trimestre.toString());
		} else {
				cell2.setCellValue("");
		}
		
		//Cota
		HSSFCell cell3 = row.createCell(3);
		if ((Integer) cota != 0){
				cell3.setCellValue(cota.toString());
		} else {
				cell3.setCellValue("");
		}
		
		//Cota
		HSSFCell cell4 = row.createCell(4);
		if (refprocesso != null){
			cell4.setCellValue(refprocesso.toString());
		} else {
			cell4.setCellValue("");
		}

		if (i % 2 == 0) {
				cell0.setCellStyle(sLinha1);
				cell1.setCellStyle(sLinha1);
				cell2.setCellStyle(sLinha1);
				cell3.setCellStyle(sLinha1);
		}
		else {
				cell0.setCellStyle(sLinha2);
				cell1.setCellStyle(sLinha2);
				cell2.setCellStyle(sLinha2);
				cell3.setCellStyle(sLinha2);
		}
	}
}
