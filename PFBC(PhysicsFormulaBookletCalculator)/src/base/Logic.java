package base;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

import CircularMotion.*;
import ElectricityandMagnetism.*;
import ElectroMagneticInduction.*;
import QuantumandNuclearPhysics.*;
import Relativity.*;
import EngineeringPhysics.*;
import Imaging.*;
import Motion.*;
import NuclearPhysics.*;
import EnergyProduction.*;
import SHM.*;
import Fields.*;
import ThermalPhysics.*;
import Waves.*;
import measurementsAndUncertainties.*;

public class Logic {

	 private Generate measurementsAndUncertainties;
	    private Generate Motion;
	    private Generate ThermalPhysics;
	    private Generate Waves;
	    private Generate ElectricityandMagnetism;
	    private Generate CircularMotion;
	    private Generate NuclearPhysics;
	    private Generate EnergyProduction;
	    private Generate SHM;
	    private Generate Fields;
	    private Generate ElectroMagneticInduction;
	    private Generate QuantumandNuclearPhysics;
	    private Generate Relativity;
	    private Generate EngineeringPhysics;
	    private Generate Imaging;
	    
	    private Generate currentFormulas;
	    private int TopicNumber;
	    private DefaultComboBoxModel dcm;
	   private ArrayList<String> formulas;


	    public int getTopicNumber() {
			return TopicNumber;
			
			}
		

        public Logic()
        {
        	getStarted();
        }


		public DefaultComboBoxModel setTopicNumber(int topicNumber) {
			TopicNumber = topicNumber;
			
			 switch(TopicNumber)
			    {
			    case 1:
			    	currentFormulas = measurementsAndUncertainties;
			    break;
			    case 2:
			    	currentFormulas = Motion;
			    break;
			    case 3:
			    	currentFormulas = ThermalPhysics;
			    break;
			    case 4:
			    	currentFormulas = Waves;
			    break;
			    case 5:
			    	currentFormulas = ElectricityandMagnetism;
			    break;
			    case 6:
			    	currentFormulas = CircularMotion;
			    break;
			    case 7:
			    	currentFormulas = NuclearPhysics;
			    	break;
			    case 8:
			    	currentFormulas = EnergyProduction;
			    break;
			    case 9:
			    	currentFormulas = SHM;
			    break;
			    case 10: 
			    	currentFormulas = Fields;
			    break;
			    case 11:
			    	currentFormulas = ElectroMagneticInduction;
			    	break;
			    case 12:
			    	currentFormulas = QuantumandNuclearPhysics;
			    	break;
			    case 13:
			    	currentFormulas = Relativity;
			    	break;
			    case 14: 
			    	currentFormulas = EngineeringPhysics;
			    	 break;
			    case 15: 
			    	currentFormulas = Imaging;
			    	break;
			 
			
			 
			    }
			
			 formulas = new ArrayList();
			 for(int x = 0; x < currentFormulas.getFormulas().size(); x++){
				 formulas.add(currentFormulas.getFormulas().get(x).getFormula().get(0));	
				
			 }
			 dcm = new DefaultComboBoxModel(formulas.toArray());
			 
			return dcm;
		}


		   public formulaBase getFormulas (int formulaNumber)
		   {
			   return currentFormulas.getFormulas().get(formulaNumber);
		   }

		   public String getStringFormula (formulaBase formula, int reArrangeNumber)
		   {
			   return formula.getFormula().get(reArrangeNumber);
		   }

		   public String getVariableName (formulaBase formula, int number)
		   {
			   return formula.getAllVariables().get(number);
		   }
		   
