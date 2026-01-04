package com.nelson.SRVPGM01;

import com.ibm.as400.access.AS400;
import com.ibm.as400.data.PcmlException;
import com.ibm.as400.data.ProgramCallDocument;

import java.io.InputStream;

public class Greeting {

    public String execute(String name){

    String systenName = "PUB400.COM";
    String userName = "NGOMEZ10";
    String pass = "*********";
    char[] password = pass.toCharArray();
    String path = "/QSYS.LIB/%LIBL%.LIB/SRVPGM01.SRVPGM";
    AS400 as400 = new AS400(systenName, userName, password);

    String result = "";

        try {
            ProgramCallDocument pcml = new ProgramCallDocument(as400, "com.nelson.SRVPGM01.SRVPGM01");

            pcml.setPath("GREETING", path);
            //asignar valores de entrada
            pcml.setStringValue("GREETING.IN_NAME",name);
            //pcml.setStringValue("GREETING.OUT_GREETING","");

            if(pcml.callProgram("GREETING")){
                //recuperar valores de salida
                result = pcml.getStringValue("GREETING.OUT_GREETING");
            }

        }catch (PcmlException e){
            throw new RuntimeException(e);
        }
        return result;
}


}
