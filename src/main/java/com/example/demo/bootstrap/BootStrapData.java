package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }
    
    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        if (partRepository.count() == 0) {

            OutsourcedPart sewingMachineExtensionTable= new OutsourcedPart();
            sewingMachineExtensionTable.setName("Sewing Machine Extension Table");
            sewingMachineExtensionTable.setInv(8);
            sewingMachineExtensionTable.setPrice(139.00);
            sewingMachineExtensionTable.setId((100L));
            sewingMachineExtensionTable.setInvMin(5);
            sewingMachineExtensionTable.setInvMax(12);
            outsourcedPartRepository.save(sewingMachineExtensionTable);
            /*OutsourcedPart thePart=null;*/

            OutsourcedPart sewingMachineFootPedal= new OutsourcedPart();
            sewingMachineFootPedal.setName("Sewing Machine Foot Pedal");
            sewingMachineFootPedal.setInv(7);
            sewingMachineFootPedal.setPrice(55.00);
            sewingMachineFootPedal.setId(200L);
            sewingMachineFootPedal.setInvMin(4);
            sewingMachineFootPedal.setInvMax(22);
            outsourcedPartRepository.save(sewingMachineFootPedal);
            /*OutsourcedPart thePart=null;*/

            OutsourcedPart needlePlate= new OutsourcedPart();
            needlePlate.setName("Needle Plate");
            needlePlate.setInv(12);
            needlePlate.setPrice(11.00);
            needlePlate.setId(300L);
            needlePlate.setInvMin(5);
            needlePlate.setInvMax(20);
            outsourcedPartRepository.save(needlePlate);
            /*OutsourcedPart thePart=null;*/

            OutsourcedPart hookDriveGear= new OutsourcedPart();
            hookDriveGear.setName("Hook Drive Gear");
            hookDriveGear.setInv(8);
            hookDriveGear.setPrice(23.00);
            hookDriveGear.setId(400L);
            hookDriveGear.setInvMin(5);
            hookDriveGear.setInvMax(20);
            outsourcedPartRepository.save(hookDriveGear);
            /*OutsourcedPart thePart=null;*/

            OutsourcedPart needleThreader= new OutsourcedPart();
            needleThreader.setName("Needle Threader");
            needleThreader.setInv(15);
            needleThreader.setPrice(4.00);
            needleThreader.setId(500L);
            needleThreader.setInvMin(5);
            needleThreader.setInvMax(20);
            outsourcedPartRepository.save(needleThreader);
            /*OutsourcedPart thePart=null;*/
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */
        if (productRepository.count() == 0) {
        Product basicSewingMachine= new Product("Basic Sewing Machine",180.00,20);
        Product sergerSewingMachine= new Product("Serger Sewing Machine",249.00,10);
        Product heavyDutySewingMachine= new Product("Heavy Duty Sewing Machine",280.00,10);
        Product quiltingSewingMachine= new Product("Quilting Sewing Machine",1300.00,2);
        Product embroiderySewingMachine= new Product("Embroidery Sewing Machine",3500.00,2);
        productRepository.save(basicSewingMachine);
        productRepository.save(sergerSewingMachine);
        productRepository.save(heavyDutySewingMachine);
        productRepository.save(quiltingSewingMachine);
        productRepository.save(embroiderySewingMachine);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
