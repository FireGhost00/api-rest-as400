package com.nelson.SRVPGM01;

import com.ibm.as400.access.AS400;
import com.ibm.as400.data.PcmlException;
import com.ibm.as400.data.ProgramCallDocument;

public class Greeting {

    public String execute(String name){

    String systenName = "PUB400.COM";
    String userName = "NGOMEZ10";
    String password = "ngas2025";
    String path = "/QSYS.LIB/NGOMEZ10.LIB/SRVPGM01.SRVPGM";
    AS400 as400 = new AS400(systenName, userName, password);

    String result = ""

        try {
            ProgramCallDocument pcml = new ProgramCallDocument(as400, "com.nelson.SRVPGM01");

            pcml.setStringValue("GREETING.IN_NAME",name);


        }catch (PcmlException e){
            throw new RuntimeException(e);
        }
        return null;
}


}