		   public int getNumVariables(formulaBase formula){
			   return formula.getAllVariables().size();
		   }
		private void getStarted(){
	        measurementsAndUncertainties = new Generate();
	        measurementsAndUncertainties.addFormulas (new uncertaintiesAndErrors1());
	        measurementsAndUncertainties.addFormulas (new uncertaintiesAndErrors2());
	        measurementsAndUncertainties.addFormulas (new uncertaintiesAndErrors3());

	        measurementsAndUncertainties.addFormulas(new vectorsAndScalars1());
	        measurementsAndUncertainties.addFormulas(new vectorsAndScalars2());

	        Motion = new Generate();
	        Motion.addFormulas(new motion1());
	        Motion.addFormulas(new motion2());
	        Motion.addFormulas(new motion3());
	        Motion.addFormulas(new motion4());
	        Motion.addFormulas(new motion5());
	        Motion.addFormulas(new motion6());
	        Motion.addFormulas(new motion7());
	        Motion.addFormulas(new motion8());
	        Motion.addFormulas(new motion9());
	        Motion.addFormulas(new motion10());
	        Motion.addFormulas(new motion11());
	        Motion.addFormulas(new motion12());
	        Motion.addFormulas(new motion13());
	        Motion.addFormulas(new motion14());
	        Motion.addFormulas(new motion15());
	        Motion.addFormulas(new motion16());
	        Motion.addFormulas(new motion17());
	        Motion.addFormulas(new motion18());

	        ThermalPhysics = new Generate();
	        ThermalPhysics.addFormulas(new thermal1());
	        ThermalPhysics.addFormulas(new thermal2());
	        ThermalPhysics.addFormulas(new thermal3());
	        ThermalPhysics.addFormulas(new thermal4());

	        Waves = new Generate();
	        Waves.addFormulas(new waves1());
	        Waves.addFormulas(new waves2());
	        Waves.addFormulas(new waves3());
	        Waves.addFormulas(new waves4());
	        Waves.addFormulas(new waves5());
	        Waves.addFormulas(new waves6());
	        Waves.addFormulas(new waves7());
	        Waves.addFormulas(new waves8());
	        Waves.addFormulas(new waves9());
	        Waves.addFormulas(new waves10());

	        ElectricityandMagnetism = new Generate();
	        ElectricityandMagnetism.addFormulas(new electricity1());
	        ElectricityandMagnetism.addFormulas(new electricity2());
	        ElectricityandMagnetism.addFormulas(new electricity3());
	        ElectricityandMagnetism.addFormulas(new electricity4());
	        ElectricityandMagnetism.addFormulas(new electricity5());
	        ElectricityandMagnetism.addFormulas(new electricity6());
	        ElectricityandMagnetism.addFormulas(new electricity7());
	        ElectricityandMagnetism.addFormulas(new electricity8());
	        ElectricityandMagnetism.addFormulas(new electricity9());
	        ElectricityandMagnetism.addFormulas(new electricity10());
	        ElectricityandMagnetism.addFormulas(new electricity11());
	        ElectricityandMagnetism.addFormulas(new electricity12());
	        ElectricityandMagnetism.addFormulas(new magnetism1());
	        ElectricityandMagnetism.addFormulas(new magnetism2());

	        CircularMotion = new Generate();
	        CircularMotion.addFormulas(new circular1());
	        CircularMotion.addFormulas(new circular2());
	        CircularMotion.addFormulas(new circular3());
	        CircularMotion.addFormulas(new circular4());
	        CircularMotion.addFormulas(new circular5());
	        CircularMotion.addFormulas(new circular6());
	        
	        NuclearPhysics = new Generate();
	        NuclearPhysics.addFormulas(new nuclear1());
	        NuclearPhysics.addFormulas(new nuclear2());
	        NuclearPhysics.addFormulas(new nuclear3());
	        
	        EnergyProduction = new Generate();
	        EnergyProduction.addFormulas(new EnergyProduction1());
	        EnergyProduction.addFormulas(new EnergyProduction2());
	        EnergyProduction.addFormulas(new EnergyProduction3());
	        EnergyProduction.addFormulas(new EnergyProduction4());
	        EnergyProduction.addFormulas(new EnergyProduction5());
	        
	        SHM = new Generate();
	        SHM.addFormulas(new SHM1());
	        SHM.addFormulas(new SHM2());
	        SHM.addFormulas(new SHM3());
	        SHM.addFormulas(new SHM4());
	        SHM.addFormulas(new SHM5());
	        SHM.addFormulas(new SHM6());
	        SHM.addFormulas(new SHM7());
	        SHM.addFormulas(new SHM8());
	        SHM.addFormulas(new SHM9());
	        SHM.addFormulas(new SHM10());
	        SHM.addFormulas(new SHM11());
	        SHM.addFormulas(new SHM12());
	        SHM.addFormulas(new SHM13());
	        SHM.addFormulas(new SHM14());
	        SHM.addFormulas(new SHM15());
	        SHM.addFormulas(new SHM16());
	    
	        Fields = new Generate();
	        Fields.addFormulas(new Fields1());
	        Fields.addFormulas(new Fields2());
	        Fields.addFormulas(new Fields3());
	        Fields.addFormulas(new Fields4());
	        
	        ElectroMagneticInduction = new Generate();
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction1());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction2());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction3());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction4());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction5());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction6());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction7());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction8());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction9());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction10());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction11());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction12());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction13());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction14());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction15());
	        ElectroMagneticInduction.addFormulas(new ElectroMagneticInduction16());
	        
	        QuantumandNuclearPhysics = new Generate();
	        QuantumandNuclearPhysics.addFormulas(new QuantumandNuclearPhysics1());
	        QuantumandNuclearPhysics.addFormulas(new QuantumandNuclearPhysics2());
	        QuantumandNuclearPhysics.addFormulas(new QuantumandNuclearPhysics3());
	        QuantumandNuclearPhysics.addFormulas(new QuantumandNuclearPhysics4());
	        QuantumandNuclearPhysics.addFormulas(new QuantumandNuclearPhysics5());
	        QuantumandNuclearPhysics.addFormulas(new QuantumandNuclearPhysics6());
	        QuantumandNuclearPhysics.addFormulas(new QuantumandNuclearPhysics7());
	       
	        Relativity = new Generate();
	        Relativity.addFormulas(new Relativity1());
	        Relativity.addFormulas(new Relativity2());
	        Relativity.addFormulas(new Relativity3());
	        Relativity.addFormulas(new Relativity4());
	        Relativity.addFormulas(new Relativity5());
	        Relativity.addFormulas(new Relativity6());
	        Relativity.addFormulas(new Relativity7());
	        Relativity.addFormulas(new Relativity8());
	        Relativity.addFormulas(new Relativity9());
	        Relativity.addFormulas(new Relativity10());
	        Relativity.addFormulas(new Relativity11());
	        Relativity.addFormulas(new Relativity12());
	        Relativity.addFormulas(new Relativity13());
	        
	        EngineeringPhysics = new Generate();
	        EngineeringPhysics.addFormulas(new EngineeringPhysics1());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics2());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics3());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics4());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics5());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics6());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics7());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics8());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics9());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics10());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics11());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics12());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics13());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics14());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics15());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics16());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics17());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics18());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics19());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics20());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics21());
	        EngineeringPhysics.addFormulas(new EngineeringPhysics22());
	        
	        Imaging = new Generate();
	        Imaging.addFormulas(new Imaging1());
	        Imaging.addFormulas(new Imaging2());
	        Imaging.addFormulas(new Imaging3());
	        Imaging.addFormulas(new Imaging4());
	        Imaging.addFormulas(new Imaging5());
	        Imaging.addFormulas(new Imaging6());
	        Imaging.addFormulas(new Imaging7());
	        Imaging.addFormulas(new Imaging8());
	        Imaging.addFormulas(new Imaging9());
	        Imaging.addFormulas(new Imaging10());
	        Imaging.addFormulas(new Imaging11());
	        Imaging.addFormulas(new Imaging12());
	        
	  
	        
	        
	        
	    } 

}
