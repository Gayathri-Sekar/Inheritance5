package Problem5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String species;
		String consumetype;
		Scanner sc=new Scanner (System.in);
		int type;
		
		System.out.print("1.Dinosur\n2.LavaDinosur\n3.DragonLavaDino\n4.SharkLavaDinosur\n5.LizardLavaDinosur\n\n");
        System.out.print("Enter type:");
        type=sc.nextInt();
        
        boolean            canBreatheFire;
        boolean            hasHeatResistance;
        
        int                numberOfWings;
        int                numberOfScales;
        boolean            canFly;
        
        int                numberOfFins;
        int                numberOfGills;
        boolean            canSwim;
        
        int                numberOfClaws;
        int                numberOfLegs;
        boolean            canRun;
        
        String             abilityName;
        String             abilityDescription;
        
        String             superPowerName;
        String             superPowerDescription;
        if(type==1)
        {
        	System.out.println("Enter Species:");
        	species=sc.next();
        	System.out.println("Enter consumetype:");
        	consumetype=sc.next();
        	Dinosur d=new Dinosur(species,consumetype);
        	d.display();
           
        }
        else if(type==2) {
        	System.out.println("Enter Species:");
        	species=sc.next();
        	System.out.println("Enter consumetype:");
        	consumetype=sc.next();
        	System.out.println("Can breathe fire(y/n)?");
        	 canBreatheFire=sc.nextBoolean();
        	 System.out.println("Can resist to heat(y/n)?");
        	 hasHeatResistance=sc.nextBoolean();
        	 LavaDino ld=new LavaDino(species,consumetype,canBreatheFire,hasHeatResistance);
        	 ld.display();
             ld.DinoDetails();
             
        }
        else if(type==3)
        {
        	System.out.println("Enter Species:");
        	 species=sc.next();
        	 System.out.println("Enter consumetype:");
        	 consumetype=sc.next();
        	 System.out.println("Can breathe fire(y/n)?");
        	 canBreatheFire=sc.nextBoolean();
        	 System.out.println("Can resist to heat(y/n)?");
        	 hasHeatResistance=sc.nextBoolean();
        	 System.out.println("Enter num of wings:");
        	 numberOfWings=sc.nextInt();
        	 System.out.println("Enter num of scales:");
        	 numberOfScales=sc.nextInt();
        	 System.out.println("Can fly(y/n):");
        	 canFly=sc.nextBoolean();
        	 DragonLava dl=new DragonLava(species,consumetype,canBreatheFire,hasHeatResistance,numberOfWings,numberOfScales,canFly);
        	 dl.display();
             dl.DinoDetails();
             dl.displayDinoDetails();
        }
        else if(type==4)
        {
        	System.out.println("Enter Species:");
        	species=sc.next();
        	System.out.println("Enter consumetype:");
       	 consumetype=sc.next();
       	 System.out.println("Can breathe fire(y/n)?");
       	 canBreatheFire=sc.nextBoolean();
       	System.out.println("Can resist to heat(y/n)?");
       	 hasHeatResistance=sc.nextBoolean();
       	System.out.println("Enter num of fins:");
        	numberOfFins=sc.nextInt();
        	System.out.println("Enter num of gills:");
        	numberOfGills=sc.nextInt();
        	System.out.println("Can swim(y/n):");
        	canSwim=sc.nextBoolean();
        	SharkLava sl=new SharkLava(species,consumetype,canBreatheFire,hasHeatResistance,numberOfFins,numberOfGills,canSwim);
        	sl.display();
            sl.DinoDetails();
            sl.displayDinoDetails();
        }
        else if(type==5)
        {
        	System.out.println("Enter Species:");
        	species=sc.next();
        	System.out.println("Enter consumetype:");
          	 consumetype=sc.next();
          	System.out.println("Can breathe fire(y/n)?");
          	 canBreatheFire=sc.nextBoolean();
          	System.out.println("Can resist to heat(y/n)?");
          	 hasHeatResistance=sc.nextBoolean();
          	System.out.println("Enter num of claws:");
          	numberOfClaws=sc.nextInt();
          	System.out.println("Enter num of legs:");
          	numberOfLegs=sc.nextInt();
          	System.out.println("Can run(y/n):");
          	canRun=sc.nextBoolean();
          	LizardLava ll=new LizardLava(species,consumetype,canBreatheFire,hasHeatResistance,numberOfClaws,numberOfLegs,canRun);
          	ll.display();
            ll.DinoDetails();
            ll.displayDinoDetails();
           
           
        }
        else if(type==6)
        {
        	System.out.println("Enter Species:");
         species=sc.next();
         System.out.println("Enter consumetype:");
       	 consumetype=sc.next();
       	System.out.println("Can breathe fire(y/n)?");
       	 canBreatheFire=sc.nextBoolean();
       	System.out.println("Can resist to heat(y/n)?");
       	 hasHeatResistance=sc.nextBoolean();
       	System.out.println("Enter num of wings:");
       	 numberOfWings=sc.nextInt();
       	System.out.println("Enter num of scales:");
       	 numberOfScales=sc.nextInt();
       	System.out.println("can fly:");
       	 canFly=sc.nextBoolean();
       	System.out.println("Enter abilityname:");
       	abilityName=sc.next();
       	System.out.println("Enter abilitydes:");
        abilityDescription=sc.nextLine();
        DragonLava2 dl2=new DragonLava2(species,consumetype,canBreatheFire,hasHeatResistance,
        		numberOfWings,numberOfScales,canFly,abilityName,abilityDescription);
        dl2.display();
        dl2.DinoDetails();
        dl2.displayDinoDetails();
        dl2.displayDinoAbility();
       
        }
        else if(type==7)
        {
        	System.out.println("Enter Species:");
        	species=sc.next();
        	System.out.println("Enter consumetype:");
          	 consumetype=sc.next();
         	System.out.println("Can breathe fire(y/n)?");
          	 canBreatheFire=sc.nextBoolean();
          	System.out.println("Can resistent to heat(y/n)?");
          	 hasHeatResistance=sc.nextBoolean();
          	System.out.println("Enter num of fins:");
           	numberOfFins=sc.nextInt();
           	System.out.println("Enter num of gills:");
           	numberOfGills=sc.nextInt();
           	System.out.println("can swim:");
           	canSwim=sc.nextBoolean();
           	System.out.println("Enter abilityname:");
           	abilityName=sc.next();
           	System.out.println("Enter abilitydes:");
            abilityDescription=sc.next();
           	SharkLava2 sl2=new SharkLava2(species,consumetype,canBreatheFire,hasHeatResistance,numberOfFins,numberOfGills,
           			canSwim,abilityName,abilityDescription);
           	sl2.display();
            sl2.DinoDetails();
            sl2.displayDinoDetails();
            sl2.displayDinoAbility();
           
        }
        else if(type==8)
        {
        	System.out.println("Enter Species:");
        	species=sc.next();
        	System.out.println("Enter consumetype:");
         	 consumetype=sc.next();
         	System.out.println("Can breathe fire(y/n)?");
         	 canBreatheFire=sc.nextBoolean();
         	System.out.println("Can resistent to heat(y/n)?");
         	 hasHeatResistance=sc.nextBoolean();
         	System.out.println("Enter num of claws:");
         	numberOfClaws=sc.nextInt();
         	System.out.println("Enter num of legs:");
         	numberOfLegs=sc.nextInt();
         	System.out.println("Can run:");
         	canRun=sc.nextBoolean();
         	System.out.println("Enter abilityname:");
         	abilityName=sc.next();
         	System.out.println("Enter abilitydes:");
            abilityDescription=sc.nextLine();
            LizardLava2 ll2=new LizardLava2(species,consumetype,canBreatheFire,hasHeatResistance,numberOfClaws,numberOfLegs,canRun,
            		abilityName,abilityDescription);
            ll2.display();
            ll2.DinoDetails();
            ll2.displayDinoDetails();
            ll2.displayDinoAbility();
           
        }
        else if(type==9)
        {
        	species=sc.next();
          	 consumetype=sc.next();
          	 canBreatheFire=sc.nextBoolean();
          	 hasHeatResistance=sc.nextBoolean();
          	 numberOfWings=sc.nextInt();
          	 numberOfScales=sc.nextInt();
          	 canFly=sc.nextBoolean();
          	abilityName=sc.next();
           abilityDescription=sc.next();
           superPowerName=sc.next();
           superPowerDescription=sc.next();
           DragonLava3 dl3=new DragonLava3(species,consumetype,canBreatheFire,hasHeatResistance,
        		numberOfWings,numberOfScales,canFly,abilityName,abilityDescription,superPowerName,superPowerDescription);
           dl3.display();
           dl3.DinoDetails();
           dl3.displayDinoDetails();
           dl3.displayDinoAbility();
           dl3.displayDinoSuperPower();
        }
        else if(type==10)
        {
        	species=sc.next();
         	 consumetype=sc.next();
         	 canBreatheFire=sc.nextBoolean();
         	 hasHeatResistance=sc.nextBoolean();
          	numberOfFins=sc.nextInt();
          	numberOfGills=sc.nextInt();
          	canSwim=sc.nextBoolean();
          	abilityName=sc.next();
           abilityDescription=sc.nextLine();
           superPowerName=sc.next();
           superPowerDescription=sc.next();
           SharkLava3 sl3=new SharkLava3(species,consumetype,canBreatheFire,hasHeatResistance,numberOfFins,numberOfGills,
           			canSwim,abilityName,abilityDescription,superPowerName,superPowerDescription);
           sl3.display();
           sl3.DinoDetails();
           sl3.displayDinoDetails();
           sl3.displayDinoAbility();
           sl3.displayDinoSuperPower();
        }
        else if(type==11)
        {
        	species=sc.next();
        	 consumetype=sc.next();
        	 canBreatheFire=sc.nextBoolean();
        	 hasHeatResistance=sc.nextBoolean();
        	numberOfClaws=sc.nextInt();
        	numberOfLegs=sc.nextInt();
        	canRun=sc.nextBoolean();
        	abilityName=sc.next();
           abilityDescription=sc.nextLine();
           superPowerName=sc.next();
           superPowerDescription=sc.next();
           LizardLava3 ll3=new LizardLava3(species,consumetype,canBreatheFire,hasHeatResistance,numberOfClaws,numberOfLegs,canRun,
           		abilityName,abilityDescription,superPowerName,superPowerDescription);
           ll3.display();
           ll3.DinoDetails();
           ll3.displayDinoDetails();
           ll3.displayDinoAbility();
           ll3.displayDinoSuperPower();
        }
	}

}
