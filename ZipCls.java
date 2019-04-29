import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipCls{

    public void SetZipFile(String fileZip, String fileRead){
        try{
            FileOutputStream fOutStream = new FileOutputStream(fileZip);
            ZipOutputStream out = new ZipOutputStream(fOutStream);
            ZipEntry e = new ZipEntry(fileRead);
            out.putNextEntry(e);
    
            out.closeEntry();
            out.close();
        }
        catch(IOException ex){
            ex.fillInStackTrace();
        }
       
    }
}