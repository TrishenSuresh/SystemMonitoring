/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmonitoring;

import oshi.software.os.FileSystem;
import oshi.software.os.OSFileStore;
import oshi.util.FormatUtil;

/**
 *
 * @author Trishen
 */
public class HardDisk {
    
    private String name;
    private long usable;
    private long total;
    private long used;
    private String type;
    private String mount;
    
    public HardDisk(FileSystem fileSystem)
    {
        System.out.println("File System:");
        OSFileStore[] fsArray = fileSystem.getFileStores();
        
        
    }

    HardDisk(OSFileStore fs) 
    {
        name = fs.getName();
        usable = fs.getUsableSpace();
        total = fs.getTotalSpace();
        used = total - usable;
        type = fs.getType();
        mount = fs.getMount();
        System.out.println(name);
        
    }
    
}
