package base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JFrame frame;
	private JPanel IBPhysicsCalculator;
	private JLabel lblIbPhysicsCalculator;
	private JLabel lblSelectTopics;
	private JButton btnMeasurementsandUncertainties;
	private JButton btnMotionmechanics;
	private JButton btnThermalPhysics;
	private JButton btnWaves;
	private JButton btnElectricityandMagnetism;
	private JButton btnCircularMotionandGravitation;
	private JButton btnAtomicParticleandNuclearPhysics;
	private JButton btnEnergyProduction;
	private JButton btnWavePhenomena;
	private JButton btnFields;
	private JButton btnElectromagneticInduction;
	private JButton btnQuantumandNuclearPhysics;
	private JLabel lblOptions;
	private JButton btnOptionBEngineeringPhysics;
	private JButton btnOptionARelativity;
	private JButton btnOptionCImaging;
	private JButton btnNextPage;
	
	
	private int topic;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	
	public int getTopic()
	{
		return topic;
	}
	public GUI() {
		initialize();
		
		setVisible(true);
	}

	
	public void setHidden(){
	    setVisible(false);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Image image;
		try {
			System.out.println("");
			image = ImageIO.read(getClass().getResourceAsStream("/img/logo-blueprint.jpg"));
			setIconImage(image);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setTitle("PFBC");
        setBounds(0, 0, 1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		JLabel background;
		try {
			background = new JLabel(new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/img/nature-background-for-photography-studio-2.jpg"))));
			this.setContentPane(background);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
        IBPhysicsCalculator = new JPanel();
		IBPhysicsCalculator.setBounds(12, 13, 958, 67);
		getContentPane().add(IBPhysicsCalculator);
		IBPhysicsCalculator.setOpaque(false);
		
		lblIbPhysicsCalculator = new JLabel("IB Physics Calculator");
		lblIbPhysicsCalculator.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblIbPhysicsCalculator.setForeground(Color.white);
		IBPhysicsCalculator.add(lblIbPhysicsCalculator);
		
		lblSelectTopics = new JLabel("Select Topics");
		lblSelectTopics.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSelectTopics.setBounds(228, 91, 157, 32);
		lblSelectTopics.setForeground(Color.white);
		getContentPane().add(lblSelectTopics);
		
		btnMeasurementsandUncertainties = new JButton("Topic 1: Measurements and Uncertainties ");
		btnMeasurementsandUncertainties.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnMeasurementsandUncertainties.setBounds(26, 136, 249, 94);
		btnMeasurementsandUncertainties.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				topic = 1;
				resetColors();
				btnMeasurementsandUncertainties.setBackground(Color.green);
			}
		});
		getContentPane().add(btnMeasurementsandUncertainties);
		
		btnMotionmechanics = new JButton("Topic 2: Motion/Mechanics");
		btnMotionmechanics.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnMotionmechanics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		topic = 2;
		resetColors();
		btnMotionmechanics.setBackground(Color.green);
				}
		});
		btnMotionmechanics.setBounds(26, 264, 249, 94);
		getContentPane().add(btnMotionmechanics);
		
		btnThermalPhysics = new JButton("Topic 3: Thermal Physics");
		btnThermalPhysics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				topic = 3;
				resetColors();
				btnThermalPhysics.setBackground(Color.green);
			}
		});
		btnThermalPhysics.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnThermalPhysics.setBounds(26, 378, 249, 85);
		getContentPane().add(btnThermalPhysics);
		
		btnWaves = new JButton("Topic 4: Waves");
		btnWaves.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnWaves.setBounds(26, 497, 249, 79);
		btnWaves.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				topic = 4;
				resetColors();
				btnWaves.setBackground(Color.green);
			}
		});
		getContentPane().add(btnWaves);
		
		 btnElectricityandMagnetism = new JButton("Topic 5: Electricity and Magnetism");
		btnElectricityandMagnetism.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnElectricityandMagnetism.setBounds(26, 597, 249, 94);
		btnElectricityandMagnetism.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				topic = 5;
				resetColors();
				btnElectricityandMagnetism.setBackground(Color.green);
			}
		});
		getContentPane().add(btnElectricityandMagnetism);
		
		 btnCircularMotionandGravitation = new JButton("Topic 6: Circular Motion and Gravitation");
		btnCircularMotionandGravitation.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCircularMotionandGravitation.setBounds(26, 709, 249, 94);
		btnCircularMotionandGravitation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				topic = 6;
				resetColors();
				btnCircularMotionandGravitation.setBackground(Color.green);
			}
		});
		getContentPane().add(btnCircularMotionandGravitation);
		
		 btnAtomicParticleandNuclearPhysics = new JButton("Topic 7: Atomic, Particle and Nuclear Physics");
		btnAtomicParticleandNuclearPhysics.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAtomicParticleandNuclearPhysics.setBounds(26, 824, 249, 94);
		btnAtomicParticleandNuclearPhysics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				topic = 7;
				resetColors();
				btnAtomicParticleandNuclearPhysics.setBackground(Color.green);
			}
		});
		getContentPane().add(btnAtomicParticleandNuclearPhysics);
		
		 btnEnergyProduction = new JButton("Topic 8: Energy Production");
		btnEnergyProduction.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEnergyProduction.setBounds(287, 138, 249, 94);
		btnEnergyProduction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				topic = 8 ;
				resetColors();
				btnEnergyProduction.setBackground(Color.green);
			}
		});
		getContentPane().add(btnEnergyProduction);
		
		 btnWavePhenomena = new JButton("Topic 9: Wave Phenomena");
		btnWavePhenomena.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnWavePhenomena.setBounds(287, 264, 249, 94);
		btnWavePhenomena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				topic = 9;
				resetColors();
				btnWavePhenomena.setBackground(Color.green);
			}
		});
		getContentPane().add(btnWavePhenomena);
		
		btnFields = new JButton("Topic 10: Fields");
		btnFields.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnFields.setBounds(287, 378, 249, 85);
		btnFields.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				topic = 10;
				resetColors();
				btnFields.setBackground(Color.green);
			}
		});
		getContentPane().add(btnFields);
		
		btnElectromagneticInduction = new JButton("Topic 11: Electromagnetic Induction");
		btnElectromagneticInduction.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnElectromagneticInduction.setBounds(287, 497, 249, 79);
		btnElectromagneticInduction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				topic = 11;
				resetColors();
				btnElectromagneticInduction.setBackground(Color.green);
			}
		});
		getContentPane().add(btnElectromagneticInduction);
		
		 btnQuantumandNuclearPhysics = new JButton("Topic 12: Quantum and Nuclear Physics");
		btnQuantumandNuclearPhysics.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnQuantumandNuclearPhysics.setBounds(287, 597, 249, 94);
		btnQuantumandNuclearPhysics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				topic = 12;
				resetColors();
				btnQuantumandNuclearPhysics.setBackground(Color.green);
			}
		});
		getContentPane().add(btnQuantumandNuclearPhysics);
		
		 lblOptions = new JLabel("Options");
		lblOptions.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOptions.setForeground(Color.white);
		lblOptions.setBackground(Color.black);
		lblOptions.setBounds(711, 93, 157, 32);
		getContentPane().add(lblOptions);
		
		 btnOptionBEngineeringPhysics = new JButton("Option B: Engineering Physics");
		btnOptionBEngineeringPhysics.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnOptionBEngineeringPhysics.setBounds(619, 274, 249, 94);
		btnOptionBEngineeringPhysics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				topic = 14;
				resetColors();
				btnOptionBEngineeringPhysics.setBackground(Color.green);
			}
		});
		getContentPane().add(btnOptionBEngineeringPhysics);
		
		btnOptionARelativity = new JButton("Option A: Relativity");
		btnOptionARelativity.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnOptionARelativity.setBounds(619, 152, 249, 94);
		btnOptionARelativity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				topic = 13;
				resetColors();
				btnOptionARelativity.setBackground(Color.green);
			}
		});
		getContentPane().add(btnOptionARelativity);
		
		 btnOptionCImaging = new JButton("Option C: Imaging");
		btnOptionCImaging.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnOptionCImaging.setBounds(619, 392, 249, 94);
		btnOptionCImaging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				topic = 15;
				resetColors();
				btnOptionCImaging.setBackground(Color.green);
			}
		});
		getContentPane().add(btnOptionCImaging);		
		btnNextPage = new JButton("Next Page");
		btnNextPage.setBounds(660, 753, 157, 50);
		getContentPane().add(btnNextPage);
	}
	
	public void addNextPage(ActionListener nextPage){
		btnNextPage.addActionListener(nextPage);
		}
	
	class ImagePanel extends JComponent {
	    private Image image;
	    public ImagePanel(Image image) {
	        this.image = image;
	    }
	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(image, 0, 0, this);
	    }
	}
	
	public void resetColors()
	{
		btnMeasurementsandUncertainties.setBackground(Color.white);
		btnMotionmechanics.setBackground(Color.white);
		btnThermalPhysics.setBackground(Color.white);
		btnWaves.setBackground(Color.white);
		btnElectricityandMagnetism.setBackground(Color.white);
		btnCircularMotionandGravitation.setBackground(Color.white);
		btnAtomicParticleandNuclearPhysics.setBackground(Color.white);
		btnEnergyProduction.setBackground(Color.white);
		btnWavePhenomena.setBackground(Color.white);
		btnFields.setBackground(Color.white);
		btnElectromagneticInduction.setBackground(Color.white);
		btnQuantumandNuclearPhysics.setBackground(Color.white);
		btnOptionARelativity.setBackground(Color.white);
		btnOptionBEngineeringPhysics.setBackground(Color.white);
		btnOptionCImaging.setBackground(Color.white);
		
	}
}
