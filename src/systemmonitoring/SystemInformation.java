/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmonitoring;

import java.util.List;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OSFileStore;
import oshi.software.os.OperatingSystem;

/**
 *
 * @author Trishen
 */
public class SystemInformation {
    
    private SystemInfo si;
    private HardwareAbstractionLayer hal;
    private RAM ComputerMemory;
    private OperatingSystem os;
    private List<HardDisk> Disks;
    
    
   public SystemInformation()
   {
       si = new oshi.SystemInfo();
       hal = si.getHardware();
       ComputerMemory = new RAM(hal.getMemory());
       os = si.getOperatingSystem();
       
       OSFileStore[] fsArray = os.getFileSystem().getFileStores();
       
       for(OSFileStore fs : fsArray)
       {
           HardDisk newDisk = new HardDisk(fs);
        //   Disks.add(newDisk);
       }
   }

    public SystemInfo getSi() 
    {
        return si;
    }

    public HardwareAbstractionLayer getHal() 
    {
        return hal;
    }

    public RAM getComputerMemory() 
    {
        return ComputerMemory;
    }

    public OperatingSystem getOs() 
    {
        return os;
    }

    public List<HardDisk> getDisks() 
    {
        return Disks;
    }
   
   
   
   
    
}
