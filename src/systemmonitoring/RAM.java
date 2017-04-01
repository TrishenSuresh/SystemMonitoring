/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmonitoring;

import oshi.hardware.GlobalMemory;
import oshi.util.FormatUtil;

/**
 *
 * @author Trishen
 */
public class RAM {
    
    private long totalMemory;
    private long usedMemory;
    private long availableMemory;
    
    public RAM(GlobalMemory memory)
    {
        availableMemory = memory.getAvailable();
        totalMemory = memory.getTotal();
        usedMemory = totalMemory - availableMemory;
    }

    public String getTotalMemoryString() 
    {
        return FormatUtil.formatBytes(totalMemory);
    }

    public String getUsedMemoryString() 
    {
       return FormatUtil.formatBytes(usedMemory);
    }

    public String getAvailableMemoryString() 
    {
        return FormatUtil.formatBytes(availableMemory);
    }

    public long getTotalMemory() 
    {
        return totalMemory;
    }

    public long getUsedMemory() 
    {
        return usedMemory;
    }

    public long getAvailableMemory() 
    {
        return availableMemory;
    }
    
    

    
    
    
    
    
}
