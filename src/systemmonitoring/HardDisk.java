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
    
    HardDisk(OSFileStore fs) 
    {
        name = fs.getName();
        usable = fs.getUsableSpace();
        total = fs.getTotalSpace();
        used = total - usable;
        type = fs.getType();
        mount = fs.getMount();
    }

    public String getName() 
    {
        return name;
    }

    public long getUsable() 
    {
        return usable;
    }

    public long getTotal() 
    {
        return total;
    }

    public long getUsed() 
    {
        return used;
    }

    public String getType() 
    {
        return type;
    }

    public String getMount() 
    {
        return mount;
    }
    
    
    
}
